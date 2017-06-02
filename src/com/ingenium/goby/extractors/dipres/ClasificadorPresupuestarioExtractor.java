/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.Extractor;
import com.opencsv.CSVReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

/**
 * Esta clase lee un archivo separado por comas con la información de la ley de
 * presupuestos y lo extrae a un archivo Jason destino.
 *
 * @author JaimeRodrigo
 */
public class ClasificadorPresupuestarioExtractor implements Extractor {
  
  private final class ClasificadorPresupuestario {
    
    private final int subtitulo;
    private final int item;
    private final int asignacion;
    private final String nombre;
    private final String descripcion;
    
    /**
     * Crea una nueva instancia de la clase ClasificadorPresupuestario.
     *
     * @param subtitulo
     *          el valor del campo subtitulo
     * @param item
     *          el valor del campo item
     * @param asignacion
     *          el valor del campo asignacion
     * @param nombre
     *          el valor del campo nombre
     * @param descripcion
     *          el valor del campo descripcion
     */
    public ClasificadorPresupuestario(int subtitulo, int item, int asignacion,
        String nombre, String descripcion) {
      super();
      this.subtitulo = subtitulo;
      this.item = item;
      this.asignacion = asignacion;
      this.nombre = nombre;
      this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(String.valueOf(subtitulo)).append(";")
          .append(String.valueOf(item)).append(";")
          .append(String.valueOf(asignacion)).append(";").append(nombre)
          .append(";").append(descripcion).append(";");
      return sb.toString();
    }
  }
  
  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.extractors.dipres.ClasificadorPresupuestarioExtractor");
  
  private final String extractionSource;
  
  private final String extractionDestination;
  
  /**
   * Crea una nueva instancia de la clase BudgetClassifierCVStoJSONParser.
   */
  public ClasificadorPresupuestarioExtractor() {
    extractionSource = Messages
        .getString("ClasificadorPresupuestarioExtractor.sourceUrl"); //$NON-NLS-1$
    extractionDestination = Messages
        .getString("ClasificadorPresupuestarioExtractor.destinationUrl"); //$NON-NLS-1$
  }
  
  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  @Override
  public void extract() throws ExtractionException {
    
    CSVReader reader = getReader();
    ClasificadorPresupuestarioExtractor.log.fine("Comenzando la extracción");
    String[] line;
    try {
      while ((line = reader.readNext()) != null) {
        StringBuilder stb = new StringBuilder(400);
        for (String element : line) {
          stb.append(element);
          stb.append("\t");
        }
        System.out.println(stb);
      }
    } catch (IOException e) {
      e.printStackTrace();
      
    }
  }
  
  /**
   * Extrae los clasificadores presupuestarios a una colección en un formato
   * plano.
   *
   * @return la colección con los clasificadores extraidos
   * @throws ExtractionException
   *           en caso de que no puedan extraerse los clasificadores por
   *           problemas en el archivo fuente
   **/
  
  Collection<ClasificadorPresupuestario> extractClasificadoresPresupuestarios()
      throws ExtractionException {
    
    CSVReader reader = getReader();
    
    ClasificadorPresupuestarioExtractor.log.fine("Comenzando la extracción");
    Collection<ClasificadorPresupuestario> clasificadores = new ArrayList<>();
    String[] line;
    int cnumber = 0;
    try {
      while ((line = reader.readNext()) != null) {
        System.out.println("Procesando item " + cnumber);
        ArrayList<String> elements = new ArrayList<>();
        int index = 0;
        for (String element : line) {
          elements.add(index, element);
          index++;
        }
        int subtitulo = 0;
        
        String s = elements.get(0);
        try {
          if (s != null) {
            subtitulo = Integer.parseInt(s);
          }
        } catch (Exception e) {
          throw new ExtractionException(
              "No es posible extraer el número de subtitulo");
        }
        
        int item = 0;
        s = elements.get(1);
        if (s != null) {
          try {
            item = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            ClasificadorPresupuestarioExtractor.log
                .finest("No se pudo obtener un número de item");
          }
        } else {
          item = 0;
        }
        
        int asignacion = 0;
        s = elements.get(2);
        if (s != null) {
          try {
            asignacion = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            ClasificadorPresupuestarioExtractor.log
                .finest("No se pudo obtener un número de asignación");
          }
        }
        
        String nombre;
        s = elements.get(3);
        if (s != null) {
          nombre = s;
        } else {
          throw new ExtractionException(
              "No es posible extraer el nombre del elemento" + subtitulo + item
                  + asignacion);
        }
        String descripcion;
        s = elements.get(4);
        if (s != null) {
          descripcion = s;
        } else {
          descripcion = "";
        }
        
        ClasificadorPresupuestario c = new ClasificadorPresupuestario(subtitulo,
            item, asignacion, nombre, descripcion);
        clasificadores.add(c);
        cnumber++;
      }
    } catch (IOException e) {
      e.printStackTrace();
      
    }
    return clasificadores;
  }
  
  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#getExtractionDestination()
   */
  @Override
  public String getExtractionDestination() {
    return extractionDestination;
  }
  
  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#getExtractionSource()
   */
  @Override
  public String getExtractionSource() {
    return extractionSource;
  }
  
  /**
   * Obtiene un CVSReader apuntando al archivo de origen detallado en el archivo
   * extractor.properties
   *
   * @return el reader
   * @throws ExtractionException
   *           en caso de que no pueda obtenerse el handler al reader
   */
  private CSVReader getReader() throws ExtractionException {
    FileInputStream fi;
    try {
      fi = new FileInputStream(extractionSource);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new ExtractionException("Archivo de origen no encontrado");
    }
    CSVReader reader = null;
    try {
      reader = new CSVReader(new InputStreamReader(fi, "UTF-8"), ';');
    } catch (UnsupportedEncodingException e1) {
      e1.printStackTrace();
      try {
        fi.close();
      } catch (IOException e) {
        ClasificadorPresupuestarioExtractor.log
            .fine("Error al cerrar los streams de lectura");
        e.printStackTrace();
      }
      throw new ExtractionException("Error de codificación del archivo fuente");
    }
    return reader;
  }
}
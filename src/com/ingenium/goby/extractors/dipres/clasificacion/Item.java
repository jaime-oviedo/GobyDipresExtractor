/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Clase que representa el clasificador de item presupuestario.
 *
 * @author JaimeRodrigo
 */
public final class Item extends ClasificadorCompuesto {
  
  /**
   * Crea una nueva instancia de la clase Item.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   */
  public Item(int numero, String nombre, String descripcion) {
    super(numero, nombre, descripcion);
  }
  
  public void addAsignacion(Asignacion asignacion) {
    super.addSubelemento(asignacion);
  }
  
  public Asignacion getAsignacion(Integer numeroAsignacion) {
    return (Asignacion) super.getSubElementos().get(numeroAsignacion);
  }
  
  /**
   * Obtiene las asigaciones correspondientes a este item.
   *
   * @return las asigaciones correspondientes a este item
   */
  public Collection<Asignacion> getAsignaciones() {
    Iterator<Clasificador> it = getSubElementos().values().iterator();
    Collection<Asignacion> asignaciones = new ArrayList<>();
    while (it.hasNext()) {
      Asignacion asignacion = (Asignacion) it.next();
      asignaciones.add(asignacion);
    }
    return asignaciones;
  }
  
  /**
   * Establece las asignaciones para el item.
   *
   * @param asignaciones
   *          el nuevo conjunto de asignaciones
   */
  public void setAsignaciones(Collection<Asignacion> asignaciones) {
    Collection<Clasificador> clasificadores = new ArrayList<>();
    Iterator<Asignacion> it = asignaciones.iterator();
    while (it.hasNext()) {
      clasificadores.add(it.next());
    }
    super.setSubElementos(clasificadores);
  }
  
  @Override
  public String toJsonString(int nestingLevel) {
    StringBuilder nesting = new StringBuilder();
    for (int i = 0; i < nestingLevel; i++) {
      nesting.append("  ");
    }
    
    StringBuilder sb = new StringBuilder(nesting);
    sb.append("{\n");
    nesting.append("  ");
    String q = "\"";
    sb.append(nesting).append(q + "numero" + q + ":" + getNumero() + ",\n");
    sb.append(nesting)
        .append(q + "nombre" + q + ":" + q + getNombre() + q + ",\n");
    sb.append(nesting)
        .append(q + "descripcion" + q + ":" + q + getDescripcion() + q);
    
    if (getAsignaciones().size() > 0) {
      sb.append(",\n");
      sb.append(nesting).append(q + "asignaciones" + q + ":[ \n");
      Iterator<Asignacion> i = getAsignaciones().iterator();
      while (i.hasNext()) {
        Asignacion asignacion = i.next();
        sb.append(asignacion.toJsonString(nestingLevel + 2));
        if (i.hasNext()) {
          sb.append(",\n");
        } else {
          sb.append("\n");
        }
      }
      sb.append(nesting).append("]\n");
    } else {
      sb.append("\n");
    }
    nesting.delete(nesting.length() - 2, nesting.length());
    sb.append(nesting).append("}");
    return sb.toString();
  }
}

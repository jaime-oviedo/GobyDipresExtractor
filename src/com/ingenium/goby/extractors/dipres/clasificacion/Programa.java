
package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Programa extends ClasificadorCompuesto {

  public Programa(int numero, String nombre, String descripcion) {
    super(numero, nombre, descripcion);
  }

  public void addSubtitulo(Subtitulo subtitulo) {
    super.addSubelemento(subtitulo);
  }
  
  public Subtitulo getSubtitulo(Integer numeroSubtitulo) {
    return (Subtitulo) super.getSubElementos().get(numeroSubtitulo);
  }
  
  /**
   * Retorna los subtitulos asociados al programa.
   *
   * @return los subtitulos asociados al programa
   */
  public Collection<Subtitulo> getSubtitulos() {
    Iterator<Clasificador> it = getSubElementos().values().iterator();
    Collection<Subtitulo> subtitulos = new ArrayList<>();
    while (it.hasNext()) {
      Subtitulo item = (Subtitulo) it.next();
      subtitulos.add(item);
    }
    return subtitulos;
  }
  
  /**
   * Establece los subtitulos para el programa.
   *
   * @param subtitulos
   *          el nuevo conjunto de subtitulos
   */
  public void setSubtitulos(Collection<Subtitulo> subtitulos) {
    Collection<Clasificador> clasificadores = new ArrayList<>();
    Iterator<Subtitulo> it = subtitulos.iterator();
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
    
    if (getSubtitulos().size() > 0) {
      sb.append(",\n");
      sb.append(nesting).append(q + "subtitulos" + q + ":[\n");
      Iterator<Subtitulo> i = getSubtitulos().iterator();
      while (i.hasNext()) {
        Subtitulo item = i.next();
        sb.append(item.toJsonString(nestingLevel + 2));
        if (i.hasNext()) {
          sb.append(",\n");
        } else {
          sb.append("\n");
        }
      }
      sb.append(nesting).append("]\n");
    }
    nesting.delete(nesting.length() - 2, nesting.length());
    sb.append(nesting).append("}");
    return sb.toString();
  }

}

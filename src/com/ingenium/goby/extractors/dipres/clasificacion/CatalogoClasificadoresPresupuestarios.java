
package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.Collection;

public class CatalogoClasificadoresPresupuestarios {
  
  private Programa programa;
  
  public CatalogoClasificadoresPresupuestarios() {
    programa = new Programa(0, "", "");
  }
  
  public void addSubtitulo(Subtitulo s) {
    programa.addSubtitulo(s);
  }
  
  /**
   * Agrega un item al subtitulo identificado.
   *
   * @param numeroSubtitulo
   *          identificador del subtitulo
   * @param item
   *          el item a agregar
   */
  public void addItem(Integer numeroSubtitulo, Item item) {
    Subtitulo s = programa.getSubtitulo(numeroSubtitulo);
    if (s != null) {
      s.addItem(item);
    }
  }
  
  /**
   * Agrega una asignación al item identificado.
   *
   * @param numeroSubtitulo
   *          el subtitulo al que pertenece el item
   * @param numeroItem
   *          el item identificado
   * @param asignacion
   *          la asignación a agrregar
   */
  public void addAsignacion(Integer numeroSubtitulo, Integer numeroItem,
      Asignacion asignacion) {
    Subtitulo s = programa.getSubtitulo(numeroSubtitulo);
    if (s != null) {
      Item item = s.getItem(numeroItem);
      if (item != null) {
        item.addAsignacion(asignacion);
      }
    }
  }
  
  public Subtitulo getSubtitulo(Integer numero) {
    return programa.getSubtitulo(numero);
  }
  
  public Collection<Subtitulo> getSubtitulos() {
    return programa.getSubtitulos();
  }
  
  public String toJsonString(int nestingLevel) {
    return programa.toJsonString(nestingLevel);
  }
}

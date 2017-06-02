package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.Map;

public class CatalogoClasificadoresPresupuestarios {

  private final Programa programa;

  public CatalogoClasificadoresPresupuestarios(int numero, String nombre,
      String descripcion, Map<Integer, Subtitulo> subTitulos) {
    programa = new Programa(numero, nombre, descripcion, subTitulos);
  }

  public Map<Integer, Subtitulo> getSubtitulos() {
    return programa.getSubtitulos();
  }

}

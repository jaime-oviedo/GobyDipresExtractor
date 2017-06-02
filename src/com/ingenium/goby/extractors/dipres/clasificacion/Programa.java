package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.Map;

public final class Programa extends ClasificadorCompuesto {

  public Programa(int numero, String nombre, String descripcion,
      Map<Integer, Subtitulo> subtitulos) {
    super(numero, nombre, descripcion, subtitulos);
  }

  @SuppressWarnings("unchecked")
  public final Map<Integer, Subtitulo> getSubtitulos() {
    return (Map<Integer, Subtitulo>) getSubElementos();
  }

  public void setAsignaciones(Map<Integer, Subtitulo> subtitulos) {
    super.setSubElementos(subtitulos);
  }

}

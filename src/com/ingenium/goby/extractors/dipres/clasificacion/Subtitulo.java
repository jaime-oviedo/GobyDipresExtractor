package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.Map;

public final class Subtitulo extends ClasificadorCompuesto {

  public Subtitulo(int numero, String nombre, String descripcion,
      Map<Integer, Item> items) {
    super(numero, nombre, descripcion, items);
  }

  @SuppressWarnings("unchecked")
  public final Map<Integer, Item> getItems() {
    return (Map<Integer, Item>) getSubElementos();
  }

  public void setItems(Map<Integer, Item> items) {
    super.setSubElementos(items);
  }

}

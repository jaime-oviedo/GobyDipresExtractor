
package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Subtitulo extends ClasificadorCompuesto {
  
  public Subtitulo(int numero, String nombre, String descripcion) {
    super(numero, nombre, descripcion);
  }
  
  public void addItem(Item item) {
    super.addSubelemento(item);
  }

  public Item getItem(Integer numeroItem) {
    return (Item) super.getSubElementos().get(numeroItem);
  }

  /**
   * Retorna los items asociados al subtitulo.
   *
   * @return los items asociados al subtitulo
   */
  public Collection<Item> getItems() {
    Iterator<Clasificador> it = getSubElementos().values().iterator();
    Collection<Item> items = new ArrayList<>();
    while (it.hasNext()) {
      Item item = (Item) it.next();
      items.add(item);
    }
    return items;
  }

  /**
   * Establece los items para la asignacion.
   *
   * @param items
   *          el nuevo conjunto de asignaciones
   */
  public void setItems(Collection<Item> items) {
    Collection<Clasificador> clasificadores = new ArrayList<>();
    Iterator<Item> it = items.iterator();
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

    if (getItems().size() > 0) {
      sb.append(",\n");
      sb.append(nesting).append(q + "items" + q + ":[\n");
      Iterator<Item> i = getItems().iterator();
      while (i.hasNext()) {
        Item item = i.next();
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

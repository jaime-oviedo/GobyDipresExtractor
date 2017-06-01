/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;

/**
 * Clase que representa un subtitulo presupuestario.
 *
 * @author JaimeRodrigo
 */
final class Subtitulo {
  
  private final int numero;
  private final String nombre;
  private final Collection<Item> items;
  private final BigInteger presupuesto;

  /**
   * Crea una nueva instancia de la clase Subtitulo.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param items
   *          el valor del campo items
   */
  public Subtitulo(int numero, String nombre, Collection<Item> items) {
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.items = items;
    Iterator<Item> a = items.iterator();
    BigInteger pres = BigInteger.ZERO;
    while (a.hasNext()) {
      pres = pres.add(a.next().getPresupuesto());
    }
    presupuesto = pres;
  }
  
  /**
   * Devuelve el valor del campo items.
   *
   * @return el valor del campo items
   */
  public final Collection<Item> getItems() {
    return items;
  }
  
  /**
   * Devuelve el valor del campo nombre.
   *
   * @return el valor del campo nombre
   */
  public final String getNombre() {
    return nombre;
  }
  
  /**
   * Devuelve el valor del campo numero.
   *
   * @return el valor del campo numero
   */
  public final int getNumero() {
    return numero;
  }
  
  /**
   * Devuelve el valor del campo presupuesto.
   * 
   * @return el valor del campo presupuesto
   */
  public final BigInteger getPresupuesto() {
    return presupuesto;
  }
  
}

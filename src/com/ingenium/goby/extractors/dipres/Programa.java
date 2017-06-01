/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Clase que representa un programa presupuestario.
 *
 * @author JaimeRodrigo
 */
final class Programa {

  private final int numero;
  private final String nombre;
  private final Collection<Subtitulo> subtitulos;
  private final BigInteger presupuesto;

  /**
   * Crea una nueva instancia de la clase Programa.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param subtitulos
   *          el valor del campo subtitulos
   */
  public Programa(int numero, String nombre, Collection<Subtitulo> subtitulos) {
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.subtitulos = subtitulos;
    Iterator<Subtitulo> a = subtitulos.iterator();
    BigInteger pres = BigInteger.ZERO;
    while (a.hasNext()) {
      pres = pres.add(a.next().getPresupuesto());
    }
    presupuesto = pres;
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

  /**
   * Devuelve el valor del campo subtitulos.
   *
   * @return el valor del campo subtitulos
   */
  public final Collection<Subtitulo> getSubtitulos() {
    return Collections.unmodifiableCollection(subtitulos);
  }
  
}

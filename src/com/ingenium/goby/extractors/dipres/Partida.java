/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;

/**
 * Clase que representa una partida presupuestaria.
 *
 * @author JaimeRodrigo
 */
final class Partida {

  private final int numero;
  private final String nombre;
  private final Collection<Capitulo> capitulos;
  private final BigInteger presupuesto;
  
  /**
   * Crea una nueva instancia de la clase Partida.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param capitulos
   *          el valor del campo capitulos
   */
  public Partida(int numero, String nombre, Collection<Capitulo> capitulos) {
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.capitulos = capitulos;
    Iterator<Capitulo> a = capitulos.iterator();
    BigInteger pres = BigInteger.ZERO;
    while (a.hasNext()) {
      pres = pres.add(a.next().getPresupuesto());
    }
    presupuesto = pres;
  }

  /**
   * Devuelve el valor del campo capitulos.
   *
   * @return el valor del campo capitulos
   */
  public final Collection<Capitulo> getCapitulos() {
    return capitulos;
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

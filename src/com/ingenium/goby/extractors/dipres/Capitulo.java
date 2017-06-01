/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;

/**
 * Clase que representa un capitulo presupuestario.
 *
 * @author JaimeRodrigo
 */
final class Capitulo {

  private final int numero;
  private final String nombre;
  private final Collection<Programa> programas;
  private final BigInteger presupuesto;
  
  /**
   * Crea una nueva instancia de la clase Capitulo.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param programas
   *          el valor del campo programas
   */
  public Capitulo(int numero, String nombre, Collection<Programa> programas) {
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.programas = programas;
    Iterator<Programa> a = programas.iterator();
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
   * Devuelve el valor del campo programas.
   *
   * @return el valor del campo programas
   */
  public final Collection<Programa> getProgramas() {
    return programas;
  }
  
}

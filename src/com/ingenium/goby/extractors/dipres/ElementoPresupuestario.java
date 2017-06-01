package com.ingenium.goby.extractors.dipres;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ElementoPresupuestario {

  protected final int numero;
  protected final String nombre;
  protected final String descripcion;
  protected final BigInteger presupuesto;
  protected final Collection<? extends ElementoPresupuestario> subElementos;

  /**
   * Crea una nueva instancia de la clase Elemento presupuestario con una lista vacía de sub
   * elementos.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param presupuesto
   *          el valor del campo presupuesto
   */
  public ElementoPresupuestario(int numero, String nombre, String descripcion,
      BigInteger presupuesto) {
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.presupuesto = presupuesto;
    this.subElementos = Collections.emptyList();
  }

  /**
   * Crea una nueva instancia de la clase Elemento presupuestario, con el presupuesto calculado a
   * partir de sus sub elementos.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   */

  public ElementoPresupuestario(int numero, String nombre, String descripcion,
      Collection<? extends ElementoPresupuestario> subElementos) {
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.subElementos = subElementos;
    Iterator<?> a = this.subElementos.iterator();
    BigInteger pres = BigInteger.ZERO;
    while (a.hasNext()) {
      pres = pres.add(((ElementoPresupuestario) a.next()).getPresupuesto());
    }
    presupuesto = pres;
  }

  /**
   * Devuelve el valor del campo descripcion.
   *
   * @return el valor del campo descripcion
   */
  public String getDescripcion() {
    return descripcion;
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

  public Collection<? extends ElementoPresupuestario> getSubElementos() {
    return subElementos;
  }

}
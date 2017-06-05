
package com.ingenium.goby.extractors.dipres.ley;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Clase base que representa un elemento presupuestario que puede componerse
 * internamente de otros subelementos presupuestarios.
 **/
abstract class ElementoPresupuestarioCompuesto extends ElementoPresupuestario {
  
  /**
   * Calcula el presupuesto agregado de un conjunto de elementos presupuestarios
   * complejos.
   *
   * @param subElementos2
   *          la colección de elementos considerados en el presupuesto agregado
   * @return la suma de los presupuestos de los subelementos
   */
  private static BigInteger calculaPresupuesto(
      Collection<? extends ElementoPresupuestario> subElementos2) {
    BigInteger presupuesto = BigInteger.ZERO;
    Iterator<? extends ElementoPresupuestario> it = subElementos2.iterator();
    while (it.hasNext()) {
      presupuesto = presupuesto.add(it.next().getPresupuesto());
    }
    return null;
  }
  
  protected final Collection<? extends ElementoPresupuestario> subElementos;

  /**
   * Crea una nueva instancia de la clase Elemento presupuestario con una lista
   * vacía de sub elementos.
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
  public ElementoPresupuestarioCompuesto(int numero, String nombre,
      String descripcion, BigInteger presupuesto) {
    super(numero, nombre, descripcion, presupuesto);
    subElementos = Collections.emptyList();
  }
  
  /**
   * Crea una nueva instancia de la clase Elemento presupuestario, con el
   * presupuesto calculado a partir de sus sub elementos.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   */

  public ElementoPresupuestarioCompuesto(int numero, String nombre,
      String descripcion,
      Collection<? extends ElementoPresupuestario> subElementos) {
    super(numero, nombre, descripcion,
        ElementoPresupuestarioCompuesto.calculaPresupuesto(subElementos));
    this.subElementos = subElementos;
  }
  
  public Collection<? extends ElementoPresupuestario> getSubElementos() {
    return subElementos;
  }
}
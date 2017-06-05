/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.ley;

import java.util.Collection;
import java.util.Collections;

/**
 * Clase que representa un capitulo presupuestario.
 *
 * @author JaimeRodrigo
 */
final class CapituloPresupuesto extends ElementoPresupuestarioCompuesto {

  /**
   * Crea una nueva instancia de la clase CapituloPresupuesto.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param programaPresupuestos
   *          el valor del campo programas
   */
  public CapituloPresupuesto(int numero, String nombre, String descripcion,
      Collection<ProgramaPresupuesto> programaPresupuestos) {
    super(numero, nombre, descripcion, programaPresupuestos);
  }

  /**
   * Devuelve el valor del campo programas.
   *
   * @return el valor del campo programas
   */
  @SuppressWarnings("unchecked")
  public final Collection<ProgramaPresupuesto> getProgramas() {
    return ((Collection<ProgramaPresupuesto>) Collections
        .unmodifiableCollection(getSubElementos()));
  }

}

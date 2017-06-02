/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.ley;

import java.util.Collection;
import java.util.Collections;

/**
 * Clase que representa un programa presupuestario.
 *
 * @author JaimeRodrigo
 */
final class ProgramaPresupuesto extends ElementoPresupuestoCompuesto {

  /**
   * Crea una nueva instancia de la clase ProgramaPresupuesto.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param subtituloPresupuestos
   *          el valor del campo subtitulos
   */
  public ProgramaPresupuesto(int numero, String nombre, String descripcion,
      Collection<SubtituloPresupuesto> subtituloPresupuestos) {
    super(numero, nombre, descripcion, subtituloPresupuestos);
  }

  /**
   * Devuelve el valor del campo subtitulos.
   *
   * @return el valor del campo subtitulos
   */
  @SuppressWarnings("unchecked")
  public final Collection<SubtituloPresupuesto> getSubtitulos() {
    return ((Collection<SubtituloPresupuesto>) Collections
        .unmodifiableCollection(getSubElementos()));
  }

}

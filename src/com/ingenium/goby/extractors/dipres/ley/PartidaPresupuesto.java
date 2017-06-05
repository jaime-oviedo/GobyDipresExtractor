/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.ley;

import java.util.Collection;
import java.util.Collections;

/**
 * Clase que representa una partida presupuestaria.
 *
 * @author JaimeRodrigo
 */
final class PartidaPresupuesto extends ElementoPresupuestarioCompuesto {

  /**
   * Crea una nueva instancia de la clase PartidaPresupuesto.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param capituloPresupuestos
   *          el valor del campo capitulos
   */
  public PartidaPresupuesto(int numero, String nombre, String descripcion,
      Collection<CapituloPresupuesto> capituloPresupuestos) {
    super(numero, nombre, descripcion, capituloPresupuestos);
  }

  /**
   * Devuelve el valor del campo capitulos.
   *
   * @return el valor del campo capitulos
   */
  @SuppressWarnings("unchecked")
  public final Collection<CapituloPresupuesto> getCapitulos() {
    return ((Collection<CapituloPresupuesto>) Collections
        .unmodifiableCollection(getSubElementos()));
  }

}

/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Clase base que representa un clasificador presupuestario que puede componerse
 * internamente de otros subelementos de clasificación.
 *
 * @author JaimeRodrigo
 */
public class ClasificadorCompuesto extends Clasificador {

  private Map<Integer, Clasificador> subElementos;

  /**
   * Crea una nueva instancia de la clase ClasificadorCompuesto.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   */
  
  public ClasificadorCompuesto(int numero, String nombre, String descripcion) {
    super(numero, nombre, descripcion);
    subElementos = new HashMap<>();
  }

  public void addSubelemento(Clasificador subelemento) {
    subElementos.put(subelemento.getNumero(), subelemento);
  }

  public Clasificador getSubelemento(Integer numero) {
    return subElementos.get(numero);
  }

  /**
   * Devuelve el valor del campo subElementos.
   *
   * @return el valor del campo subElementos
   */
  public Map<Integer, Clasificador> getSubElementos() {
    return subElementos;
  }
  
  /**
   * Establece el valor del campo subElementos.
   *
   * @param clasificadores
   *          el valor del campo subElementos
   */
  public void setSubElementos(Collection<Clasificador> clasificadores) {
    subElementos.clear();
    Iterator<Clasificador> it = clasificadores.iterator();
    while (it.hasNext()) {
      Clasificador clasificador = it.next();
      subElementos.put(clasificador.getNumero(), clasificador);
    }

  }

}

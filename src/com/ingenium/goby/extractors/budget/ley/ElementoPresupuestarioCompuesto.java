
package com.ingenium.goby.extractors.budget.ley;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;base&nbsp;que&nbsp;representa&nbsp;un&nbsp;elemento&nbsp;presupuestario&nbsp;que&nbsp;puede&nbsp;componerse<br>internamente&nbsp;de&nbsp;otros&nbsp;subelementos&nbsp;presupuestarios.
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_Ua2CYEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ua2CYEquEeeJsdrfgQXeQw"
 */
abstract class ElementoPresupuestarioCompuesto extends ElementoPresupuestario {

  /** 
  * <!-- begin-UML-doc -->
  * Calcula&nbsp;el&nbsp;presupuesto&nbsp;agregado&nbsp;de&nbsp;un&nbsp;conjunto&nbsp;de&nbsp;elementos&nbsp;presupuestarios<br>complejos.<br><br>@param&nbsp;subElementos2<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;la&nbsp;colección&nbsp;de&nbsp;elementos&nbsp;considerados&nbsp;en&nbsp;el&nbsp;presupuesto&nbsp;agregado<br>@return&nbsp;la&nbsp;suma&nbsp;de&nbsp;los&nbsp;presupuestos&nbsp;de&nbsp;los&nbsp;subelementos
  * <!-- end-UML-doc -->
  * @param subElementos2
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjpZEEquEeeJsdrfgQXeQw"
  */
  private static BigInteger calculaPresupuesto(
      Collection<? extends ElementoPresupuestario> subElementos2) {
    // begin-user-code
    BigInteger presupuesto = BigInteger.ZERO;
    Iterator<? extends ElementoPresupuestario> it = subElementos2.iterator();
    while (it.hasNext()) {
      presupuesto = presupuesto.add(it.next().getPresupuesto());
    }
    return null;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjlusUquEeeJsdrfgQXeQw"
  */
  protected final Collection<? extends ElementoPresupuestario> subElementos;

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;Elemento&nbsp;presupuestario&nbsp;con&nbsp;una&nbsp;lista<br>vacía&nbsp;de&nbsp;sub&nbsp;elementos.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion<br>@param&nbsp;presupuesto<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;presupuesto
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param presupuesto
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjscYEquEeeJsdrfgQXeQw"
  */
  public ElementoPresupuestarioCompuesto(int numero, String nombre,
      String descripcion, BigInteger presupuesto) {
    // begin-user-code
    super(numero, nombre, descripcion, presupuesto);
    subElementos = Collections.emptyList();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;Elemento&nbsp;presupuestario,&nbsp;con&nbsp;el<br>presupuesto&nbsp;calculado&nbsp;a&nbsp;partir&nbsp;de&nbsp;sus&nbsp;sub&nbsp;elementos.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param subElementos
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uju4oEquEeeJsdrfgQXeQw"
  */

  public ElementoPresupuestarioCompuesto(int numero, String nombre,
      String descripcion,
      Collection<? extends ElementoPresupuestario> subElementos) {
    // begin-user-code
    super(numero, nombre, descripcion,
        ElementoPresupuestarioCompuesto.calculaPresupuesto(subElementos));
    this.subElementos = subElementos;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ujx78EquEeeJsdrfgQXeQw"
  */
  public Collection<? extends ElementoPresupuestario> getSubElementos() {
    // begin-user-code
    return subElementos;
    // end-user-code
  }
}
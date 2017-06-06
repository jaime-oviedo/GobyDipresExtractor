
package com.ingenium.goby.extractors.budget.ley;

import java.util.Iterator;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UZy5gEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UZy5gEquEeeJsdrfgQXeQw"
 */
final class PresupuestoJsonMapper {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param a
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ue6qEEquEeeJsdrfgQXeQw"
  */
  public static String map(AsignacionPresupuestaria a) {
    // begin-user-code
    return PresupuestoJsonMapper.map(a, 0);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param a
  * @param nesting
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ue9GUEquEeeJsdrfgQXeQw"
  */
  public static String map(AsignacionPresupuestaria a, int nesting) {
    // begin-user-code
    return PresupuestoJsonMapper.mapBase(a).toString();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param i
  * @param nesting
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfAwsEquEeeJsdrfgQXeQw"
  */
  public static String map(ItemPresupuesto i, int nesting) {
    // begin-user-code
    StringBuilder sb = PresupuestoJsonMapper.mapBase(i);
    if (i.getSubElementos().size() > 0) {
      for (int n = 0; n < nesting; n++) {
        sb.append("  ");
      }
      sb.append("\"asignaciones\":{\n");
      Iterator<AsignacionPresupuestaria> it = i.getAsignaciones().iterator();
      while (it.hasNext()) {
        for (int n = 0; n < (nesting + 1); n++) {
          sb.append("  ");
        }
        sb.append("{ ");
        sb.append(PresupuestoJsonMapper.mapBase(it.next()).toString());
        sb.append(" } \n");
      }
      sb.append("}");
    }
    return sb.toString();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param ep
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfDM8EquEeeJsdrfgQXeQw"
  */
  private static StringBuilder mapBase(ElementoPresupuestario ep) {
    // begin-user-code
    StringBuilder sb = new StringBuilder();
    sb.append("\"nombre\":" + "\"" + ep.getNombre() + "\"" + ",");
    sb.append("\"numero\":" + ep.getNumero() + ",");
    sb.append("\"presupuesto\":" + ep.getPresupuesto().intValue());
    return sb;
    // end-user-code
  }
}

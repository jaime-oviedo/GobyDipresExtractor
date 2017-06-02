
package com.ingenium.goby.extractors.dipres.ley;

import java.util.Iterator;

final class PresupuestoJsonMapper {
  
  public static String map(AsignacionPresupuesto a) {
    return PresupuestoJsonMapper.map(a, 0);
  }

  public static String map(AsignacionPresupuesto a, int nesting) {
    return PresupuestoJsonMapper.mapBase(a).toString();
  }
  
  public static String map(ItemPresupuesto i, int nesting) {
    StringBuilder sb = PresupuestoJsonMapper.mapBase(i);
    if (i.getSubElementos().size() > 0) {
      for (int n = 0; n < nesting; n++) {
        sb.append("  ");
      }
      sb.append("\"asignaciones\":{\n");
      Iterator<AsignacionPresupuesto> it = i.getAsignaciones().iterator();
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
  }
  
  private static StringBuilder mapBase(ElementoPresupuesto ep) {
    StringBuilder sb = new StringBuilder();
    sb.append("\"nombre\":" + "\"" + ep.getNombre() + "\"" + ",");
    sb.append("\"numero\":" + ep.getNumero() + ",");
    sb.append("\"presupuesto\":" + ep.getPresupuesto().intValue());
    return sb;
  }
}

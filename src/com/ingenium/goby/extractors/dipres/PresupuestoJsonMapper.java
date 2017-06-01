package com.ingenium.goby.extractors.dipres;

final class PresupuestoJsonMapper {

  public static String map(Asignacion a) {
    return PresupuestoJsonMapper.mapBase(a).toString();
  }

  public static String map(Item i) {
    StringBuilder sb = PresupuestoJsonMapper.mapBase(i);
    if (i.getSubElementos().size() > 0) {
      sb.append("\"asignaciones\":[");
    }
    return sb.toString();
  }

  private static StringBuilder mapBase(ElementoPresupuestario ep) {
    StringBuilder sb = new StringBuilder();
    sb.append("\"nombre\":" + "\"" + ep.getNombre() + "\"" + ",");
    sb.append("\"numero\":" + ep.getNumero() + ",");
    sb.append("\"presupuesto\":" + ep.getPresupuesto().intValue());
    return sb;
  }
}

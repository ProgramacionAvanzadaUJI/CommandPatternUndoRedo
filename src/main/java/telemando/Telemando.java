package telemando;

import command.Accion;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by oscar on 11/4/16.
 */
public class Telemando {
    private Map<TipoAccion, Accion> acciones = new HashMap<TipoAccion, Accion>();

    public void ejecutaAccion(TipoAccion tipoAccion) {
        acciones.get(tipoAccion).ejecutaAccion();
    }

    public void setAccion(TipoAccion tipoAccion, Accion accion) {
        acciones.put(tipoAccion, accion);
    }
}
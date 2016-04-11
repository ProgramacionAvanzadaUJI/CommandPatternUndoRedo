package command;

import electrodomestico.TV;

/**
 * Created by oscar on 11/4/16.
 */
public class AccionEnciendeTV implements Accion {
    private TV tv;

    public AccionEnciendeTV(TV tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void ejecutaAccion() {
        tv.enciende();
    }

    @Override
    public void undo() {
        tv.apaga();
    }
}

package command;

import electrodomestico.TV;

/**
 * Created by oscar on 11/4/16.
 */
public class AccionApagaTV implements Accion {
    private TV tv;

    public AccionApagaTV(TV tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void ejecutaAccion() {
        tv.apaga();
    }

    @Override
    public void undo() {
        tv.enciende();
    }
}
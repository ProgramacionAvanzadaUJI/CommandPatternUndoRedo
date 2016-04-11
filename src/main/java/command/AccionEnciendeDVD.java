package command;

import electrodomestico.DVD;

/**
 * Created by oscar on 11/4/16.
 */
public class AccionEnciendeDVD implements Accion {
    private DVD dvd;

    public AccionEnciendeDVD(DVD dvd) {
        super();
        this.dvd = dvd;
    }

    @Override
    public void ejecutaAccion() {
        dvd.play();
    }

    @Override
    public void undo() {
        dvd.stop();
    }
}
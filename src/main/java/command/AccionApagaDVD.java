package command;

import electrodomestico.DVD;

/**
 * Created by oscar on 11/4/16.
 */
public class AccionApagaDVD implements Accion {
    private DVD dvd;

    public AccionApagaDVD(DVD dvd) {
        super();
        this.dvd = dvd;
    }

    @Override
    public void ejecutaAccion() {
        dvd.stop();
    }

    @Override
    public void undo() {
        dvd.play();
    }
}
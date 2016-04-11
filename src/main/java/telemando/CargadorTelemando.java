package telemando;

import command.AccionApagaDVD;
import command.AccionApagaTV;
import command.AccionEnciendeDVD;
import command.AccionEnciendeTV;
import electrodomestico.DVD;
import electrodomestico.TV;

/**
 * Created by oscar on 11/4/16.
 */
public class CargadorTelemando {
    public void cargaTelemando(Telemando telemando) {
        TV tv = new TV();
        telemando.setAccion(TipoAccion.ENCENDER_TV, new AccionEnciendeTV(tv));
        telemando.setAccion(TipoAccion.APAGAR_TV, new AccionApagaTV(tv));
        DVD dvd = new DVD();
        telemando.setAccion(TipoAccion.ENCENDER_DVD, new AccionEnciendeDVD(dvd));
        telemando.setAccion(TipoAccion.APAGAR_DVD, new AccionApagaDVD(dvd));
    }
}
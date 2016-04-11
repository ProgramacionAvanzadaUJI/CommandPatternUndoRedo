package main;

import telemando.CargadorTelemando;
import telemando.Telemando;
import telemando.TipoAccion;

/**
 * Created by oscar on 11/4/16.
 */
public class Main {
    public static void main(String[] args) {
        new Main().lauch();
    }

    private void lauch() {
        CargadorTelemando cargadorTelemando = new CargadorTelemando();
        Telemando telemando = new Telemando();
        cargadorTelemando.cargaTelemando(telemando);
        telemando.ejecutaAccion(TipoAccion.ENCENDER_TV);
        telemando.ejecutaAccion(TipoAccion.ENCENDER_DVD);
        telemando.ejecutaAccion(TipoAccion.APAGAR_TV);
        telemando.ejecutaAccion(TipoAccion.APAGAR_DVD);
    }
}

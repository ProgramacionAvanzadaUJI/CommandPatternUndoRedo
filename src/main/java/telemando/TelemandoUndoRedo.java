package telemando;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by oscar on 11/4/16.
 */
public class TelemandoUndoRedo extends Telemando {
    private Deque<TipoAccion> undo = new ArrayDeque<TipoAccion>();
    private Deque<TipoAccion> redo = new ArrayDeque<TipoAccion>();

    public TelemandoUndoRedo() {
        super();
    }

    @Override
    public void ejecutaAccion(TipoAccion tipoAccion) {
        super.ejecutaAccion(tipoAccion);
        undo.push(tipoAccion);
    }

    public void undoAccion() {
        if (undo.isEmpty() == false) {
            TipoAccion tipoAccion = undo.pop();
            acciones.get(tipoAccion).undo();
            redo.push(tipoAccion);
        } else System.out.println("La pila undo está vacía.");
    }

    public void redoAccion() {
        if (redo.isEmpty() == false) {
            TipoAccion tipoAccion = redo.pop();
            ejecutaAccion(tipoAccion);
        } else System.out.println("La pila redo está vacía.");
    }
}

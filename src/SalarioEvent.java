
import java.util.*;

public class SalarioEvent extends EventObject {

    protected int anteSueldo, nuevoSueldo;
    protected Object objFuente;

    public SalarioEvent(Object fuente, int anterior, int nuevo) {
        super(fuente);
        this.nuevoSueldo=nuevo;
        this.anteSueldo=anterior;
        this.objFuente = fuente;
    }

    public int getNuevoSueldo(){
        return nuevoSueldo;
    }

    public int getAnteSueldo(){
        return anteSueldo;
    }

    public Object getSource(){
        return objFuente;
    }
}

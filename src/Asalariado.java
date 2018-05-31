import java.beans.*;
import java.io.Serializable;
import java.util.*;

public class Asalariado implements Serializable{
    private Vector salarioListeners = new Vector();

    private int sueldo;

    public Asalariado() {
        sueldo=20;
    }

    public void setSueldo(int nuevoSueldo){
        int anteSueldo=sueldo;
        sueldo=nuevoSueldo;
        if(anteSueldo!=nuevoSueldo){
            SalarioEvent event = new SalarioEvent(this, anteSueldo, nuevoSueldo);
            notificarCambio(event);
        }
    }

    public int getSalario(){
        return sueldo;
    }

    public synchronized void addSalarioListener(SalarioListener listener){
        salarioListeners.addElement(listener);
    }

    public synchronized void removeSalarioListener(SalarioListener listener){
        salarioListeners.removeElement(listener);
    }

    private void notificarCambio(SalarioEvent event){
        Vector lista;
        synchronized(this){
            lista = (Vector) salarioListeners.clone();
        }
        for(int i=0; i<lista.size(); i++){
            SalarioListener listener=(SalarioListener)lista.elementAt(i);
            listener.enteradoCambioSueldo(event);
        }
    }
}

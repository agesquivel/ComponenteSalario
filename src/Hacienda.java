import java.util.*;

public class Hacienda implements SalarioListener{

    public Hacienda() {
    }
    public void enteradoCambioSueldo(EventObject ev){
        if(ev instanceof SalarioEvent){
            SalarioEvent event=(SalarioEvent)ev;
            System.out.println("Hacienda: nuevo sueldo    "+event.getNuevoSueldo());
            System.out.println("Hacienda: sueldo anterior "+event.getAnteSueldo());
        }
    }
}

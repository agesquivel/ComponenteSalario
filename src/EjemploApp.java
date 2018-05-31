public class EjemploApp {

    public static void main(String[] args) {
        Hacienda funcionario1 = new Hacienda();
        Asalariado empleado=new Asalariado();
        System.out.println("----------------------------");
        empleado.addSalarioListener(funcionario1);
        empleado.setSueldo(50);

        try  {
            System.in.read();
        }catch (Exception e) {  }
    }
}


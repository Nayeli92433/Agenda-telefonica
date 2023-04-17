import java.util.Scanner;

public class Ingresar {
    private Numero num;



    public  void datos(Scanner scanner){
        num= new Numero();
        System.out.println("----------INGRESE LOS DATOS----------");
        System.out.println("Ingrese el nombre:");
        num.setNombre(scanner.next());
        System.out.println("Ingrese numero telefonico:");
        num.setNewNumero(scanner.nextInt());
        System.out.println("----------INGRESE LA FECHA----------");
        System.out.println("Ingrese el dia:");
        num.setDia(scanner.nextInt());
        System.out.println("Ingrese el mes");
        num.setMes(scanner.next());

    }
    //@Override
    public Numero readData() {
        return num;
    }
}

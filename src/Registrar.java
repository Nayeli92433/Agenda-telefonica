import java.util.ArrayList;
import java.util.Scanner;

public class Registrar {
    public ArrayList<Numero> registro = new ArrayList<>();
    Ingresar ingresar = new Ingresar();
    Actualizar actualizar= new Actualizar();

    public void ingresarRegistro(int o) {
        Scanner scanner = new Scanner(System.in);

        if (o >= 0 && o < registro.size()) {
            actualizar.actualizarRegistro(this,o);
            return;
        }

        System.out.println("Ingresa la cantidad de registros de Alumnos que desea ingresar");
        int reg = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < reg; i++) {
            Numero registro = new Numero();
            System.out.println("----------INGRESE LOS DATOS----------");
            System.out.println("Ingrese el nombre:");
            registro.setNombre(scanner.next());
            System.out.println("Ingrese apellido:");
            registro.setApellido(scanner.next());
            System.out.println("Ingrese numero telefonico:");
            registro.setNewNumero(scanner.nextInt());
            System.out.println("Ingrese correo electronico:");
            registro.setCorreo(scanner.next());
            System.out.println("----------INGRESE LA FECHA----------");
            System.out.println("Ingrese el dia:");
            registro.setDia(scanner.nextInt());
            System.out.println("Ingrese el mes");
            registro.setMes(scanner.next());
            scanner.nextLine();
            this.registro.add(registro);
        }
    }

    public ArrayList<Numero> getRegistro() {
        return registro;
    }

    public int tamRegistro() {
        if (registro.isEmpty()) {
            System.out.println("\n NO EXISTEN DATOS");
            return 0;
        } else {
            return registro.size();
        }
    }
}
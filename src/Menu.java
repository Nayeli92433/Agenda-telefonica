import java.util.Scanner;

public class Menu {
    Registrar registro = new Registrar();
    //Mostrar mostrar = new Mostrar();
    Actualizar actualizar=new Actualizar();

    public void opciones() {
        Scanner scanner = new Scanner(System.in);
        int Op;

        do {
            System.out.println("----MENU----");
            System.out.println("[1].-Registrar Numero");
            System.out.println("[2].-Consultar Numeros");
            System.out.println("[3].-Eliminar Numeros");
            System.out.println("[4].-Actualizar Registro");
            System.out.println("[5].-Salir");
            Op = scanner.nextInt();

            switch (Op) {
                case 1:
                    System.out.println("Ingresar Registro");
                    System.out.println("------------------");
                    registro.ingresarRegistro(0);
                    break;
                case 2:
                    System.out.println("Mostrar Registro");
                    System.out.println("------------------");
                    //mostrar.mostrarRegistro(registro);
                    break;
                case 3:
                    System.out.println("Eliminar todos los registros");
                    System.out.println("------------------");
                    Eliminar eliminar = new Eliminar();
                    eliminar.eliminarRegistros(registro);
                    break;
                case 4:
                    System.out.println("Actualizar Registro");
                    System.out.println("------------------");
                    registro.ingresarRegistro(scanner.nextInt());
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (Op != 5);
    }
}

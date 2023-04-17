import java.util.Scanner;

public class Actualizar  {
    public void actualizarRegistro(Registrar registro, int o) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el índice del registro a actualizar:");
        int indice = scanner.nextInt();
        indice=indice-1;
        scanner.nextLine();

        if (indice >= registro.tamRegistro()) {
            System.out.println("Índice inválido");
            return;
        }

        Numero num = registro.getRegistro().get(indice);
        System.out.println("Registro a actualizar: " + num.toString());
        System.out.println("Ingrese los nuevos datos:");

        System.out.println("Ingrese el nombre:");
        num.setNombre(scanner.next());
        System.out.println("Ingrese el apellido:");
        num.setApellido(scanner.next());
        System.out.println("Ingrese el número telefónico:");
        num.setNewNumero(scanner.nextInt());
        System.out.println("Ingrese el correo electrónico:");
        num.setCorreo(scanner.next());
        System.out.println("Ingrese el día:");
        num.setDia(scanner.nextInt());
        System.out.println("Ingrese el mes:");
        num.setMes(scanner.next());

        System.out.println("Registro actualizado: " + num.toString());
    }

}



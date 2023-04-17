import java.util.ArrayList;
public class Mostrar {
    public void mostrarRegistro(Registrar registro) {
        ArrayList<Numero> listaRegistros = registro.getRegistro();
        int tam = registro.tamRegistro();

        if (tam == 0) {
            System.out.println("\n NO EXISTEN DATOS");
        } else {
            System.out.println("\n REGISTROS:");
            for (Numero num : listaRegistros) {
                System.out.println(num.toString());
            }
        }
    }
}

public class Numero {
    String newNumero;
    String apellido;
    String correo;
    String nombre;
    String dia;
    String mes;
    public Numero(){

    }

    public Numero(String newNumero, String apellido, String correo, String nombre, String dia, String mes) {
        this.newNumero = newNumero;
        this.apellido = apellido;
        this.correo = correo;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
    }

    public String getNewNumero(){return newNumero;}
    public String getCorreo(){return correo;}
    public String getApellido(){return  apellido;}
    public String getNombre(){return nombre;}
    public String getDia(){return dia;}
    public String getMes(){return mes;}

    public void setNewNumero(int newNumero){
        this.newNumero= String.valueOf(newNumero);
    }
    public void setDia(int dia){
        this.dia= String.valueOf(dia);
    }
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setMes(String mes){
        this.mes=mes;
    }
    public void setCorreo(String correo){this.correo=correo;}
    public void setApellido(String apellido) {this.apellido=apellido;}

    @Override
    public String toString() {
        return super.toString() + "------Nombre:  " + nombre
                + "|  Apellido:  "+ apellido
                + "|  Numero: " + newNumero
                + "|  Mes: " + mes
                + "|  Dia: " + dia
                + "|  Correo:  "+correo;
    }

}

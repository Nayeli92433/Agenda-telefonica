public class Numero {
    int newNumero;
    String apellido;
    String correo;
    String nombre;
    int dia;
    String mes;

    public int getNewNumero(){return newNumero;}
    public String getCorreo(){return correo;}
    public String getApellido(){return  apellido;}
    public String getNombre(){return nombre;}
    public int getDia(){return dia;}
    public String getMes(){return mes;}

    public void setNewNumero(int newNumero){
        this.newNumero=newNumero;
    }
    public void setDia(int dia){
        this.dia=dia;
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

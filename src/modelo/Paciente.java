package modelo;

public abstract class Paciente extends Persona {

    private String direccion;

    public Paciente() {
    }

    public Paciente(String direccion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public abstract void ingresarClinica();
    public abstract void llegararecepcion();
    public abstract void esperarllamado();
    

}

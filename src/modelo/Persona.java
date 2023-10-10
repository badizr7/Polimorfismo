
package modelo;


public class Persona {
    protected int id;
    protected String nombre; 
    protected String apellido;
    protected int edad;
    protected String tipo_contrato;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, int edad, String tipo_contrato) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipo_contrato = tipo_contrato;
    }

    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad, String tipo_contrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipo_contrato = tipo_contrato;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }
  
}

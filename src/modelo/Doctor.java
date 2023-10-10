
package modelo;

public abstract class Doctor extends Persona {
    private String departamento;

    public Doctor() {
    }
    
    public Doctor(String departamento, int id, String nombre, String apellido, int edad, String tipo_contrato) {
        super(id, nombre, apellido, edad, tipo_contrato);
        this.departamento = departamento;
    }

    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public abstract void atenderPaciente();
    public abstract void recetarPaciente();
    public abstract void llamarpaciente();
    public abstract void solicitarprocedimiento();
    public abstract void seguimiento();

    @Override
    public String toString() {
        return "Doctor{" + "departamento=" + departamento + '}';
    }
    
    
}

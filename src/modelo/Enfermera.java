package modelo;

public abstract class Enfermera extends Persona {

    private int id_enfermera;

    public Enfermera() {
    }

    public Enfermera(int id_enfermera, String nombre, String apellido, int edad, String tipo_contrato) {
        super(nombre, apellido, edad, tipo_contrato);
        this.id_enfermera = id_enfermera;
    }

    public int getId_enfermera() {
        return id_enfermera;
    }

    public void setId_enfermera(int id_enfermera) {
        this.id_enfermera = id_enfermera;
    }

    public abstract void revisarPaciente();
    public abstract void seguimientoPaciente();
    public abstract void asistir();
    public abstract void agendarcita();

}

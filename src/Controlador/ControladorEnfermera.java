package Controlador;

import javax.swing.JOptionPane;
import modelo.Enfermera;

public class ControladorEnfermera extends ControladorPersona {

    public ControladorEnfermera() {

    }

    public void registarEnfermera(int id_enfermera, String nombre, String apellido, int edad, String tipo_contrato) {
        Enfermera enfermera = new Enfermera(id_enfermera, nombre, apellido, edad, tipo_contrato) {
            @Override
            public void revisarPaciente() {
                JOptionPane.showMessageDialog(null, "La enfermera " + nombre + "esta revisando al paciente");
            }

            @Override
            public void seguimientoPaciente() {
                JOptionPane.showMessageDialog(null, "La enfermera " + nombre + "le hara seguimiento al paciente");

            }

            @Override
            public void asistir() {
                JOptionPane.showMessageDialog(null, "La enfermera " + nombre + "esta asistiendo al doctor");

            }

            @Override
            public void agendarcita() {
                JOptionPane.showMessageDialog(null, "La enfermera " + nombre + "esta agendando una cita para el 10 de octubre");

            }
        };
        enfermera.revisarPaciente();
        enfermera.seguimientoPaciente();
        enfermera.asistir();
        enfermera.agendarcita();
        JOptionPane.showMessageDialog(null, """
                                            INFORMACION DE LA ENFERMERA
                                            Nombre de la enfemera: """ + enfermera.getNombre()
                                            + "\nApellido de la enfermera: " + enfermera.getApellido()
                                            + "\nEdad de la enfermera: " + enfermera.getEdad()
                                            + "\n Tipo de contrato: " + enfermera.getTipo_contrato()
                                            + "\n ID de la enfermera: " + enfermera.getId_enfermera(),"Informacion de la Enfermera",JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void iniciarsesion() {
        JOptionPane.showMessageDialog(null, "Estoy iniciando sesion desde enfermera", "Iniciar Sesion",JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void reportar() {
        JOptionPane.showMessageDialog(null, "Generando reporte...", "Reporte", JOptionPane.ERROR_MESSAGE);

    }
}

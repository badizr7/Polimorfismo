package Controlador;

import javax.swing.JOptionPane;
import modelo.Paciente;

public class ControladorPaciente extends ControladorPersona {

    public ControladorPaciente() {

    }

    public void registrarPaciente(String direccion, int id, String nombre, String apellido, int edad) {
        Paciente paciente = new Paciente(direccion, id, nombre, apellido, edad) {
            @Override
            public void ingresarClinica() {
                JOptionPane.showMessageDialog(null, "Ingresando a la clinica");
            }

            @Override
            public void llegararecepcion() {
                JOptionPane.showMessageDialog(null, "Llegando a recepcion para pagar el impuesto o copago");
            }

            @Override
            public void esperarllamado() {
                JOptionPane.showMessageDialog(null, "Esperando el llamado para que me atiendan");
            }
        };
        paciente.ingresarClinica();
        paciente.llegararecepcion();
        paciente.esperarllamado();
        JOptionPane.showMessageDialog(null, """
                                            INFORMACION DEL PACIENTE
                                            Nombre del paciente: """ + paciente.getNombre()
                                            + "\nApellido del paciente: " + paciente.getApellido()
                                            + "\n ID del paciente: " + paciente.getId()
                                            + "\nEdad del paciente: " + paciente.getEdad()
                                            + "\n Direccion del paciente: " + paciente.getDireccion(), "Informacion del Paciente", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void iniciarsesion() {
        JOptionPane.showMessageDialog(null, "Estoy iniciando sesion desde paciente", "Iniciar Sesion",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void reportar() {
        JOptionPane.showMessageDialog(null, "Generando reporte...", "Reporte", JOptionPane.ERROR_MESSAGE);

    }

}

package Controlador;

import javax.swing.JOptionPane;
import modelo.Doctor;

public class ControladorDoctor extends ControladorPersona {

    public ControladorDoctor() {

    }

    public void registrardoctor(String departamento, int id, String nombre, String apellido, int edad, String tipo_contrato) {
        Doctor doctor = new Doctor(departamento, id, nombre, apellido, edad, tipo_contrato) {
            @Override
            public void atenderPaciente() {
                JOptionPane.showMessageDialog(null, "El doctor " + nombre + " está atendiendo a un paciente.");
            }

            @Override
            public void recetarPaciente() {
                JOptionPane.showMessageDialog(null, "El doctor " + nombre + " esta recetando acetaminofen al paciente");
            }

            @Override
            public void llamarpaciente() {
                JOptionPane.showMessageDialog(null, "El doctor " + nombre + " está llamando al paciente.");
            }

            @Override
            public void solicitarprocedimiento() {
                JOptionPane.showMessageDialog(null, "El doctor " + nombre + " solicita una rutina de ejercicio al paciente.");
            }

            @Override
            public void seguimiento() {
                JOptionPane.showMessageDialog(null, "El doctor " + nombre + " estará haciendo siguiendo constantemente al paciente.");
            }

        };
        doctor.atenderPaciente();
        doctor.recetarPaciente();
        doctor.llamarpaciente();
        doctor.solicitarprocedimiento();
        doctor.seguimiento();

        JOptionPane.showMessageDialog(null, """
                                            INFORMACION DEL DOCTOR
                                            Nombre del doctor: """ + doctor.getNombre()
                                            + "\n ID del Doctor: " + doctor.getId()
                                            + "\nApellido del doctor: " + doctor.getApellido()
                                            + "\nEdad del doctor: " + doctor.getEdad()
                                            + "\n Tipo de contrato: " + doctor.getTipo_contrato()
                                            + "\n Departamento del doctor: " + doctor.getDepartamento(),"Informacion del Doctor",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void iniciarsesion() {
        JOptionPane.showMessageDialog(null, "Estoy iniciando sesion desde doctor", "Iniciar Sesion",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void reportar() {
        JOptionPane.showMessageDialog(null, "Generando reporte...","Reporte",JOptionPane.ERROR_MESSAGE);
    }

}

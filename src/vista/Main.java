
package vista;

// Rafael Mejia Paternina and Juan Badillo Morales PROGRAMACION II
import Controlador.*;
import java.awt.Component;
import javax.swing.JOptionPane;

public class Main {
    
    static String menu = """
                         1. REGISTRAR DOCTOR
                         2. REGISTRAR ENFERMERA
                         3. REGISTRAR PACIENTE
                         4. SALIR
                         """;
    public static void main(String[] args) {
        int mensaje = mostrarMenuOpciones(null, menu);
        seleccionarOpcion(mensaje);
        
    }
    static void mostrarmensaje(Component componente, Object mensaje){
        JOptionPane.showMessageDialog(componente,mensaje);
    }
    static String ingresarDatos(Component componente, Object mensaje){
        return JOptionPane.showInputDialog(componente, mensaje);
    }
    static int mostrarMenuOpciones(Component componente, Object mensaje){
        do {            
            String datos = ingresarDatos(componente, mensaje);
            if (datos != null){
                mensaje = Integer.valueOf(datos);
                return (int) mensaje;
            }
        } while (JOptionPane.CLOSED_OPTION != -1);
        return -1;
    }
    static void seleccionarOpcion(int opcion){
        switch(opcion){
            case 1 -> {
                ControladorDoctor controladordoctor = new ControladorDoctor();
                controladordoctor.registrardoctor("BOLIVAR", 145, "Juan", "Badillo", 45, "OBRA O LABOR");
                controladordoctor.iniciarsesion();
                controladordoctor.reportar();
            }
            case 2 -> {
                ControladorEnfermera controladorenfermera = new ControladorEnfermera();
                controladorenfermera.registarEnfermera(1453, "JENNY", "MORELOS", 24, "INDEFINIDO");
                controladorenfermera.iniciarsesion();
                controladorenfermera.reportar();
            }
            case 3 -> {
                ControladorPaciente controladorpaciente = new ControladorPaciente();
                controladorpaciente.registrarPaciente("El Bosque", 1234, "Luis", "Morales", 20);
                controladorpaciente.iniciarsesion();
                controladorpaciente.reportar();
            }
            case 4 -> {
                System.exit(0);
            }
        }
    }

}

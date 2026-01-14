package Controlador;

import vista.Menu;
import modelo.Paciente;


// esta es la clase que controla toa la vuelta
public class Registro {

    
        // este es el metodo que inicia el programa
    public static void main(String[] args) {
        
        //crea el cointrolador principal
        Registro Controlador = new Registro();
        
        
        // crean el menu
        Menu menu = new Menu(Controlador);
        
        
        // ejecuta al menu
        menu.iniciar();
    }


    // las variables que permiten guardar pacientes, con un ,maximo de 4
    private Paciente p1;
    private Paciente p2;
    private Paciente p3;
    private Paciente p4;




    // este metodo intenta agregar un paciente en el primer cupo disponible, y si no hay cupos, pues no lo deja guardar
    public boolean agregarPaciente(Paciente p) {
        if (p1 == null) {
            p1 = p;
            return true;
        } else if (p2 == null) {
            p2 = p;
            return true;
        } else if (p3 == null) {
            p3 = p;
            return true;
        } else if (p4 == null) {
            p4 = p;
            return true;
        }
        
        // no hay cupos disponibles
        return false; 
    }

    
    
    // este es el funcionamiento de la opcion que deja ver a los pacientes que hay registrados
    public void mostrarPacientes() {
        if (p1 != null) {
            System.out.println(p1.getNombre() + " - " + p1.getDocumento() + " - " + p1.getEstado());
        }
        if (p2 != null) {
            System.out.println(p2.getNombre() + " - " + p2.getDocumento() + " - " + p2.getEstado());
        }
        if (p3 != null) {
            System.out.println(p3.getNombre() + " - " + p3.getDocumento() + " - " + p3.getEstado());
        }
        if (p4 != null) {
            System.out.println(p4.getNombre() + " - " + p4.getDocumento() + " - " + p4.getEstado());
        }
    }

    
    
    // este es el metodo dentro de la opcion de atender paciente, que le cambia el estado ATENDIDO y muestra un mensaje de exito
    public void atenderPaciente(int opcion) {
        if (opcion == 1 && p1 != null && p1.getEstado().equals("REGISTRADO")) {
            p1.setEstado("ATENDIDO");
            System.out.println("paciente atendido exitosamente: " + p1.getNombre());
        } else if (opcion == 2 && p2 != null && p2.getEstado().equals("REGISTRADO")) {
            p2.setEstado("ATENDIDO");
            System.out.println("paciente atendido exitosamente: " + p2.getNombre());
        } else if (opcion == 3 && p3 != null && p3.getEstado().equals("REGISTRADO")) {
            p3.setEstado("ATENDIDO");
            System.out.println("paciente atendido exitosamente: " + p3.getNombre());
        } else if (opcion == 4 && p4 != null && p4.getEstado().equals("REGISTRADO")) {
            p4.setEstado("ATENDIDO");
            System.out.println("paciente atendido exitosamente: " + p4.getNombre());
        } else {
            System.out.println("opcion invalida o paciente no disponible");
        }
    }



    // retorna al paciente segun la opcion elegida
    public Paciente obtenerPaciente(int posicion) {
        switch (posicion) {
            case 1: return p1;
            case 2: return p2;
            case 3: return p3;
            case 4: return p4;
            
            // retorna null si no se vale la opcion
            default: return null;
        }
    }

    

}
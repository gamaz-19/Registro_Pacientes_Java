
package vista;
//
import java.util.Scanner;
import Controlador.Registro;
import modelo.Paciente;



// esta clase es la encargada de "interactuar"? con el usuario
public class Menu {

    // lee lo que escribe el usuario
    private Scanner sc;             
    
    // referencia al controlador para la logica del programa
    private Registro controlador;    
    
    
      //constructor que inicializa el scanner y recibe el controlador
    public Menu(Registro controlador) {
        this.sc = new Scanner(System.in);
        this.controlador = controlador;
    }

    
       //esto es lo que "controla"? el funcionamiento del menu

    public void iniciar() {
        int op;

        do {
            // muestra el menu
            mostrarOpciones();
            
            // lee lo que escribe el usuario
            op = sc.nextInt();          

            
            // evalua la opcion que escribe el usuario y dependiendo de cual sea, llama la funcion con que indica su nombre (plena me da peresa escribirle a cada case que es lo que hace si ya lo indica el nombre)
            switch (op) {
                case 1:
                    registrarPaciente();
                    break;
                case 2:
                    mostrarPacientes();
                    break;
                case 3:
                    atenderPaciente();
                    break;
            }

            // repite el menu hasta que elija salir
        } while (op != 4); 

        // cierra el scanner al terminar
        sc.close();
    }



    // muestra el menu ahora si jajaja, lo de arriba es la funcion que lo "llama"?
    private void mostrarOpciones() {
        System.out.println("""
                           #################################################
                                        BIENVENIDO A LA CLINICA 
                           #################################################
                               
                           Opciones disponibles
                           
                           1. Registrar paciente
                           2. Mostrar pacientes registrados
                           3. Atender paciente
                           4. Salir
                           
                           #################################################
                           """);
    }

    
        //metodo que solicita los datos y crea un paciente
    private void registrarPaciente() {
        System.out.println("///// Registrar paciente /////");

        sc.nextLine(); 

        // solicita todos los datos
        System.out.println("Ingrese el nombre del paciente");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el documento del paciente");
        String documento = sc.nextLine();

        System.out.println("Ingrese edad del paciente");
        int edad = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Ingrese el motivo de la consulta");
        String motivoConsulta = sc.nextLine();

        System.out.println("Ingrese telefono del paciente");
        String telefono = sc.nextLine();

        //crea al paciente con los datos ingresados
        Paciente nuevo = new Paciente(nombre, documento, edad, motivoConsulta, telefono);

        // intenta agregarlo usando el controlador
        boolean agregado = controlador.agregarPaciente(nuevo);

        // dice si se pudo o no registrar
        if (agregado) {
            System.out.println("paciente registrado correctamente");
        } else {
            System.out.println("no hay cupos disponibles");
        }
    }

    
// metodo que llama al controlador para mostrar los pacientes (esta es la opcion 2 del menu principal)
    private void mostrarPacientes() {
        controlador.mostrarPacientes();
    }

    
  // deja seleccionar al paciente que se va a atender
    private void atenderPaciente() {
        System.out.println("///// atender paciente /////");

        // recorre los pacientes que hay, y si el estado es REGISTRADO, lo deja ver para atenderlo
        for (int i = 1; i <= 4; i++) {
            Paciente p = controlador.obtenerPaciente(i);
            
            if (p != null && p.getEstado().equals("REGISTRADO")) {
                System.out.println(i + ". " + p.getNombre());
            }
        }

        // deja seleccionar el paciente a atender
        System.out.println("Seleccione al paciente que quiere atender:");
        int opcionAtender = sc.nextInt();

        
        // envia la opocion al controlador para atender al paciente
        controlador.atenderPaciente(opcionAtender);
    }
}


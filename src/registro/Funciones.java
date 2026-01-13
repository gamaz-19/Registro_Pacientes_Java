package registro;

import java.util.Scanner;


// esta es la funcion que muestra los menus e interactua con el usuario
public class Funciones {

    
    // muestra las opciones y ejecuta acciones segun lo elegido
    public void menu(Clinica clinica) {
        
        // este scanner lee los datos ingresados por el usuario (teniamos varios scanners pero por alguna razon no me querian funcionar, no se si por el codigo o por mi pc, esta fue la solucion que funciono y pues aja, se quedo)
            Scanner sc = new Scanner(System.in);

            
            //variable que guarda la opcion del menu
        int op;
        
        
        // este ciclo mantiene el menu activo hasta que el usuario decida salir
        do {
            System.out.println("""
                               #################################################
                                            BIENVENIDO LA CLINICA 
                               #################################################
                                   
                               Opciones disponibles
                               
                               1. Registrar paciente
                               2. Mostrar pacientes registrados
                               3. Atender paciente
                               4. Salir
                               
                               #################################################
                               """);

            // lee la opcion del menu
            op = new Scanner(System.in).nextInt();

            // el switch sirve para saber que opcion vamos a ejecutar dependiento del case
            switch (op) {
                
                // esta opcion es la que permite registrar un nuevo paciente
                case 1:
    System.out.println("/////Registro de paciente/////");

    // pide el nombre del paciente
    System.out.println("Ingrese el nombre del paciente");
        String nombre = sc.nextLine(); 

        // pide el numero de documento del paciente
    System.out.println("Ingrese el documento del paciente");
        String documento = sc.nextLine();

        // pide la edad del paciente
    System.out.println("Ingrese edad del paciente");
        int edad = sc.nextInt();
        
        
             // Limpia el salto de línea pendiente del Scanner
            sc.nextLine(); 

            // pide el motivo de la consulta del paciente
    System.out.println("Ingrese el motivo de la consulta");
         String motivoConsulta = sc.nextLine();

         // pide el numero telefonico del paciente
    System.out.println("Ingrese telefono del paciente");
        String telefono = sc.nextLine();

        
        
        // crea al paciente con los datos ingresados
    Paciente nuevo = new Paciente(nombre, documento, edad, motivoConsulta, telefono);

    
    // intenta agregr al paciente
    boolean agregado = clinica.agregarPaciente(nuevo);

    
    //valida si se agregro o si no dejo agregarlo por cupos llenos
    if (agregado) {
        System.out.println("Paciente registrado correctamente");
    } else {
        System.out.println("Lo sentimos, no tenemos cupos disponibles");
    }

    break;
                
                // segunda opcion, muestra los pacientes registrados
                case 2:
                    
                    //se llama al metodo que muestra a todos los pacientes
                    clinica.mostrarPacientes();
                    break;

                    
                    // tercera opcion, atender pacientes
                case 3:
                    
    System.out.println("///// Atender paciente /////");

    
    //muestra a los pacientes que tienen el estado: registrado
    if (clinica.p1 != null && clinica.p1.getEstado().equals("REGISTRADO")) {
        System.out.println("1. " + clinica.p1.getNombre());
    }

    if (clinica.p2 != null && clinica.p2.getEstado().equals("REGISTRADO")) {
        System.out.println("2. " + clinica.p2.getNombre());
    }

    if (clinica.p3 != null && clinica.p3.getEstado().equals("REGISTRADO")) {
        System.out.println("3. " + clinica.p3.getNombre());
    }

    if (clinica.p4 != null && clinica.p4.getEstado().equals("REGISTRADO")) {
        System.out.println("4. " + clinica.p4.getNombre());
    }

    // el usuario debe escoger a que paciente atender (eso sono feo, como ruleta rusa jajaja)
    System.out.println("seleccione al paciente que quiere atender atender mediante el numero del paciente:");
    int opcionAtender = sc.nextInt();

    // "envia" la opcion al archivo clinica para atender al paciente
    clinica.atenderPaciente(opcionAtender);

    break;

        

            }

            // y con esto repetimos el menu hasta que el usuario elija la cuarta opcion, lo cual lo sacaria del sistema
        } while (op != 4);

    }

}

package registro;

import java.util.Scanner;

public class Funciones {

    public void menu() {
        int op;
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

            op = new Scanner(System.in).nextInt();

            switch (op) {
                case 1:
                    System.out.println("/////Registro de paciente/////");
                    System.out.println("Ingrese el nombre del paciente");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese el documento del paciente");
                    int documento = new Scanner(System.in).nextInt();
                    System.out.println("Ingrese edad del paciente");
                    int edad = new Scanner(System.in).nextInt();
                    System.out.println("Ingrese el motivo de la consulta");
                    String motivoConsulta = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese telefono del paciente \n¡¡Atencion!!: Tenga en ceunta que si tiene mas de un telefono debe escribirlo separado por comas");
                    String telefono = new Scanner(System.in).nextLine();
                    if (p1 == null) {
                        Paciente p1=new Paciente(nombre);
                    } else {
                        if (p2 == null) {
                        } else {
                            if (p3 == null) {
                            } else {
                                if (p4 == null) {
                                } else {
                                    System.out.println("Lo sentimos no tenemos cupos disponibles");
                                }
                            }
                        }
                    }

                    break;

                case 2:
                    break;

                case 3:
                    break;

            }

        } while (op != 4);

    }

}

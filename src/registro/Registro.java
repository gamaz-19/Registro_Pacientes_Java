package registro;

public class Registro {

    public static void main(String[] args) {
        /*
        REGISTRO BÁSICO DE PACIENTES (CONSOLA)
        Una clínica pequeña necesita una aplicación de consola para registrar pacientes que llegan a consulta general.
        Por limitaciones técnicas, el sistema no usa base de datos ni listas, y solo puede manejar 4 pacientes al mismo tiempo, representados mediante objetos fijos definidos en el código (p1, p2, p3, p4).

        DATOS DEL PACIENTE
        Cada paciente debe almacenar:
                - nombre completo
                - número de documento
                - edad
                - motivo de consulta
                - telefonos
                - tipo de paciente (calculado automáticamente)
                - estado (disponible / registrado / atendido)

        El tipo de paciente se calcula automáticamente en el constructor:
                - menor de 18 → MENOR
                - 18 o más → ADULTO

        MENÚ PRINCIPAL
        El sistema debe mostrar un menú repetitivo con las opciones:
                - Registrar paciente
                - Mostrar pacientes registrados
                - Atender paciente
                - Salir

        Las opciones deben validarse usando ciclos, condicionales y try-catch.


        REGISTRO DE PACIENTES
                - El sistema debe registrar al paciente en el primer cupo disponible
                - Si no hay cupos libres, debe informarlo
        Durante el registro:
                - el telefono se ingresa en una sola línea separado por comas y se debe mostrar con un split(",") tipo Telefono 1: ... Telefono 2:... y asi sucesivamente.
                - documento y edad se validan con try-catch
                - la edad no puede ser negativa
        Al finalizar:
                - el paciente queda en estado registrado
                - el tipo de paciente ya debe estar calculado


        RESTRICCIONES
                - No usar arreglos ni ArrayList
                - Usar clases, constructores y métodos
                - Usar ciclos, condicionales y validaciones

        OBJETIVO
        Simular un sistema real de registro sin base de datos, enfocándose en:
                - control de estado
                - validación de datos
                - lógica de negocio simple
         */

//        Paciente P1=new Paciente("Carlos Torres",1234,25,"Dolor de cabeza",3123,"disponible");
//        Paciente P2=new Paciente("Camilo Torres",1345,12,"Herido de bala",3234,"atendido");
//        Paciente P3=new Paciente("Carla Torres",1456,38,"Dolor de rodilla",3345,"disponible");
//        Paciente P4=new Paciente("Carlo Torres",1567,8,"Dolor de muela",3456,"registrado");
//        
        Paciente p1 = null;
        Paciente p2 = null;
        Paciente p3 = null;
        Paciente p4 = null;
        Funciones f=new Funciones();
        f.menu(p1, p2, p3, p4);
        
        
        
    }

}


package registro;


// esta clase administra los pacintes registrados
public class Clinica {
    
    
    
    
    // variables para almacenar pacientes con un maximo de 4 pacientes
    Paciente p1;
    Paciente p2;
    Paciente p3;
    Paciente p4;
    
    
    
    // este es el metodo que agrega al paciente, recibe a un objeto paciente como parametro y retorna true si lo agrego, o false si estaban llenos los cupos (jajaja, medicina en colombia)
    public boolean agregarPaciente(Paciente p){
        
        // valida los cupos disponibles para ver si se puede agregar al paciente
        if (p1 == null){
            p1 = p;
            return true;
        }else if(p2 == null){
            p2 = p;
            return true;
        }else if(p3 == null){
            p3 = p;
            return true;
        }else if(p4 == null){
            p4 = p;
            return true;
        }
        
        // si todos los cupos estan llenos, pues no lo agrega
    return false;
    }




// muestra los pacientes que estan registrados , si el estado es: registrado
public void mostrarPacientes(){
    
    // verifica a acada paciente antes de mostrarlo
    if (p1 != null){
        System.out.println(p1.getNombre() + "-" + p1.getDocumento() + "-" + p1.getEstado());
    }
    
    if (p2 != null){
        System.out.println(p2.getNombre() + "-" + p2.getDocumento() + "-" + p2.getEstado());
    }
    
    if (p3 != null){
        System.out.println(p3.getNombre() + "-" + p3.getDocumento() + "-" + p3.getEstado());
    }
    
    if (p4 != null){
        System.out.println(p4.getNombre() + "-" + p4.getDocumento() + "-" + p4.getEstado());
    }
}






// metodo para atender al paciente seleccionado, recibiendo como paramenro, la opcion elegida por el usuario
public void atenderPaciente(int opcion){

    
    // valida la opcion elegida y cambia el estado de registrado a atendido 
    if (opcion == 1 && p1 != null && p1.getEstado().equals("REGISTRADO")) {
        p1.setEstado("ATENDIDO");
        System.out.println("Paciente atendido exitosamente: " + p1.getNombre());

    } else if (opcion == 2 && p2 != null && p2.getEstado().equals("REGISTRADO")) {
        p2.setEstado("ATENDIDO");
        System.out.println("Paciente atendido exitosamente: " + p2.getNombre());

    } else if (opcion == 3 && p3 != null && p3.getEstado().equals("REGISTRADO")) {
        p3.setEstado("ATENDIDO");
        System.out.println("Paciente atendido exitosamente: " + p3.getNombre());

    } else if (opcion == 4 && p4 != null && p4.getEstado().equals("REGISTRADO")) {
        p4.setEstado("ATENDIDO");
        System.out.println("Paciente atendido exitosamente: " + p4.getNombre());

    } else {
        
        // mensaje por si la opcion es invalida o por si el paciente no esta disponible
        System.out.println("Opción inválida o paciente no disponible");
    }
}

     




}






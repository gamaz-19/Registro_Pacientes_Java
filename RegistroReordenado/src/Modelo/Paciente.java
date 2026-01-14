package modelo;


public class Paciente {


        //variables que guardan la informacion basica del paciente

    private String nombre;          
    private String documento;       
    private int edad;               
    private String motivoConsulta;  
    private String telefono;        
    private String estado;          
    private String tipoP;           
    
 
        //constructor que se ejecuta al crear un  paciente

    public Paciente(String nombre, String documento, int edad, String motivoConsulta, String telefono) {
        this.nombre = nombre;                 // asigna: el nombre recibido
        this.documento = documento;           // el documento recibido
        this.edad = edad;                     // la edad recibida
        this.motivoConsulta = motivoConsulta; // el motivo de consulta
        this.telefono = telefono;             // el telefono
        this.estado = "REGISTRADO";            // el estado inicial del paciente
        this.tipoP = tipoPaciente();           // calcula  si es menor o adulto
    }

    
    
        //este metodo determina si el paciente es menor o adulto segun la edad
    private String tipoPaciente() {
        if (edad < 18) {
            return "MENOR";
        } else {
            return "ADULTO";
        }
    }

    
    
    // getters y setters (permiten recibir y modificar la data del paciente)
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipoP() {
        return tipoP;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
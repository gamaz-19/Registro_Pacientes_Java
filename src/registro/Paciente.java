package registro;


// es la persona que va a ser atendida
public class Paciente {

    /*
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
     */
    
    
    // son los datos que pediremos para poderlo registrar
    String nombre;
    String documento;
    int edad;
    String motivoConsulta;
    String telefono;
    
    
    // el estado del paciente es (registrado, atendido, disponible)
    String estado;
    
    // el tipo de paciente es la edad, mayor o menor
    String tipoP = "";

    //Calculo de tipo de paciente (pa saber si es mayor o menor de edad)
    public String tipoPaciente() {

        if (edad < 18) {
            tipoP = "MENOR";
        } else {
            tipoP = "ADULTO";
        }
        return tipoP;
    }

    //Constructor, aqui recivimos los datos del paciente
    public Paciente(String nombre, String documento, int edad, String motivoConsulta, String telefono) {
        
        // aqui se asignan los valores recibidos a los atributos del objeto cliente
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.motivoConsulta = motivoConsulta;
        this.telefono = telefono;
        
        // el estado por defecto que se le asigna al cliente cuando se crea es de: REGISTRADO
        this.estado = "REGISTRADO";
        
        // esto calcula automaticamente el tipo de cliente
        this.tipoP = tipoPaciente();
    }

    
    
    //Setters y getters, deja ver y modificar los datos del paciente
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    
    //deja cambiar el estado del paciente :v
    public void setEstado(String estado) {
        this.estado = estado;
    }

}

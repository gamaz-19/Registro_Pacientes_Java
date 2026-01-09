package registro;

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
    String nombre;
    int documento;
    int edad;
    String motivoConsulta;
    String telefono;
    String estado;
    String tipoP = "";

    //Calculo de tipo de paciente
    public String tipoPaciente() {

        if (edad < 18) {
            tipoP = "MENOR";
        } else {
            tipoP = "ADULTO";
        }
        return tipoP;
    }

    //Constructor
    public Paciente(String nombre, int documento, int edad, String motivoConsulta, String telefono, String estado) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.motivoConsulta = motivoConsulta;
        this.telefono = telefono;
        this.estado = estado;
        this.tipoP = tipoPaciente();
    }

    //Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
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

    public void setEstado(String estado) {
        this.estado = estado;
    }

}

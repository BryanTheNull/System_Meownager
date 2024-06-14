package Model;

public class GestionarUsuario {

// Atributos de la clase
    private int ID_Usuario;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Contraseña;
    private String Fecha_Registro;
    private String Rango;

    // Constructor vacío
    public GestionarUsuario() {
    }

    // Getters y Setters
    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    
    public String getFecha_Registro() {
        return Fecha_Registro;
    }

    public void setFecha_Registro(String Fecha_Registro) {
        this.Fecha_Registro = Fecha_Registro;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
    }
}

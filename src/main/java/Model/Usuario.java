package Model;

public class Usuario {
    // Atributos de la clase
    private int ID_Usuario;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Contraseña;
    private String Celular;
    private String Fecha_Registro;
    private String Rango;

    // Instancia unica de singleton
    private static Usuario instance;
    
    // Constructor vacio
    private Usuario() {
    }
    
    // Método estático para obtener la instancia única
    public static Usuario getInstance() {
        if (instance == null) {
            instance = new Usuario();
        }
        return instance;
    }
    
    // Getter and Setter
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

    public String getCelular() {
        return Celular;
    }
    public void setCelular(String Celular) {
        this.Celular = Celular;
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

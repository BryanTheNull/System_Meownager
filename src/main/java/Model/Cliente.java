package Model;

public class Cliente {
    // Atributos de la clase
    private int ID_Cliente;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Telefono;
    private String Direccion;
    private String Estado;
    
    // Constructor vacio
    public Cliente() {
    }
    
    // Constructor de la clase
    public Cliente(int ID_Cliente, String Nombre, String Apellido, String Email, String Telefono, String Direccion, String Estado) {
        this.ID_Cliente = ID_Cliente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Estado = Estado;
    }
    
    // Getter and Setter
    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}

package Model;

public class Proveedor {
    // Atributos
    private int ID_Proveedor;
    private String Rut;
    private String Nombre;
    private String Email;
    private String Telefono;
    private String Direccion;
    private String Estado;
    
    // Contructor vacio
    public Proveedor() {
    }
    
    // Constructor con datos
    public Proveedor(int ID_Proveedor, String Rut, String Nombre, String Email, String Telefono, String Direccion, String Estado) {
        this.ID_Proveedor = ID_Proveedor;
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Estado = Estado;
    }
    
    // Getter and Setter
    public int getID_Proveedor() {
        return ID_Proveedor;
    }

    public void setID_Proveedor(int ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

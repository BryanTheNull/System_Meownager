package Model;

public class Categoria {

    // Atributos 
    private int ID_Categoria;
    private String Nombre;
    private String Descripcion;

    // Constructor vacio
    public Categoria() {
    }

    // Contructor con datos
    public Categoria(int ID_Categoria, String Nombre, String Descripcion) {
        this.ID_Categoria = ID_Categoria;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    // Getter and Setter
    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}

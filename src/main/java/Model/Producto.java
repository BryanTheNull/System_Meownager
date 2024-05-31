package Model;


public class Producto {
    // Atributos de la clase Producto
    private int ID_Producto;
    private String Nombre_Proveedor;
    private String Nombre_Categoria;
    private String Nombre_Producto;
    private String Descripcion;
    private String Codigo;
    private double Precio;
    private int Stock;

    // Constructor vacio
    public Producto() {
    }
    
    // Constructor 
    public Producto(int ID_Producto, String Nombre_Proveedor, String Nombre_Categoria, String Nombre_Producto, String Descripcion, String Codigo, double Precio, int Stock) {
        this.ID_Producto = ID_Producto;
        this.Nombre_Proveedor = Nombre_Proveedor;
        this.Nombre_Categoria = Nombre_Categoria;
        this.Nombre_Producto = Nombre_Producto;
        this.Descripcion = Descripcion;
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Stock = Stock;
    }
    
    // Getter and Setter
    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public String getNombre_Proveedor() {
        return Nombre_Proveedor;
    }

    public void setNombre_Proveedor(String Nombre_Proveedor) {
        this.Nombre_Proveedor = Nombre_Proveedor;
    }

    public String getNombre_Categoria() {
        return Nombre_Categoria;
    }

    public void setNombre_Categoria(String Nombre_Categoria) {
        this.Nombre_Categoria = Nombre_Categoria;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    

    
    
    
}

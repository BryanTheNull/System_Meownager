package Model;

public class DetalleVenta {
    private int ID_DetalleVenta;
    private int ID_Venta;
    private int ID_Producto;
    private int Cantidad;
    private int Precio_Unitario;

    public DetalleVenta() {
    }

    public DetalleVenta(int ID_DetalleVenta, int ID_Venta, int ID_Producto, int Cantidad, int Precio_Unitario) {
        this.ID_DetalleVenta = ID_DetalleVenta;
        this.ID_Venta = ID_Venta;
        this.ID_Producto = ID_Producto;
        this.Cantidad = Cantidad;
        this.Precio_Unitario = Precio_Unitario;
    }

    public int getID_DetalleVenta() {
        return ID_DetalleVenta;
    }

    public void setID_DetalleVenta(int ID_DetalleVenta) {
        this.ID_DetalleVenta = ID_DetalleVenta;
    }

    public int getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecio_Unitario() {
        return Precio_Unitario;
    }

    public void setPrecio_Unitario(int Precio_Unitario) {
        this.Precio_Unitario = Precio_Unitario;
    }
    
}

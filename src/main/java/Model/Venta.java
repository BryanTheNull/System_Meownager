package Model;


public class Venta {
    private int ID_Venta;
    private int ID_Cliente;
    private int Total;

    public Venta() {
    }

    public Venta(int ID_Venta, int ID_Cliente, int Total) {
        this.ID_Venta = ID_Venta;
        this.ID_Cliente = ID_Cliente;
        this.Total = Total;
    }

    public int getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    
}

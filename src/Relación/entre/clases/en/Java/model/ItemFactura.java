package Relación.entre.clases.en.Java.model;

public class ItemFactura {
    private Producto producto;
    private int cantidad;

    public ItemFactura( Producto producto,int cantidad) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    // Getters y Setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float calcularImporte() {
        return (float) (cantidad * producto.getPrecio());
    }

    @Override
    public String toString() {
        return producto + "\t" + cantidad + "\t" + calcularImporte();
    }
}

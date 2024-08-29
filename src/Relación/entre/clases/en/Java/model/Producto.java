package Relación.entre.clases.en.Java.model;
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private static int ultimoCodigo = 1000;

    public Producto (String codigo, String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = generarCodigo();
    }

    private String generarCodigo() {
        ultimoCodigo++;
        return "P" + String.format("%04d", ultimoCodigo);
    }


    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo + "\t" + nombre + "\t" + precio;
    }
}

package Relación.entre.clases.en.Java.model;

public class Cliente {
    private String nombre;
    private String nif;
    public  Cliente ( String nombre, String nif) {
        this.nombre=nombre;
        this.nif = nif;

    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}

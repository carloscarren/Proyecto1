package co.edu.uniquindio.SOLID.model;

public class Cliente {
    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;

    public Cliente(String nombre, String cedula, String correo, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }
    public String getCedula() {return cedula;}
    public String getNombre() {return nombre;}
    public String getCorreo() {return correo;}
    public String getTelefono() {return telefono;}


    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}


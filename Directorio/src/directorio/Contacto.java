
package directorio;


public class Contacto {
    
    private String DNI;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Contacto(String DNI, String nombre, String apellido, String ciudad, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    @Override
    public String toString (){
        return "Contacto { " +
                "DNI: " + DNI + " / " +
                "Nombre: " + nombre + " / " +
                "Apellido: " + apellido + " / " + 
                "Ciudad: " + ciudad + " / " +
                "Dirección: " + direccion + " / " +
                " } ";
    }
}

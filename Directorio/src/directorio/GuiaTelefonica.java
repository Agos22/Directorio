
package directorio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GuiaTelefonica {
    
    private TreeMap<Long, Contacto> contactos;

    public GuiaTelefonica() {
        this.contactos = new TreeMap <>();
    }
    
    public void agregarContacto(Long telefono, Contacto contacto) {
        if (!contactos.containsKey(telefono)) {
            contactos.put(telefono, contacto);
            System.out.println("Contacto agregado.");
        } else {
            System.out.println("Este numero de telefono ya esta registrado!");
        }
    }
    
    public Contacto buscarContacto(Long telefono) {
        System.out.println("Buscar contacto con el telefono: " + telefono + 
                "\n");
        return contactos.get(telefono);
    }
    
    public HashSet<Long> buscarTelefonos(String apellido) {
        HashSet<Long> telefonos = new HashSet<>();
        for (Map.Entry<Long, Contacto> entry: contactos.entrySet()){
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)){
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }
    public ArrayList<Contacto> buscarContactoPorCiudad(String Ciudad) {
        ArrayList<Contacto> listaContactos = new ArrayList<>();
            for (Contacto contacto : contactos.values()){
                if (contacto.getCiudad().equalsIgnoreCase(Ciudad)){
                    listaContactos.add(contacto);
                }
            }
            return listaContactos;
        }
    
    public void borrarContactos(Long telefono) {
        System.out.println("Borrando contacto: ");
        if (contactos.containsKey(telefono)) {
            contactos.remove(telefono);
            System.out.println("Contacto con el telefono: " + telefono + 
                    " eliminado.");
        } else {
            System.out.println("No se encontro ningun contacto con ese numero "
                    + "de telefono.");
        }
    }
    
    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay cotactos en el directorio");
        } else {
            System.out.println("Contactos en el directorio:");
            for (Map.Entry<Long, Contacto> entry: contactos.entrySet()) {
                Long telefono = entry.getKey();
                Contacto contacto = entry.getValue();
                System.out.println("Contacto:" + contacto + "Numero de telefono: " + telefono + "\n");
            }
        }
    }
    
    public List<Contacto> obtenerTodosLosContactos() {
        return new ArrayList<>(contactos.values());
    }
}
    
    

   
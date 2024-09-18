
package directorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class GuiaTelefonica {
    
    private TreeMap<Long, Contacto> contactos;

    public GuiaTelefonica() {
        this.contactos = new TreeMap <>();
    }
    
    public boolean agregarContacto (Long telefono, Contacto contacto){
        if(contactos.containsKey(telefono) || contacto == null ){
            return false;
        }else{
            contactos.put(telefono, contacto);
            return true;
        }
    }
    
    public Contacto buscarContacto (Long telefono){
        return contactos.get(telefono);
    }
    
    public Set<Long> buscarTelefono (String apellido){
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry: contactos.entrySet()){
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)){
                telefonos.add(entry.getKey());
            }
    }
        return telefonos;
}
    public ArrayList<Contacto> buscarContactoPorCiudad (String Ciudad){
        ArrayList<Contacto> listaContactos = new ArrayList<>();
            for (Contacto contacto : contactos.values()){
                if (contacto.getCiudad().equalsIgnoreCase(Ciudad)){
                    listaContactos.add(contacto);
                }
            }
            return listaContactos;
        }
    
    public boolean borrarContactos (Long telefono){
        if (contactos.remove(telefono) != null){
            return true;
        }else{
            return false;
        
        }
    }
    public List<Contacto> obtenerTodosLosContactos(){
    
        return new ArrayList<>(contactos.values());
    
    }
        
     
}
    
    

   
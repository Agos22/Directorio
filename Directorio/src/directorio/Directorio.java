
package directorio;

import java.util.ArrayList;
import java.util.HashSet;
import vistas.Direc;
import javax.swing.SwingUtilities;


public class Directorio {

 
    public static void main(String[] args) {
       
        GuiaTelefonica directorio = new GuiaTelefonica ();
        
        directorio.agregarContacto(2664345678L, new Contacto("12345678", "Simon", "Sanchez", "San Luis", "Calle Falsa 123"));
        directorio.agregarContacto(2664567890L, new Contacto("76547567", "Carlos", "Gomez", "San Luis", "Pringles 56"));
        directorio.agregarContacto(2664234598L, new Contacto("45678456", "Tito", "Cala", "Villa Mercedes", "Mitre 456"));
        directorio.agregarContacto(2656896754L, new Contacto("37987654", "Jimy", "Gomez", "Villa de Merlo", "Av del Sol 65"));
        directorio.agregarContacto(2657543412L, new Contacto("13789567", "Charly", "Garcia", "Villa Mercedes", "Perdernera 45"));
        
        System.out.println();
        System.out.println(directorio.buscarContacto(2664345678L));
        directorio.mostrarContactos();
        HashSet<Long> telefonosGomez = directorio.buscarTelefonos("Gomez");
        System.out.println("Telefonos asociados al apellido 'Gomez': "+ telefonosGomez + "\n");
        ArrayList<Contacto> contactosCiudadSan = directorio.buscarContactoPorCiudad("San Luis");
        System.out.println("Contactos en la 'Ciudad A': " +contactosCiudadSan + "\n");
        
        iniciarInterfaz ();
    }
        
         public static void iniciarInterfaz (){
            
             SwingUtilities.invokeLater (()-> {
                Direc directorio = new Direc ();
                directorio.setVisible(true);
            }) ;
}
}


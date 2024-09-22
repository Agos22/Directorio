
package directorio;

import vistas.Direc;
import javax.swing.SwingUtilities;


public class Directorio {

 
    public static void main(String[] args) {
       
        GuiaTelefonica directorio = new GuiaTelefonica ();
        
        directorio.agregarContacto(2664345678L, new Contacto("12345678A", "Simon", "Sanchez", "San Luis", "Calle Falsa 123"));
        directorio.agregarContacto(2664567890L, new Contacto("76547567A", "Carlos", "Gomez", "San Luis", "Pringles 56"));
        directorio.agregarContacto(2664234598L, new Contacto("45678456A", "Tito", "Cala", "Villa Mercedes", "Mitre 456"));
        directorio.agregarContacto(2656896754L, new Contacto("37987654A", "Jimy", "Arregui", "Villa de Merlo", "Av del Sol 65"));
        directorio.agregarContacto(2657543412L, new Contacto("13789567", "Charly", "Garcia", "Villa Mercedes", "Perdernera 45"));
     
        iniciarInterfaz ();
    }
        
         public static void iniciarInterfaz (){
            
             SwingUtilities.invokeLater (()-> {
                Direc directorio = new Direc ();
                directorio.setVisible(true);
            }) ;
}
}


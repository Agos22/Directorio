
package directorio;

import directorio.vistas.Direc;
import javax.swing.SwingUtilities;


public class Directorio {

 
    public static void main(String[] args) {
       
        GuiaTelefonica directorio = new GuiaTelefonica ();
        
        directorio.agregarContacto(2664345678L, new Contacto("12345678A", "Simon", "Sanchez", "San Luis", "Calle Falsa 123"));
        directorio.agregarContacto(2664567890L, new Contacto("76547567A", "Carlos", "Gomez", "San Luis", "Pringles 56"));
        directorio.agregarContacto(2664234598L, new Contacto("45678456A", "Tito", "Cala", "Villa Mercedes", "Mitre 456"));
        directorio.agregarContacto(2656896754L, new Contacto("37987654A", "Jimy", "Arregui", "Villa de Merlo", "Av del Sol 65"));
        directorio.agregarContacto(2657543412L, new Contacto("13789567", "Charly", "Garcia", "Villa Mercedes", "Perdernera 45"));
        
        
        System.out.println("Buscar contacto por teléfono 2664345678 : " + directorio.buscarContacto(2664345678L));
        System.out.println("Buscar teléfonos por apellido 'Gomez': " + directorio.buscarContacto("Gomez"));
        System.out.println("Buscar contactos por ciudad 'San Luis': " + directorio.buscarContacto("San Luis"));
        
        directorio.borrarContactos(2657543412L);
        System.out.println("Buscar contacto por teléfono 2657543412 después de borrar: " + directorio.buscarContacto(2657543412L));
     
        iniciarInterfaz ();
    }
        
         public static void iniciarInterfaz (){
            
             SwingUtilities.invokeLater (()-> {
                Direc directorio = new Direc ();
                directorio.setVisible(true);
            }) ;
}
}


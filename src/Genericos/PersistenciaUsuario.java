/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;
import java.util.ArrayList;
//import java.

/**
 *
 * @author JuanAntonio
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class PersistenciaUsuario {
    
    //Esta es una clase model de tipo logico. Solamente contiene acciones metodos que representan 
    //acciones concretas las sintaxis y estructura depende de la accion. 
    
    ArrayList<Usuario> usuario;

    public PersistenciaUsuario() {
        usuario=new ArrayList<>();
    }
    
    //Primero generamos el metodo que nos guarda un usuario.
    
    public void guardar(Usuario u )throws Exception{
        //Paso 1 generar el archivo a guardar. 
        File f=new File ("Archivaldo.raton");
        //Indicar que se va a guardar
        FileOutputStream fos=new FileOutputStream(f);
        
        //Generar el objeto que nos va a ayudar a guardar el arraylist de usuario 
        ObjectOutputStream nos=new ObjectOutputStream(fos);
        
        //Ahora si a guardar el objeto 
        usuario.add(u);
        //oos.writeObject(usuario);
        
    }
    
}
    


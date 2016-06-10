/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author campitos
 * Aqui usaremos lsd excepciones de tipo checked, en als que
 * tu te tienes que hacer cargo de ellas. Vamos a usar un paquete
 * que no se encuentra por defecto, tienes que agregarlo con un import
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SegundaExcepcion {
    
    
    public static void main(String[] args) {
        
        
        File f=new File("C:\\Users\\JuanAntonio\\Documents\\archivo1.txt");
        try {
            FileInputStream fis=new FileInputStream(f);
            int ch=0;
            StringBuilder builder=new StringBuilder();
        } catch (FileNotFoundException ex) {
           // while (( ch=fis.read() )!=-1){
                //builder.append((ch));
            }
            System.out.println("Se leio y se encontro esto ");
          //catch (Exception.ex){ 
        } 
           
        }
    
    


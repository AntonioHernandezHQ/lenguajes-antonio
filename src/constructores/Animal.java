/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-107
 */
public class Animal {
    String nombre;
    String especie;
    boolean carniboro;
    
    public Animal(String valor){
        //constructor por defecto
    nombre=valor;
    }
    public Animal(){
        nombre="Leon";
    }
    public Animal (String valor1,String valor2){
        especie=valor1;
        nombre=valor2;
    }
        
    }




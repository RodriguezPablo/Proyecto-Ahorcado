
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class horca {
    Random random = new Random(9);
    String [] arregloAutos = {"Mercedes", "Toyota", "Isuzu", "Hyundai", "Daihatsu", "Ford", "Dodge", "Mitsubishi" ,"Ferrari" , "Honda"};
    String [] arregloAnimales = {"Perro" , "Gato", "Conejo", "Ardilla", "Elefante","Canguro", "Vaca", "Rinoceronte", "Jirafa","Camello"};
    String [] arregloPaises = {"España","Alemania","Colombia","Brasil","Panama","Mexico","Ecuador","Francia","Italia","Inglaterra"};
    String [] arregloMarcas = {"Apple","Dell","Aeropostale","Samsung","Sony","Levis", "Nike", "Adidas", "Arenas","Panasonic"};
    String [] arregloNombre = {"Carlos","Felipe","Nicole","Maria","Pablo","Mariela","Juan", "Pedro","Manuel", "Laura"};        
               
    public String Carga_palabras(String categoria){
        String palabra;
        switch(categoria){
            case "1":
                
                break;
            case "2":
                
            break;
                
            case "3":
                
            break;
                
            case "4":
                            break;
                
            case "5":
                
            break;                
        }
            
        return palabra;
    }
    private int selccionRamdon(){
        int numRandom;
        
        numRandom=random.nextInt();
        
        return numRandom;
    }
    
    
               
}

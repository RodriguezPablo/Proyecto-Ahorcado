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
   
     public int vidas;
    
    
    public horca(){  //Construcor
        opciones();
        
    }
    Integer opcion=0;
    
    public void setMenu(int opc){
        
        opcion=opc; //obtener valor para el menú
        
        
        switch(opcion){
            case 1: //caso 1 = Empezar el juego
                System.out.println("Empezar juego"); 
                
                break;
                
            case 2:
                System.out.println("Categorias"); //Seleccionar la caategoria
                
                break;
            case 3:
                System.out.println("Salir"); //Salir del juego
                
                break;
                
            default:
                    throw new AssertionError();
                    
        }
    }
               public void opciones(){
                   System.out.println("1: Empezar juego");
                   System.out.println("2: Seleccionar categoria");
                   System.out.println("3: Salir");
                   
               }
               
}

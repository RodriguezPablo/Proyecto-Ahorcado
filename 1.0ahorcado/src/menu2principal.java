
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class menu2principal {
     public Scanner dato = new Scanner(System.in);
    public String opcion;
    
    
    public void Menu_principal(){  // Opciones del menu principal
        
        
        System.out.println("Bienvenido al juego");
        do {
            System.out.println("1: Entrar");
            System.out.println("2: Salir");
            System.out.println("Digite la opción deseada");
            opcion=dato.next();
            
            switch(opcion){
                case "1":
                    
                    break;
                case "2":
                    
                    break;
            }
        }
        while(!"2".equals(opcion)); //Si opcion ingresada por el usuario es igual a 2 se sale 
        
        
           }
    
    private void categorias(){
         Carga_palabras palabras = new Carga_palabras(); //Cronstructor de Categorias
        palabras.Carga_palabras();
        
        
        System.out.println("1: Paises ");
            System.out.println("2: Autos");
            System.out.println("3: Animales");
            System.out.println("4: Marcas");
            System.out.println("5: Nombre de personas");            
            System.out.println("Digite la opción deseada");
            opcion=dato.next();
        
             
    
}
}
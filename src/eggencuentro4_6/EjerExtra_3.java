/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggencuentro4_6;

import java.util.Scanner;

/*
 *
 * @author Anabela
 */
public class EjerExtra_3 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si 
        se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
        la función equals() de la clase String.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Letra:");
                
        String letra = leer.next();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Es una vocal");
        } else {
            System.out.println("La letra no es una vocal");
        }
        
        
        
        
    }
    
}

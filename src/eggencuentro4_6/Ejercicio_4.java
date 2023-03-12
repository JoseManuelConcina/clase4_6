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
public class Ejercicio_4 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que pida una frase o palabra y valide si la primera 
        letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
        imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
        deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.next();
       
        if (frase.substring(0,1).equals("A")){ //substring(sub indice de inicio,hasta el primer caracter)
            System.out.println("CORRECTO");
    }else {
            System.out.println("INCORRECTO");
        
    }
   }   
}
/*
// substring(index INICIAL, index FINAL+1)
        System.out.println(frase.substring(0)); // Toda la palabra
        System.out.println(frase.substring(1)); // Toda la palabra menos la 1er letra
        System.out.println(frase.substring(0,2)); // Las 2 primeras letras --> 0 1 2 3 --> 0 a 2 --> HOL --> HO
*/
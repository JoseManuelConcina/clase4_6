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
public class manosalaObra10 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima 
        el número ingresado seguido de tantos asteriscos como indique su valor.
        Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **

        */
        
        Scanner leer = new Scanner(System.in);
        
        
        
        for (int i = 0; i < 4; i++) {
            
          System.out.println("Ingrese un numero:");
          
        int num = leer.nextInt();
        
            System.out.print(num+" ");
            
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }    
}      
       

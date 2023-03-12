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
public class EggEncuentro4_6 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Implementar un programa que le pida dos números enteros al usuario y
        determine si ambos o alguno de ellos es mayor a 25.
        
        */
Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros:");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
      
        if ((num1 > 25) || (num2 > 25) ) {
            System.out.println("Unos o ambos numeros son o es mayor a 25");
          } 
        else {
            System.out.println(" Ambos numeros son  menor a 25");
        }
        
        
        
        }
        

}
    


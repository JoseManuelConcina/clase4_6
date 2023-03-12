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
public class Ejercicio_1 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un número determine si es par o impar.
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        
        if (num%2==0){
            System.out.println("El numero "+num+" es par");
        }else {
            System.out.println("El numero "+num+" es impar");
        }
        
        
    }
    
}

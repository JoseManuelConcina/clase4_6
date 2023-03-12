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
public class Ejercicio_5 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a 
        continuación solicite números al usuario hasta que la suma de los números 
        introducidos supere el límite inicial.
        */
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite positivo:");
        int valorLimite = leer.nextInt();
        int suma=0;
        do {
            System.out.print("Ingrese un numero: ");
            int num = leer.nextInt();
            suma = suma + num;
        
        } while (suma < valorLimite);
        
        System.out.println("La suma de los numeros ingresados es de:"+ suma);
    }
    
}

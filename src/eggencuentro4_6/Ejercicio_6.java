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
public class Ejercicio_6 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que pida dos números enteros positivos por teclado y muestre 
        por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa
        deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá 
        ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario 
        selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar
        el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
        Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se
        vuelve a mostrar el menú.


        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros:");
        double num1 = leer.nextInt();
        double num2 = leer.nextInt();
        boolean bucle = true;
        do {
            
            System.out.println(" MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR ");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR ");
            System.out.println("5. SALIR");
            System.out.println("ELIJA OPCION ");
            int option = leer.nextInt();
            String salir ;
            switch (option){
                case 1:
                    System.out.println("La suma de los numer es: "+(num1+num2));
                    break ;
                case 2:
                    System.out.println("La resta de los numeros es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("La divicion de los  numeros es: "+ (num1/num2));
                    break;
                case 5:
                    System.out.println(" ¿Está seguro que desea salir del programa (S/N)?");
                salir = leer.next();
                if (salir.equalsIgnoreCase("s")){
                    System.out.println("Saliendo del programa");
                    bucle = false;
                    
                }else if (salir.equalsIgnoreCase("n")){
                    System.out.println("Volviendo al MENU");    
                
                }else {
                    System.out.println("La respuesta es incorrecta volviendo al MENU");
                }
                    
            } 
            
        } while (bucle);    
        
        
        
                
        
        
    }
    
}

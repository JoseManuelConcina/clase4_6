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
public class ejercicioManosalaObra9 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
        debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
        El programa deberá calcular y mostrar el resultado de la suma de los números
        leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de 
        la sentencia break.

        */
        
        Scanner leer =new Scanner(System.in);
        
        int numaux=0;
        int i =1;
        do { System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        
                i++;
                
                if (num == 0){
                    System.out.println("Se capturo en numero : "+num);
                    break;
                }else if (num > 0){
                numaux += num ;
            
                }
                
                
            
        } while ( i <=20);
        
        System.out.println("La suma de los numero positivos leido es de :"+numaux);
    }
    
}

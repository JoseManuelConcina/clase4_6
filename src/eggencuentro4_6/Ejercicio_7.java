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
public class Ejercicio_7 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
        este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
        llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
        el primer carácter tiene que ser X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
        especial    “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
        distinta de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
        correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
        se utilizan las siguientes funciones de Java Substring(), Length(), equals().
        
        */
        
        Scanner leer = new Scanner(System.in);
       String frase ;
        int cona=0;
        int conb =0;
        
        do {
            System.out.print("Ingrese una cadena de hasta 5 letras: ");
            frase = leer.next();
            if((frase.length()<=5)&&(frase.substring(0, 1).equals("X"))&&(frase.endsWith("O"))){
                System.out.println(frase+" Correctas");
             cona++;        
       
              } else {
                System.out.println(frase+" Incorrecta");
                conb++;}
        } while (!frase.equals("&&&&&"));
        
        System.out.println("La cantidad de lecturas correctas es de: "+cona);
        System.out.println("La cantidad de lecturas incorrectas es de: "+conb);
       
    }
    
}
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
public class EjerEctra_1 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas.
        Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe
        calcular su equivalente: 1 día, 2 horas.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los minutos: ");
        double min = leer.nextInt();
        double horas = min/ 60;
        double dias = 0;
       
        while (horas > 24){
            dias++;
            horas -= 24;
            
        }
        dias = Math.floor(dias);
        horas = Math.floor(horas); 
        System.out.println("Equivale a :"+ dias+ " dias, y " + horas+" horas." );
    }
}

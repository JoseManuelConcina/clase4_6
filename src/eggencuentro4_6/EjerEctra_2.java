/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggencuentro4_6;



/*
 *
 * @author Anabela
 */
public class EjerEctra_2 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
        diferente a cada una. A continuación, realizar las instrucciones necesarias 
        para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y
        D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada
        variable. Utilizar sólo una variable auxiliar.
        */
        
        
    int A = 1;
    int B = 2;
    int C = 3;
    int D = 4;
    int aux = B;
    
     System.out.println ( "La variable A vale: " + A +", la B: " + B + ", la C: " + C + " y la D: " + D ); 
    B=C;
    C=A;
    A=D;
    D=aux;
    
    System.out.println ( "Ahora la variable A vale: " + A +", la B: " + B + ", la C: " + C + " y la D: " + D ); 
    }
   
    
   
    
    
}

    
    


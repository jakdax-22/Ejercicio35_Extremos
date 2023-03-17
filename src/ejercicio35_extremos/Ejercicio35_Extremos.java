/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35_extremos;

/**
 *
 * @author enriq 
 */
public class Ejercicio35_Extremos  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5,6,7,8,9,10};
        double [] array2 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        Math3 math3 = new Math3 ();
        
        System.out.println("El mayor número del array1 es: "+ math3.max(array1));
        System.out.println("El menor número del array1 es: "+ math3.min(array1));
        System.out.println("El mayor número del array2 es: "+ math3.max(array2));    
        System.out.println("El menor número del array2 es: "+ math3.min(array2));        
    }
    
}

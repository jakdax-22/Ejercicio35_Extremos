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
public final class Math3 implements Extremos {
    private int min = 9999, max = 0;
    private double mind = 9999, maxd = 0;
    public Math3 () {
        
    }
    public int min (int []a){
        for (int i = 0; i < a.length; i++){
            if (a [i] < min)
                min = a [i];
        }
        return min;
    }
    public int max (int []a){
        for (int i = 0; i < a.length; i++){
            if (a [i] > max)
                max = a [i];
        }
        return max;
    }
    public double min (double []a){
        for (int i = 0; i < a.length; i++){
            if (a [i] < mind)
                mind = a [i];
        }
        return mind;
    }   
    public double max (double []a){
        for (int i = 0; i < a.length; i++){
            if (a [i] > maxd)
                maxd = a [i];
        }
        return maxd;
    }          
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series_taylor;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Pi {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void Pi() {
        double Pi = 0;
        System.out.println("ingrese la cantidad de terminos a evaluar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                Pi = Pi -(4 / ((i*2) - 1));
            }else{
                Pi = Pi +(4 / ((i*2) -1));
            }
        }
        System.out.println("El resultado aproximado es: " + Pi);
    }
    
}

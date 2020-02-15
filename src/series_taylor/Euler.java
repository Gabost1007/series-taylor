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
public class Euler {
    static Scanner sc = new Scanner(System.in);
    public static void Euler(){
        System.out.println("Numero a evaluar: ");
        int suma = sc.nextInt();
        int sum=0;
        for(int i=0; i<suma; i++) {
            if((i%3 == 0) || (i%5 == 0)){
                sum = sum+ i;
            }
        }
        System.out.println(sum);
    }
}

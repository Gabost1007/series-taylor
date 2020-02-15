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
public class Seno {
    static Scanner sc = new Scanner(System.in);
    
    public static void Seno() {
        double x;
        int n;
        System.out.println("ingrese el termino de resultados que desea: ");
        n = sc.nextInt();
        System.out.println("Ingrese el valor de los grados: ");
        x = sc.nextDouble();
        SerieSeno(x, 1,n);
    }
    
    static void SerieSeno(double x,int n, int i){
        if (n > 0) {
            if (i%2 !=0) {
                System.out.println("x" + x + "^" + (i*2-1) + "/" + (i*2-1) + "!" );
            }
            else
                System.out.println("-" + x + "^" + (i*2-1) + "/" + (i*2-1) + "!");
        SerieSeno(x, i+1, n-1);
        }
    }
    
}

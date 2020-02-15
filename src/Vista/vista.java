/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.Scanner;
import series_taylor.Coseno;
import series_taylor.Coseno;
import series_taylor.Coseno;
import series_taylor.Coseno;
import series_taylor.Coseno;
import series_taylor.Euler;
import series_taylor.Pi;
import series_taylor.Seno;

/**
 *
 * @author Gabriel
 */
public class vista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int resultado;
        while (!salir) {
            System.out.println("Que operacion desea?");
            System.out.println("1)Coseno, 2)Exponente/Euler, 3)Pi, 4)Seno, 5)Salir");
            resultado = sc.nextInt();
            switch (resultado) {
                case 1:
                    Coseno.Coseno();
                    break;
                case 2:
                    Euler.Euler();
                    break;
                case 3:
                    Pi.Pi();
                    break;
                case 4:
                    Seno.Seno();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("numeros entre 1 y 5");
            }
        }
    }

}

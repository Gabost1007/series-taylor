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
public class Coseno {

    public static void Coseno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese los grados: ");
        double grados = sc.nextDouble();
        double angulo = Math.toRadians(grados),
                calcularPorSerie = serieTaylor(angulo),
                calcularPorMath = Math.cos(angulo);

        System.out.println("Serie: " + calcularPorSerie);
        System.out.println("Cos: " + calcularPorMath);
    }

    static double serieTaylor(double x) {
        double sumando, sumatoria = 0, precision = 0.0001d;

        // limite superior, iteracion de la sumatoria
        int n = 0;

        do {
            sumando = Math.pow(-1, n) / factorial(2 * n) * Math.pow(x, 2 * n);
            sumatoria = sumatoria + sumando;
            n = n + 1;
        } while (Math.abs(sumando) > precision);

        return sumatoria;
    }

    static double factorial(int numero) {
        double factorial = 1.0d;

        while (numero != 0) {
            factorial *= numero--;
        }

        return factorial;
    }

}

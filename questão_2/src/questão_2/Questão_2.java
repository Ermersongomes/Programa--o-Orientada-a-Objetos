/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questão_2;

/**
 *
 * @author 20241198060006
 */

import java.util.Scanner;

public class Questão_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(5,20);

        r1.setAltura(teclado.nextDouble());
        r1.setLargura(teclado.nextDouble());

        System.out.println("Area de r1: " + r1.calulaArea());
        System.out.println("Area de r2: " + r2.calulaArea());
    }
    
}

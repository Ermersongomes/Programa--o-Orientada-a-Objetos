/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_de_volta_as_aulas_2;

/**
 *
 * @author 20241198060006
 */
import java.util.Scanner;

public class Atividade_de_volta_as_aulas_2 {


    public static class Retangulo {
        private double largura;
        private double altura;

        public Retangulo(double largura, double altura) {
            this.largura = largura;
            this.altura = altura;
        }
        //.............................................................
        
        public double getLargura() {
            return largura;
        }

        public double getAltura() {
            return altura;
        }
        //................................................................
        
        public void setLargura(double largura) {
            this.largura = largura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
        //...................................................................
        
        public double calcularArea() {
            return largura * altura;
        }
    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite a largura do retangulo: ");
        double largura = entrada.nextDouble();
        
        System.out.print("Digite a altura do retangulo: ");
        double altura = entrada.nextDouble();
        
        // Objeto Retangulo com os valores informados pelo usuário
        Retangulo retangulo = new Retangulo(largura, altura);


        System.out.println("Area do retangulo e de: " + retangulo.calcularArea());
        
    }
}

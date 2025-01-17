package atividade_de_volta_as_aulas_2;

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
//.............................................................
        public void setLargura(double largura) {
            this.largura = largura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
//..............................................................
        public double calcularArea() {
            return largura * altura;
        }
    }

    public static void main(String[] args) {
        
         // Scanner para leitura
        Scanner entrada = new Scanner(System.in);

        // Solicitar ao usuário que informe a largura e altura do retângulo
        System.out.print("Digite a largura do retângulo: ");
        double largura = entrada.nextDouble();
        
        System.out.print("Digite a altura do retângulo: ");
        double altura = entrada.nextDouble();
        
        // Criar o objeto Retangulo com os valores informados pelo usuário
        Retangulo retangulo = new Retangulo(largura, altura);

        // Calcular e exibir a área do retângulo
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        
    }
}

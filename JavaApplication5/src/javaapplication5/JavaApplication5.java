/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Ermerson
 */
public class JavaApplication5 
{

    public static void main(String[] args) 
    {
        double janeiro = 3500.25;
        double fevereiro = 2489.57;
        double marco = 3011.52;
        
        System.out.println("Janeiro = " + janeiro);
        System.out.println("Fevereiro = " + fevereiro);
        System.out.println("Março = " + marco);
        
        System.out.println("");
        System.out.println( "Resultado sem salvar na variável: " + String.format("%.2f",(janeiro + fevereiro + marco) / 3));
        
        double media = (janeiro + fevereiro + marco) / 3;
        System.out.println("Na Variável Média = " + String.format("%.2f", media) + "\n");
        
        /*Troca de tipo de dados por força bruta*/
        int x = (int)media;
        System.out.println("forçando a troca de tipo de dados: " + x);
        
        int i = 1;
        while(i<10)
        {
          System.out.println("Valor de i: " + i);
          i++;
        }
    }
    
}

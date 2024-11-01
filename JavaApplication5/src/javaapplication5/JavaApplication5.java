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
        
        for (int j = 0; j < 50; j++) 
        {
            System.out.print("_"); 
        }
         
        System.out.println("");
        
        double media = (janeiro + fevereiro + marco) / 3;
        System.out.println("Média = " + String.format("%.2f", media) + "\n");
    }
    
}

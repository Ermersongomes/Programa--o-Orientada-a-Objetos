/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepoo.pkg01;

/**
 *
 * @author 20241198060006
 */
public class AtividadePOO01
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Questão 1");
       int x = 150;
       while (x < 300){
           x++;
           System.out.println(x);
       }
        System.out.println("\n");
        
        System.out.println("Questão 2");
        int i = 1;
        int sum = 0;
        while (i <= 1000){
            sum += i;
            i++;
        }        
        System.out.println("total da suma de 1 á 1000:" + sum);
        
        System.out.println("\n");
        
        System.out.println("Questão 3");
        for( int m=1; m <= 100; m++){
            if(m % 3 == 0){
                System.out.println(m);
            }
        }
        
        System.out.println("\n");
        
        System.out.println("Questão 4");
        int fat = 1;
        for ( int n = 1; n <=10; n++){
            fat = fat * n;
            System.out.println(fat);
        }
        
        System.out.println("\n");
        
        System.out.println("Questão 5");
        int a =0;
        int b =1;
        int acomulador;
     
            System.out.println(a);
            System.out.println(b);
        
        for(int fib = 3 ; fib <= 14; fib++){
            acomulador = a + b ;
            a = b;
            b = acomulador;
            System.out.println(b);
            if (acomulador >= 100){
                break;
            }
        }
    }
    
}

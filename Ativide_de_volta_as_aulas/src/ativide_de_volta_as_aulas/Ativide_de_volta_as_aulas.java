
package ativide_de_volta_as_aulas;

import java.util.Scanner;

public class Ativide_de_volta_as_aulas {

    public static void tabuada (int num){
        
        for (int i = 0; i<= 10; i++){
            System.out.println(num + "x" + i + "=" + (num*i)); 
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite um número: ");  
            tabuada(entrada.nextInt());
        
    }
    
}

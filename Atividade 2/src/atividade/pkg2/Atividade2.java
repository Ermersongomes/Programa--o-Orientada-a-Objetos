package atividade.pkg2;

/**
 *
 * @author 20241198060006
 */

 import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, controle, qtd_par, qtd_impar;
        
        controle = 0;
        qtd_par = qtd_impar = 0;
        
        do{
            System.out.println("Digite um número positivo: ");  
            numero = entrada.nextInt();
            if(numero > 0){
                if(numero % 2 == 0){
                    qtd_par++;
                }
                else{
                    qtd_impar++;
                }
            }
            controle++;
        }while(controle < 5);
        
        System.out.println("par: " + qtd_par); 
        System.out.println("impar: " + qtd_impar); 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petshop;


public class Petshop 
{
   
    public static void main(String[] args) 
    {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Luna");
        cachorro.setIdade(5);
        
        
        System.out.println("Nome do cachorro: "+cachorro.getNome());
        System.out.println("Idade do cachorro: "+cachorro.getIdade()+" Anos");
        cachorro.amamentar();
        cachorro.latir();
        
        System.out.println(" ");
        
        Gato gato = new Gato();
        gato.setNome("Pedro");
        gato.setIdade(3);
        
        System.out.println("Nome do gato: "+gato.getNome());
        System.out.println("Idade do gato: "+gato.getIdade()+" Anos");
        gato.miar();
        
        System.out.println(" ");
        
        Ave ave = new Ave ();
        ave.setNome("Piu");
        ave.setIdade(1);
        
        
    }
    
}

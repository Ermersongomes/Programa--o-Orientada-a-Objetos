/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

public class Animal 
{
    private String nome;
    private int idade;
 
    //Faz a alteração
    void setNome(String n)
    {   
        //sem tratamento
        this.nome = n;
    }
    
    //Pega a alteração
    String getNome(){
        return this.nome;
    }
    
    //pegar idade
    void setIdade(int n)
    {
        this.idade = n;
    }
    int getIdade()
    {
        return this.idade;
    }
    
    void comer()
    {
        System.out.println("Está comendo");
    }
    void emitirSom()
    {
        System.out.println("Está emetindo som");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author 20241198060006
 */
public class Mamifero extends Animal 
{
    public String tipoPelo;   
    
    void settipoPelo (String pelo)
    {
        this.tipoPelo = pelo;
    }
    String gettipoPelo()
    {
        return this.tipoPelo;
    }
    
    
    void amamentar()
    {
        System.out.println(getNome()+" Está amamentando");
    }   
}

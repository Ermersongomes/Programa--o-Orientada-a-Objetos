/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author 20241198060006
 */
public class Ave extends Animal 
{
    private String tipoPena;
    
    void setTipoPena(String pena )
    {
        this.tipoPena = pena;
    }
    
    String getTipoPena()
    {
        return this.tipoPena;
    }
    void voar()
    {
        System.out.println("Está voando");
    }
}

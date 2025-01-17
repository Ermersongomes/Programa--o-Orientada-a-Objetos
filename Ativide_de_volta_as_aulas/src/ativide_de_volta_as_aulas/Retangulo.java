/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativide_de_volta_as_aulas;

/**
 *
 * @author 20241198060006
 */
public class Retangulo {
    private double largura;
    private double altura; 
    
    public Retangulo( double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    public double getLargura(){
        return largura;
    }
    public double getAltura(){
        return altura;
    }
   //......................................
    
    public void setLargura(double largura){
        this.largura = largura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    //.....................................
    
    public double calcularArea () {
        return largura * altura;
    }
    
  
    
}
   public class main{
        public static void main(String[] args){
            
        }
    }
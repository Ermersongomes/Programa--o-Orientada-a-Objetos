/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questão_2;

/**
 *
 * @author 20241198060006
 */

public class Retangulo {
    private double largura;
    private double altura;
    
     //construtor
    public Retangulo(double larg, double alt) {
        setAltura(alt); // Chama o método setAltura
        setLargura(larg); // Chama o método setLargura
    }
    
    //obrigatoria construtor padrão sem paramentors
    //obrigatorio quando tiver qualquer outro construtor
    public Retangulo(){
        
    }
    
    //metodos gets
    public double getLargura(){
        return this.largura;
    }
    
    public double getAltura(){
        return this.altura;
    }
    //metodos sets
    public void setLargura(double larg){
       if(larg > 0){
            this.largura = larg;
        }else{
           System.out.println("Número inválido");
       }
    }
    
    public void setAltura(double alt){
        if(alt > 0){
            this.altura = alt;
        }else{
           System.out.println("Número inválido");
       }
    }
   
    //metodo que calcula a Area
    double calulaArea(){
        return  this.largura * this.altura;
    }
    
}

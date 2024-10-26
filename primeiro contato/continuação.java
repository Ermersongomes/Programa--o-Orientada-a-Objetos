import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Carro carro1, carro2; // Só declaração
        Moto moto1 = new Moto(); // Declarando e instânciando "Mais usado" 
        carro1 = new Carro();// declarando carro1
        carro1.set_AnoFabricacao(2020);
        System.out.println("Ano de fabricação carro 1: "+carro1.get_AnoFabricacao());
        carro1.buzinar();     
        moto1.buzinar();       
    }
}

class Automovel{
    private int anoFabricacao;
    void set_AnoFabricacao(int anoFabricacao){
        if(anoFabricacao <= 2024)
            this.anoFabricacao = anoFabricacao;
    }
    int get_AnoFabricacao(){
        return this.anoFabricacao;
    }
    void buzinar(){
    }   
}
class Carro extends Automovel{
    void buzinar(){
        System.out.println("Carro buzinando");    
    }
        
}
class Moto extends Automovel{
    void buzinar(){
        System.out.println("Moto buzinando");        
    }

    
}
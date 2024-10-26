import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Carro carro1, carro2;
        carro1 = new Carro();
        carro1.set_AnoFabricacao(3020);
        System.out.println("Ano Fab carro1:"+carro1.get_AnoFabricacao());
       
    }
}

class Automovel{
    private int anoFabricacao;
    void set_AnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    int get_AnoFabricacao(){
        return this.anoFabricacao;
    }
    void buzinar(){
    }   
}
class Carro extends Automovel{
    
}
class Moto extends Automovel{
    
}
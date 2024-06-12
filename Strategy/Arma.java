package Strategy;

import Strategy.elemento.Elemento;
import Strategy.energia.Energia;

public class Arma {

    private int danhio = 30;
    
    private Elemento elemento;
    private Energia energia;

    public Arma(Elemento elemento, Energia energia){
        this.elemento = elemento;
        this.energia = energia;
    }

    public void golpe(){
        System.out.println("base: "+ this.danhio+" Energia: "+this.energia.damnum()+" Elmental: "+this.elemento.damnum());
    }
}

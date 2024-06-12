package Strategy;

import Strategy.elemento.Fuego;
import Strategy.elemento.Hielo;
import Strategy.energia.Lacer;
import Strategy.energia.Pasma;

public class Principal {
    public static void main(String[] args){
        Arma arma1 = new Arma(new Hielo(), new Pasma());
        Arma arma2 = new Arma(new Fuego(), new Pasma());
        Arma arma3 = new Arma(new Hielo(), new Lacer());
        Arma arma4 = new Arma(new Fuego(), new Lacer());

        arma4.golpe();
        arma1.golpe();
        arma2.golpe();
        arma3.golpe();
    }
}

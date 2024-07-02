package Observer.observerV3.principal;

import Observer.observerV3.golpe.Golpe1;
import Observer.observerV3.golpe.Golpe2;
import Observer.observerV3.sujeto.Sujeto;
import Observer.observerV3.sujeto.Sujeto1;
import Observer.observerV3.sujeto.Sujeto2;

public class Principal {

    public static void main(String[] args){
        Sujeto sujeto11 = new Sujeto1("putito", 2000, 40);
        //Sujeto suejto12 = new Sujeto1("holardo", 2000);
        Sujeto sujeto21 = new Sujeto2("lionardo", 4000, 100);

        new Golpe1(sujeto11, sujeto21.getGolpe());
        //new Golpe1(sujeto11, 40);

        new Golpe2(sujeto21, sujeto11.getGolpe());
        new Golpe2(sujeto21, sujeto11.getGolpe());

        System.out.println(sujeto11.getNombre()+" "+sujeto11.getVida());

        sujeto11.cambioEstado(true);
        System.out.println(sujeto11.getNombre()+" "+sujeto11.getVida());

        System.out.println(sujeto21.getNombre()+" "+sujeto21.getVida());

        sujeto21.cambioEstado(true);
        System.out.println(sujeto21.getNombre()+" "+sujeto21.getVida());
    }
    
}

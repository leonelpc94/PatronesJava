package Observer.observerV3.golpe;

import Observer.observerV3.sujeto.Sujeto;

public class Golpe1 extends Golpe{

    public Golpe1(Sujeto sujeto, int golpe){
        this.tipoGolpe = golpe;
        this.sujeto = sujeto;
        sujeto.agregarGolpe(this);
    }
    
}

package Observer.observerV3.golpe;

import Observer.observerV3.sujeto.Sujeto;
import Observer.observerV3.observador.Observador;

public abstract class Golpe implements Observador{

    protected Sujeto sujeto;
    protected int tipoGolpe;

    @Override
    public void golpeSujeto(){
        sujeto.golpeDaño(tipoGolpe);
    }
}
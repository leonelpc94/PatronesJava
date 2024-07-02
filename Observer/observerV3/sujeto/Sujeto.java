package Observer.observerV3.sujeto;

import java.util.ArrayList;
import java.util.List;

import Observer.observerV3.observador.Observador;

public abstract class Sujeto {

    protected int vida;
    protected String nombre;
    protected int golpe;

    List<Observador> listaGolpe = new ArrayList<>();
    protected boolean estado;

    public Sujeto(String nombre, int vida, int golpe){
        this.nombre = nombre;
        this.vida = vida;
        this.golpe = golpe;
    }

    public boolean getEstado(){
        return this.estado;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public int getVida(){
        return this.vida;
    }
    
    public int getGolpe(){
        return this.golpe;
    }

    public void agregarGolpe(Observador observa){
        listaGolpe.add(observa);
    }

    public void cambioEstado(boolean estado){
        this.estado = estado;
        notificarGlope();
    }

    public void notificarGlope(){
        // indice : iterador
        for(Observador lista: listaGolpe){
            lista.golpeSujeto();
        }
    }

    public void golpeDaño(int golpe){
        this.vida -= golpe;
    }
}

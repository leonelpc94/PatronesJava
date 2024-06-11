package Observer.observerV2;

import java.util.ArrayList;
import java.util.List;

public class Sujeto implements Observador{

    private List<Observador> listaObservadors = new ArrayList<>();

    private boolean estado;
    private String nombre;

    public Sujeto(String nombre){
        this.nombre = nombre;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
        notificarSubscritores();
    }

    public void notificarSubscritores(){
        for(Observador observador: listaObservadors){
            observador.getUpdate();
        }
    }

    public void agergarSubcritores(Observador sujeto){
        listaObservadors.add(sujeto);
    }

    public void eliminarSubcritores(Observador sujeto){
        listaObservadors.remove(sujeto);
    }

    @Override
    public void getUpdate() {
        System.out.println("Hola Subcritor: "+ this.nombre);
    }
    
}

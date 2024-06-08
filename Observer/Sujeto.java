package Observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    
    List<Observador> listaObservadors = new ArrayList<>();

    private boolean estado;

    public boolean getEstado(){
        return this.estado;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
        notificarObservadores();
    }

    public void agregarObservador(Observador observador){
        listaObservadors.add(observador);
    }

    public void notificarObservadores(){
        for(Observador observador: listaObservadors){
            observador.upDate();
        }
    }
}

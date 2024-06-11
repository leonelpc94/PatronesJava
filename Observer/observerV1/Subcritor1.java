package Observer.observerV1;

public class Subcritor1 extends Observador{

    public Subcritor1(Sujeto sujeto){
        this.sujeto =sujeto;
        this.sujeto.agregarObservador(this);
    }
    
    public void upDate(){
        System.out.println( "yo soy subcritor 1: " + sujeto.getEstado() );
    }
}

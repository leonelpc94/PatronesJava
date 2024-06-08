package Observer;

public class Subcritor1 extends Observador{

    public Subcritor1(Sujeto sujeto){
        this.sujeto =sujeto;
        this.sujeto.agregarObservador(this);
    }
    
    public void upDate(){
        System.out.println( "Binary String: " + sujeto.getEstado() );
    }
}

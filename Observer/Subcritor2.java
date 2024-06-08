package Observer;

public class Subcritor2 extends Observador{
    
    public Subcritor2(Sujeto sujeto){
        this.sujeto =sujeto;
        this.sujeto.agregarObservador(this);
    }
    
    public void upDate(){
        System.out.println( "Binary String: " + sujeto.getEstado() );
    }
}

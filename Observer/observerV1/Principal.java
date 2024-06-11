package Observer.observerV1;

public class Principal {
    
    public static void main(String[] args){
        Sujeto sujeto = new Sujeto();

        new Subcritor1(sujeto);
        new Subcritor2(sujeto);

        sujeto.setEstado(true);
    }
}

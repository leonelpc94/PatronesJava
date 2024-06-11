package Builder;

public class AutoBus {

     private int numeroPuertas;
     private int numeroAsientos;

     public void setNumeroAsentos(int asientos){
        this.numeroAsientos = asientos;
     }

     public void setNumeroPuertas(int puertas){
        this.numeroPuertas = puertas;
     }
     public int getNumeroPuertas(){
        return this.numeroPuertas;
     }
     public int getNumeroAsientos(){
        return this.numeroAsientos;
     }
}

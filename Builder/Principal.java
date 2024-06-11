package Builder;

public class Principal {

    public static void main(String[] args){
        ConstrutorAutoBus construtorBus = new ConstrutorAutoBus();
        Director director = new Director(construtorBus);

        director.make("autobus");
        AutoBus bus = construtorBus.getAutoBus();
        System.out.println("AUTOBUS");
        System.out.println("Numero de asientos: "+bus.getNumeroAsientos());
        System.out.println("Numero de puertas: "+bus.getNumeroPuertas());
    }
    
}

package Builder;

public class Director {

    private ConstrutorAuto construtorAuto;

    public Director(ConstrutorAuto construtorAuto){
        this.construtorAuto = construtorAuto;
    }

    public void make(String tipo){
        if (tipo.equals("autobus")){
            construtorAuto.resultado();
            construtorAuto.setNumeroAsentos(20);
            construtorAuto.setNumeroPuertas(6);
        }else if(tipo.equals("automovil")){

        }else{
            System.out.println("no se encontro la opcion");
        }
    }
    
}

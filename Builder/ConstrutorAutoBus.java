package Builder;

public class ConstrutorAutoBus implements ConstrutorAuto{

    private AutoBus autoBus;

    @Override
    public void resultado() {
        this.autoBus = new AutoBus();
    }

    @Override
    public void setNumeroPuertas(int puertas) {
        autoBus.setNumeroPuertas(puertas);
    }

    @Override
    public void setNumeroAsentos(int asientos) {
        autoBus.setNumeroAsentos(asientos);
    }
    
    public AutoBus getAutoBus(){
        return this.autoBus;
    }
}

package Observer.observerV2;

public class Principal {
    
    public static void main(String[] args){
        Sujeto leonaldo = new Sujeto("leonardo");
        Sujeto sara = new Sujeto("sara");
        Sujeto andrea = new Sujeto("andrea");
        Sujeto leonel = new Sujeto("leonel");

        //primer cuenta 
        //validar tambein que no pueda subscribirse varia veces
        leonel.agergarSubcritores(sara); 
        leonel.agergarSubcritores(leonaldo);
        leonel.agergarSubcritores(andrea);

        //segunda cuenta
        andrea.agergarSubcritores(leonel);
        
        //tercera cuanta 
        sara.agergarSubcritores(leonel);
        sara.agergarSubcritores(andrea);

        //mostrar sub
        leonel.setEstado(true);

        //eliminar sub
        leonel.eliminarSubcritores(andrea);

        //nueva lista
        leonel.setEstado(true);

    }
}

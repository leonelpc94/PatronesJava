package Chain_responsibility.Chain;

import Chain_responsibility.User.User;

public class HandlerOne extends Handler{

    public HandlerOne(){
        levelAccess = 1;
    }

    @Override
    protected void write(User user) {
        System.out.println(String.format("Bienvenido %s al nivel 1", user.getName()));
    }    
}

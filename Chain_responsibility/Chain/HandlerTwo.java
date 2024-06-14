package Chain_responsibility.Chain;

import Chain_responsibility.User.User;

public class HandlerTwo extends Handler{

    public HandlerTwo(){
        levelAccess = 2;
    }

    @Override
    protected void write(User user) {
        System.out.println(String.format("Bienvenido %s al nivel 2", user.getName()));
    }

    
}
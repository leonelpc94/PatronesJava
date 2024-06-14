package Chain_responsibility.Chain;

import Chain_responsibility.User.User;

public class HandlerThree extends Handler{

    public HandlerThree(){
        levelAccess = 3;
    }

    @Override
    protected void write(User user) {
        System.out.println(String.format("Bienvenido %s al nivel 3", user.getName()));
    }
    
}

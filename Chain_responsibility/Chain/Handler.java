package Chain_responsibility.Chain;

import Chain_responsibility.User.User;

public abstract class Handler {

    protected int levelAccess;
    protected Handler handler;
    
    public void setNext(Handler HB){
        this.handler = HB;
    }
    public void handler(User user){
        if(user.getAccess() >= levelAccess){
            write(user);
        }
        if(handler != null){
            handler.handler(user);
        }
    }
    abstract protected void write(User user);
}

package Chain_responsibility.User;

public class User {

    private String name;
    private int access;

    public User(String name, int access){
        this.name = name;
        this.access = access;
    }

    public int getAccess(){
        return this.access;
    }

    public String getName(){
        return this.name;
    }
    
}

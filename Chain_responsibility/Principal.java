
package Chain_responsibility;

import Chain_responsibility.Chain.Handler;
import Chain_responsibility.Chain.HandlerOne;
import Chain_responsibility.Chain.HandlerThree;
import Chain_responsibility.Chain.HandlerTwo;
import Chain_responsibility.User.User;

public class Principal {

    public static void main(String[] args){
        //usuarios
        User user1 = new User("Leonel", 3);
        User user2 = new User("Andrea", 1);
        User user3 = new User("Sara", 2);
        User user4 = new User("Carmesi", 3);

        //crear la cadena
        Handler level1 = new HandlerOne();
        Handler level2 = new HandlerTwo();
        Handler level3 = new HandlerThree();

        level1.setNext(level2);
        level2.setNext(level3);
        //level3.setNext(null);

        //acceso de usaurios 
        level1.handler(user1);
        level1.handler(user2);
        level1.handler(user3);
        level1.handler(user4);
    }
}
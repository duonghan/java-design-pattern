package adapter;

public class User { // Client class
    public void charge(){
        ChargerAdapter c = new ChargerAdapter();
        c.charg();
    }

    public static void main(String[] args) {
        new User().charge();
    }
}

package adapter;

public class ChargerAdapter {  // Adapter class
    private ChargerAdaptee adaptee;

    public void charg(){
        adaptee = new ChargerAdaptee();
        adaptee.plug();
    }
}

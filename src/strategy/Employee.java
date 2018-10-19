package strategy;

public class Employee implements Marketing{
    @Override
    public void sale() {
        System.out.println("Get more money");
    }
}

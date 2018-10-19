package strategy;

public class Student implements Marketing{
    @Override
    public void sale() {
        System.out.println("I'm poor. Don't lie me.");
    }
}

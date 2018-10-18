package singleton;

public class Printer {
    private static Printer instance;

    private Printer() {}

    public static Printer getInstance(){
        if(instance == null){
            return new Printer();
        }

        return instance;
    }

    public void connect(){
        System.out.println("Connected!!");
    }
}

class Employee{
    public void print(){
        Printer printer = Printer.getInstance();
        printer.connect();
    }
}

class Staff{
    public void work(){
        Printer printer = Printer.getInstance();
        printer.connect();
    }
}

class Main{
    public static void main(String[] args) {
        new Employee().print();
        new Staff().work();
        Printer.getInstance().connect();
    }
}

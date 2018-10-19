package strategy;

public class Customer {
    private Marketing marketing;

    public Customer(Marketing marketing) {
        this.marketing = marketing;
    }

    public void sale(){
        marketing.sale();
    }

    public static void main(String[] args) {
        Customer c1 = new Customer(new Employee());
        c1.sale();

        Customer c2 = new Customer(new Student());
        c2.sale();
    }
}

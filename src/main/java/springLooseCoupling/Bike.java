package springLooseCoupling;

public class Bike implements Travel{

    public void travel() {

        System.out.println("travel by Bike");
    }
    public void start() {
        System.out.println("Bike start with kick");
    }
}

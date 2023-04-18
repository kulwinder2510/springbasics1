package springLooseCoupling;

public class Car implements Travel{

    public void travel() {

        System.out.println("travel by car");
    }
    public void start() {

        System.out.println("car start with key");
    }
}

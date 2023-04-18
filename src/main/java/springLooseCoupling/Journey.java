package springLooseCoupling;

public class Journey {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.start();

        Bike bike1=new Bike();
        bike1.start();

        Car car=new Car();
        car.travel();

        Bike bike=new Bike();
        bike.travel();

    }
}

public class Main {
    public static void main(String[] args) {
        // car object
        Car car = new Car("M 3", "BMW", 2024, 100000, "White", 10);

        // print car details
        System.out.println(car.toString());

        // selling 3 cars
        car.sell(3);

        // print 
        System.out.println("\nAfter selling:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: $" + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        // change 
        car.setColor("Red");
        car.setPrice(110000);
        car.delivery(5); 

        // print updated details
        System.out.println("\nAfter updates:");
        System.out.println(car.toString());
    }
}


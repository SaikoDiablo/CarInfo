public class Car {
    // private 
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    // constructor
    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // car delivery 
    public void delivery(int amount) {
        quantity += amount;
        System.out.println(amount + " cars delivered. New quantity: " + quantity);
    }

    // car sale 
    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " cars sold. Remaining: " + quantity);
        } else {
            System.out.println("Not enough cars in stock for sell " + amount + ".");
        }
    }

    // return all field values
    @Override
    public String toString() {
        return """
               Car Details:
               Brand: """ + brand + "\n" +
               "Model: " + model + "\n" +
               "Year: " + year + "\n" +
               "Price: $" + price + "\n" +
               "Color: " + color + "\n" +
               "Quantity: " + quantity;
    }
}

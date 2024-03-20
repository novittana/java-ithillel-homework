package cars;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int registerYear;
    private String color;
    private double price;
    private String registerNumber;

    public Car(int id, String brand, String model, int registerYear, String color, double price, String registerNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.registerYear = registerYear;
        this.color = color;
        this.price = price;
        this.registerNumber = registerNumber;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegisterYear(int registerYear) {
        this.registerYear = registerYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRegisterYear() {
        return registerYear;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    @Override
    public String toString() {
        return "Car{Id: " + id + ", Brand: " + brand + ", Model: " + model + ", Register year: " + registerYear + ", Color:" + color + ", Price: " + price + ", Register number: " + registerNumber + '}';
    }

}

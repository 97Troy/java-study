package objectarray;

public class Phone {
    private String brand;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public Phone() {
    }

    public double avgPrice(Phone[] phones){
        double sum = 0;
        for (Phone phone:phones){
            sum += phone.getPrice();
        }
        return sum / phones.length;
    }
}

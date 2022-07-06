package ObjectArray;

import java.util.Arrays;

public class Goods {
    private String id;
    private String name;
    private  double price;
    private int amount;

    public Goods() {
    }

    public Goods(String id, String name, double price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void show(){
        System.out.println(id +" " + name + " " + price + " " + amount);
    }
}

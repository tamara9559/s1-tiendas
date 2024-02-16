package model;

public class Toy {
    private String name;
    private Type type;
    private int amount;
    private int price;

    public Toy() {
    }

    public Toy(String name, Type type, int amount, int price) {
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

package model.java;

public class Finish {
    private String price;
    private String size;

    public Finish(String price ,String size) {
        this.price = price;
        this.size=size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

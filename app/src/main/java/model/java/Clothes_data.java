package model.java;

import java.util.ArrayList;

public class Clothes_data {
     private ArrayList<Clothes> data =new ArrayList<>();

    public Clothes_data() {
        data.add(new Clothes("100","M"));
        data.add(new Clothes("110","L"));
        data.add(new Clothes("50","S"));
        data.add(new Clothes("180","L"));
    }

    public ArrayList<Clothes> getData() {
        return data;
    }

    public void setData(ArrayList<Clothes> data) {
        this.data = data;
    }
}

package model.java;

import java.util.ArrayList;

public class shose_data {
    private ArrayList<Clothes> data =new ArrayList<>();

    public shose_data() {
        data.add(new Clothes("200","43"));
        data.add(new Clothes("210","39"));
        data.add(new Clothes("250","44"));
        data.add(new Clothes("180","42"));
    }

    public ArrayList<Clothes> getData() {
        return data;
    }

    public void setData(ArrayList<Clothes> data) {
        this.data = data;
    }
}

package model.java;

import java.util.ArrayList;

public class data_type {
ArrayList<Type>types=new ArrayList<>();

    public data_type() {
        types.add(new Type("shoes"));
        types.add(new Type("clothes"));
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Type> types) {
        this.types = types;
    }
    public String [] cat(){
        String [] type=new String[]{"shoes","clothes"};
        return type;
    }
}

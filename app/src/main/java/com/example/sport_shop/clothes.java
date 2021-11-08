package com.example.sport_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

import model.java.Clothes;
import model.java.Clothes_data;
import model.java.Finish;
import model.java.Finish_end;

public class clothes extends AppCompatActivity {
    private TextView item1_price;
    private TextView item1_size;
    private TextView item2_price;
    private TextView item2_size;
    private TextView item3_price;
    private TextView item3_size;
    private TextView item4_price;
    private TextView item4_size;
    Clothes_data Data;
Finish_end finsh=new Finish_end();
Finish f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);
        get_data_in_run_time();
        put_data_in_textview();
    }

    private void put_data_in_textview() {
         Data=new Clothes_data();
        item1_price.setText(Data.getData().get(0).getPrice());
        item1_size.setText(Data.getData().get(0).getSize());
        item2_price.setText(Data.getData().get(1).getPrice());
        item2_size.setText(Data.getData().get(1).getSize());
        item3_price.setText(Data.getData().get(2).getPrice());
        item3_size.setText(Data.getData().get(2).getSize());
        item4_price.setText(Data.getData().get(3).getPrice());
        item4_size.setText(Data.getData().get(3).getSize());



    }

    private void get_data_in_run_time() {
        item1_price=findViewById(R.id.item1_price);
        item1_size=findViewById(R.id.item1_size);
        item2_price=findViewById(R.id.item2_price);
        item2_size=findViewById(R.id.item2_size);
        item3_price=findViewById(R.id.item3_price);
        item3_size=findViewById(R.id.item3_size);
        item4_price=findViewById(R.id.item4_price);
        item4_size=findViewById(R.id.item4_size);

    }

    public void click_item1(View view) {
        f=new Finish(Data.getData().get(0).getPrice(),Data.getData().get(0).getSize());
        finsh.getFinal_data().add(f);


    }
    public void click_item2(View view) {
        f=new Finish(Data.getData().get(1).getPrice(),Data.getData().get(1).getSize());
        finsh.getFinal_data().add(f);

    }

    public void click_item3(View view) {
        f=new Finish(Data.getData().get(2).getPrice(),Data.getData().get(2).getSize());
        finsh.getFinal_data().add(f);
    }

    public void click_item4(View view) {
        f=new Finish(Data.getData().get(3).getPrice(),Data.getData().get(3).getSize());
        finsh.getFinal_data().add(f);
    }
    public void show_booked(View view) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String booksString = gson.toJson(finsh);
        editor.putString("items", booksString);
        editor.commit();
        Intent intent = new Intent(this ,result.class);
        startActivity(intent);
    }
}
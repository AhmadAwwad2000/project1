package com.example.sport_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import model.java.Type;
import model.java.data_type;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        fillSpinner();

    }

    private void fillSpinner() {
        data_type type=new data_type();
        String [] type1=type.cat();
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this , android.R.layout.simple_spinner_item,type1);
        spinner.setAdapter(adapter);

    }

    public void go_to_next_page(View view)
    {
        if(spinner.getSelectedItem().toString().equals("clothes")){
            Intent intent = new Intent(this ,clothes.class);
            startActivity(intent);}
            else{
            Intent intent = new Intent(this ,shoes.class);
            startActivity(intent);

            }

    }
}
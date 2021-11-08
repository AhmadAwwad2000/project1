package com.example.sport_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import model.java.Clothes;
import model.java.Finish_end;

public class result extends AppCompatActivity {
private TextView res;
private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        listview=findViewById(R.id.listview);
        res=findViewById(R.id.res);
        Intent intent =getIntent();
        getresult();
        fill_list();

    }

    private void fill_list() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        String str = prefs.getString("items", "");
        Finish_end ff = gson.fromJson(str, Finish_end.class);
        String []list=new String[ff.getFinal_data().size()];
        for (int i=0;i<list.length;i++)
            list[i]="the price is :"+ff.getFinal_data().get(i).getPrice()+" and the size is  "+ff.getFinal_data().get(i).getSize();

        //ArrayAdapter<String> adapter= new ArrayAdapter<>(this , R.layout.activity_result,list);
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this , android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);


    }

    private void getresult() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                String str = prefs.getString("items", "");
                Finish_end ff = gson.fromJson(str, Finish_end.class);

                double price1=0;

                for(int i=0;i<ff.getFinal_data().size();i++){

                    price1+=Double.parseDouble(ff.getFinal_data().get(i).getPrice());
                }
                String r=Double. toString(price1);
                res.setText("the total price is : "+r);

            }
        });



    }


    public void home_page(View view) {
        Intent intent = new Intent(this ,MainActivity.class);
        startActivity(intent);
    }
}


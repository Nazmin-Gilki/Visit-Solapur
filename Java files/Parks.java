package com.example.admin.visitsolapur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class
Parks extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String[] parks={"Siddheshwar Park","Mantri Chandak Park","Hotel City Park","Meera Park","Vishwkarma Park"};
    ListView parkslist;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_parks);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,parks);
        parkslist=(ListView)findViewById(R.id. parks);
        parkslist.setAdapter(adapter);
        parkslist.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                Toast.makeText(this, "Siddheshwar Park", Toast.LENGTH_SHORT).show();
                Intent Sidintent = new Intent(this, SiddheshwarPark.class);
                startActivity(Sidintent);
                break;
            case 1:

                Toast.makeText(this, "Mantri Chandak Park",Toast.LENGTH_SHORT).show();
                Intent Mcpintent = new Intent(this, MantrichandakPark.class);
                startActivity(Mcpintent);
                break;
            case 2:
                Toast.makeText(this, "Hotel City Park", Toast.LENGTH_SHORT).show();
                Intent Hcpintent = new Intent(this,HotelCityPark.class);
                startActivity(Hcpintent);

                break;
            case 3:
                Toast.makeText(this, "Meera Park", Toast.LENGTH_SHORT).show();
                Intent Mpintent = new Intent(this, MeeraPark.class);
                startActivity(Mpintent);
                break;
            case 4:
                Toast.makeText(this, "Vishwkarma Park", Toast.LENGTH_SHORT).show();
                Intent Vpintent = new Intent(this,VishwkarmaPark.class);
                startActivity(Vpintent);
                break;
        }
    }

}




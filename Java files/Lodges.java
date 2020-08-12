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
Lodges extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String[] lodges={"Poonam Lodge","Geeta Lodge","Manoj Lodge","Savita Lodge","Surya Lodge"};
    ListView lodgeslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodges);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lodges);
        lodgeslist=(ListView)findViewById(R.id.lodges);
        lodgeslist.setAdapter(adapter);
        lodgeslist.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                Toast.makeText(this, "Poonam Lodge", Toast.LENGTH_SHORT).show();
                Intent Plintent = new Intent(this, PoonamLodge.class);
                startActivity(Plintent);
                break;
            case 1:

                Toast.makeText(this, "Geeta Lodge",Toast.LENGTH_SHORT).show();
                Intent Glintent = new Intent(this, GeetaLodge.class);
                startActivity(Glintent);
                break;
            case 2:
                Toast.makeText(this, "Manoj Lodge", Toast.LENGTH_SHORT).show();
                Intent Mlintent = new Intent(this, ManojLodge.class);
                startActivity(Mlintent);

                break;
            case 3:
                Toast.makeText(this, "Savita Lodge", Toast.LENGTH_SHORT).show();
                Intent Slintent = new Intent(this, SavitaLodge.class);
                startActivity(Slintent);
                break;
            case 4:
                Toast.makeText(this, "Surya Lodge", Toast.LENGTH_SHORT).show();
                Intent Surintent = new Intent(this, SuryaLodge.class);
                startActivity(Surintent);
                break;
        }
    }


}

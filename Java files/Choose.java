package com.example.admin.visitsolapur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Choose extends AppCompatActivity implements AdapterView.OnItemClickListener{

String[] Places={"Temples","Hospitals","schools","colleges","shopping malls","parks","forts","theaters","lodges","restaurant"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Places);
    ListView listview=(ListView)findViewById(R.id.places);
        listview.setAdapter(adapter);
       listview.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       switch (position){
            case 0:
                Toast.makeText(this, "Temples", Toast.LENGTH_SHORT).show();
                Intent myintent=new Intent(this,Temple.class);
                startActivity(myintent);
              break;
          case 1:

              Toast.makeText(this, "Hospitals", Toast.LENGTH_SHORT).show();
               Intent hospitalintent =new Intent(this,Hospitals.class);
              startActivity(hospitalintent);
               break;
           case 2:
               Toast.makeText(this, "Schools", Toast.LENGTH_SHORT).show();
                Intent schoolsintent=new Intent(this,Schools.class);
               startActivity(schoolsintent);

               break;
           case 3:
                Toast.makeText(this, "Colleges", Toast.LENGTH_SHORT).show();
               Intent collegeintent=new Intent(this,Colleges.class);
               startActivity(collegeintent);
               break;
           case 4:
               Toast.makeText(this, "Shopping Malls", Toast.LENGTH_SHORT).show();
                Intent shoppingintent=new Intent(this,ShoppingMalls .class);
               startActivity(shoppingintent);
               break;
           case 5:
               Toast.makeText(this, "Parks", Toast.LENGTH_SHORT).show();
               Intent parkintent=new Intent(this,Parks.class);
               startActivity(parkintent);
               break;
           case 6:
               Toast.makeText(this, "Forts", Toast.LENGTH_SHORT).show();
                Intent fortintent = new Intent(this, Forts.class);
               startActivity(fortintent);
               break;
           case 7:
               Toast.makeText(this, "Theaters", Toast.LENGTH_SHORT).show();
               Intent theaterintent=new Intent(this,Theaters.class);
               startActivity(theaterintent);
               break;
           case 8:
               Toast.makeText(this, "Lodges", Toast.LENGTH_SHORT).show();
                Intent lodgeintent=new Intent(this,Lodges.class);
               startActivity(lodgeintent);
               break;
           case 9:
               Toast.makeText(this, "Restaurant", Toast.LENGTH_SHORT).show();
                Intent restintent=new Intent(this,Restaurant.class);
               startActivity(restintent);
               break;
       }
    }
}

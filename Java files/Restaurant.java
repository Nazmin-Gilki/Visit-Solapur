package com.example.admin.visitsolapur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Restaurant extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String[] restaurant={"Skyview Family Restaurant","McDonalds","Laziz Pizza","Lokseva Pure Veg Restaurant","Sheetal Restaurant"};
    ListView restaurantlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
    ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,restaurant);
        restaurantlist=(ListView)findViewById(R.id.restaurants);
        restaurantlist.setAdapter(adapter);
        restaurantlist.setOnItemClickListener(this);

}
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position)
        {
            case 0:
                Toast.makeText(this, "Skyview Family Restaurant", Toast.LENGTH_SHORT).show();
                Intent Skyintent = new Intent(this,SkyviewFamilyRestaurant.class);
                startActivity(Skyintent);
                break;
            case 1:

                Toast.makeText(this, "McDonalds",Toast.LENGTH_SHORT).show();
                Intent Mcintent = new Intent(this, McDonalds.class);
                startActivity(Mcintent);
                break;
            case 2:
                Toast.makeText(this, "Laziz Pizza", Toast.LENGTH_SHORT).show();
                Intent Lpintent = new Intent(this, LazizPizza.class);
                startActivity(Lpintent);
                break;
            case 3:
                Toast.makeText(this, "Lokseva Pure Veg Restaurant", Toast.LENGTH_SHORT).show();
                Intent Pureintent = new Intent(this, LoksevaPureVegRestaurant.class);
                startActivity(Pureintent);
                break;
            case 4:
                Toast.makeText(this, "Sheetal Restaurant", Toast.LENGTH_SHORT).show();
                Intent Sheintent = new Intent(this ,SheetalRestaurant.class);
                startActivity(Sheintent);
                break;
        }
    }

}



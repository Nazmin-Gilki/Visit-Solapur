package com.example.admin.visitsolapur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ShoppingMalls extends AppCompatActivity  implements AdapterView.OnItemClickListener
{
    String[] shoppingMalls={"Oasis Mall","Virgo mica","Vikram Mall","Soham Mall","Big Bazar"};
    ListView shoppingMalllist;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_malls);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,shoppingMalls);
        shoppingMalllist=(ListView)findViewById(R.id.shoppingMalls);
        shoppingMalllist.setAdapter(adapter);
        shoppingMalllist.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                Toast.makeText(this, "Oasis Mall", Toast.LENGTH_SHORT).show();
                Intent Omintent = new Intent(this, OssisMall.class);
                startActivity(Omintent);
                break;
            case 1:

                Toast.makeText(this, "Virgo mica",Toast.LENGTH_SHORT).show();
                Intent Virintent = new Intent(this, VirgoMica.class);
                startActivity(Virintent);
                break;
            case 2:
                Toast.makeText(this, "Vikram Mall", Toast.LENGTH_SHORT).show();
                Intent Vikintent = new Intent(this, VikramMall.class);
                startActivity(Vikintent);

                break;
            case 3:
                Toast.makeText(this, "Soham Mall", Toast.LENGTH_SHORT).show();
                Intent Sohintent = new Intent(this, SohamMall.class);
                startActivity(Sohintent);
                break;
            case 4:
                Toast.makeText(this, "Big Bazar", Toast.LENGTH_SHORT).show();
                Intent Bigintent = new Intent(this, BigBazar.class);
                startActivity(Bigintent);
                break;
        }
    }

}

package com.example.admin.visitsolapur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Theaters extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String[] theater={"Prabhat Theater","Bhagwat Theater","Laxmi Narayan Theater","Padma Theater","Shriniwas Theater"};
    ListView theaterslist;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theaters);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,theater);
        theaterslist=(ListView)findViewById(R.id.theaters);
        theaterslist.setAdapter(adapter);
        theaterslist.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position)
        {
            case 0:
                Toast.makeText(this, "Prabhat Theater", Toast.LENGTH_SHORT).show();
                Intent Printent = new Intent(this, PrabhatTheater.class);
                startActivity(Printent);
                break;
            case 1:

                Toast.makeText(this, "Bhagwat Theater",Toast.LENGTH_SHORT).show();
                Intent Btintent = new Intent(this, BhagwatTheater.class);
                startActivity(Btintent);
                break;
            case 2:
                Toast.makeText(this, "Laxmi Narayan Theater", Toast.LENGTH_SHORT).show();
                Intent Laintent = new Intent(this, LaxmiNarayanTheater.class);
                startActivity(Laintent);

                break;
            case 3:
                Toast.makeText(this, "Padma Theater", Toast.LENGTH_SHORT).show();
                Intent Padintent = new Intent(this, PadmaTheater.class);
                startActivity(Padintent);
                break;
            case 4:
                Toast.makeText(this, "Shriniwas Theater", Toast.LENGTH_SHORT).show();
                Intent Shiintent = new Intent(this, ShriniwasTheater.class);
                startActivity(Shiintent);
                break;
        }
    }


}


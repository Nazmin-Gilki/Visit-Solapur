package com.example.admin.visitsolapur;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Temple extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView templeList;
   String[] temple={"Shri Siddheshwar Temple","Shri Mallikarjun Temple","Rupabhavani Temple","Markhandey Temple","Ajoba Ganpati Temple"};
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temple);
        templeList = (ListView) findViewById(R.id.temples);
        templeList.setAdapter(adapter);
        templeList.setOnItemClickListener(this);
    }
    @Override


   public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        switch (position)
        {
            case 0:
               Toast.makeText(this, "Shri Siddheshwar Temple", Toast.LENGTH_SHORT).show();
                Intent siddhintent = new Intent(this, ShriSiddheshwarTemple.class);
                startActivity(siddhintent);
                break;
            case 1:

                Toast.makeText(this, "Shri Mallikarjun Temple", Toast.LENGTH_SHORT).show();
                Intent mallikarjunintent = new Intent(this,ShriMallikarjunTemple.class);
                startActivity(mallikarjunintent);
                break;
            case 2:
                Toast.makeText(this, "Rupabhavani Temple", Toast.LENGTH_SHORT).show();
                Intent rupaintent = new Intent(this, RupabhavaniTemple.class);
                startActivity(rupaintent);
                break;
            case 3:
                Toast.makeText(this, "Markandeya Temple", Toast.LENGTH_SHORT).show();
                Intent markintent = new Intent(this, MarkhandeyTemple.class);
                startActivity(markintent);
                break;
            case 4:
                Toast.makeText(this, "Ajoba Ganpati Temple", Toast.LENGTH_SHORT).show();
                Intent ajointent = new Intent(this, AjobaGanpatiTemple.class);
                startActivity(ajointent);
                break;
        }
    }


}

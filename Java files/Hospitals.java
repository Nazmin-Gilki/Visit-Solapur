package com.example.admin.visitsolapur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Hospitals extends AppCompatActivity  implements AdapterView.OnItemClickListener{
    String[] hospitals={"Siddheshwar Hospital","Yashodhara Hospital","Ambika Hospital","Dama Hospital","Unique Hospital"};
    ListView hospitalslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hospitals);
        hospitalslist=(ListView)findViewById(R.id.hospitals);
        hospitalslist.setAdapter(adapter);
        hospitalslist.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                Toast.makeText(this, "Siddheshwar Hospital", Toast.LENGTH_SHORT).show();
                Intent sidhintent = new Intent(this,SiddheshwarHospital.class);
                startActivity(sidhintent);
                break;
            case 1:

                Toast.makeText(this, "Yashodhra Hospital",Toast.LENGTH_SHORT).show();
                Intent yashintent = new Intent(this, YashodharaHospital.class);
                startActivity(yashintent);
                break;
            case 2:
                Toast.makeText(this, "Ambika Hospital", Toast.LENGTH_SHORT).show();
                Intent Ambintent = new Intent(this,  AmbikaHospital.class);
                startActivity(Ambintent);

                break;
            case 3:
                Toast.makeText(this, "Dama Hospital", Toast.LENGTH_SHORT).show();
                Intent Daintent = new Intent(this,  DamaHospital.class);
                startActivity(Daintent);
                break;
            case 4:
                Toast.makeText(this, "Unique Hospital", Toast.LENGTH_SHORT).show();
                Intent Uniintent = new Intent(this, UniqueHospital.class);
                startActivity(Uniintent);
                break;
        }
    }


}



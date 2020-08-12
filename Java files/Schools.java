package com.example.admin.visitsolapur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Schools extends AppCompatActivity  implements AdapterView.OnItemClickListener{
    String[] schools={"Indian Model School","Jain Gurukul","St Joseph Highschool","Podar Internatinal School","Little Flower Convent School "};
    ListView schoolslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,schools);
        schoolslist=(ListView)findViewById(R.id.schools);
        schoolslist.setAdapter(adapter);
        schoolslist.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                Toast.makeText(this, "Indian Model School", Toast.LENGTH_SHORT).show();
                Intent Imsintent = new Intent(this, IndianModelSchool.class);
                startActivity(Imsintent);
                break;
            case 1:

                Toast.makeText(this, "Jain Gurukul",Toast.LENGTH_SHORT).show();
                Intent Jainintent = new Intent(this, JainGurukul.class);
                startActivity(Jainintent);
                break;
            case 2:
                Toast.makeText(this, "St Joseph Highschool", Toast.LENGTH_SHORT).show();
                Intent Stintent = new Intent(this, StJosephHighschool.class);
                startActivity(Stintent);

                break;
            case 3:
                Toast.makeText(this, "Podar Internatinal School", Toast.LENGTH_SHORT).show();
                Intent Podintent = new Intent(this, PodarInternatinalSchool.class);
                startActivity(Podintent);
                break;
            case 4:
                Toast.makeText(this, "Little Flower Convent School", Toast.LENGTH_SHORT).show();
                Intent Lfcintent = new Intent(this, LittleFlowerConventSchool.class);
                startActivity(Lfcintent);
                break;
        }
    }


}




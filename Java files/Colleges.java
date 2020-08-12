package com.example.admin.visitsolapur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Colleges extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String[] colleges={"Shri Sidhheshwar Womens Polytechnic","Orchid College","Walchand Institute Of Technology","A G Patil Polytechic","Dayanad Colleage "};
    ListView collegeslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,colleges);
        collegeslist=(ListView)findViewById(R.id.colleges);
        collegeslist.setAdapter(adapter);
        collegeslist.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        switch (position)
        {
            case 0:
                Toast.makeText(this, "Shri Sidhheshwar Womens Polytechnic", Toast.LENGTH_SHORT).show();
                Intent Sswpintent = new Intent(this,ShriSiddheshwarWomensPolytechnic.class);
                startActivity(Sswpintent);
                break;
            case 1:

                Toast.makeText(this, "Orchid College",Toast.LENGTH_SHORT).show();
                Intent Oraintent = new Intent(this,OrchidCollege.class);
                startActivity(Oraintent);
                break;
            case 2:
                Toast.makeText(this, "Walchand Institute Of Technology", Toast.LENGTH_SHORT).show();
                Intent Witintent = new Intent(this, WalchandInstituteOfTechnology.class);
                startActivity(Witintent);

                break;
            case 3:
                Toast.makeText(this, "A G Patil Polytechic", Toast.LENGTH_SHORT).show();
                Intent Agintent = new Intent(this, AGPatilPolytechic.class);
                startActivity(Agintent);
                break;
            case 4:
                Toast.makeText(this, "Dayanad Colleage", Toast.LENGTH_SHORT).show();
                Intent Daintent = new Intent(this, DayanandCollege.class);
                startActivity(Daintent);
                break;
        }
    }
}

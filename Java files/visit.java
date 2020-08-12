package com.example.admin.visitsolapur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class
visit extends AppCompatActivity
{    EditText Email,Password;

    String s,s1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit);
        Email=(EditText) findViewById(R.id.Email);
        Password=(EditText) findViewById(R.id.Password);
    }

    public void LogIn(View view) {
        s = Email.getText().toString();
        s1 =Password.getText().toString();
        if(s.equals("19nazmin@gmail.com") && s1.equals("shayesta"))
        {
            Intent myintent=new Intent(this,Choose.class);
            startActivity(myintent);
        }
        else
        {
            Log.d("ER","Invalid Operatoin");
            Toast.makeText(this, "Password Incorrect", Toast.LENGTH_SHORT).show();

        }
    }


}

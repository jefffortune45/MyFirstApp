package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CreatAcount extends AppCompatActivity {
    TextView email, password, confirmePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_acount);

        this.email = (TextView) findViewById(R.id.tvEmail);
        this. password = (TextView)findViewById(R.id.tvpass);
        this. confirmePass = (TextView)findViewById(R.id.tvconpassword);
    }
}
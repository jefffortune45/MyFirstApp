package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView email,password;
    Button signing, createAcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       this.signing = findViewById(R.id.bSigning);
       this. createAcount = findViewById(R.id.bCreateAcount);
        this. email = findViewById(R.id.tvEmail);
        this. password = findViewById(R.id.tvpass);

       createAcount.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent otherActivity = new Intent(getApplicationContext(),CreatAcount.class);
               startActivity(otherActivity);
               finish();

           }
       });
    }

    public void AddSigning(View view) {
    }

    public void CreateAcount(View view) {
    }
}

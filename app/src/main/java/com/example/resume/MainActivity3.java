package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView name1,email1,phone1,Address1,Experience1,skills1,reference1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        name1 = findViewById(R.id.name);
        email1 = findViewById(R.id.email);
        phone1 = findViewById(R.id.phone);
        Address1 = findViewById(R.id.Address);
        Experience1 = findViewById(R.id.Experience);
        skills1 = findViewById(R.id.skills);
        reference1 = findViewById(R.id.reference);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String Address = getIntent().getStringExtra("Address");
        String Experience = getIntent().getStringExtra("Experience");
        String skills = getIntent().getStringExtra("skills");
        String reference = getIntent().getStringExtra("reference");



        name1.setText("Name :- "+name);
        email1.setText("email :-"+email);
        phone1.setText("phone :-"+phone);
        Address1.setText("Address:-"+Address);
        Experience1.setText("Experience :-"+Experience);
        skills1.setText("skills :-"+skills);
        reference1.setText("reference :-"+reference);




    }

}
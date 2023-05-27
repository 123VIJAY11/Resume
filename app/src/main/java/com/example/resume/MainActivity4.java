package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity4 extends AppCompatActivity {

    ImageView  img1,img2,img3,imageView;


    TextView name, email, phone, Address, Experience, skills, reference,profile,interests,Eduction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        Address = findViewById(R.id.Address);
        Experience = findViewById(R.id.Experience);
        skills = findViewById(R.id.skills);
        profile = findViewById(R.id.profile);
        Eduction = findViewById(R.id.Eduction);
        interests = findViewById(R.id.interests);
        reference = findViewById(R.id.reference);
        imageView = findViewById(R.id.imageView);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 =findViewById(R.id.img3);

        String name1 = getIntent().getStringExtra("name");
        String email1 = getIntent().getStringExtra("email");
        String phone1 = getIntent().getStringExtra("phone");
        String address1 = getIntent().getStringExtra("Address");
        String experience1 = getIntent().getStringExtra("Experience");
        String skills1 = getIntent().getStringExtra("skills");
        String reference1 = getIntent().getStringExtra("reference");
        String profile1 = getIntent().getStringExtra("profile");
        String Eduction1 = getIntent().getStringExtra("eduction");
        String interests1 = getIntent().getStringExtra("interests");



        name.setText("Name :- " + name1);
        email.setText("email :-" + email1);
        phone.setText("phone :-" + phone1);
        Address.setText("Address:-" + address1);
        Experience.setText("Experience :-" + experience1);
        skills.setText("skills :-" + skills1);
        reference.setText("reference :-" + reference1);
        profile.setText("profile :-" + profile1);
        Eduction.setText("eduction :-" + Eduction1);
        interests.setText("interests :-" + interests1);


    }
}
package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {


    ImageView img1,img2,img3,man;


    TextView name, email, phone, Address, Experience, skills, reference,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        Address = findViewById(R.id.address);
        Experience = findViewById(R.id.EXPERIENCE);
        skills = findViewById(R.id.skills);
        reference = findViewById(R.id.reference);
        profile = findViewById(R.id.profile);
        man = findViewById(R.id.profile_image);
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
        String profile1 = getIntent().getStringExtra("reference");


        name.setText("Name :- " + name1);
        email.setText("email :-" + email1);
        phone.setText("phone :-" + phone1);
        Address.setText("Address:-" + address1);
        Experience.setText("Experience :-" + experience1);
        skills.setText("skills :-" + skills1);
        reference.setText("reference :-" + reference1);
        profile.setText("reference :-" + profile1);

    }
}
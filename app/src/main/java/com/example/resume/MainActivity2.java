package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6,img7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);

        String name = getIntent().getStringExtra("name");
        String EMAIL = getIntent().getStringExtra("EMAIL");
        String phone_number = getIntent().getStringExtra("phone_number");
        String Adderess = getIntent().getStringExtra("Adderess");
        String Experience = getIntent().getStringExtra("Experience");
        String skills = getIntent().getStringExtra("skills");
        String reference = getIntent().getStringExtra("reference");

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("name",name);
                intent.putExtra("email",EMAIL);
                intent.putExtra("phone",phone_number);
                intent.putExtra("Address",Adderess);
                intent.putExtra("Experience",Experience);
                intent.putExtra("skills",skills);
                intent.putExtra("reference",reference);
                startActivity(intent);



            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                intent.putExtra("name",name);
                intent.putExtra("email",EMAIL);
                intent.putExtra("phone",phone_number);
                intent.putExtra("Address",Adderess);
                intent.putExtra("Experience",Experience);
                intent.putExtra("skills",skills);
                intent.putExtra("reference",reference);

                startActivity(intent);



            }
        });

 img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
                intent.putExtra("name",name);
                intent.putExtra("email",EMAIL);
                intent.putExtra("phone",phone_number);
                intent.putExtra("Address",Adderess);
                intent.putExtra("Experience",Experience);
                intent.putExtra("skills",skills);
                intent.putExtra("reference",reference);
                startActivity(intent);



            }
        });

 img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                intent.putExtra("name",name);
                intent.putExtra("email",EMAIL);
                intent.putExtra("phone",phone_number);
                intent.putExtra("Address",Adderess);
                intent.putExtra("Experience",Experience);
                intent.putExtra("skills",skills);
                intent.putExtra("reference",reference);
                startActivity(intent);



            }
        });

 img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("name",name);
                intent.putExtra("email",EMAIL);
                intent.putExtra("phone",phone_number);
                intent.putExtra("Address",Adderess);
                intent.putExtra("Experience",Experience);
                intent.putExtra("skills",skills);
                intent.putExtra("reference",reference);
                startActivity(intent);



            }
        });

 img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("name",name);
                intent.putExtra("email",EMAIL);
                intent.putExtra("phone",phone_number);
                intent.putExtra("Address",Adderess);
                intent.putExtra("Experience",Experience);
                intent.putExtra("skills",skills);
                intent.putExtra("reference",reference);
                startActivity(intent);



            }
        });


    }
}
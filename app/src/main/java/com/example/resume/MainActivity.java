package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText edt1,hint2,hint3,hint4,hint5,hint6,hint7;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button = findViewById(R.id.btnNext);
        edt1 = findViewById(R.id.hint1);
        hint2 = findViewById(R.id.hint2);
        hint3= findViewById(R.id.hint3);
        hint4 = findViewById(R.id.hint4);
        hint5 = findViewById(R.id.hint5);
        hint6 = findViewById(R.id.hint6);
        hint7 = findViewById(R.id.hint7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edt1.getText().toString();
                String EMAIL = hint2.getText().toString();
                String phone_number = hint3.getText().toString();
                String Adderess = hint4.getText().toString();
                String Experience = hint5.getText().toString();
                String skills = hint6.getText().toString();
                String reference = hint7.getText().toString();



                // Method 1
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name);
                intent.putExtra("EMAIL",EMAIL);
                intent.putExtra("phone_number",phone_number);
                intent.putExtra("Adderess",Adderess);
                intent.putExtra("Experience",Experience);
                intent.putExtra("skills",skills);
                intent.putExtra("reference",reference);
                startActivity(intent);


                  //( Method 2
//                startActivity(new Intent(MainActivity.this, MainActivity.class).putExtra("name",data));

            }
        });

    }


}

package com.rahul009.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 textView=findViewById(R.id.textView);
 button=findViewById(R.id.button);
 button2=findViewById(R.id.button2);
 button.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Toast.makeText(MainActivity.this,"SING UP",Toast.LENGTH_SHORT).show();
         Intent intent= new Intent(MainActivity.this,MainActivity2.class);
         startActivity(intent);
     }
 });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"SING IN",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
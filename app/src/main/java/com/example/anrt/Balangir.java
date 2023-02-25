package com.example.anrt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Balangir extends AppCompatActivity {
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balangir);
        imageButton=findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Balangir.this,Balangri1.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Balangir.this,Balangri2.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton4);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Balangir.this,Balangri3.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton5);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Balangir.this,Balangri4.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton6);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Balangir.this,Balangri5.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
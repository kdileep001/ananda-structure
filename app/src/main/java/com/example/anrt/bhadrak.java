package com.example.anrt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bhadrak extends AppCompatActivity {
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhadrak);
        imageButton=findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(bhadrak.this,bhadrak1.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(bhadrak.this,bhadrak2.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton4);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(bhadrak.this,bhadrak3.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton5);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(bhadrak.this,bhadrak4.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton6);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(bhadrak.this,bhadrak5.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
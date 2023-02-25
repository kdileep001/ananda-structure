package com.example.anrt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class nayagarh extends AppCompatActivity {
private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nayagarh);
        imageButton=findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(nayagarh.this,nayagarh1.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(nayagarh.this,nayagarh2.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton4);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(nayagarh.this,nayagarh3.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton5);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(nayagarh.this,nayagarh4.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton=findViewById(R.id.imageButton6);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(nayagarh.this,nayagarh5.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
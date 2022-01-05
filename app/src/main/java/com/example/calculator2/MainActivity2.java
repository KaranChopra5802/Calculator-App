package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button For1 = (Button) findViewById(R.id.Formula1);
        Button For2 = (Button) findViewById(R.id.Formula2);
        Button For3 = (Button) findViewById(R.id.Formula3);
        Button For4 = (Button) findViewById(R.id.Formula4);

        View.OnClickListener Page1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        };
        For1.setOnClickListener(Page1);

        View.OnClickListener Page2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent1);

            }
        };
        For2.setOnClickListener(Page2);

        View.OnClickListener Page3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent2);

            }
        };
        For3.setOnClickListener(Page3);

        View.OnClickListener Page4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(intent3);

            }
        };
        For4.setOnClickListener(Page4);


    }
}
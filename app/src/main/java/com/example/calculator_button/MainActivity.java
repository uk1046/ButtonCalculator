package com.example.calculator_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5;
    int choice = 0 ,no1, no2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText TXT1 = (EditText) findViewById(R.id.num01);
        EditText TXT2 = (EditText) findViewById(R.id.num2);
        btn1 = (Button) findViewById(R.id.addbtn);
        btn2= (Button) findViewById(R.id.subbtn);
        btn3 = (Button) findViewById(R.id.mulbtn);
        btn4 = (Button) findViewById(R.id.divbtn);
        btn5 = (Button) findViewById(R.id.eqlbtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TXT1.getText().toString().isEmpty() && TXT2.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this, "Enter 2 Numbers", Toast.LENGTH_LONG).show();
                }
                else{
                    no1 = Integer.parseInt(TXT1.getText().toString());
                    no2 = Integer.parseInt(TXT2.getText().toString());
                   // Toast.makeText(MainActivity.this,"Addition: "+(no1+no2),Toast.LENGTH_LONG).show();
                    choice = 1;
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TXT1.getText().toString().isEmpty() && TXT2.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this, "Enter 2 Numbers", Toast.LENGTH_LONG).show();
                }
                else{
                    no1 = Integer.parseInt(TXT1.getText().toString());
                    no2 = Integer.parseInt(TXT2.getText().toString());
                    // Toast.makeText(MainActivity.this,"Addition: "+(no1+no2),Toast.LENGTH_LONG).show();
                    choice = 2;
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TXT1.getText().toString().isEmpty() && TXT2.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this, "Enter 2 Numbers", Toast.LENGTH_LONG).show();
                }
                else{
                    no1 = Integer.parseInt(TXT1.getText().toString());
                    no2 = Integer.parseInt(TXT2.getText().toString());
                    // Toast.makeText(MainActivity.this,"Addition: "+(no1+no2),Toast.LENGTH_LONG).show();
                    choice = 3;
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TXT1.getText().toString().isEmpty() && TXT2.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this, "Enter 2 Numbers", Toast.LENGTH_LONG).show();
                }
                else{
                    no1 = Integer.parseInt(TXT1.getText().toString());
                    no2 = Integer.parseInt(TXT2.getText().toString());
                    choice = 4;
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (choice){
                    case 1:
                        Toast.makeText(MainActivity.this,"Addition: "+(no1+no2),Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,"Substraction: "+(no1-no2),Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this,"Multiplication: "+(no1*no2),Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this,"Division: "+(no1/no2),Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}
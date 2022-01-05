package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.DOMImplementation;

public class MainActivity3 extends AppCompatActivity {

    private EditText result;
    private EditText newNumber;
    Double c = 300000000.0;
    Double finalans = 1.0;
    private EditText objVelocity;

    private Double operand1 = null;
    private Double operand2 = null;
    private String pendingOperation = "=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        result = (EditText) findViewById(R.id.CurrentFunction);
        newNumber = (EditText) findViewById(R.id.Result);
        objVelocity = findViewById(R.id.VeloObj);


        Button EqualButton = (Button) findViewById(R.id.EqualButton);

        Button AllClear = (Button) findViewById(R.id.AllClear);



        //Equal To Button
        View.OnClickListener opListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = newNumber.getText().toString();
                String objvelo = objVelocity.getText().toString();
                if (value.length() != 0) {
                    performOperation(value, objvelo);
                }
                newNumber.setText(value);
                objVelocity.setText(objvelo);
            }
        };
        EqualButton.setOnClickListener(opListener);

        //All Clear Button
        View.OnClickListener allListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText("");
                result.setText("");
                objVelocity.setText("");
                operand1 = null;
                operand2 = null;
            }

        };
        AllClear.setOnClickListener(allListener);

    }

    private void performOperation(String value, String objvelo) {
        operand1 = Double.valueOf(value);
        operand2 = Double.valueOf(objvelo);
        finalans = operand1 * (Math.sqrt(1 - ((operand2 * operand2) / (c * c))));
        result.setText(finalans.toString());
        newNumber.setText("");
    };
}



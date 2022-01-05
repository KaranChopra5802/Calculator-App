package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText result;
    private EditText newNumber;
    Double c = 300000000.0;
    Double finalans=1.0;

    private Double operand1=null;
    private String pendingOperation = "=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (EditText) findViewById(R.id.CurrentFunction);
        newNumber = (EditText) findViewById(R.id.Result);


        Button EqualButton= (Button) findViewById(R.id.EqualButton);

        Button AllClear = (Button) findViewById(R.id.AllClear) ;

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button)v;
                newNumber.append(button.getText().toString());
            }
        };


        //Equal To Button
        View.OnClickListener opListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = newNumber.getText().toString();
                if(value.length()!=0)
                {
                    performOperation(value);
                }
            }
        };
        EqualButton.setOnClickListener(opListener);

        //All Clear Button
        View.OnClickListener allListener = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                newNumber.setText("");
                result.setText("");
                operand1 = null;
            }

        };
        AllClear.setOnClickListener(allListener);

    }
    private void performOperation(String value)
    {
        operand1 = Double.valueOf(value);
        finalans = operand1*c*c;
        result.setText(finalans.toString());
        newNumber.setText("");
    }





}
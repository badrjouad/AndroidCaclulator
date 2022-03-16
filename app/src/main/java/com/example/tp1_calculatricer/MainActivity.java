package com.example.tp1_calculatricer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button Add_button;
    Button Division_button;
    Button Sub_button;
    Button Multiplication_button;
    TextView result;
    int ans=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // by ID we can use each component which id is assign in xml file
        number1=(EditText) findViewById(R.id.editText_first_no);
        number2=(EditText) findViewById(R.id.editText_second_no);
        Add_button=(Button) findViewById(R.id.add_button);
        Sub_button=(Button) findViewById(R.id.substract_button);
        Division_button=(Button) findViewById(R.id.division_button);
        Multiplication_button=(Button) findViewById(R.id.multiplication_button);
        result = (TextView) findViewById(R.id.textView_answer);

        // Add_button add clicklistener
        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                // add both number and store it to sum
                double sum = num1 + num2;
                // set it ot result textview
                result.setText(Double.toString(sum));
            }
        });
        Division_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                // add both number and store it to sum
                double division = num1 / num2;
                // set it ot result textview
                result.setText(Double.toString(division));
            }
        });
        Sub_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                // add both number and store it to sum
                double sub = num1 - num2;
                // set it ot result textview
                result.setText(Double.toString(sub));
            }
        });
        Multiplication_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                // add both number and store it to sum
                double multiplication = num1 * num2;
                // set it ot result textview
                result.setText(Double.toString(multiplication));
            }
        });
    }
    }

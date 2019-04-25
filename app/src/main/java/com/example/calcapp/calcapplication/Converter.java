package com.example.calcapp.calcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Converter extends AppCompatActivity {

    Button btn_back, btn_calc;
    String original_unit;
    String new_unit;
    String value;


    TextView output;
    EditText orginialUnit;
    EditText newUnit;
    EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);


        btn_back = (Button) findViewById(R.id.btn_back);
        btn_calc = (Button) findViewById(R.id.btn_calc);

        output = (TextView) findViewById(R.id.ouput_text);
        orginialUnit = (EditText) findViewById(R.id.original_unit);
        newUnit = (EditText) findViewById(R.id.new_unit);
        input = (EditText) findViewById(R.id.value_entered);


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalcActivity();
            }
        });


        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                original_unit = String.valueOf(orginialUnit.getText());
                new_unit = String.valueOf(newUnit.getText());
                value = String.valueOf(input.getText());

                output.setText(convert(original_unit, new_unit, Double.parseDouble(value)));


            }
        });


    }


    public void openCalcActivity() {
        Intent intentGarageList = new Intent(this, MainActivity.class);
        startActivity(intentGarageList);
    }

    public String convert(String originalUnit, String newUnit, double input) {


        double num1 = input;
        double num2 = 0.0d;

        String original = originalUnit.toLowerCase();
        String newU = newUnit.toLowerCase();

        switch (original) {
            case "inches": {
                switch (newU) {
                    case "inches":
                        num2 = num1;
                        break;
                    case "feet":

                        num2 = num1 / 12.0d;
                        break;
                    case "yards":

                        num2 = num1 / 36.0d;
                        break;
                    case "miles":

                        num2 = num1 / 63360.0d;
                        break;
                    case "millimeters":

                        num2 = num1 * 25.4d;
                        break;
                    case "centimeters":

                        num2 = num1 * 2.54d;
                        break;
                    case "meters":

                        num2 = num1 * 0.0254d;
                        break;
                    case "kilometers":

                        num2 = num1 * 0.0000254d;
                        break;
                }
                break;
            }
            case "feet": {
                switch (newU) {
                    case "inches":

                        num2 = num1 * 12.0d;
                        break;
                    case "feet":
                        num2 = num1;
                        break;
                    case "yards":

                        num2 = num1 / 3.0d;
                        break;
                    case "miles":

                        num2 = num1 / 5280.0d;
                        break;
                    case "millimeters":

                        num2 = num1 * 304.8d;
                        break;
                    case "centimeters":

                        num2 = num1 * 30.48d;
                        break;
                    case "meters":

                        num2 = num1 * 0.3048d;
                        break;
                    case "kilometers":

                        num2 = num1 * 0.0003048d;
                        break;
                }
                break;
            }
            case "yards": {
                switch (newU) {
                    case "inches":

                        num2 = num1 * 36.0d;
                        break;
                    case "feet":

                        num2 = num1 * 3.0d;
                        break;
                    case "yards":
                        num2 = num1;
                        break;
                    case "miles":

                        num2 = num1 / 1760.0d;
                        break;
                    case "millimeters":

                        num2 = num1 * 914.4d;
                        break;
                    case "centimeters":

                        num2 = num1 * 91.44d;
                        break;
                    case "meters":
                        num2 = num1 * 0.9144d;
                        break;
                    case "kilometers":

                        num2 = num1 / 1093.61d;
                        break;
                }
                break;
            }
            case "miles": {
                switch (newU) {
                    case "inches":

                        num2 = num1 * 6330.0d;
                        break;
                    case "feet":

                        num2 = num1 * 5280.0d;
                        break;
                    case "yards":

                        num2 = num1 * 1760.0d;
                        break;
                    case "miles":
                        num2 = num1;
                        break;
                    case "millimeters":

                        num2 = num1 * 1609340.0d;
                        break;
                    case "centimeters":

                        num2 = num1 * 160934.0d;
                        break;
                    case "meters":

                        num2 = num1 * 1609.34d;
                        break;
                    case "kilometers":

                        num2 = num1 * 1.60934d;
                        break;
                }
                break;
            }
            case "millimeters": {
                switch (newU) {
                    case "inches":
                        num2 = num1 * 25.4d;
                        break;
                    case "feet":
                        num2 = num1 / 304.8d;
                        break;
                    case "yards":
                        num2 = num1 / 914.4d;
                        break;
                    case "miles":
                        num2 = num1 / 1609000.0d;
                        break;
                    case "millimeters":
                        num2 = num1;
                        break;
                    case "centimeters":
                        num2 = num1 * 10;
                        break;
                    case "meters":
                        num2 = num1 * 100;
                        break;
                    case "kilometers":
                        num2 = num1 * 100000;
                        break;
                }
                break;
            }

            case "centimeters": {
                switch (newU) {
                    case "inches":
                        num2 = num1 / 2.54d;
                        break;
                    case "feet":
                        num2 = num1 / 30.48d;
                        break;
                    case "yards":
                        num2 = num1 / 91.44d;
                        break;
                    case "miles":
                        num2 = num1 / 160934.0d;
                        break;
                    case "millimeters":
                        num2 = num1 / 10;
                        break;
                    case "centimeters":
                        num2 = num1;
                        break;
                    case "meters":
                        num2 = num1 * 10;
                        break;
                    case "kilometers":
                        num2 = num1 * 100000;
                        break;
                }
                break;
            }
            case "meters": {
                switch (newU) {
                    case "inches":
                        num2 = num1 * 39.3701d;
                        break;
                    case "feet":
                        num2 = num1 * 3.28084d;
                        break;
                    case "yards":
                        num2 = num1 * 1.09361d;
                        break;
                    case "miles":
                        num2 = num1 / 1609.34d;
                        break;
                    case "millimeters":
                        num2 = num1 / 1000;
                        break;
                    case "centimeters":
                        num2 = num1 / 100;
                        break;
                    case "meters":
                        num2 = num1;
                        break;
                    case "kilometers":
                        num2 = num1 * 100;
                        break;
                }
                break;
            }
            case "kilometers": {
                switch (newU) {
                    case "inches":
                        num2 = num1 * 39370.1d;
                        break;
                    case "feet":
                        num2 = num1 * 3280.84d;
                        break;
                    case "yards":
                        num2 = num1 * 1093.61d;
                        break;
                    case "miles":
                        num2 = num1 / 1.60934d;
                        break;
                    case "millimeters":
                        num2 = num1 / 1000000;
                        break;
                    case "centimeters":
                        num2 = num1 / 100000;
                        break;
                    case "meters":
                        num2 = num1 / 1000;
                        break;
                    case "kilometers":
                        num2 = num1;
                        break;
                }
                break;
            }
        }
        return String.valueOf(num2);
    }
}


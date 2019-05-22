/*
package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.text.NumberFormat;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class MainActivity extends AppCompatActivity {

    // define variables for the widgets
    private EditText fahrenheitTemperature;
    private TextView c;
    private TextView f;
    private TextView display;


    // define the SharedPreferences object
    //private SharedPreferences savedValues;

    // define instance variables that should be saved
    //private String fahrenheitString = "";


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // get references to the widgets
            c = findViewById(R.id.c);
            f = findViewById(R.id.f);
            display = findViewById(R.id.display);
            fahrenheitTemperature = findViewById(R.id.fahrenheitTemperature);

            userInput();

            // set the listeners
            //fahrenheitTemperature.setOnEditorActionListener(this);

            // get SharedPreferences object
            //savedValues = getSharedPreferences("SavedValues", MODE_PRIVATE);
        }


        private void userInput(){

            c.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    ConverterClass converterClass = new ConverterClass();
                    double degCel = Double.parseDouble(fahrenheitTemperature.getText().toString());
                    display.setText(Double.toString(degCel));
                }
            });
        }

    }


}
*/

package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.text.NumberFormat;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class MainActivity extends AppCompatActivity {


    private EditText fahrenheitTemperature;
    private TextView c;
    private TextView f;
    private TextView Display;
    private TextView output_TV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        c = findViewById(R.id.c);
        f = findViewById(R.id.f);
        Display = findViewById(R.id.Display);
        fahrenheitTemperature = findViewById(R.id.fahrenheitTemperature);


        userInput();

        }

        private void userInput(){

        fahrenheitTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double degCel = Double.parseDouble(fahrenheitTemperature.getText().toString());
                degCel = (degCel  -  32)/1.8;
                Display.setText(Double.toString(degCel));

            }
        });

    }
}



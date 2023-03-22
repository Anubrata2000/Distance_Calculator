package com.example.distance_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView a;
    EditText x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void Dist_calc() {
        x1 = (EditText) findViewById(R.id.X1);
        x2 = (EditText) findViewById(R.id.X2);
        y1 = (EditText) findViewById(R.id.Y1);
        y2 = (EditText) findViewById(R.id.Y2);
        a = (TextView) findViewById(R.id.Result);
        double a1 = Double.parseDouble(x1.getText().toString());
        double a2 = Double.parseDouble(x2.getText().toString());
        double b1 = Double.parseDouble(y1.getText().toString());
        double b2 = Double.parseDouble(y2.getText().toString());
        double r = (a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1);
        double res = Math.sqrt(r);
        a.setText("result="+String.valueOf(res));

        }
}
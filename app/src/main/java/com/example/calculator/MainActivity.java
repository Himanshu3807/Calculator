package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstno , etSecondno;
    TextView tvResult;
    Button add, substract , multiply , divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstno = findViewById(R.id.etFirstno);
        etSecondno = findViewById(R.id.etSecondno);
        tvResult = findViewById(R.id.tvResult);
        add = findViewById(R.id.btPlus);
        substract = findViewById(R.id.btMinus);
        multiply = findViewById(R.id.btMultiply);
        divide = findViewById(R.id.btDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue , secondvalue , ans;
                firstvalue = Integer.parseInt(etFirstno.getText().toString());
                secondvalue = Integer.parseInt(etSecondno.getText().toString());
                ans = firstvalue + secondvalue;
                tvResult.setText("Ans Is = "+ans);
            }
        });

        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue , secondvalue , ans;
                firstvalue = Integer.parseInt(etFirstno.getText().toString());
                secondvalue = Integer.parseInt(etSecondno.getText().toString());
                ans = firstvalue - secondvalue;
                tvResult.setText("Ans Is = "+ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue , secondvalue , ans;
                firstvalue = Integer.parseInt(etFirstno.getText().toString());
                secondvalue = Integer.parseInt(etSecondno.getText().toString());
                ans = firstvalue / secondvalue;
                tvResult.setText("Ans Is = "+ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue , secondvalue , ans;
                firstvalue = Integer.parseInt(etFirstno.getText().toString());
                secondvalue = Integer.parseInt(etSecondno.getText().toString());
                ans = firstvalue * secondvalue;
                tvResult.setText("Ans Is = "+ans);
            }
        });

    }
}
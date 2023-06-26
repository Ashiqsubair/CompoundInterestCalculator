package com.example.compoundinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CompoundInterest(View v){
        EditText txt_amount,txt_interest,txt_year,txt_result;
        float amount,interest,compoundInterest=0;

        int year;
        txt_amount=(EditText) findViewById(R.id.txt_loan_amount);
        txt_interest=(EditText) findViewById(R.id.txt_interest);
        txt_year=(EditText) findViewById(R.id.txt_year);
        amount=Float.parseFloat(txt_amount.getText().toString());
        interest=Float.parseFloat(txt_interest.getText().toString());
        year=Integer.parseInt(txt_year.getText().toString());
        for (int i=0;i<year;i++){
            compoundInterest=(amount*interest)/100;
            amount=amount+compoundInterest;
        }
        txt_result=(EditText) findViewById(R.id.txt_result);
        txt_result.setText("Amount is "+String.valueOf(amount));
    }
}
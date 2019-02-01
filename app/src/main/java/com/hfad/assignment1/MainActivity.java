
/**********************************************************
 * MainActivity.java - input the bill and get the total price(bill+tip) *
 * Name: Yang Song *
 * Student ID: 1522916 *
 * Lab: Lab 2 Tip-o-later *
 * Email: ysong1@coastal.edu *
 * Date: 2/01/2019 *
 **********************************************************/




package com.hfad.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static  final double Poor_rate = 0.05;
    public static  final double Good_rate = 0.10;
    public static  final double Excellent_rate = 0.20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleButtonClick(View v){

        //Give a reference to the Bill TextView
        EditText BillEditText =(EditText)findViewById(R.id.BillEditText);

        //Give a reference to the spinner
        Spinner TipSpinner = (Spinner)findViewById(R.id.TipSpinner);

        //Get the selected item from the Spinner
        String Tip_Type = String.valueOf(TipSpinner.getSelectedItem());

        //Give a reference to the total TextView
        TextView TotalView = (TextView)findViewById(R.id.TotalView) ;

        double value =0.0;

        value =Double.parseDouble(BillEditText.getText().toString());

        double result =0.0;

        if(Tip_Type.equals("Poor")){
            result  = value*(1+Poor_rate);
        }
        else if(Tip_Type.equals("Good")){
            result  = value*(1+Good_rate);
        }
        else if(Tip_Type.equals("Excellent")){
            result = value*(1+Excellent_rate);
        }

        TotalView.setText(String.format("The total price is(Bill+Tip) : %s", result));


    }

}

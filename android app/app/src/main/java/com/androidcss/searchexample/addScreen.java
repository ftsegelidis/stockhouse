package com.androidcss.searchexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class addScreen extends AppCompatActivity {

    public static EditText productTitle;
    public static EditText productPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_screen);
        productTitle = (EditText)findViewById(R.id.productText);
        productPrice = (EditText)findViewById(R.id.priceText);
    }

    public void makeAdd(View v) {
        if(!productPrice.getText().equals(null) && !productPrice.getText().equals(null)){

            Toast.makeText(this, "ok", Toast.LENGTH_LONG).show();

        }

    }
}

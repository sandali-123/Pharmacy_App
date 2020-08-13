package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class My_Cart extends AppCompatActivity {

    public Button editbtn1, editbtn2,editbtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__cart);

        editbtn1 = (Button) findViewById(R.id.changebtn1);
        editbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(My_Cart.this,Display_Item.class);
                startActivity(i);
            }
        });

    }
}
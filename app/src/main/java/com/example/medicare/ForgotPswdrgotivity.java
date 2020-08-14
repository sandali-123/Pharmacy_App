package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ForgotPswdrgotivity extends AppCompatActivity {

    private ImageView backArrow ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pswdrgotivity);

        backArrow= (ImageView) findViewById(R.id.back_arrow);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ForgotPswdrgotivity.this,LoginActivity.class);
                startActivity(intent);
             }
            }
        );


    }
}
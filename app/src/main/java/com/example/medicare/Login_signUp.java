package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login_signUp extends AppCompatActivity {

    private Button joinNowButton , LoginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_up);

        joinNowButton=(Button)findViewById(R.id.main_Join_now_btn);
        LoginButton=(Button)findViewById(R.id.main_login_btn);



        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Login_signUp.this,LoginActivity.class);
                startActivity(intent);
            }
        }
        );

        joinNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(Login_signUp.this,RegisterActivity.class);
                startActivity(intent1);
            }
        }
        );




    }
}
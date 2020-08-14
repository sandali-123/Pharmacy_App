package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

//    private TextView admin;
//    private Button search;
    private TextView forgot_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        forgot_pwd=(TextView)findViewById(R.id.forgot_password_link);

        forgot_pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( LoginActivity.this,ForgotPswdrgotivity.class);
                startActivity(intent);
            }
        });


//        admin=(TextView)findViewById(R.id.admin_panel_link) ;
//        search=(Button) findViewById(R.id.login_btn) ;

//        admin.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent( LoginActivity.this,AdminPanel.class);
//                startActivity(intent);
//            }
//        });
//
//        search.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent( LoginActivity.this,AdminPanel.class);
//                startActivity(intent);
//            }
//        });

    }


}
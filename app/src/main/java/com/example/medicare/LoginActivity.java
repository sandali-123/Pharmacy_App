package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        admin=(TextView)findViewById(R.id.admin_panel_link) ;

        admin.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                Intent intent= new Intent( LoginActivity.this,AdminPanel.class);
                startActivity(intent);
            }
        });
    }


}
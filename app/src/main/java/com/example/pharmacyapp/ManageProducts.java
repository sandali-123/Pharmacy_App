package com.example.pharmacyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ManageProducts extends AppCompatActivity {

    private String panelManage;
    private ImageView item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_products);

        panelManage = getIntent().getExtras().get("panel").toString();
        item = (ImageView)findViewById(R.id.item_image1);


        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageProducts.this, editItems.class);
                intent.putExtra("editproduct","item");
                startActivity(intent);
            }
        });
    }
}
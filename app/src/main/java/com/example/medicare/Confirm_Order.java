package com.example.medicare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Confirm_Order extends AppCompatActivity {

    Button Btn_dialog ;
    private Button btn_ChangeDel;
    private Button btn_RemoveDel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm__order);

        //Add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // back button


        btn_ChangeDel = (Button) findViewById(R.id.btn_chnge);
        btn_ChangeDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDeliChangeDetails();
            }
        });

        btn_RemoveDel = (Button) findViewById(R.id.btn_remove);
        btn_RemoveDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDeliRemoveDetails();
            }
        });


        Btn_dialog = findViewById(R.id.btn_confirm_alert);
        Btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Confirm_Order.this);

                //set Message
                builder.setMessage("Your final order has already been placed.Soon it will be verified.Thank You.");

                //set positive
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //close the activity when this button is clicked
                        Confirm_Order.this.finish();
                    }
                });
                //create alert dialog
                AlertDialog alertDialog = builder.create();
                //show alert dialog
                alertDialog.show();
            }
        });

    }
    public void openDeliChangeDetails(){

        Intent intent = new Intent(this,Delivery.class);
        startActivity(intent);


    }
    public void openDeliRemoveDetails(){

        Intent intent = new Intent(this,Delivery.class);
        startActivity(intent);


    }

    //back button
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id == android.R.id.home){
            //end the activity
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    //back button

}
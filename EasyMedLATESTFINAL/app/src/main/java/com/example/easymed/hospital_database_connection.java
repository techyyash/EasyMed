package com.example.easymed;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class hospital_database_connection extends AppCompatActivity {
    private databasehelper2 dbHandler;

    RelativeLayout r1,r2,r3,r4;
    int clickcount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_hospital_database_connection);


        dbHandler = new databasehelper2(hospital_database_connection.this);


        getSupportActionBar().hide();



        ImageView img = (ImageView) findViewById(R.id.image_search_logo);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount==1)
                {
                    r1= findViewById(R.id.admin_pharmacy_layout1);
                    r1.setVisibility(View.VISIBLE);
                    r4= findViewById(R.id.layout4);
                    r4.setVisibility(View.INVISIBLE);

                }
                else if(clickcount==2)
                {
                    r2= findViewById(R.id.admin_pharmacy_layout2);
                    r2.setVisibility(View.VISIBLE);
                    r1= findViewById(R.id.admin_pharmacy_layout1);
                    r1.setVisibility(View.INVISIBLE);
                }
                else if(clickcount==3)
                {
                    r3= findViewById(R.id.admin_pharmacy_layout3);
                    r3.setVisibility(View.VISIBLE);
                    r2= findViewById(R.id.admin_pharmacy_layout2);
                    r2.setVisibility(View.INVISIBLE);
                }
                else if(clickcount==4)
                {
                    r4= findViewById(R.id.admin_pharmacy_layout4);
                    r4.setVisibility(View.VISIBLE);
                    r3= findViewById(R.id.admin_pharmacy_layout3);
                    r3.setVisibility(View.INVISIBLE);
                }
                else{
                    //check how many times clicked and so on
                    Toast.makeText(getApplicationContext(),"Opps!! Something Went Wrong", Toast.LENGTH_LONG).show();
                }



            }
        });


    }
}
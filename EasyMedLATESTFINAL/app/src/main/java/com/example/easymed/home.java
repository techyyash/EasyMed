package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.logging.Handler;

public class home extends AppCompatActivity implements View.OnClickListener{

    public CardView card1,card2;
    private databasehelper2 dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();




        setContentView(R.layout.activity_home);


        card1 = (CardView) findViewById(R.id.doctor_card);
        card2 = (CardView) findViewById(R.id.patient_card);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        dbHandler = new databasehelper2(home.this);


        Button buttonOne = findViewById(R.id.admin_link);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                admin_login_form();
            }

        });


        // for adddata4
        int did=10;
        String dname="yash";
        String dpass="12345";
        dbHandler.adddata4(did,dname,dpass);


    }

    private void admin_login_form() {
        Intent i;
        i = new Intent(this,admin_login.class);// was previously login_hospital
        startActivity(i);
    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.doctor_card:
                //dbHandler.adddata5("ramesh",1212121,"weweweewe","wewewerf","doctor","opo");

                i = new Intent(this,doctor_registration.class);// was previously login_hospital
                startActivity(i);
                break;

            case R.id.patient_card:
                i = new Intent(this,login_patient.class);
                startActivity(i);
                break;




        }

    }
}
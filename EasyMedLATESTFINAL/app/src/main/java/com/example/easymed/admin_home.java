package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class admin_home extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_admin_home);

        card1 = (CardView) findViewById(R.id.admin_profile_card);
        card2 = (CardView) findViewById(R.id.admin_staff_card);
        card3 = (CardView) findViewById(R.id.scan_admin_card);
        card4 = (CardView) findViewById(R.id.admin_doctor_card);
        card5=(CardView) findViewById(R.id.admin_pharmacy_card);
        card6=(CardView) findViewById(R.id.admin_card_logout);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);










    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.admin_profile_card:
                i = new Intent(this,Admin_Profile.class);
                startActivity(i);
                break;


            case R.id.admin_staff_card:
                i = new Intent(this,Admin_Staff.class);
                startActivity(i);
                break;

            case R.id.scan_admin_card:
                i = new Intent(this,Admin_scan.class);
                startActivity(i);
                break;

            case R.id.admin_doctor_card:
                i = new Intent(this,Admin_Doctor.class);
                startActivity(i);
                break;

            case R.id.admin_pharmacy_card:
                i = new Intent(this,Admin_Pharmacy.class);
                startActivity(i);

                break;
            case R.id.admin_card_logout:
                i = new Intent(this,home.class);
                startActivity(i);

                break;


        }
    }
}
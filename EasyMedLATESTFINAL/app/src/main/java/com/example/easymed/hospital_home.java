package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.List;

public class hospital_home extends AppCompatActivity implements View.OnClickListener{
    private databasehelper2 dbHandler;
    RelativeLayout r1,r2,r3;
    int clickcount=0;
    public CardView card1, card2,card3,card4,card5,card6,card7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        dbHandler = new databasehelper2(hospital_home.this);

        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_hospital_home);


        card1 = (CardView) findViewById(R.id.profile_hospital_card);
        card2 = (CardView) findViewById(R.id.database_hospital_card);
        card3 = (CardView) findViewById(R.id.qrcode_hospital_card);
        card4 = (CardView) findViewById(R.id.pharmacy_hospital_card);
        card6 = (CardView) findViewById(R.id.hospital_card_logout);
        card7 = (CardView) findViewById(R.id.patient_doctor_card);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.profile_hospital_card:
                i = new Intent(this,hospital_profile.class);
                startActivity(i);
                Toast.makeText(hospital_home.this,"NAME- yash\nPHONE_NUMBER- 080-98765687\nADDRESS- 14/5 Kashi Temple Street,Vijay Nagar Bangalore\nPATIENT_COUNT- 12356\nDOCTOR_SPECIALIZATION- Neurologist ",Toast.LENGTH_LONG).show();

                break;

            case R.id.database_hospital_card:
                    i = new Intent(this,hospital_database_connection.class);
                    startActivity(i);
                break;

            case R.id.qrcode_hospital_card:
                i = new Intent(this,hospital_Qrcode_view.class);
                startActivity(i);
                break;

            case R.id.pharmacy_hospital_card:
                i = new Intent(this,hospital_pharmacy.class);
                startActivity(i);
                break;

            case R.id.hospital_card_logout:
                i = new Intent(this,home.class);
                startActivity(i);
                break;

            case R.id.patient_doctor_card:
                i = new Intent(this,patient_doctor_profile.class);
                startActivity(i);
                break;

    }
}
}
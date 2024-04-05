package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class patient_include_family extends AppCompatActivity {

    CardView r1,r2,r3;
    int clickcount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_patient_include_family);



        ImageView img = (ImageView) findViewById(R.id.add_member_image);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount==1)
                {

                    startActivity(new Intent(patient_include_family.this,hospital_stats.class));
                    r1= findViewById(R.id.patient_family_member2_card);
                    r1.postDelayed(new Runnable() {
                        public void run() {
                            r1.setVisibility(View.VISIBLE);
                        }
                    }, 7000);

                }
                else if(clickcount==2)
                {
                    startActivity(new Intent(patient_include_family.this,hospital_stats.class));
                    r2= findViewById(R.id.patient_family_member3_card);
                    r2.postDelayed(new Runnable() {
                        public void run() {
                            r2.setVisibility(View.VISIBLE);
                        }
                    }, 7000);

                }

                else{
                    //check how many times clicked and so on
                    Toast.makeText(getApplicationContext(),"Opps!! Something Went Wrong ", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
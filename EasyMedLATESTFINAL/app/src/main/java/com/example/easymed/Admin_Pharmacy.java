package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Admin_Pharmacy extends AppCompatActivity{

    RelativeLayout r1,r2,r3,r4;
    int clickcount=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_admin_pharmacy);




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
                else{
                    //check how many times clicked and so on
                    Toast.makeText(getApplicationContext(),"Opps!! Something Went Wrong ", Toast.LENGTH_LONG).show();
                }




            }
        });
    }


}

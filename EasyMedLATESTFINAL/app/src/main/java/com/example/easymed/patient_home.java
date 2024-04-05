package com.example.easymed;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class patient_home extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2,card3,card4,card5,card6,card7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_patient_home);

        card1 = (CardView) findViewById(R.id.profile_patient_card);
        card2 = (CardView) findViewById(R.id.family_patient_card);
        card3 = (CardView) findViewById(R.id.doctor_patient_card);
        card4 = (CardView) findViewById(R.id.patient_card_logout);
        card5=(CardView) findViewById(R.id.data_patient_card);
        card6=(CardView) findViewById(R.id.patient_card_logout);
        card7=(CardView)findViewById(R.id.scan_patient_card);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);






    }

     @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        IntentResult intentresult=IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
//a=findViewById(R.id.editTextTextPersonName);
String b=intentresult.toString();
        if(intentresult.getContents()!=null)
        {
            AlertDialog.Builder builder=new AlertDialog.Builder(patient_home.this);
            builder.setTitle( "Result");

            builder.setMessage(intentresult.getContents());
           // a.setText(b);
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    Toast.makeText(getApplicationContext()," Data Entered",Toast.LENGTH_SHORT).show();
System.out.println(b);
                }
            });

            builder.show();


        }
        else
            {
                Toast.makeText(getApplicationContext()," You did not scan anything",Toast.LENGTH_SHORT).show();
            }

    }



    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.profile_patient_card:
                i = new Intent(this,patient_profile.class);
                startActivity(i);
                Toast.makeText(patient_home.this,"NAME- ramesh\nPHONE_NUMBER - 8217858859\nADDRESS- c-12,xyz\nEMAIL - xyz@qmail.com\nGENDER - Male",Toast.LENGTH_LONG).show();
                break;


            case R.id.family_patient_card:
                i = new Intent(this,patient_include_family.class);
                startActivity(i);
                break;

            case R.id.doctor_patient_card:
                i = new Intent(this,Doctor_patient_profile.class);
                startActivity(i);
                break;

            case R.id.patient_card_logout:
                i = new Intent(this,home.class);
                startActivity(i);
                break;

            case R.id.data_patient_card:


                Uri mapUri = Uri.parse("geo: 13.006752, 77.561737");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;
            case R.id.scan_patient_card:
                IntentIntegrator intentintegrator=new IntentIntegrator(patient_home.this);

                intentintegrator.setPrompt("Use volume UP for flash and volume DOWN to turn it OFF");
                intentintegrator.setBeepEnabled(true);
                intentintegrator.setOrientationLocked(true);
                intentintegrator.setCaptureActivity(Capture.class);
                intentintegrator.initiateScan();



                break;



        }
;


}
}
package com.example.easymed;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class qrscanner extends AppCompatActivity {
Button btscan;
//EditText a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrscanner);

        btscan=findViewById(R.id.bt_scan);

      /*  btscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator intentintegrator=new IntentIntegrator(qrscanner.this);

                intentintegrator.setPrompt("Use volume UP for flash and volume DOWN to turn it OFF");
                intentintegrator.setBeepEnabled(true);
                intentintegrator.setOrientationLocked(true);
                intentintegrator.setCaptureActivity(Capture.class);
                intentintegrator.initiateScan();

            }
        });*/
    }

  /*  @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        IntentResult intentresult=IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
//a=findViewById(R.id.editTextTextPersonName);
String b=intentresult.toString();
        if(intentresult.getContents()!=null)
        {
            AlertDialog.Builder builder=new AlertDialog.Builder(qrscanner.this);
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

    }*/
}
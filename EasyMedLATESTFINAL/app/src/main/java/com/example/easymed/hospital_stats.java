package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class hospital_stats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_hospital_stats);
        Toast.makeText(hospital_stats.this,"PATIENT_COUNT- 123\nDOCTOR_SPECIALIZATION- Neurologist ",Toast.LENGTH_LONG).show();

        Button yourButton = (Button) findViewById(R.id.register);

        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"Family Member Is Added Successfully", Toast.LENGTH_LONG).show();
            }
        });
    }
}
package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class patient_doctor_profile extends AppCompatActivity {
    EditText p_username,visit_cause,prescription;
    Button submit;
    private databasehelper2 dbHandler;

    /*ArrayList<String> pusername=new ArrayList<String>();
    ArrayList<String> visitcause=new ArrayList<String>();
    ArrayList<String> press=new ArrayList<String>();
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_patient_doctor_profile);

        dbHandler=new databasehelper2(patient_doctor_profile.this);

        p_username=findViewById(R.id.med_name_value);
        visit_cause=findViewById(R.id.doc_spec_value);
        prescription=findViewById(R.id.doc_add_value);

        submit=findViewById(R.id.update_hospital_profile);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username_p=p_username.getText().toString();
                String cause_visit=visit_cause.getText().toString();
                String presc=prescription.getText().toString();

                dbHandler.adddata2(username_p,cause_visit,presc);
                Toast.makeText(patient_doctor_profile.this, "Data Entered", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
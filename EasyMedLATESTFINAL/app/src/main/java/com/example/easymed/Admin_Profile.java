package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class Admin_Profile extends AppCompatActivity {
//int LENGTH_LONG=500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_admin_profile);
        Toast.makeText(Admin_Profile.this,"HOSPITAL_NAME- CHRIST HOSPITAL\nPHONE_NUMBER- 080-98765687\nADDRESS- 14/5 Kashi Temple Street,Vijay Nagar Bangalore\nPATIENT_COUNT- 12356 ",Toast.LENGTH_LONG).show();
       // Toast.makeText(Admin_Profile.this,"HOSPITAL_NAME- CHRIST HOSPITAL\nPHONE_NUMBER- 080-98765687\nADDRESS- 14/5 Kashi Temple Street,Vijay Nagar Bangalore\nPATIENT_COUNT- 12356 ",Toast.LENGTH_LONG).show();
    }
}
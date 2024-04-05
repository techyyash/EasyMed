package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class hospital_profile extends AppCompatActivity{

    //public login_hospital helper;//creating object for login_hospital class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /* TextView a=(TextView)findViewById(R.id.hospital_name_extract);
        String as=helper.temp;//getting value of temp variable from login_hospital class.
      //a.setText(as);
      */

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_hospital_profile);
    }
}
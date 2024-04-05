package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class Admin_Staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_admin_staff);
        Toast.makeText(Admin_Staff.this,"STAFF_COUNT- 500\nMALE_STAFF- 250\nFEMALE_STAFF- 250 ",Toast.LENGTH_LONG).show();

    }
}
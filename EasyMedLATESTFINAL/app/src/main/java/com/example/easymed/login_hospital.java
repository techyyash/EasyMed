package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class login_hospital extends AppCompatActivity {

    EditText username,password,username1,password1,email_d,fd,ph;
    Button submit,sgn,sgn1;
    TextView tx1,tx2;
    RelativeLayout re,re1;
    //String temp;

    ArrayList<String> usn = new ArrayList<String>();
    ArrayList<String> eml = new ArrayList<String>();
    ArrayList<String> phn1 = new ArrayList<String>();
    ArrayList<String> fdc = new ArrayList<String>();
    ArrayList<String> pass = new ArrayList<String>();

    int x = 0;

    private databasehelper2 dbHandler;
    private Toast mToastToShow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();


        setContentView(R.layout.activity_login_hospital);

        dbHandler = new databasehelper2(login_hospital.this);

        username=findViewById(R.id.age);
        password=findViewById(R.id.past);
        tx1=findViewById(R.id.textView5);
        re=findViewById(R.id.rel);
        //re1=findViewById(R.id.rel1);

        //re.setVisibility(View.INVISIBLE);

        username1=findViewById(R.id.ust1);
        email_d=findViewById(R.id.em);
        fd=findViewById(R.id.ph);
        ph=findViewById(R.id.fd);
        password1=findViewById(R.id.pass1);
       // tx2=findViewById(R.id.textView7);


        submit=findViewById(R.id.signup_button);
        sgn =findViewById(R.id.login_button);
       // sgn1=findViewById(R.id.register1);

        // for adddata4
       /* int did=10;
        String dname="yash";
        String dpass="12345";
        dbHandler.adddata4(did,dname,dpass);*/
        //////////////////////////////////////////////

        Button buttonOne = findViewById(R.id.login_button);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String loginusername=username.getText().toString();
                String loginpassword=password.getText().toString();

               /* String name="username";
                String password="password";
                */

                if(loginusername.equals("")||loginpassword.equals(""))
                {
                    Toast.makeText(login_hospital.this, "PLEASE ENTER ALL THE FIELDS!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(login_hospital.this, "PLEASE ENTER ALL THE FIELDS!", Toast.LENGTH_SHORT).show();



                }

                else
                {
                    Boolean checkuserpass = dbHandler.checkdoctorusernamepassword(loginusername, loginpassword);

                    if (checkuserpass == true)
                    {
                        Toast.makeText(login_hospital.this, "LOGGING IN", Toast.LENGTH_SHORT).show();
                        Intent activity2Intent = new Intent(getApplicationContext(), hospital_home.class);
                       // temp=loginusername;
                        startActivity(activity2Intent);
                    }
                    else if(checkuserpass == false)
                    {
                        Toast.makeText(login_hospital.this, "Wrong Credentials! TRY AGAIN", Toast.LENGTH_SHORT).show();
                    }
                }
                /*if(loginusername==name&&loginpassword==password)

                    if(loginusername.isEmpty()&&loginpassword.isEmpty())
                    {
                        Toast.makeText(login_hospital.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                        //return;
                    }*/


            }
        });






    }



    private void sign_up() {
        username.setVisibility(View.INVISIBLE);
        password.setVisibility(View.INVISIBLE);
        tx1.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);
        sgn.setVisibility(View.INVISIBLE);
        re1.setVisibility(View.VISIBLE);
    }




    public void reg(View view) {
        String uns = (username1.getText().toString());
        String ems = (email_d.getText().toString());
        String phn = (ph.getText().toString());
        String food = (fd.getText().toString());
        String ps = (password1.getText().toString());

        usn.add(uns);
        eml.add(ems);
        phn1.add(phn);
        fdc.add(food);
        pass.add(ps);



        re1.setVisibility(View.INVISIBLE);


        username.setVisibility(View.VISIBLE);
        password.setVisibility(View.VISIBLE);
        tx1.setVisibility(View.VISIBLE);
        submit.setVisibility(View.VISIBLE);
        sgn.setVisibility(View.VISIBLE);

    }

    public void bck(View view) {
        re.setVisibility(View.INVISIBLE);

        username.setVisibility(View.VISIBLE);
        password.setVisibility(View.VISIBLE);
        tx1.setVisibility(View.VISIBLE);
        submit.setVisibility(View.VISIBLE);
        sgn.setVisibility(View.VISIBLE);

    }

}
package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class admin_login extends AppCompatActivity {

    EditText username, password, username1, password1, email_d, fd, ph, name, address, gender;
    Button submit, sgn, sgn1, register;
    TextView tx1, tx2;
    RelativeLayout re, re1;
    ImageView back;
    private databasehelper2 dbHandler;
 /*   GoogleSignInClient mGoogleSignInClient;
    private static int  RC_SIGN_IN=100;*/
    // private databasehelper3 dbhandler2;

    ArrayList<String> usn = new ArrayList<String>();
    ArrayList<String> eml = new ArrayList<String>();
    ArrayList<String> phn1 = new ArrayList<String>();
    ArrayList<String> fdc = new ArrayList<String>();
    ArrayList<String> pass = new ArrayList<String>();

    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_admin_login);


        dbHandler = new databasehelper2(admin_login.this);
        //dbhandler2=new databasehelper3(login_patient.this);

        username = findViewById(R.id.age);
        password = findViewById(R.id.past);
        back = findViewById(R.id.back);
        tx1 = findViewById(R.id.textView5);
        re = findViewById(R.id.rel);
        re1 = findViewById(R.id.rel1);
        back = findViewById(R.id.back);


        username1 = findViewById(R.id.ust1);
        name = findViewById(R.id.em);
        email_d = findViewById(R.id.email_id);
        //fd=findViewById(R.id.ph);
        ph = findViewById(R.id.fd);//for phone number
        password1 = findViewById(R.id.ph);
        address = findViewById(R.id.pass1);
        gender = findViewById(R.id.gender);
        // tx2=findViewById(R.id.textView7);


        submit = findViewById(R.id.signup_button);
        sgn = findViewById(R.id.login_button);
        sgn1 = findViewById(R.id.register);


        back.setVisibility(View.INVISIBLE);


        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//for hospital_registration database
     /*

                final String tablename3="hospital_registration";
    final String hospital_id="hospital_id";
    final String hospital_name="hospital_name";
    final String hospital_email="hospital_email";
    final String hospital_phno="hospital_phno";
    final String hospital_address="hospital_address";
    final String hregistration_certificate="registration_certificate";
    final String hospital_qr="hospital_qr";



                String query3="CREATE TABLE " + tablename3 + " ("
                        + "hospital_id" + " INT primary key autoincrement NOT NULL ,"
                        + "hospital_name" + " TEXT NOT NULL  ,"
                        + "hospital_email" + " TEXT NOT NULL ,"
                        + "hospital_phno" + " INT NOT NULL ,"
                        + "hospital_address" + " TEXT  NOT NULL,"
                        + "hregistration_certificate" + " TEXT NOT NULL,"
                        + "hospital_qr" + " TEXT NOT NULL)";
*/


                String username = username1.getText().toString();
                String namee = name.getText().toString();
                String email_id = email_d.getText().toString();
                String phonenumber = ph.getText().toString();
                String password = password1.getText().toString();
                String addresss = address.getText().toString();
                String genderr = gender.getText().toString();

                if (username.isEmpty() && email_id.isEmpty() && phonenumber.isEmpty() && password.isEmpty() && addresss.isEmpty() && genderr.isEmpty() && namee.isEmpty()) {
                    Toast.makeText(admin_login.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }
                //dbHandler.adddata(username, password, namee, email_id, phonenumber, addresss, genderr);


                //for adddata3
                int id = 12;
                String nme = "rmeje";
                String mail = "wewee";
                int ph = 12122;
                String add = "weewwewewe";
                String cert = "wewee";
                String qr = "no";
               // dbHandler.adddata3(id, nme, mail, ph, add, cert, qr);



                //dbhandler2.adddata(username,password,namee,email_id,phonenumber,addresss,genderr);
                Toast.makeText(admin_login.this, "Data Entered", Toast.LENGTH_SHORT).show();
                Intent activity2Intent = new Intent(getApplicationContext(), patient_home.class);
                startActivity(activity2Intent);
            }
        });


        Button buttonOne = findViewById(R.id.login_button);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                String loginusername = username.getText().toString();
                String loginpassword = password.getText().toString();

                String name = "username";
                String password = "password";/*
                if(loginusername==name&&loginpassword==password)

                    if(loginusername.isEmpty()&&loginpassword.isEmpty())
                    {
                        Toast.makeText(login_patient.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                        //return;
                    }
            */


                if (loginusername.equals("") || loginpassword.equals("")) {
                    Toast.makeText(admin_login.this, "PLEASE ENTER ALL THE FIELDS!", Toast.LENGTH_LONG).show();
                } else {
                    //Boolean checkuserpass = dbHandler.checkusernamepassword(loginusername, loginpassword);
                    String checkuserpass="admin";
                    String checkusername="admin";
                    if (loginusername.equals(checkusername) || loginpassword.equals(checkuserpass) ) {
                        Toast.makeText(admin_login.this, "LOGGING IN", Toast.LENGTH_LONG).show();
                        Intent activity2Intent = new Intent(getApplicationContext(), admin_home.class);
                        startActivity(activity2Intent);
                    } else if (!loginusername.equals(checkusername) || !loginpassword.equals(checkuserpass)) {
                        Toast.makeText(admin_login.this, "Wrong Credentials! TRY AGAIN", Toast.LENGTH_LONG).show();
                    }

                }


                //String db="easymed2";
/*
                if(dbHandler.logincheck(loginusername,loginpassword))
                {
                }*/

            }


        });


        Button buttonTwo = findViewById(R.id.signup_button);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sign_up();
            }
        });


       /* Button buttonThree = findViewById(R.id.register1);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity2Intent = new Intent(getApplicationContext(), patient_home.class);
                startActivity(activity2Intent);
            }
        });*/


        ImageView buttonfour = findViewById(R.id.back);
        buttonfour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bck();
            }
        });

    }

    private void bck() {
        re.setVisibility(View.VISIBLE);

        username.setVisibility(View.VISIBLE);
        password.setVisibility(View.VISIBLE);
        tx1.setVisibility(View.VISIBLE);
        submit.setVisibility(View.VISIBLE);
        sgn.setVisibility(View.VISIBLE);
        re1.setVisibility(View.INVISIBLE);
        back.setVisibility(View.INVISIBLE);
    }

    private void sign_up() {
        username.setVisibility(View.INVISIBLE);
        password.setVisibility(View.INVISIBLE);
        tx1.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);
        sgn.setVisibility(View.INVISIBLE);
        re1.setVisibility(View.VISIBLE);
        back.setVisibility(View.VISIBLE);


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


}
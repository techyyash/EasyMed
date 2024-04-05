package com.example.easymed;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databasehelper extends SQLiteOpenHelper{


    private static final String DB_NAME = "easymed";

    private static final int DB_VERSION = 1;


    private static final String TABLE_NAME = "patient_registration";


    private static final String username = "username";


    private static final String password = "password";


    private static final String email = "email";


    private static final String name = "name";

    private static final String phone = "phone";

    private static final String address = "address";
    private static final String gender = "gender";

    //for prescribe in doctor section(activity_patient_doctor_profile)

    private static final String patient_username="patient_username";
    private static final String cause_of_visit="cause_of_visit";
    private static final String prescription="prescription";
    private static final String TABLE_NAME2 = "patient_prescription";//for prescribe in doctor section.
    public databasehelper(@Nullable Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }



//for hospital_registration database

    private static final String tablename3="hospital_registration";
    private static final String hospital_id="hospital_id";
    private static final String hospital_name="hospital_name";
    private static final String hospital_email="hospital_email";
    private static final String hospital_phno="hospital_phno";
    private static final String hospital_address="hospital_address";
    private static final String hregistration_certificate="registration_certificate";
    private static final String hospital_qr="hospital_qr";



    String query3="CREATE TABLE " + "hospital_registration" + " ("
            + hospital_id + " INT primary key autoincrement NOT NULL ,"
            + hospital_name + " TEXT NOT NULL  ,"
            + hospital_email + " TEXT NOT NULL ,"
            + hospital_phno + " INT NOT NULL ,"
            + hospital_address + " TEXT  NOT NULL,"
            + hregistration_certificate + " TEXT NOT NULL,"
            + hospital_qr + " TEXT NOT NULL)";

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + username + " TEXT, "
                + password + " TEXT,"
                + name + " TEXT,"
                + email + " TEXT,"
                + phone + " TEXT,"
                + address + " TEXT,"
                + gender + " TEXT)";

//        db.execSQL(query);

        //for prescribe in doctor section(activity_patient_doctor_profile)
        String query2="CREATE TABLE " + TABLE_NAME2 + " ("
                + patient_username + " TEXT, "
                + cause_of_visit + " TEXT,"
                + prescription + " TEXT)";

       // db.execSQL(query3);



    }


    public void logincheck(String username,String password,SQLiteDatabase db)
    {
        String[] columns={"username"};
        //db=SQLiteDatabase.openDatabase();
        db=this.getReadableDatabase();



    }

    public void adddata(String usrname,String pass,String nme,String emaill,String phonee,String addresss,String genderr)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();

        values.put(username,usrname);
        values.put(password,pass);
        values.put(name,nme);
        values.put(email,emaill);
        values.put(phone,phonee);
        values.put(address,addresss);
        values.put(gender,genderr);

        db.insert(TABLE_NAME,null,values) ;
        db.close();
    }

    public void adddata2(String p_username,String visitcause,String pres)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();

        values.put(patient_username,p_username);
        values.put(cause_of_visit,visitcause);
        values.put(prescription,pres);

        db.insert(TABLE_NAME2,null,values) ;
        db.close();

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        onCreate(db);
        onCreate(db);
    }
}

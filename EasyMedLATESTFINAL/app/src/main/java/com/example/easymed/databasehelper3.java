package com.example.easymed;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databasehelper3 extends SQLiteOpenHelper
{
    private static final String DB_NAME = "hospital";

    private static final int DB_VERSION = 1;


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

    ////////////////////////////////////////////////////////////////////





    public databasehelper3(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


       // db.execSQL(query3);


    }

    public void adddata()
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();

        values.put("hospital_id",12);
        values.put(hospital_name,"yash");
        values.put(hospital_email,"qw");
        values.put(hospital_phno,1212);
        values.put(hospital_address,"qwqwwqw");
        values.put(hregistration_certificate,"no");
        values.put(hospital_qr,"no");

        db.insert(tablename3,null,values) ;

        db.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        /*db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);*/
        db.execSQL("DROP TABLE IF EXISTS " + tablename3);
        // onCreate(db);
        onCreate(db);
    }
}
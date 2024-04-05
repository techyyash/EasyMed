package com.example.easymed;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databasehelper2 extends SQLiteOpenHelper{




    private static final String DB_NAME = "easymed2";

    private static final int DB_VERSION = 1;


    //create table and enter data in method only.
    final String TABLE_NAME = "patient_registration";


    final String username = "username";


    final String password = "password";


    final String email = "email";


    final String name = "name";

    final String phone = "phone";

    final String address = "address";
    final String gender = "gender";



//for registration
    String query = "CREATE TABLE " + TABLE_NAME + " ("
            + username + " TEXT, "
            + password + " TEXT,"
            + name + " TEXT,"
            + email + " TEXT,"
            + phone + " TEXT,"
            + address + " TEXT,"
            + gender + " TEXT)";

////////////////////////////////////////////////////////////////////
    //for prescribe in doctor section(activity_patient_doctor_profile)
    //for prescribe in doctor section(activity_patient_doctor_profile)
    String query2="CREATE TABLE " + TABLE_NAME2 + " ("
            + patient_username + " TEXT, "
            + cause_of_visit + " TEXT,"
            + prescription + " TEXT)";
////////////////////////////////////////////////////////////////////

//for hospital_registration database

    final String tablename3="hospital_registration";
    final String hospital_id="hospital_id";
    final String hospital_name="hospital_name";
    final String hospital_email="hospital_email";
    final String hospital_phno="hospital_phno";
    final String hospital_address="hospital_address";
    final String hregistration_certificate="registration_certificate";
    final String hospital_qr="hospital_qr";



    String query3="CREATE TABLE " + "hospital_registration" + " ("
            + hospital_id + " INT ,"
            + hospital_name + " TEXT ,"
            + hospital_email + " TEXT ,"
            + hospital_phno + " INT ,"
            + hospital_address + " TEXT  ,"
            + hregistration_certificate + " TEXT ,"
            + hospital_qr + " TEXT)";

    ////////////////////////////////////////////////////////////////////

    //for hospitallogin

    final String tablename4="hospital_login";
    final String lhospital_id="hospital_id";
    final String lhospital_username="hospital_username";
    final String lhospital_password="hospital_password";

    String query4="CREATE TABLE " + "hospital_login" + " ("
            + lhospital_id + " INT ,"
            + lhospital_username + " TEXT ,"
            + lhospital_password + " TEXT)";
    ////////////////////////////////////////////////////////////////////

    //for hospitalpharmacy
    final String tablename5="hospital_pharmacy";
    final String phospital_id="hospital_id";
    final String med_name="med_name";
    final String med_price="med_price";
    final String med_stock="med_stock";
    final String med_sold="med_sold";

    String query5="CREATE TABLE " + "hospital_pharmacy" + " ("
            + phospital_id + " INT ,"
            + med_name + " TEXT ,"
            + med_price + " INT,"
            + med_stock+"INT,"
            + med_sold+"INT)";


    /////////////////////////////////////////////////////////////////////

    //for doctor registration
    final String tablename6="doctor_reg";
/*    final String dhospital_id="hospital_id";
    final String doctor_id="doctor_id";
    final String doctor_name="doctor_name";
    final String doctor_email="doctor_email";
    final String doctor_phno="doctor_phno";
    final String doctor_address="doctor_address";
    final String doctor_patient_count="doctor_patient_count";
    final String doc_specialization="doc_specialization";
*/
    final String doc_name="doc_name";
    final String doc_mob="doc_mob";
    final String doc_mail="doc_mail";
    final String doc_edu="doc_edu";
    final String doc_des="doc_des";
    final String doc_spec="doc_spec";

    String query6="CREATE TABLE " + "doctor_reg" + " ("
            + doc_name + " TEXT ,"
            + doc_mob + " INT ,"
            + doc_mail + " TEXT ,"
            + doc_edu + " TEXT ,"
            + doc_des + " TEXT ,"
            + doc_spec + " TEXT)";

    ////////////////////////////////////////////////////////////////////

    //for patient prescription

    final String tablename7="ppatient_prescription";
    final String ppatient_username="patient_username";
    final String pcause_of_visit="cause_of_visit";
    final String pprescription="prescription";
    final String pdate="date";

    String query7="CREATE TABLE " + "ppatient_prescription" + " (" // keep it ppatient_prescription only because we already have patient_prescription.
            + ppatient_username + " TEXT ,"
            + pcause_of_visit + " TEXT ,"
            + pprescription + " TEXT,"
            + pdate+"TEXT)";


    ////////////////////////////////////////////////////////////////////

    //for patient registration
    final String tablename8="rpatient_registration";
    final String rpatient_id="patient_id";
    final String rpatient_name="patient_name";
    final String rpatient_dob="patient_dob";
    final String rpatient_phno="patient_phno";
    final String rpatient_address="patient_address";
    final String rpatient_mail="patient_mail";
    final  String rpatient_gender="patient_gender";

    String query8="CREATE TABLE " + "rpatient_registration" + " (" // keep it rpatient_registration only because we already have patient_registration.
            + rpatient_id + " INT ,"
            + rpatient_name + " TEXT ,"
            + rpatient_dob + " TEXT,"
            + rpatient_phno+"INT,"
            + rpatient_address+"TEXT,"
            + rpatient_mail+"TEXT,"
            + rpatient_gender+"TEXT)";
    /////////////////////////////////////////////////////////////////////

    //for addfamilymembers
    final String tablename9="addfamily_member";
    final String apatient_id="patient_id";
    final String amember_name="member_name";
    final String amember_dob="member_dob";
    final String amember_phno="member_phno";
    final String amember_address="member_address";
    final String amember_mail="member_mail";
    final  String amember_gender="member_gender";

    String query9="CREATE TABLE " + "addfamily_member" + " ("
            + apatient_id + " INT ,"
            + amember_name + " TEXT ,"
            + amember_dob + " TEXT,"
            + amember_phno+"INT,"
            + amember_address+"TEXT,"
            + amember_mail+"TEXT,"
            + amember_gender+"TEXT)";
    /////////////////////////////////////////////////////////////////////

    //for doctor login
    final String tablename10="doctor_login";
    final String ldoctor_id="doctor_id";
    final String ldoctor_username="doctor_name";
    final String ldoctor_password="doctor_password";

    String query10="CREATE TABLE " + "doctor_login" + " ("
            + ldoctor_id + " INT ,"
            + ldoctor_username + " TEXT ,"
            + ldoctor_password + " TEXT)";
     //////////////////////////////////////////////////////////////////////

    private static final String patient_username="patient_username";
    private static final String cause_of_visit="cause_of_visit";
    private static final String prescription="prescription";
    private static final String TABLE_NAME2 = "patient_prescription";//for prescribe in doctor section.




    //for login

    private static final String COLUMN_username = "username";
    private static final String COLUMN_password = "password";



    public databasehelper2(@Nullable Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {






        db.execSQL(query);

        db.execSQL(query2);

        db.execSQL(query3);

        db.execSQL(query4);

        db.execSQL(query5);

        db.execSQL(query6);

        db.execSQL(query7);

        db.execSQL(query8);

        db.execSQL(query9);

        db.execSQL(query10);

        //  reg(db);


    }
    /*
    public void reg(SQLiteDatabase db)
    {

    }

     */
/*

    public boolean logincheck(String username, String password)
    {SQLiteDatabase db;
        final String TABLE_NAME = "patient_registration";
        String[] columns={COLUMN_username,COLUMN_password};
        //db=SQLiteDatabase.openDatabase();
        db=this.getReadableDatabase();

        //for where conditions
        String selection = COLUMN_username +COLUMN_password+ " = ?";
        //String selection2 = COLUMN_password + " = ?";

        //for values for where clause
        String[] selectionArgs = {username,password};
       // String[] selectionArgs2={password};

        Cursor cursor = db.query(TABLE_NAME, //Table to query
                columns,                    //columns to return
                selection,                  //columns for the WHERE clause
                selectionArgs,              //The values for the WHERE clause
                null,                       //group the rows
                null,                      //filter by row groups
                null);


        int cursorCount = cursor.getCount();
        cursor.close();
        db.close();
        if (cursorCount > 0) {
            return true;
        }
        return false;

    }
*/
    public void adddata(String usrname,String pass,String nme,String emaill,String phonee,String addresss,String genderr)//registration
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

    public void adddata2(String p_username,String visitcause,String pres)//patient
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();

        values.put(patient_username,p_username);
        values.put(cause_of_visit,visitcause);
        values.put(prescription,pres);

        db.insert(TABLE_NAME2,null,values) ;
        db.close();

    }
/*
    public Boolean checkusername(String username)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select *from patient_registration where username=?",new String[]{username});

        if (cursor.getCount()>0)
        {
            return true;

        }
        else
        {return false;}

    }*/

    public void adddata3(int id, String name, String email, int phno, String add, String certificate, String qr)//hospital registration. calling this method from login_patient.java file
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();

        values.put(hospital_id,id);
        values.put(hospital_name,name);
        values.put(hospital_email,email);
        values.put(hospital_phno,phno);
        values.put(hospital_address,add);
        values.put(hregistration_certificate,certificate);
        values.put(hospital_qr,qr);

        db.insert(tablename3,null,values) ;
        db.close();


        //return true;
    }

    public void adddata4(int id,String name,String pass) //for doctor login
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();


        values.put(ldoctor_id,id);
        values.put(ldoctor_username,name);
        values.put(ldoctor_password,pass);

        db.insert(tablename10,null,values) ;
        db.close();

    }

    public void adddata5(String name,int mob,String mail,String edu,String des, String spec )//for doc registration
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();

        values.put(doc_name,name);
        values.put(doc_mob,mob);
        values.put(doc_mail,mail);
        values.put(doc_edu,edu);
        values.put(doc_des,des);
        values.put(doc_spec,spec);

        db.insert(tablename6,null,values);
        db.close();

    }



    public Boolean checkusernamepassword(String username,String password)//for patient login
    {

        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select *from patient_registration where username=? and password=?",new String[]{username,password});

        if (cursor.getCount()>0)
        {
            return true;

        }
        else
        {return false;}

    }


    public Boolean checkdoctorusernamepassword(String username,String password)//for doctor_login
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * from doctor_login where doctor_name=? and doctor_password=?",new String[]{username,password});

        if (cursor.getCount()>0)
        {
            return true;

        }
        else
        {return false;}


    }

    public Cursor getdata() // for history in doctor tab. will be accesed from hospital_database_connection file
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from patient_prescription", null);

return cursor;
    }



    public Cursor pharmacy()
    { SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * from patient_prescription  ",null);

    return cursor;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS " + tablename3);
        db.execSQL("DROP TABLE IF EXISTS " + tablename4);
        db.execSQL("DROP TABLE IF EXISTS " + tablename5);
        db.execSQL("DROP TABLE IF EXISTS " + tablename6);
        db.execSQL("DROP TABLE IF EXISTS " + tablename7);
        db.execSQL("DROP TABLE IF EXISTS " + tablename8);
        db.execSQL("DROP TABLE IF EXISTS " + tablename9);
        db.execSQL("DROP TABLE IF EXISTS " + tablename10);


        onCreate(db);
    }



}

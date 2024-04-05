package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class patient_map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_map);

        ImageView buttonThree = findViewById(R.id.locationimg);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo: 12.972442,77.580643?q=Hospitals");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
/*
                //String url = "https://goo.gl/maps/CwsCGZ9fRruhfSUw8";
                List <String>url=new ArrayList<String>();
                url.add("https://goo.gl/maps/CwsCGZ9fRruhfSUw8");
                url.add("https://goo.gl/maps/4wAbk4Drja89hqXD7");
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(String.valueOf(url)));
                startActivity(intent);
*/
                Toast.makeText(patient_map.this, "Opening Google Maps", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
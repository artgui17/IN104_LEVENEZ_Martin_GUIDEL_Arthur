package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button=(TextView) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
           

            @Override
            public void onClick(View v) {
                EditText depart=(EditText) findViewById(R.id.editTextTextPostalAddress) ;
                EditText arrive=(EditText) findViewById(R.id.editTextTextPostalAddress2) ;
                String dep=depart.getText().toString();
                String arr=arrive.getText().toString();
                Intent otherActivity = new Intent(getApplicationContext(), MapsActivity.class);
                otherActivity.putExtra("depart1",dep);
                otherActivity.putExtra("arrive1",arr);
                startActivity(otherActivity);
                finish();
            }
        });


    }
}
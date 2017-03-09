package com.m2dl.miniprojet.mini_projet_m2;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView monTexte = null;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monTexte = (TextView)findViewById(R.id.textView1);
        //monTexte.setText("Bienvenue dans l'application mini projet M2 !");
        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(

                new View.OnClickListener() {
                    public void onClick(View v) {
                        //on lance l'activité qui gère la map

                        //Toast.makeText(MainActivity.this,  "Bonjour ! :)", Toast.LENGTH_LONG).show();
                        Intent intent1 = new Intent(MainActivity.this, GoogleMap.class);
                        startActivity(intent1);

                    }
                }
        );


    }
}

package com.example.activitylauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button1;
private Button button2;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openALCprofile();
            }
        });

         button2 = (Button)findViewById(R.id.button2);
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openMyProfile();
             }
         });
    }
    public void openALCprofile(){
        Intent intent=new Intent(this,ALCProfile.class);
        startActivity(intent);
    }

    public void openMyProfile(){
        Intent intent=new Intent(this,MyProfile.class);
        startActivity(intent);
    }
}

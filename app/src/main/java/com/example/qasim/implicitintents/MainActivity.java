package com.example.qasim.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMap, btnCall, btnCallFriend, btnWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall=findViewById(R.id.btnCall);
        btnCallFriend=findViewById(R.id.btnCallFriend);
        btnMap=findViewById(R.id.btnMap);
        btnWeb=findViewById(R.id.btnWeb);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });

        btnCallFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0872543225"));
                startActivity(intent);
            }
        });

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

package com.thangtruong19.coffeemanagement;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChonTang extends AppCompatActivity {

    TextView txtchontang;
    ImageView imgtang1;
    ImageView imgtang2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chontang);
        txtchontang = (TextView) findViewById(R.id.txtchontang);
        txtchontang.setTextColor(Color.RED);
        imgtang1=(ImageView)findViewById(R.id.imgtang1);
        imgtang2=(ImageView)findViewById(R.id.imgtang2);


        imgtang1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent tang11=new Intent(ChonTang.this,Tang1.class);
                startActivity(tang11);
            }
        });

        imgtang2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent tang22=new Intent(ChonTang.this,Tang2.class);
                startActivity(tang22);

            }
        });





    }
}

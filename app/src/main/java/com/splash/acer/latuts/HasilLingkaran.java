package com.splash.acer.latuts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HasilLingkaran extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_lingkaran);

        tv = (TextView)findViewById(R.id.tv);
        Intent i = getIntent();
        String nilai = i.getStringExtra("nilai");
        tv.setText(nilai);
    }
}

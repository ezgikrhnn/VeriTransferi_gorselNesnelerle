package com.info.veritransferi_gorselnesnelerle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    private TextView textViewCikti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);


        textViewCikti = findViewById(R.id.textViewCikti);

        //MainActivity'den gonderilen veriyialmam gerekiyor.
        String gelenveri = getIntent().getStringExtra("mesaj"); //key mesajdi,o yuzden boyle yaptim

        //simdi gelen mesaji TextView icinde yazdirmak istiyorum.
        textViewCikti.setText(gelenveri);

    }
}
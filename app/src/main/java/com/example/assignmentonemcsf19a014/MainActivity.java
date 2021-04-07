package com.example.assignmentonemcsf19a014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CharoQul(View view) {
        Intent intent = new Intent(this,CharoQul.class);
        startActivity(intent);
    }

    public void ayatulkursi(View view) {
        Intent intent = new Intent(this,AyatulKursi.class);
        startActivity(intent);
    }
}
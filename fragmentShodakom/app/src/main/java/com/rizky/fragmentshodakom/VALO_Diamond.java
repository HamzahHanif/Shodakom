package com.rizky.fragmentshodakom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VALO_Diamond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valo_diamond);
        Button btn1=findViewById(R.id.bt6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VALO_Diamond.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}
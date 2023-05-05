package com.rizky.fragmentshodakom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        CardView cardView=findViewById(R.id.imageCard);
        CardView cardView01=findViewById(R.id.imageCard1);
        CardView cardView2=findViewById(R.id.imageCard2);
        CardView cardView3=findViewById(R.id.imageCard3);
        CardView cardView4=findViewById(R.id.imageCard4);
        CardView cardView5=findViewById(R.id.imageCard6);
        CardView cardView6=findViewById(R.id.imageCard7);
        CardView cardView7=findViewById(R.id.imageCard8);
        CardView cardView8=findViewById(R.id.imageCard9);
        CardView cardView9=findViewById(R.id.imageCard10);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Wallet_Dana.class);
                startActivity(intent);
            }
        });

        cardView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Wallet_Shopee.class);
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Wallet_Gopay.class);
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Wallet_Ovo.class);
                startActivity(intent);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Wallet_Qriss.class);
                startActivity(intent);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Wallet_Bank.class);
                startActivity(intent);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Wallet_Bank.class);
                startActivity(intent);
            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Wallet_Bank.class);
                startActivity(intent);
            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Wallet_Bank.class);
                startActivity(intent);
            }
        });

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Wallet_Bank.class);
                startActivity(intent);
            }
        });


        ImageButton Ib=findViewById(R.id.title);
        Ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, ML_Diamond.class);
                startActivity(intent);
            }
        });

        ImageButton Ib1=findViewById(R.id.title);
        Ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, FF_Diamond.class);
                startActivity(intent);
            }
        });

        ImageButton Ib2=findViewById(R.id.title);
        Ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, AOV_Diamond.class);
                startActivity(intent);
            }
        });

        ImageButton Ib3=findViewById(R.id.title);
        Ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, Ga_Diamond.class);
                startActivity(intent);
            }
        });

        ImageButton Ib4=findViewById(R.id.title);
        Ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, VALO_Diamond.class);
                startActivity(intent);
            }
        });

        ImageButton Ib5=findViewById(R.id.title);
        Ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentActivity.this, PUBG_Diamond.class);
                startActivity(intent);
            }
        });

    }
}
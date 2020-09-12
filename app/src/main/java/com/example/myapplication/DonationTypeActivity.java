package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DonationTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_type);
    }

    public void chooseOneTimeDonation(View view) {
      Intent intent = new Intent(this, OneTimeDonationFormActivity.class);
      startActivity(intent);
    }

    public void chooseRegularDonation(View view) {
      Intent intent = new Intent(this, RegularDonationFormActivity.class);
      startActivity(intent);
    }
}

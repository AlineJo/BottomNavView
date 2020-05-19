package com.programining.bottomnavview.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.programining.bottomnavview.R;

public class SimpleBottomNavActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_bottom_nav);
        mBottomNav = findViewById(R.id.bottom_nav);

    }
}

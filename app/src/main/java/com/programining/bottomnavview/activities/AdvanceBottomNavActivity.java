package com.programining.bottomnavview.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.programining.bottomnavview.R;
import com.programining.bottomnavview.adapters.MyAdapter;

public class AdvanceBottomNavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_bottom_nav);
        ViewPager viewPager = findViewById(R.id.view_pager);
        BottomNavigationView mBottomNav = findViewById(R.id.bottom_nav);
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

    }
}

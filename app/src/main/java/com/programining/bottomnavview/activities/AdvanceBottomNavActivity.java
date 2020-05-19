package com.programining.bottomnavview.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.programining.bottomnavview.R;
import com.programining.bottomnavview.adapters.MyAdapter;

public class AdvanceBottomNavActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, ViewPager.OnPageChangeListener {
    private BottomNavigationView mBottomNav;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_bottom_nav);

        mViewPager = findViewById(R.id.view_pager);

        mBottomNav = findViewById(R.id.bottom_nav);
        mBottomNav.setOnNavigationItemSelectedListener(this);
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);
        mViewPager.addOnPageChangeListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home: {
                mViewPager.setCurrentItem(0);
                return true;
            }

            case R.id.nav_dashboard: {
                mViewPager.setCurrentItem(1);
                return true;
            }

            case R.id.nav_notifications: {
                mViewPager.setCurrentItem(2);
                return true;
            }
        }

        return false;
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        mBottomNav.setSelectedItemId(mBottomNav.getMenu().getItem(position).getItemId());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}

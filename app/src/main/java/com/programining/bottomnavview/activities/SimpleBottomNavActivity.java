package com.programining.bottomnavview.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.programining.bottomnavview.R;
import com.programining.bottomnavview.fragments.DashboardFragment;
import com.programining.bottomnavview.fragments.HomeFragment;
import com.programining.bottomnavview.fragments.NotificationsFragment;
import com.programining.bottomnavview.interfaces.MediatorInterface;

public class SimpleBottomNavActivity extends AppCompatActivity implements MediatorInterface, BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_bottom_nav);
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(this);
        changeFragmentTo(new HomeFragment(), HomeFragment.class.getSimpleName());
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_home: {
                changeFragmentTo(new HomeFragment(), HomeFragment.class.getSimpleName());
                return true;
            }

            case R.id.nav_dashboard: {
                changeFragmentTo(new DashboardFragment(), DashboardFragment.class.getSimpleName());
                return true;
            }

            case R.id.nav_notifications: {
                changeFragmentTo(new NotificationsFragment(), NotificationsFragment.class.getSimpleName());
                return true;
            }
        }

        return false;
    }

    @Override
    public void changeFragmentTo(Fragment fragmentToDisplay, String fragmentTag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fl_host, fragmentToDisplay, fragmentTag);
        ft.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        if (fm.findFragmentByTag(fragmentTag) == null) {
            ft.addToBackStack(fragmentTag);
        }
        ft.commit();
    }


}

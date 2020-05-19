package com.programining.bottomnavview.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.programining.bottomnavview.fragments.DashboardFragment;
import com.programining.bottomnavview.fragments.HomeFragment;
import com.programining.bottomnavview.fragments.NotificationsFragment;

public class MyAdapter extends FragmentPagerAdapter {

    Fragment[] mViewPagerFragments = {
            new HomeFragment(),
            new DashboardFragment(),
            new NotificationsFragment()};


    public MyAdapter(@NonNull FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mViewPagerFragments[position];
    }

    @Override
    public int getCount() {
        return mViewPagerFragments.length;
    }
}

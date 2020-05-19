package com.programining.bottomnavview.interfaces;


import androidx.fragment.app.Fragment;

public interface MediatorInterface {
    void changeFragmentTo(Fragment fragmentToDisplay, String fragmentTag);
}

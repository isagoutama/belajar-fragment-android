package com.example.belajar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String FRAGMENT_STACK = "STACK_ISA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add fragment baru di activity
        FragmentManager fragmentManager = getSupportFragmentManager(); // ngatur fragment di suatu activity
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        HomeFragment homeFragment = new HomeFragment();

        Fragment fragment = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());
        if (!(fragment instanceof HomeFragment)){
            fragmentTransaction.add(R.id.frame_container, homeFragment, HomeFragment.class.getSimpleName());
            Log.d("My Fragment","Fragment : "+HomeFragment.class.getSimpleName());
            fragmentTransaction.commit();
        }
    }
}
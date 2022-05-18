package com.example.keeping_fit;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainMenuActivity extends FragmentActivity { //FragmentActivity!!

    private Button btnGoToHandsTraining, btnGoToLegsTraining, btnGoToBackTraining, btnGoToBreastTraining, btnGoToButtocksTraining;
    private FragmentContainerView fragmentContainerView;

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        TrainingFragment trainingFragment = new TrainingFragment();
        DietFragment dietFragment = new DietFragment();
        HealthFragment healthFragment = new HealthFragment();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);

        // при выборе item на панели заменяем один фрагмент на выбранный
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_training:
                        setNewFragment(trainingFragment);
                        return true;
                    case R.id.navigation_diet:
                        setNewFragment(dietFragment);
                        return true;
                    case R.id.navigation_health:
                        setNewFragment(healthFragment);
                        return true;
                }
                return false;
            }
        });

        fragmentContainerView = (FragmentContainerView) findViewById(R.id.fragmentContainerView);
    }

    // Метод замены одного фрагмента на другой
    public void setNewFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
    }

   }

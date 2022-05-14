package com.example.keeping_fit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.AppBarConfiguration;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AdapterView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;


import androidx.navigation.ui.NavigationUI;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    training_fragment trainingFragment = new training_fragment();
    diet_fragment dietFragment = new diet_fragment();
    health_fragment healthFragment = new health_fragment();


    @Override
    // начать activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);


    }

    protected void mainMenu() {

        setContentView(R.layout.main_menu);


        bottomNavigationView = findViewById(R.id.nav_view);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, trainingFragment).commit(); // заменяем один фрагмент на другой

        // при выборе item на панели заменяем один фрагмент на выбранный
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_training:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, trainingFragment).commit();
                        return true;
                    case R.id.navigation_diet:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, dietFragment).commit();
                        return true;
                    case R.id.navigation_health:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, healthFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}
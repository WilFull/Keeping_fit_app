package com.example.keeping_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class MainActivity extends AppCompatActivity {


    @Override
    // начать activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

    }

    // Метод для нажатия кнопки "Продолжить" в приветсвенном экране
    public void Continue(View view){
        Intent intent = new Intent(this, BasicInfo.class);
        startActivity(intent);
    }


    protected void mainMenu() {

        BottomNavigationView bottomNavigationView;

        TrainingFragment trainingFragment = new TrainingFragment();
        DietFragment dietFragment = new DietFragment();
        HealthFragment healthFragment = new HealthFragment();

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
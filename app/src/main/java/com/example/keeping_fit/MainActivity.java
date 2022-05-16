package com.example.keeping_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class MainActivity extends AppCompatActivity {


    @Override
    // начать activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        // Считываем объект btnGoToBasicInfo в Activity welcome_screen, и преобразуем его в кнопку
        Button btnGoToBasicInfo = (Button) findViewById(R.id.btnGoToBasicInfo);

        // Создаем слушатель кнопки
        View.OnClickListener oclBtnGoToBasicInfo = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Для осуществления перехода на basic_info создаем некую сущность
                Intent intent = new Intent(MainActivity.this, BasicInfo.class);
                startActivity(intent); //запускаем переход
            }
        };

        // Назначаем кнопке обработчик
        btnGoToBasicInfo.setOnClickListener(oclBtnGoToBasicInfo);
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
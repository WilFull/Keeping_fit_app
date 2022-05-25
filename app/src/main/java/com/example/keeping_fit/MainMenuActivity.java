// Класс активити, реализующий методы отображения макета Главного меню

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

    // Процедура, запускающая activity
    @Override
    protected void onCreate(Bundle savedInstanceState) { // параметр Bundle -  это параметр, который представляет собой объект пакета, содержащий ранее сохраненное состояние действия
        super.onCreate(savedInstanceState);// этот метод - это конструктор родительского класса, выполняющий необходимые операции для работы активности
        // параметр savedInstanceState - Это параметр, который представляет собой объект пакета, содержащий ранее сохраненное состояние действия
        setContentView(R.layout.main_menu); // метод - Объект класса вызывающий процедуру для поиска объекта view по id
        // парметр R.layout.main_menu - Ссылка на экран главного меню

        TrainingFragment trainingFragment = new TrainingFragment();
        DietFragment dietFragment = new DietFragment();
        HealthFragment healthFragment = new HealthFragment();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);

        // метод, который при выборе item на нижней навигационной панели заменяет один фрагмент на выбранный
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // в параметре находится объект класса, который вызывает прослушиватель для обработки событий выбора элементов навигации
            @Override
            // Это метод, который вызывается, когда пользователь выбирает какой–нибудь элемент выпадающего списка
            public boolean onNavigationItemSelected(MenuItem item) { // MenuItem item - Меню элементов навигации
                switch (item.getItemId()){
                    case R.id.navigation_training:
                        setNewFragment(trainingFragment);
                        return true;
                    case R.id.navigation_diet:
                        setNewFragment(dietFragment);
                        return true;
                    case R.id.navigation_health:
                        setNewFragment(healthFragment);
                        return true; // возвращает true, если  был выбран один из элементов навигации
                }
                return false; // возвращает false, если не был выбран ни один элемент навигации
            }
        });

        fragmentContainerView = (FragmentContainerView) findViewById(R.id.fragmentContainerView);
    }

    // Метод замены одного фрагмента на другой
    public void setNewFragment(Fragment fragment) { // Fragment fragment - объект типа "фрагмент"
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
    }

   }

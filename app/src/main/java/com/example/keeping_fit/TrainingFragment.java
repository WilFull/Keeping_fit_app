// Класс фрагмента, реализующий методы отображения макета Тренировок

package com.example.keeping_fit;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class TrainingFragment extends Fragment {



   // public TrainingFragment() {}

    @Override
    // Процедура, запускающая activity
    public void onCreate(@Nullable Bundle savedInstanceState) { // параметр Bundle -  это параметр, который представляет собой объект пакета, содержащий ранее сохраненное состояние действия
        super.onCreate(savedInstanceState); // этот метод - это конструктор родительского класса, выполняющий необходимые операции для работы активности
        // параметр savedInstanceState - Это параметр, который представляет собой объект пакета, содержащий ранее сохраненное состояние действия
    }

    @Nullable
    @Override
    // метод для отображения  training_layout во фрагменте TrainingFragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
               // LayoutInflater inflater Это класс, который читает описание внешнего вида xml и преобразует их в объекты View.
               // ViewGroup container Это параметр, который представляет собой контейнер, в которой будет загружаться training-фрагмент.
               // Bundle savedInstanceState Это параметр, который представляет собой объект пакета, содержащий ранее сохраненное состояние действия.

        View view = inflater.inflate(R.layout.training_layout, container, false);

        // кнопка "Руки"
        // Создаем объект типа "кнопка". Считываем объект btnGoToHandsTraining в fragment trainings, и преобразуем его в кнопку
        Button btnGoToHandsTraining = (Button) view.findViewById(R.id.btnGoToHandsTraining); // объявляем кнопку
        // метод - Создаем слушатель для кнопки btnGoToHandsTraining
        btnGoToHandsTraining.setOnClickListener(new View.OnClickListener() { // new View.OnClickListener() - этот параметр определяет интерфейс для обратного вызова, который будет вызываться при щелчке на view
            @Override
            // метод обработки событий нажатий для кнопки "Руки"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
                // Для осуществления перехода на trainings создаем сущность
                HandsMenuFragment handsMenuFragment = new HandsMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(handsMenuFragment);
            }
        });

        // кнопка "Ноги"
        // Создаем объект типа "кнопка". Считываем объект btnGoToLegsTraining в fragment trainings, и преобразуем его в кнопку
        Button btnGoToLegsTraining = (Button) view.findViewById(R.id.btnGoToLegsTraining); // объявляем кнопку
        // метод - Создаем слушатель для кнопки btnGoToLegsTraining
        btnGoToLegsTraining.setOnClickListener(new View.OnClickListener() { // new View.OnClickListener() - этот параметр определяет интерфейс для обратного вызова, который будет вызываться при щелчке на view
            @Override
            // метод обработки событий нажатий для кнопки "Ноги"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
                // Для осуществления перехода на trainings создаем сущность
                LegsMenuFragment legsMenuFragment = new LegsMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(legsMenuFragment);
            }
        });

        // Кнопка спина/плечи
        // Создаем объект типа "кнопка". Считываем объект btnGoToBackTraining в fragment trainings, и преобразуем его в кнопку
        Button btnGoToBackTraining = (Button) view.findViewById(R.id.btnGoToBackTraining); // объявляем кнопку
        // метод - Создаем слушатель для кнопки btnGoToBackTraining
        btnGoToBackTraining.setOnClickListener(new View.OnClickListener() { // new View.OnClickListener() - этот параметр определяет интерфейс для обратного вызова, который будет вызываться при щелчке на view
            @Override
            // метод обработки событий нажатий для кнопки "спина/плечи"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
                // Для осуществления перехода на trainings создаем сущность
                BackMenuFragment backMenuFragment = new BackMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(backMenuFragment);
            }
        });

        // Кнопка грудь
        // Создаем объект типа "кнопка". Считываем объект btnGoToBreastTraining в fragment trainings, и преобразуем его в кнопку
        Button btnGoToBreastTraining = (Button) view.findViewById(R.id.btnGoToBreastTraining); // объявляем кнопку
        // метод - Создаем слушатель для кнопки btnGoToBreastTraining
        btnGoToBreastTraining.setOnClickListener(new View.OnClickListener() { // new View.OnClickListener() - этот параметр определяет интерфейс для обратного вызова, который будет вызываться при щелчке на view
            @Override
            // метод обработки событий нажатий для кнопки "грудь"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
                // Для осуществления перехода на trainings создаем сущность
                BreastMenuFragment breastMenuFragment = new BreastMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(breastMenuFragment);
            }
        });

        // Кнопка ягодицы
        // Создаем объект типа "кнопка". Считываем объект btnGoToButtocksTraining в fragment trainings, и преобразуем его в кнопку
        Button btnGoToButtocksTraining = (Button) view.findViewById(R.id.btnGoToButtocksTraining); // объявляем кнопку
        // метод - Создаем слушатель для кнопки btnGoToButtocksTraining
        btnGoToButtocksTraining.setOnClickListener(new View.OnClickListener() { // new View.OnClickListener() - этот параметр определяет интерфейс для обратного вызова, который будет вызываться при щелчке на view
            @Override
            // метод обработки событий нажатий для кнопки "ягодицы"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
                // Для осуществления перехода на trainings создаем сущность
                ButtMenuFragment buttMenuFragment = new ButtMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(buttMenuFragment);
            }
        });

        // Кнопка пресс
        // Создаем объект типа "кнопка". Считываем объект btnGoToButtocksTraining в fragment trainings, и преобразуем его в кнопку
        Button btnGoToPressTraining = (Button) view.findViewById(R.id.btnGoToPressTraining); // объявляем кнопку
        // метод - Создаем слушатель для кнопки btnGoToPressTraining
        btnGoToPressTraining.setOnClickListener(new View.OnClickListener() { // new View.OnClickListener() - этот параметр определяет интерфейс для обратного вызова, который будет вызываться при щелчке на view
            @Override
            // метод обработки событий нажатий для кнопки "пресс"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
                // Для осуществления перехода на trainings создаем сущность
                PressMenuFragment pressMenuFragment = new PressMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(pressMenuFragment);
            }
        });



        return view;
    }

}
// Класс фрагмента, реализующий методы отображения макета Здоровья

package com.example.keeping_fit;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class HealthFragment extends Fragment {

    public int count = 0;
    TextView txt;

    @Override
    // Процедура, запускающая activity
    public void onCreate(@Nullable Bundle savedInstanceState) { // параметр Bundle -  это параметр, который представляет собой объект пакета, содержащий ранее сохраненное состояние действия
        super.onCreate(savedInstanceState); // этот метод - это конструктор родительского класса, выполняющий необходимые операции для работы активности
        // параметр savedInstanceState - Это параметр, который представляет собой объект пакета, содержащий ранее сохраненное состояние действия
    }

    @Nullable
    @Override
    // метод для отображения  health_layout во фрагменте HealthFragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // LayoutInflater inflater Это класс, который читает описание внешнего вида xml и преобразует их в объекты View.
        // ViewGroup container Это параметр, который представляет собой контейнер, в которой будет загружаться training-фрагмент.
        // Bundle savedInstanceState Это параметр, который представляет собой объект пакета, содержащий ранее сохраненное состояние действия.

        View view = inflater.inflate(R.layout.health_layout, container, false);

        // кнопка Обновить данные
        // Создаем объект типа "кнопка". Считываем объект btnUpdateData в fragment basic_info, и преобразуем его в кнопку
        Button btnUpdateData = (Button) view.findViewById(R.id.btnUpdateData); // объявляем кнопку
        // метод - Создаем слушатель для кнопки btnUpdateData
        btnUpdateData.setOnClickListener(new View.OnClickListener() { // new View.OnClickListener() - этот параметр определяет интерфейс для обратного вызова, который будет вызываться при щелчке на view
            @Override
            // метод обработки событий нажатий для кнопки "Обновить данные"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
                ActivityMainFragment activityMainFragment = new ActivityMainFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(activityMainFragment);
            }
        });

        // кнопка +
        // Создаем объект типа "кнопка". Считываем объект btnUpdateData и преобразуем его в кнопку
        Button btn_plus = (Button) view.findViewById(R.id.btn_plus); // объявляем кнопку
        // Создаем объект типа TextView. Считываем объект count_glass и преобразуем его в TextView
        txt = (TextView) view.findViewById(R.id.count_glass);
        // метод - Создаем слушатель для кнопки btn_plus
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            // метод обработки событий нажатий для кнопки "+"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
                count++;
                txt.setText("" + count);
            }
        });

        // кнопка -
        // Создаем объект типа "кнопка". Считываем объект btn_minus и преобразуем его в кнопку
        Button btn_minus = (Button) view.findViewById(R.id.btn_minus); // объявляем кнопку
        // метод - Создаем слушатель для кнопки btn_minus
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            // метод обработки событий нажатий для кнопки "-"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
                count--;
                txt.setText("" + count);
            }
        });

        return view;
    }

    public void display(int n) {
        //txt.setText(n);
    }


}
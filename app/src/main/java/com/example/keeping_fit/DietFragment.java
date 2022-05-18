package com.example.keeping_fit;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class DietFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    // метод для отображения  diet_layout во фрагменте DietFragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.diet_layout, container, false);

        // кнопка Сбалансированное питание
        Button btnGoToBalancedDiet = (Button) view.findViewById(R.id.btnGoToBalancedDiet); // объявляем кнопку
        btnGoToBalancedDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DietMenuFragment dietMenuFragment = new DietMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(dietMenuFragment);
            }
        });

        // кнопка Для похудения
        Button btnGoToWeightLoss = (Button) view.findViewById(R.id.btnGoToWeightLoss); // объявляем кнопку
        btnGoToWeightLoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DietMenuFragment dietMenuFragment = new DietMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(dietMenuFragment);
            }
        });

        // кнопка Вегетерианское питание
        Button btnGoToVegDiet = (Button) view.findViewById(R.id.btnGoToVegDiet); // объявляем кнопку
        btnGoToVegDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DietMenuFragment dietMenuFragment = new DietMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(dietMenuFragment);
            }
        });

        return view;
    }
}
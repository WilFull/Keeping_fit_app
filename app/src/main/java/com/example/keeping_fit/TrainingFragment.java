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



    public TrainingFragment() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    // метод для отображения  training_layout во фрагменте TrainingFragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.training_layout, container, false);

        // кнопка "Руки"
        Button btnGoToHandsTraining = (Button) view.findViewById(R.id.btnGoToHandsTraining); // объявляем кнопку
        btnGoToHandsTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandsMenuFragment handsMenuFragment = new HandsMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(handsMenuFragment);
            }
        });

        // кнопка "Ноги"
        Button btnGoToLegsTraining = (Button) view.findViewById(R.id.btnGoToLegsTraining); // объявляем кнопку
        btnGoToLegsTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LegsMenuFragment legsMenuFragment = new LegsMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(legsMenuFragment);
            }
        });

        // Кнопка спина/плечи
        Button btnGoToBackTraining = (Button) view.findViewById(R.id.btnGoToBackTraining); // объявляем кнопку
        btnGoToBackTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackMenuFragment backMenuFragment = new BackMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(backMenuFragment);
            }
        });

        // Кнопка грудь
        Button btnGoToBreastTraining = (Button) view.findViewById(R.id.btnGoToBreastTraining); // объявляем кнопку
        btnGoToBreastTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BreastMenuFragment breastMenuFragment = new BreastMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(breastMenuFragment);
            }
        });

        // Кнопка грудь
        Button btnGoToButtocksTraining = (Button) view.findViewById(R.id.btnGoToButtocksTraining); // объявляем кнопку
        btnGoToButtocksTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ButtMenuFragment buttMenuFragment = new ButtMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(buttMenuFragment);
            }
        });

        return view;
    }

}
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

        Button btnGoToHandsTraining = (Button) view.findViewById(R.id.btnGoToHandsTraining); // объявляем кнопку

        // кнопка "Руки"
        btnGoToHandsTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandsMenuFragment handsMenuFragment = new HandsMenuFragment();
                ((MainMenuActivity)getActivity()).setNewFragment(handsMenuFragment);
            }
        });

        return view;
    }

}
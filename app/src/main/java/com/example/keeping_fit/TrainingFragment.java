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

    @Nullable
    @Override
    // метод для отображения  training_layout во фрагменте TrainingFragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //View view = inflater.inflate(R.layout.training_layout, null);
       // Button btnGoToHandsTraining = (Button) view.findViewById(R.id.btnGoToHandsTraining);

       // View.OnClickListener oclBtnGoToHandsTraining = new View.OnClickListener() {
         //   @Override
        //    public void onClick(View view) {
         //       Intent intent = new Intent(TrainingFragment.this.getActivity(), HealthFragment.class);
           //     startActivity(intent);
         //   }
      //  };
       // btnGoToHandsTraining.setOnClickListener(oclBtnGoToHandsTraining);


        return inflater.inflate(R.layout.training_layout, container, false);
    }

}
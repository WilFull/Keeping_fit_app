package com.example.keeping_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


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
                Intent intent = new Intent(MainActivity.this, BasicInfoActivity.class);
                startActivity(intent); //запускаем переход
            }
        };

        // Назначаем кнопке обработчик
        btnGoToBasicInfo.setOnClickListener(oclBtnGoToBasicInfo);
    }

}
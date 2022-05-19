package com.example.keeping_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private EditText edUserName;
    private DatabaseReference dataBase;
    private String USER_KEY = "User";

    @Override
    // начать activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_info);

        // Считываем объект btnGoToBasicInfo в Activity welcome_screen, и преобразуем его в кнопку
        Button btnСntToMainMenu = (Button) findViewById(R.id.btnСntToMainMenu);
        // Создаем слушатель кнопки
        View.OnClickListener oclBtnСntToMainMenu = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Для осуществления перехода на basic_info создаем некую сущность
                Intent intent = new Intent(MainActivity.this, MainMenuActivity.class);
                startActivity(intent); //запускаем переход
            }
        };
        // Назначаем кнопке обработчик
        btnСntToMainMenu.setOnClickListener(oclBtnСntToMainMenu);

        Button btnSkipToMainMenu = (Button) findViewById(R.id.btnSkipToMainMenu);
        View.OnClickListener oclBtnSkipToMainMenu = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainMenuActivity.class);
                startActivity(intent);
            }
        };
        btnSkipToMainMenu.setOnClickListener(oclBtnSkipToMainMenu);

        init();
    }

    // метод для сохранения данных в бд
    private void onClickSave(View view) {
        String id = dataBase.getKey(); // id нашей бд
        String name = edUserName.getText().toString(); // сохраняем то, что ввел пользователь
       // User user = new User(id, name);
    }

    // метод для присвоения значений переменным EditText
    public void init() {
        edUserName = findViewById(R.id.edUserName);
        dataBase = FirebaseDatabase.getInstance().getReference(USER_KEY);
    }


}
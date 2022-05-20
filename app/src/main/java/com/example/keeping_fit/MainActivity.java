package com.example.keeping_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private EditText edUserName, edUserAge, edUserHit, edUserWeight, f_gender, m_gender;
   // private DatabaseReference dataBase;
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
               // Intent intent = new Intent(MainActivity.this, MainMenuActivity.class);
                //startActivity(intent);
            }
        };
        btnSkipToMainMenu.setOnClickListener(oclBtnSkipToMainMenu);

        init();
    }

    // метод для сохранения данных в бд
    private void onClickSave(View view) {
     //   String id = dataBase.getKey(); // id нашей бд
        String name = edUserName.getText().toString(); // сохраняем то, что ввел пользователь
        String age = edUserAge.getText().toString();
        String hit = edUserHit.getText().toString();
        String weight = edUserWeight.getText().toString();
        String female = f_gender.getText().toString();
        String male = m_gender.getText().toString();
      //  User newUser = new User(id, name, age, hit, weight, female, male);

        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(age) && !TextUtils.isEmpty(hit) && !TextUtils.isEmpty(weight)) {
            //dataBase.push().setValue(newUser);
            Toast.makeText(this, "Сохранено", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Вы ввели не все данные", Toast.LENGTH_SHORT).show();
        }

       // dataBase.push().setValue(newUser);
    }

    // метод для присвоения значений переменным EditText
    public void init() {
        edUserName = findViewById(R.id.edUserName);
        edUserAge = findViewById(R.id.edUserAge);
        edUserHit = findViewById(R.id.edUserHit);
        edUserWeight = findViewById(R.id.edUserWeight);
        f_gender = findViewById(R.id.f_gender);
        m_gender = findViewById(R.id.m_gender);
       // dataBase = FirebaseDatabase.getInstance("https://keeping-fit-e8c60-default-rtdb.asia-southeast1.firebasedatabase.app").getReference(USER_KEY);
    }


}
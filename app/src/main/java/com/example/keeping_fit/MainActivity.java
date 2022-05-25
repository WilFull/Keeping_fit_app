// Класс, являющийся фундаметальным строительным блоком. Активити для макета Экрана регистрации

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
    // Процедура, запускающая activity
    protected void onCreate(Bundle savedInstanceState) { // параметр Bundle -  это параметр, который представляет собой объект пакета, содержащий ранее сохраненное состояние действия
        super.onCreate(savedInstanceState); // этот метод - это конструктор родительского класса, выполняющий необходимые операции для работы активности
                                            // параметр savedInstanceState - Это параметр, который представляет собой объект пакета, содержащий ранее сохраненное состояние действия
        setContentView(R.layout.basic_info); // метод - Объект класса вызывающий процедуру для поиска объекта view по id
                                            // парметр R.layout.basic_info - Ссылка на экран регистрации

        // Создаем объект типа "кнопка". Считываем объект btnGoToBasicInfo в Activity main_menu, и преобразуем его в кнопку
        Button btnСntToMainMenu = (Button) findViewById(R.id.btnСntToMainMenu);
        // метод - Создаем слушатель для кнопки btnСntToMainMenu
        View.OnClickListener oclBtnСntToMainMenu = new View.OnClickListener() {
            @Override
            // метод обработки событий нажатий для кнопки "Продолжить"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
                // Для осуществления перехода на main_menu создаем сущность
                Intent intent = new Intent(MainActivity.this, MainMenuActivity.class);
                startActivity(intent); // метод, запускающий переход
            }
        };
        //метод (объект класса, вызывающие метод). Назначаем кнопке обработчик
        btnСntToMainMenu.setOnClickListener(oclBtnСntToMainMenu);

        // Создаем объект типа "кнопка". Считываем объект btnSkipToMainMenu в Activity main_menu, и преобразуем его в кнопку
        Button btnSkipToMainMenu = (Button) findViewById(R.id.btnSkipToMainMenu);
        // метод - Создаем слушатель для кнопки btnSkipToMainMenu
        View.OnClickListener oclBtnSkipToMainMenu = new View.OnClickListener() {
            @Override
            //  метод обработки событий нажатий для кнопки "Пропустить"
            public void onClick(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
               Intent intent = new Intent(MainActivity.this, MainMenuActivity.class); // Для осуществления перехода на main_menu создаем сущность
               startActivity(intent); // метод, запускающий переход
            }
        };
        //метод (объект класса, вызывающие метод). Назначаем кнопке обработчик
        btnSkipToMainMenu.setOnClickListener(oclBtnSkipToMainMenu);

        init(); // вызываем метод для присвоения значений переменным EditText
    }

    // метод для сохранения данных в бд
    private void onClickSave(View view) { // View view -  объект, являющийся основным строительным элементом элементов пользовательского интерфейса
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
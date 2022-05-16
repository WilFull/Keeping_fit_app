package com.example.keeping_fit;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicInfo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_info);

        Button btnСntToMainMenu = (Button) findViewById(R.id.btnСntToMainMenu);
        View.OnClickListener oclBtnСntToMainMenu = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicInfo.this, MainMenu.class);
                startActivity(intent);
            }
        };
        btnСntToMainMenu.setOnClickListener(oclBtnСntToMainMenu);

        Button btnSkipToMainMenu = (Button) findViewById(R.id.btnSkipToMainMenu);
        View.OnClickListener oclBtnSkipToMainMenu = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicInfo.this, MainActivity.class);
                startActivity(intent);
            }
        };
        btnSkipToMainMenu.setOnClickListener(oclBtnSkipToMainMenu);
    }

}

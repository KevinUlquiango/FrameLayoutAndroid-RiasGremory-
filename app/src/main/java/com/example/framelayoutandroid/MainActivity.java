package com.example.framelayoutandroid;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    private ImageView belleza;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        belleza = findViewById(R.id.img_belleza);
        button1 = findViewById(R.id.btn_belleza);
    }

    public void ocultar(View view){
        button1.setVisibility(View.INVISIBLE);
        belleza.setVisibility(View.VISIBLE);
    }
}
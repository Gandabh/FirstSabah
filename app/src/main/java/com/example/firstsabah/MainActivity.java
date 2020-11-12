package com.example.firstsabah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnClickEvent(View view) {

            TextView tv=findViewById(R.id.tvHelloWorld);
            tv.setText("YOU CLICKED BUTTON");

        Toast.makeText(this, "Message for you !!", Toast.LENGTH_LONG).show();



    }

    public void btnimgClicked(View view) {
        ImageButton imgBtn=findViewById(R.id.imgBtn);
        imgBtn.setImageResource(R.drawable.ic_person);
    }
}
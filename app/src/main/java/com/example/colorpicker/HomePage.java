package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        Button buttonForWheels=findViewById(R.id.colorWheel);
        buttonForWheels.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openColorWheel();
            }
        });
    }

    public void openColorWheel(){
        Intent intent=new Intent(this, ColorWheel.class);
        startActivity(intent);
    }
}
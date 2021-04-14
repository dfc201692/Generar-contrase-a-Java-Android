package com.example.generarpass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = (TextView)findViewById(R.id.password);
        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            password.setText(generateString(8));
            }
        });

    }

    private String generateString (int length){
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<length; i++)
        {
            char c = chars[r.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }


}
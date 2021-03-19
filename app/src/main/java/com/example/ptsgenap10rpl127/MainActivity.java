package com.example.ptsgenap10rpl127;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText emailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

        EditText emailText = (EditText)findViewById(R.id.emailText);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailText.getText().toString();

                if (email.equalsIgnoreCase("rasyid")) {

                }

                Intent intent = new Intent(MainActivity.this, Page2.class);
                startActivity(intent);


            }
        });

    }

}
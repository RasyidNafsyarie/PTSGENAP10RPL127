package com.example.ptsgenap10rpl127;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {
    Button btn;
    EditText passwordKu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        EditText passwordKu = (EditText)findViewById(R.id.passwordKu);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent receiveIntent = getIntent();
                Bundle bundle = receiveIntent.getExtras();

                String password = passwordKu.getText().toString();

                if (password.equalsIgnoreCase("12345")) {
                    Toast.makeText(Page2.this, "Sukses Login", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(Page2.this, "Toast", Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(Page2.this, DashboardMenu.class);
                startActivity(intent);


            }
        });


    }
}
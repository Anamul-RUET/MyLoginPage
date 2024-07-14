package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userID;
    EditText password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userID=findViewById(R.id.userID);
        password=findViewById(R.id.password);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userID.getText().toString().equals("Anamul") && password.getText().toString().equals("4321")){
                    Toast.makeText(MainActivity.this, "Login sucessfully", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Invalid User ID or incorrect password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
package com.example.lab1_nuratiqah;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = findViewById(R.id.textView);
        submitButton = findViewById(R.id.button);
        etName = findViewById(R.id.editText);
    }

    public void displayText(View view) {

        String name = etName.getText().toString();

        tvMessage.setText("Welcome " + name);

        Toast.makeText(this, "HELLO", Toast.LENGTH_SHORT).show();
    }
}
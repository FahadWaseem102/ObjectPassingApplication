package com.example.fahad.objectpassingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView textView_result ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Student student = (Student) getIntent().getSerializableExtra("Data");
        textView_result = findViewById(R.id.textView_result) ;
        textView_result.setText(student.toString());
        Toast.makeText(this, "Registered Successfully !", Toast.LENGTH_SHORT).show();
    }
}

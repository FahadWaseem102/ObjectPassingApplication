package com.example.fahad.objectpassingapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et_name, et_father_name, et_city, et_age, et_rollno;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBounds();
    }

    public void setBounds() {
        et_name = findViewById(R.id.et_name);
        et_father_name = findViewById(R.id.et_father);
        et_city = findViewById(R.id.et_city);
        et_age = findViewById(R.id.et_age);
        et_rollno = findViewById(R.id.et_roll);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        Student student = new Student();
        student.setName(et_name.getText().toString());
        student.setFathers_name(et_father_name.getText().toString());
        student.setCity(et_city.getText().toString());
        student.setAge(Integer.parseInt(et_age.getText().toString()));
        student.setRoll_no(Integer.parseInt(et_rollno.getText().toString()));
        intent.putExtra("Data", student);
        startActivity(intent);

        et_name.setText("");
        et_father_name.setText("");
        et_rollno.setText("");
        et_age.setText("");
        et_city.setText("");
    }
}

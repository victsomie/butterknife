package com.example.admin.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // Binding views
    @BindView(R.id.tv_title)
    TextView title;

    @BindView(R.id.et_input)
    EditText input;

    @BindView(R.id.btn_submit)
    Button update;

    // Binding a method
    @OnClick(R.id.btn_submit) void update(){

        // Do somethinge here
        if (!input.getText().toString().isEmpty()){
            title.setText(input.getText().toString());
        }
        else {
            Toast.makeText(this, "Please enter some text", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // You won't cut anything if you wont pick the knife like below
        ButterKnife.bind(this);


        //update();

    }
}

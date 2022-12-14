package com.example.minitwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSingUp;
    TextView tvGoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();

        btnSingUp = findViewById(R.id.buttonSignUp);
        tvGoLogin = findViewById(R.id.textViewGoLogin);

        btnSingUp.setOnClickListener(this);
        tvGoLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.buttonSignUp:
                break;
            case R.id.textViewGoLogin:
                goToSignUp();
                break;

        }
    }

    private void goToSignUp() {
        Intent i = new Intent(SignUpActivity.this, MainActivity.class);
        startActivity(i);
    }
}
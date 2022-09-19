package com.example.minitwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit.MiniTwitterCliente;
import retrofit.MiniTwitterService;
import retrofit.request.RequestLogin;
import retrofit.response.ResponseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin;
    TextView tvGoSignUp;
    EditText editEmail, editPassword;
    MiniTwitterCliente miniTwitterCliente;
    MiniTwitterService miniTwitterService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        
        retrofitInit();
        findViews();
        events();

        btnLogin.setOnClickListener(this);
        tvGoSignUp.setOnClickListener(this);

    }

    private void retrofitInit() {
        miniTwitterCliente = MiniTwitterCliente.getInstance();
        miniTwitterService = miniTwitterCliente.getMiniTwitterService();
    }


    private void findViews() {
        editEmail = findViewById(R.id.editTextEmail);
        editPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.buttonLogin);
        tvGoSignUp = findViewById(R.id.textViewGoSignUp);
    }

    private void events() {
    }

    @Override
    public void onClick(View v){
        int id = v.getId();

        switch (id){
            case R.id.buttonLogin:
                goToLogin();
                break;
            case R.id.textViewGoSignUp:
                goToSignUp();
                break;

        }
    }

    private void goToLogin() {
        String email = editEmail.getText().toString();
        String password = editPassword.getText().toString();

        if(email.isEmpty()){
            editEmail.setError("El email es requerido");
        } else if(password.isEmpty()){
            editPassword.setError("La contraseña es requerida");
        } else {
            RequestLogin requestLogin = new RequestLogin(email, password);
            Call<ResponseAuth> call = miniTwitterService.doLogin(requestLogin);
        }

    }

    private void goToSignUp() {
        Intent i = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(i);
        finish();
    }

}
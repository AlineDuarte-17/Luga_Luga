package com.example.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lugaluga.R;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private Button buttonLogin;
    private TextInputLayout inputEmail, inputSenha;

    private TextView fazerCadastro;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputEmail = findViewById(R.id.input_email);
        inputSenha = findViewById(R.id.input_senha);
        buttonLogin = findViewById(R.id.btn1);
        fazerCadastro = findViewById(R.id.Cadastrar);

        buttonLogin = findViewById(R.id.btn1);
        Intent intent = new Intent(this, MainActivity2.class);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validaEmailSenha()) {
                    startActivity(intent);
                }
            }
        });

        Intent intentCadastro = new Intent(this, CadastroUsuario_activity.class);
        fazerCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentCadastro);

            }
        });

    }

    public boolean validaEmailSenha(){
        if (inputEmail.getEditText() != null
                && inputEmail.getEditText().getText().toString().equals("")){
            inputEmail.setError("Informe o email");
           return false;
        }

        if (inputSenha.getEditText() != null
                && inputSenha.getEditText().getText().toString().equals("")) {
            inputSenha.setError("Informe a senha");
          return true;

        }
        return true;
    }


}




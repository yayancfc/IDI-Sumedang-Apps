package com.yayanheryanto.hallobayawak.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.yayanheryanto.hallobayawak.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void openRegister(View view) {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    public void openMainActivity(View view) {
        EditText txtUsername = findViewById(R.id.txtUsername);
        EditText txtPassword = findViewById(R.id.txtPassword);
        String username = txtUsername.getText().toString();
        String passsword = txtPassword.getText().toString();
        Intent intent = null;
        if (username.equals("") || passsword.equals("")){
            Toast.makeText(this, "Username dan Password Harus Diisi", Toast.LENGTH_SHORT).show();
        }else if (username.equals("user") && passsword.equals("user")){
            intent = new Intent(LoginActivity.this, MainActivity.class);
            finish();
            startActivity(intent);
        }else if (username.equals("dokter") && passsword.equals("dokter")){
            intent = new Intent(LoginActivity.this, DoctorActivity.class);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
        }
    }

}

package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    private EditText etFullName, etEmail, etPassword, etConfirmPassword;
    private Button btnSignup;
    public static String email,password,name;

    public Button getBtnSignup() {
        return btnSignup;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        findView();
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isValidInput();
            }
        });
    }

    private void findView() {
        etFullName = findViewById(R.id.edit_text_fullname);
        etEmail = findViewById(R.id.edit_text_email);
        etPassword = findViewById(R.id.edit_text_password);
        etConfirmPassword = findViewById(R.id.edit_text_confirm_password);
        btnSignup = findViewById(R.id.button_signup);
    }

    private boolean isValidInput() {
        if(TextUtils.isEmpty(etEmail.getText().toString()))
            etEmail.setError("Email is required");
        else
            email = etEmail.getText().toString();
        if(TextUtils.isEmpty(etPassword.getText().toString()))
            etPassword.setError("Password is required");
        if(TextUtils.isEmpty(etConfirmPassword.getText().toString()))
            etConfirmPassword.setError("Password is required");
        if(!(etConfirmPassword.getText().toString().equals(etPassword.getText().toString())))
            Toast.makeText(this, "Password don't match!!", Toast.LENGTH_SHORT).show();
        else
            password = etPassword.getText().toString();
        if(TextUtils.isEmpty(etFullName.getText().toString()))
            etFullName.setError("Name is required");
        else
            name = etFullName.getText().toString();
        return true;
    }
}

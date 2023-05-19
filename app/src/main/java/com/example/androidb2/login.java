package com.example.androidb2;
import android.widget.Toast;

import com.example.login.LoginActivity;
public class login extends LoginActivity{
    private String email;
    private String password;

    @Override
    protected void checkLoginData() {
        email = LoginActivity.email;
        password = LoginActivity.password;
        if(email.equals("bar@gmail.com")&&password.equals("1234")){
            Toast.makeText(login.this,"Login good",Toast.LENGTH_LONG);
        }
    }
}

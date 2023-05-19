package com.example.androidb2;

import android.widget.Toast;

import com.example.login.SignupActivity;

public class Signup extends SignupActivity {
    private String email,password,name;
    @Override
    protected void checkLoginData() {
        email = SignupActivity.email;
        password = SignupActivity.password;
        name = SignupActivity.name;
        if(email.equals("bar@gmail.com")&&password.equals("1234") && name.equals("bar")){
            Toast.makeText(Signup.this,"Signup good",Toast.LENGTH_LONG);
        }
    }
}

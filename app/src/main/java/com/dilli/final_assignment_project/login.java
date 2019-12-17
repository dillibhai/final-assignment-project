package com.dilli.final_assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText etusername,etpassword;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etusername = findViewById(R.id.etusername);
        etpassword = findViewById(R.id.etpassword);

        login = findViewById(R.id.btnlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUser(etusername.getText().toString(), etpassword.getText().toString());
            }
        });
    }
    public void checkUser(String userName, String userPassword){
        if((userName.equals("dilli")) && (userPassword.equals("bhandari"))){
            Intent intent = new Intent(login.this,dashboard.class);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(login.this,"Invalid username or password",Toast.LENGTH_SHORT).show();
        }
    }
}

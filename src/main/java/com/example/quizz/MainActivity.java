package com.example.quizz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button login;
    TextView toregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        login=findViewById(R.id.buttonlogin);
        toregister=findViewById(R.id.textRegister);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                email=findViewById(R.id.EmailLogin);
                password=findViewById(R.id.LoginPassword);


            }
        });


        toregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Register.class));
            }
        });

    }

//    private void userLogin() {
//
//        String mail = email.toString();
//        String pass = password.toString();
//        FirebaseAuth mAuth = FirebaseAuth.getInstance();
//        mAuth.signInWithEmailAndPassword(mail, pass)
//                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//
//                        if (task.isSuccessful())
//                        {
//                            startActivity(new Intent(MainActivity.this,Quiz1.class));
//
//                        }
//                        else
//                        {
//                            Toast.makeText(MainActivity.this, "Authentication failed.", Toast.LENGTH_LONG).show();
//                        }
//                    }
//
//
//                });






    }

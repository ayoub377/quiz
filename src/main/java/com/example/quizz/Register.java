package com.example.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    EditText name,email,password,confirmpassword;
    Button register;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        name=findViewById(R.id.Name);
        confirmpassword=findViewById(R.id.ConfirmPasswordRegister);
        register=findViewById(R.id.buttonregister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=findViewById(R.id.EmailRegister);
                password=findViewById(R.id.PasswordRegister);
                if(TextUtils.isEmpty(email.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Email ne doit pas etre null !!",Toast.LENGTH_LONG).show();
                }
                if(TextUtils.isEmpty(name.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Name ne doit pas etre null !!",Toast.LENGTH_LONG).show();
                }
                if(TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Password ne doit pas etre null !!",Toast.LENGTH_LONG).show();
                }
                if(TextUtils.isEmpty(confirmpassword.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Confirm password ne doit pas etre null !!",Toast.LENGTH_LONG).show();
                }
                if(!confirmpassword.getText().toString().equals(password.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Les deux mots de passe ne sont pas egaux !!!!!",Toast.LENGTH_LONG).show();
                }
                mAuth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString()).addOnCompleteListener(Register.this, task -> {

                    if(task.isSuccessful())
                    {
                        Toast.makeText(getApplicationContext(),"Successful ",Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Register.this,Quiz1.class));

                    }
                    else{
                        Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();
                    }

                });
            }
        });
    }
}
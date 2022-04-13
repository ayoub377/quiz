package com.example.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz1 extends AppCompatActivity {
    public int Score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        Button suivant_q1 = findViewById(R.id.button1);

        EditText number_score;
        number_score = findViewById(R.id.Score);
        number_score.setText(String.valueOf(Score));


        suivant_q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton ans = findViewById(R.id.radioButton);
                if(ans.getText().toString().equals("Vrai"))
                {
                    Score++;
                }
                Intent intent = new Intent(Quiz1.this, Quiz2.class);
                intent.putExtra("Score", Score);
                startActivity(intent);

            }
        });

    }
}

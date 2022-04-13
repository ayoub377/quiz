package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Quiz2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        EditText score_text = findViewById(R.id.Score2);
        Button suivant_q2 = findViewById(R.id.button2);
        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("Score");
        score_text.setText(String.valueOf(score));

        suivant_q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Score = bundle.getInt("score");
                RadioButton ans = findViewById(R.id.radioButton);
                if(ans.getText().toString().equals("Vrai"))
                {
                    Score++;
                }
                Intent intent = new Intent(Quiz2.this, Quiz3.class);
                intent.putExtra("Score", Score);
                startActivity(intent);


            }
        });


    }


}
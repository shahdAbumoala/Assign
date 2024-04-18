package com.example.assign;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    private RadioGroup radiogroup1 , radiogroup2 ;
    private RadioButton radioButton11, radioButton12 , radioButton21 , radioButton22 ;

    private TextView txtviewresult ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        radiogroup1 = findViewById(R.id.radiogroup1);
        radiogroup2 = findViewById(R.id.radiogroup2);
        radioButton11 = findViewById(R.id.radiobutton11);
        radioButton12 = findViewById(R.id.radiobutton12);
        radioButton21 = findViewById(R.id.radiobutton21);
        radioButton22 = findViewById(R.id.radiobutton22);
        txtviewresult = findViewById(R.id.txtviewresult);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btnCheckOnClick(View view) {
        int selectedId1 = radiogroup1.getCheckedRadioButtonId();
        int selectedId2 = radiogroup2.getCheckedRadioButtonId();
        if (selectedId1 == -1 && selectedId2 == -1 ) {
            // No radio button is checked
            Toast.makeText(this, "the Two qustion not solve", Toast.LENGTH_SHORT).show();
        } else {
            RadioButton selectedRadioButton1 = findViewById(selectedId1);
            RadioButton selectedRadioButton2 = findViewById(selectedId2);
            if (selectedRadioButton1 == radioButton11 && selectedRadioButton2 == radioButton22) {
                // Correct answer selected
                txtviewresult.setText("Excellent, got a full mark");
            } else if (selectedRadioButton1 == radioButton11 && selectedRadioButton2 == radioButton21) {
                // Incorrect answer selected
                txtviewresult.setText("Good, you got half the mark. But The answer to the second question is wrong");
            } else if (selectedRadioButton1 == radioButton12 && selectedRadioButton2 == radioButton22) {
                // Incorrect answer selected
                txtviewresult.setText("Good, you got half the mark. But The answer to the First question is wrong");
            } else if (selectedRadioButton1 == radioButton11 && selectedId2 == -1) {
                // Incorrect answer selected
                txtviewresult.setText("Good, you got half the mark because the first qustion true but second qustion not solve ");
            } else  if (selectedRadioButton1 == radioButton12 && selectedId2 == -1) {
                // Incorrect answer selected
                txtviewresult.setText("Unfortunately, you got a zero mark because the first qustion false and second qustion not solve ");
        } else if (selectedId1 == -1 && selectedRadioButton2 == radioButton22) {
            // Incorrect answer selected
            txtviewresult.setText("Good, you got half the mark because the second qustion true but first qustion not solve ");
        } else  if (selectedId1 == -1  && selectedRadioButton2 == radioButton21) {
            // Incorrect answer selected
            txtviewresult.setText("Unfortunately, you got a zero mark because the second qustion false and first qustion not solve ");
        }else{
                    txtviewresult.setText("Unfortunately, you got a zero mark");
                }
            }
    }
}
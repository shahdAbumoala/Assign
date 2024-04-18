package com.example.assign;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {
    private Spinner spinner5 ;
    private TextView txtViewD5 ;
    private Button btnBack5 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        spinner5 = findViewById(R.id.spinner5);
        txtViewD5 = findViewById(R.id.txtViewD5);
        btnBack5 = findViewById(R.id.btnBack5);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btnSumitOnClick5(View view) {
        String description ;
        String item = spinner5.getSelectedItem().toString();
        if(item.equals("jbMuscle strain")){
            description = "It is a type of muscle injury that ranges in severity from mild injuries resulting from excessive muscle stretching, to severe injuries that may be a complete or partial tear in the muscle tissue. It is common for muscle strains to occur in the lower back and the back of the thigh.";
            txtViewD5.setText(description);
        }else if (item.equals("Muscle cramps")){
            description = "Or muscle spasms, which is one of the common and involuntary injuries that appear as contractions and tension that causes pain in the muscles, and the muscles most affected by muscle spasms are: the thigh, hands, feet, arms, abdomen, and calf (the back of the leg).";
            txtViewD5.setText(description);
        }
    }
}
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

public class MainActivity3 extends AppCompatActivity {
private Spinner spinner ;
private TextView txtViewD ;
private Button btnBack ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        spinner = findViewById(R.id.spinner);
        txtViewD = findViewById(R.id.txtViewD);
        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btnSumitOnClick(View view) {
        String description ;
        String item = spinner.getSelectedItem().toString();
        if(item.equals("Smooth Muscles")){
            description = "Smooth muscles are found in the walls of hollow internal organs such as the bladder, uterus, blood vessels, digestive canal, and respiratory passages. They are muscles that contract involuntarily, and their slow, coordinated contractions cannot be controlled.";
            txtViewD.setText(description);
        }else if (item.equals("Skeletal Muscles")){
            description = "The skeletal muscles associated with the bones of the body move voluntarily and consciously by the person, and these muscles are responsible for skeletal movements.";
            txtViewD.setText(description);
        }else if (item.equals("Cardiac Muscles")){
            description = "The heart muscle - which has involuntary movement - forms the walls of its chambers, maintains its regular beats and pumps blood forcefully through the body. This happens under the control of the automatic nervous system. [5] [6] The heart muscle is classified as one of the hardest working muscles. And regularity in the body, especially since it pumps more than 7,500 liters of blood per day.";
            txtViewD.setText(description);
        }
    }

    public void btnBackOnClick(View view) {

    }
}
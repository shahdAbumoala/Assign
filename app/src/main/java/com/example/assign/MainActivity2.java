package com.example.assign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtShowMessage ;
    private ListView listview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        listview = findViewById(R.id.listview);

        Intent intent = getIntent();
        txtShowMessage = findViewById(R.id.txtShowMessage);
        String msg = intent.getStringExtra("data");
        String msg2 = "Hi " + msg + " , let's learn about the muscular system. Then there is a short quiz to test your understanding" ;
        txtShowMessage.setText(msg2);

        List <String> list = new ArrayList<>();
        list.add(" Type of muscles ");
        list.add(" Muscular system injuries ");
        list.add(" Quize ");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext() , android.R.layout.simple_list_item_1 , list);
        listview.setAdapter(arrayAdapter);
        // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
         //   Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
           // v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            //return insets;
        //});
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(MainActivity2.this , MainActivity3.class));
                }else
                    if (position==1){
                        startActivity(new Intent(MainActivity2.this , MainActivity5.class));
                    }else {
                        startActivity(new Intent(MainActivity2.this , MainActivity4.class));
                    }
            }
        });

    }
}
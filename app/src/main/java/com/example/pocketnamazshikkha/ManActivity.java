package com.example.pocketnamazshikkha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ManActivity extends AppCompatActivity implements View.OnClickListener {
    Button option1, option2, option3, option4, option5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man);

        option1 = findViewById(R.id.homeButton_1_id);
        option2 = findViewById(R.id.homeButton_2_id);
        option3 = findViewById(R.id.homeButton_3_id);
        option4 = findViewById(R.id.homeButton_4_id);
        option5 = findViewById(R.id.homeButton_5_id);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);
        option5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.homeButton_1_id) {
            Intent intent = new Intent(getApplicationContext(), Option1Activity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.homeButton_2_id) {
            Intent intent = new Intent(getApplicationContext(), Option2Activity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.homeButton_3_id) {
            Intent intent = new Intent(getApplicationContext(), Option3Activity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.homeButton_4_id) {
            Intent intent = new Intent(getApplicationContext(), Option4Activity.class);
            intent.putExtra("name", "namazNiyom");
            startActivity(intent);

        } else if (v.getId() == R.id.homeButton_5_id) {
            Intent intent = new Intent(getApplicationContext(), Option5Activity.class);
            startActivity(intent);

        }

    }
}

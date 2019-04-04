package com.example.pocketnamazshikkha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Option1Activity extends AppCompatActivity implements View.OnClickListener {

    Button option1_bt_1, option1_bt_2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);

        option1_bt_1 = findViewById(R.id.option1_Button_1_id);
        option1_bt_2 = findViewById(R.id.option1_Button_2_id);

        option1_bt_2.setOnClickListener(this);
        option1_bt_1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.option1_Button_1_id) {
            intent = new Intent(getApplicationContext(), GosolActivity_Option1.class);
            intent.putExtra("name", "gosol_details");
            startActivity(intent);

        }
        if (v.getId() == R.id.option1_Button_2_id) {
            intent = new Intent(getApplicationContext(), GosolActivity_Option1.class);
            intent.putExtra("name", "oju_details");
            startActivity(intent);

        }

    }
}

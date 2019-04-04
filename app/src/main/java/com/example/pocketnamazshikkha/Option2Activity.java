package com.example.pocketnamazshikkha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Option2Activity extends AppCompatActivity implements View.OnClickListener {

    Button option2_bt_1, option2_bt_2, option2_bt_3, option2_bt_4, option2_bt_5;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2);

        option2_bt_1 = findViewById(R.id.option2_Button_1_id);
        option2_bt_2 = findViewById(R.id.option2_Button_2_id);
        option2_bt_3 = findViewById(R.id.option2_Button_3_id);
        option2_bt_4 = findViewById(R.id.option2_Button_4_id);
        option2_bt_5 = findViewById(R.id.option2_Button_5_id);

        option2_bt_1.setOnClickListener(this);
        option2_bt_2.setOnClickListener(this);
        option2_bt_3.setOnClickListener(this);
        option2_bt_4.setOnClickListener(this);
        option2_bt_5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.option2_Button_1_id) {
            intent = new Intent(getApplicationContext(), Option2TextActivity.class);
            intent.putExtra("name", "Fozor");
            startActivity(intent);

        } else if (v.getId() == R.id.option2_Button_2_id) {
            intent = new Intent(getApplicationContext(), Option2TextActivity.class);
            intent.putExtra("name", "Zohor");
            startActivity(intent);
        } else if (v.getId() == R.id.option2_Button_3_id) {
            intent = new Intent(getApplicationContext(), Option2TextActivity.class);
            intent.putExtra("name", "Asor");
            startActivity(intent);
        } else if (v.getId() == R.id.option2_Button_4_id) {
            intent = new Intent(getApplicationContext(), Option2TextActivity.class);
            intent.putExtra("name", "Magrib");
            startActivity(intent);
        } else if (v.getId() == R.id.option2_Button_5_id) {

            intent = new Intent(getApplicationContext(), Option2TextActivity.class);
            intent.putExtra("name", "Eshar");
            startActivity(intent);
        }

    }
}

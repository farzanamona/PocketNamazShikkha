package com.example.pocketnamazshikkha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Option5Activity extends AppCompatActivity implements View.OnClickListener {
    Button option5_bt_1, option5_bt_2, option5_bt_3, option5_bt_4, option5_bt_5, option5_bt_6, option5_bt_7, option5_bt_8, option5_bt_9, option5_bt_10;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option5);

        option5_bt_1 = findViewById(R.id.option5_Button_1_id);
        option5_bt_2 = findViewById(R.id.option5_Button_2_id);
        option5_bt_3 = findViewById(R.id.option5_Button_3_id);
        option5_bt_4 = findViewById(R.id.option5_Button_4_id);
        option5_bt_5 = findViewById(R.id.option5_Button_5_id);
        option5_bt_6 = findViewById(R.id.option5_Button_6_id);
        option5_bt_7 = findViewById(R.id.option5_Button_7_id);
        option5_bt_8 = findViewById(R.id.option5_Button_8_id);
        option5_bt_9 = findViewById(R.id.option5_Button_9_id);
        option5_bt_10 = findViewById(R.id.option5_Button_10_id);

        option5_bt_1.setOnClickListener(this);
        option5_bt_2.setOnClickListener(this);
        option5_bt_3.setOnClickListener(this);
        option5_bt_4.setOnClickListener(this);
        option5_bt_5.setOnClickListener(this);
        option5_bt_6.setOnClickListener(this);
        option5_bt_7.setOnClickListener(this);
        option5_bt_8.setOnClickListener(this);
        option5_bt_9.setOnClickListener(this);
        option5_bt_10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.option5_Button_1_id) {
            intent = new Intent(getApplicationContext(), Option5TextActivity.class);
            intent.putExtra("name", "Sura1");
            startActivity(intent);

        } else if (v.getId() == R.id.option5_Button_2_id) {
            intent = new Intent(getApplicationContext(), Option5TextActivity.class);
            intent.putExtra("name", "Sura2");
            startActivity(intent);
        } else if (v.getId() == R.id.option5_Button_3_id) {
            intent = new Intent(getApplicationContext(), Option5TextActivity.class);
            intent.putExtra("name", "Sura3");
            startActivity(intent);
        } else if (v.getId() == R.id.option5_Button_4_id) {
            intent = new Intent(getApplicationContext(), Option5TextActivity.class);
            intent.putExtra("name", "Sura4");
            startActivity(intent);
        } else if (v.getId() == R.id.option5_Button_5_id) {

            intent = new Intent(getApplicationContext(), Option5TextActivity.class);
            intent.putExtra("name", "Sura5");
            startActivity(intent);
        } else if (v.getId() == R.id.option5_Button_6_id) {

            intent = new Intent(getApplicationContext(), Option5TextActivity.class);
            intent.putExtra("name", "Sura6");
            startActivity(intent);
        } else if (v.getId() == R.id.option5_Button_7_id) {
            intent = new Intent(getApplicationContext(), Option5TextActivity.class);
            intent.putExtra("name", "Sura7");
            startActivity(intent);
        } else if (v.getId() == R.id.option5_Button_8_id) {
            intent = new Intent(getApplicationContext(), Option5TextActivity.class);
            intent.putExtra("name", "Sura8");
            startActivity(intent);
        } else if (v.getId() == R.id.option5_Button_9_id) {
            intent = new Intent(getApplicationContext(), Option5TextActivity.class);
            intent.putExtra("name", "Sura9");
            startActivity(intent);
        } else if (v.getId() == R.id.option5_Button_10_id) {
            intent = new Intent(getApplicationContext(), Option5TextActivity.class);
            intent.putExtra("name", "Sura10");
            startActivity(intent);
        }

    }
}


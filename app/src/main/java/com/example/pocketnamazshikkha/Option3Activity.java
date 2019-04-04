package com.example.pocketnamazshikkha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Option3Activity extends AppCompatActivity implements View.OnClickListener {
    Button option3_bt_1, option3_bt_2, option3_bt_3, option3_bt_4, option3_bt_5, option3_bt_6;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option3);

        option3_bt_1 = findViewById(R.id.option3_Button_1_id);
        option3_bt_2 = findViewById(R.id.option3_Button_2_id);
        option3_bt_3 = findViewById(R.id.option3_Button_3_id);
        option3_bt_4 = findViewById(R.id.option3_Button_4_id);
        option3_bt_5 = findViewById(R.id.option3_Button_5_id);
        option3_bt_6 = findViewById(R.id.option3_Button_6_id);

        option3_bt_1.setOnClickListener(this);
        option3_bt_2.setOnClickListener(this);
        option3_bt_3.setOnClickListener(this);
        option3_bt_4.setOnClickListener(this);
        option3_bt_5.setOnClickListener(this);
        option3_bt_6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.option3_Button_1_id) {
            intent = new Intent(getApplicationContext(), Option3TextActivity.class);
            intent.putExtra("name", "FozorN");
            startActivity(intent);

        } else if (v.getId() == R.id.option3_Button_2_id) {
            intent = new Intent(getApplicationContext(), Option3TextActivity.class);
            intent.putExtra("name", "ZohorN");
            startActivity(intent);
        } else if (v.getId() == R.id.option3_Button_3_id) {
            intent = new Intent(getApplicationContext(), Option3TextActivity.class);
            intent.putExtra("name", "AsorN");
            startActivity(intent);
        } else if (v.getId() == R.id.option3_Button_4_id) {
            intent = new Intent(getApplicationContext(), Option3TextActivity.class);
            intent.putExtra("name", "MagribN");
            startActivity(intent);
        } else if (v.getId() == R.id.option3_Button_5_id) {

            intent = new Intent(getApplicationContext(), Option3TextActivity.class);
            intent.putExtra("name", "EsharN");
            startActivity(intent);
        } else if (v.getId() == R.id.option3_Button_6_id) {

            intent = new Intent(getApplicationContext(), Option3TextActivity.class);
            intent.putExtra("name", "Other");
            startActivity(intent);
        }
    }
}

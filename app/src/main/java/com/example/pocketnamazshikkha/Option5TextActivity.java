package com.example.pocketnamazshikkha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Option5TextActivity extends AppCompatActivity {
    TextView option5TextDtails1, option5TextDtails2, option5TextDtails3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option5_text);

        option5TextDtails1 = findViewById(R.id.option5_textView1_id);
        option5TextDtails2 = findViewById(R.id.option5_textView2_id);
        option5TextDtails3 = findViewById(R.id.option5_textView3_id);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String namazSuraAll = bundle.getString("name");
            showDetails(namazSuraAll);
        }
    }

    private void showDetails(String namazSuraAll) {

        if (namazSuraAll.equals("Sura1")) {
            option5TextDtails1.setText(R.string.sura1);
            option5TextDtails2.setText(R.string.sura11);

        }

        if (namazSuraAll.equals("Sura2")) {
            option5TextDtails1.setText(R.string.sura2);
            option5TextDtails2.setText(R.string.sura22);
        }

        if (namazSuraAll.equals("Sura3")) {
            option5TextDtails1.setText(R.string.sura3);
            option5TextDtails2.setText(R.string.sura33);

        }
        if (namazSuraAll.equals("Sura4")) {
            option5TextDtails1.setText(R.string.sura4);
            option5TextDtails2.setText(R.string.sura44);

        }
        if (namazSuraAll.equals("Sura5")) {
            option5TextDtails1.setText(R.string.sura5);
            option5TextDtails2.setText(R.string.sura55);

        }

        if (namazSuraAll.equals("Sura6")) {
            option5TextDtails1.setText(R.string.sura6);
            option5TextDtails2.setText(R.string.sura66);

        }
        if (namazSuraAll.equals("Sura7")) {
            option5TextDtails1.setText(R.string.sura7);
            option5TextDtails2.setText(R.string.sura77);

        }
        if (namazSuraAll.equals("Sura8")) {
            option5TextDtails1.setText(R.string.sura8);
            option5TextDtails2.setText(R.string.sura88);

        }
        if (namazSuraAll.equals("Sura9")) {
            option5TextDtails1.setText(R.string.sura9);
            option5TextDtails2.setText(R.string.sura99);

        }
        if (namazSuraAll.equals("Sura10")) {
            option5TextDtails1.setText(R.string.sura10);
            option5TextDtails2.setText(R.string.sura100);

        }

    }
}

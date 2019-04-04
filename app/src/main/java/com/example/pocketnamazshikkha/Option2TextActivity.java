package com.example.pocketnamazshikkha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Option2TextActivity extends AppCompatActivity {
    TextView option2TextDtails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2_text);
        option2TextDtails = findViewById(R.id.option2_textView_id);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String namazOktoAll = bundle.getString("name");
            showDetails(namazOktoAll);
        }


    }

    private void showDetails(String namazOktoAll) {
        if (namazOktoAll.equals("Fozor")) {
            option2TextDtails.setText(R.string.fojor_okto);
        }
        if (namazOktoAll.equals("Zohor")) {
            option2TextDtails.setText(R.string.zohor_okto);
        }
        if (namazOktoAll.equals("Asor")) {
            option2TextDtails.setText(R.string.asor_okto);
        }
        if (namazOktoAll.equals("Magrib")) {
            option2TextDtails.setText(R.string.margrib_okto);
        }
        if (namazOktoAll.equals("Eshar")) {
            option2TextDtails.setText(R.string.eshar_okto);
        }

    }
}

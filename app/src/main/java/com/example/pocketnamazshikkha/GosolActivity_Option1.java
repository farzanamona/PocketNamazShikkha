package com.example.pocketnamazshikkha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GosolActivity_Option1 extends AppCompatActivity {


    TextView gosol_details, oju_detals_1, Oju_detals_2, oju_detals_3, oju_detals_4,go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gosol__option1);

        gosol_details = findViewById(R.id.gosol_textView_id);
        oju_detals_1 = findViewById(R.id.oju_details_1_id);
        Oju_detals_2 = findViewById(R.id.oju_details_2_id);
        oju_detals_3 = findViewById(R.id.oju_details_3_id);
        oju_detals_4 = findViewById(R.id.oju_details_4_id);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String gosolAll = bundle.getString("name");
            showDetails(gosolAll);
        }


    }

    private void showDetails(String gosolAll) {
        if (gosolAll.equals("gosol_details")) {
            gosol_details.setText(R.string.gosol_dealis);
        }
        if (gosolAll.equals("oju_details")) {
            gosol_details.setText(R.string.oju_details1);
            oju_detals_1.setText(R.string.oju_details2);
            Oju_detals_2.setText(R.string.oju_details3);
            oju_detals_3.setText(R.string.oju_details4);
            oju_detals_4.setText(R.string.oju_details5);


        }
    }
}

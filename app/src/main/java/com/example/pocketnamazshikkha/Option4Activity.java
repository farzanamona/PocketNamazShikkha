package com.example.pocketnamazshikkha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Option4Activity extends AppCompatActivity {
    TextView option4TextDtails1, option4TextDtails2, option4TextDtails3, option4TextDtails4, option4TextDtails5, option4TextDtails6, option4TextDtails7, option4TextDtails8, option4TextDtails9, option4TextDtails10, option4TextDtails11, option4TextDtails12, option4TextDtails13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option4);

        option4TextDtails1 = findViewById(R.id.option4_textView1_id);
        option4TextDtails2 = findViewById(R.id.option4_textView2_id);
        option4TextDtails3 = findViewById(R.id.option4_textView3_id);
        option4TextDtails4 = findViewById(R.id.option4_textView4_id);
        option4TextDtails5 = findViewById(R.id.option4_textView5_id);
        option4TextDtails6 = findViewById(R.id.option4_textView6_id);
        option4TextDtails7 = findViewById(R.id.option4_textView7_id);
        option4TextDtails8 = findViewById(R.id.option4_textView8_id);
        option4TextDtails9 = findViewById(R.id.option4_textView9_id);
        option4TextDtails10 = findViewById(R.id.option4_textView10_id);
        option4TextDtails11 = findViewById(R.id.option4_textView11_id);
        option4TextDtails12 = findViewById(R.id.option4_textView12_id);
        option4TextDtails13 = findViewById(R.id.option4_textView13_id);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String namazNeyomAll = bundle.getString("name");
            showDetails(namazNeyomAll);
        }
    }

    private void showDetails(String namazNeyomAll) {

        if (namazNeyomAll.equals("namazNiyom")) {
            option4TextDtails1.setText(R.string.namaz_neyoum1);
            option4TextDtails2.setText(R.string.namaz_neyoum2);
            option4TextDtails3.setText(R.string.namaz_neyoum3);
            option4TextDtails4.setText(R.string.namaz_neyoum4);
            option4TextDtails5.setText(R.string.namaz_neyoum5);
            option4TextDtails6.setText(R.string.namaz_neyoum6);
            option4TextDtails7.setText(R.string.namaz_neyoum7);
            option4TextDtails8.setText(R.string.namaz_neyoum8);
            option4TextDtails9.setText(R.string.namaz_neyoum9);
            option4TextDtails10.setText(R.string.namaz_neyoum10);
            option4TextDtails11.setText(R.string.namaz_neyoum11);
            option4TextDtails12.setText(R.string.namaz_neyoum12);

        }

    }
}
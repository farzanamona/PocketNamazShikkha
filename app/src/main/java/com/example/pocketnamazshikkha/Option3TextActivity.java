package com.example.pocketnamazshikkha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Option3TextActivity extends AppCompatActivity {
    TextView option3TextDtails1, option3TextDtails2, option3TextDtails3, option3TextDtails4, option3TextDtails5, option3TextDtails6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option3_text);

        option3TextDtails1 = findViewById(R.id.option3_textView1_id);
        option3TextDtails2 = findViewById(R.id.option3_textView2_id);
        option3TextDtails3 = findViewById(R.id.option3_textView3_id);
        option3TextDtails4 = findViewById(R.id.option3_textView4_id);
        option3TextDtails5 = findViewById(R.id.option3_textView5_id);
        option3TextDtails6 = findViewById(R.id.option3_textView6_id);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String namazNiyatAll = bundle.getString("name");
            showDetails(namazNiyatAll);
        }


    }

    private void showDetails(String namazNiyatAll) {

        if (namazNiyatAll.equals("FozorN")) {
            option3TextDtails1.setText(R.string.fojor_niyat1);
            option3TextDtails2.setText(R.string.fojor_niyat2);
            option3TextDtails3.setText(R.string.fozor_niyat3);
            option3TextDtails4.setText(R.string.fozor_niyat4);
        }
        if (namazNiyatAll.equals("ZohorN")) {
            option3TextDtails1.setText(R.string.zohor_niyat1);
            option3TextDtails2.setText(R.string.zohor_niyat2);
            option3TextDtails3.setText(R.string.zohor_niyat3);
            option3TextDtails4.setText(R.string.zohor_niyat4);
            option3TextDtails5.setText(R.string.zohor_niyat5);
            option3TextDtails6.setText(R.string.zohor_niyat6);
        }
        if (namazNiyatAll.equals("AsorN")) {
            option3TextDtails1.setText(R.string.asor_niyat1);
            option3TextDtails2.setText(R.string.asor_niyat2);
        }
        if (namazNiyatAll.equals("MagribN")) {
            option3TextDtails1.setText(R.string.magrib_niyat1);
            option3TextDtails2.setText(R.string.magrib_niyat2);
            option3TextDtails3.setText(R.string.magrib_niyat3);
            option3TextDtails4.setText(R.string.magrib_niyat4);

        }
        if (namazNiyatAll.equals("EsharN")) {
            option3TextDtails1.setText(R.string.esar_niyat1);
            option3TextDtails2.setText(R.string.esar_niyat2);
            option3TextDtails3.setText(R.string.esar_niyat3);
            option3TextDtails4.setText(R.string.esar_niyat4);
            option3TextDtails5.setText(R.string.esar_niyat5);
            option3TextDtails6.setText(R.string.esar_niyat6);

        }
        if (namazNiyatAll.equals("Other")) {
            option3TextDtails1.setText(R.string.nofol_niyat1);
            option3TextDtails2.setText(R.string.nofol_niyat2);
            option3TextDtails3.setText(R.string.beter_niyat1);
            option3TextDtails4.setText(R.string.beter_niyat2);


        }

    }
}

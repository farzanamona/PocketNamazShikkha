package com.example.pocketnamazshikkha;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AzanAndDuyaFragment extends Fragment {
    TextView AzanFragment_textview1, AzanFragment_textview2, AzanFragment_textview3, AzanFragment_textview4, AzanFragment_textview5, AzanFragment_textview6, AzanFragment_textview7, AzanFragment_textview8, AzanFragment_textview9, AzanFragment_textview10, AzanFragment_textview11, AzanFragment_textview12;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.activity_azan_and_duya_fragment, container, false);

        AzanFragment_textview1 = v.findViewById(R.id.AzanFragment_textView1_id);
        AzanFragment_textview2 = v.findViewById(R.id.AzanFragment_textView2_id);
        AzanFragment_textview3 = v.findViewById(R.id.AzanFragment_textView3_id);
        AzanFragment_textview4 = v.findViewById(R.id.AzanFragment_textView4_id);
        AzanFragment_textview5 = v.findViewById(R.id.AzanFragment_textView5_id);
        AzanFragment_textview6 = v.findViewById(R.id.AzanFragment_textView6_id);
        AzanFragment_textview7 = v.findViewById(R.id.AzanFragment_textView7_id);
        AzanFragment_textview8 = v.findViewById(R.id.AzanFragment_textView8_id);
        AzanFragment_textview9 = v.findViewById(R.id.AzanFragment_textView9_id);
        AzanFragment_textview10 = v.findViewById(R.id.AzanFragment_textView10_id);
        AzanFragment_textview11 = v.findViewById(R.id.AzanFragment_textView11_id);
        AzanFragment_textview12 = v.findViewById(R.id.AzanFragment_textView12_id);

        AzanFragment_textview1.setText(R.string.Azan1);
        AzanFragment_textview2.setText(R.string.Azan2);
        AzanFragment_textview3.setText(R.string.Azan3);
        AzanFragment_textview4.setText(R.string.Azan4);
        AzanFragment_textview5.setText(R.string.Azan5);
        AzanFragment_textview6.setText(R.string.Azan6);
        AzanFragment_textview7.setText(R.string.Azan7);
        AzanFragment_textview8.setText(R.string.Azan8);
        AzanFragment_textview9.setText(R.string.Azan9);
        AzanFragment_textview10.setText(R.string.AzanDuya1);
        AzanFragment_textview11.setText(R.string.AzanDuya2);
        AzanFragment_textview12.setText(R.string.AzanDuya3);


        return v;
    }
}


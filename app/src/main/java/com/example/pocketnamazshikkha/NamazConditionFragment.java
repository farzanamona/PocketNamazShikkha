package com.example.pocketnamazshikkha;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NamazConditionFragment extends Fragment {

    TextView NamazCondition_textview1, NamazCondition_textview2, NamazCondition_textview3, NamazCondition_textview4, NamazCondition_textview5, NamazCondition_textview6, NamazCondition_textview7, NamazCondition_textview8, NamazCondition_textview9, NamazCondition_textview10;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_namaz_condition_fragment, container, false);

        NamazCondition_textview1 = v.findViewById(R.id.NamazCondition_textView1_id);
        NamazCondition_textview2 = v.findViewById(R.id.NamazCondition_textView2_id);
        NamazCondition_textview3 = v.findViewById(R.id.NamazCondition_textView3_id);
        NamazCondition_textview4 = v.findViewById(R.id.NamazCondition_textView4_id);
        NamazCondition_textview5 = v.findViewById(R.id.NamazCondition_textView5_id);
        NamazCondition_textview6 = v.findViewById(R.id.NamazCondition_textView6_id);
        NamazCondition_textview7 = v.findViewById(R.id.NamazCondition_textView7_id);
        NamazCondition_textview8 = v.findViewById(R.id.NamazCondition_textView8_id);
        NamazCondition_textview9 = v.findViewById(R.id.NamazCondition_textView9_id);
        NamazCondition_textview10 = v.findViewById(R.id.NamazCondition_textView10_id);

        NamazCondition_textview1.setText(R.string.NamazCondition1);
        NamazCondition_textview2.setText(R.string.NamazCondition2);
        NamazCondition_textview3.setText(R.string.NamazCondition3);
        NamazCondition_textview4.setText(R.string.NamazCondition4);
        NamazCondition_textview5.setText(R.string.NamazCondition5);
        NamazCondition_textview6.setText(R.string.NamazCondition6);
        NamazCondition_textview7.setText(R.string.NamazCondition7);
        NamazCondition_textview8.setText(R.string.NamazCondition8);
        NamazCondition_textview9.setText(R.string.NamazCondition9);
        NamazCondition_textview10.setText(R.string.NamazCondition10);


        return v;

    }
}

package com.example.pocketnamazshikkha;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class KiyamFragment extends Fragment {

    TextView Kiyam_TextView_1,Kiyam_TextView_2,Kiyam_TextView_3,Kiyam_TextView_4,Kiyam_TextView_5,Kiyam_TextView_6;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v =  inflater.inflate(R.layout.activity_kiyam_fragment, container, false);

       Kiyam_TextView_1 = v.findViewById(R.id.kiyam_textView_1_id);
       Kiyam_TextView_2 = v.findViewById(R.id.kiyam_textView_2_id);
       Kiyam_TextView_3 = v.findViewById(R.id.kiyam_textView_3_id);
       Kiyam_TextView_4 = v.findViewById(R.id.kiyam_textView_4_id);
       Kiyam_TextView_5 = v.findViewById(R.id.kiyam_textView_5_id);
       Kiyam_TextView_6 = v.findViewById(R.id.kiyam_textView_6_id);


        Kiyam_TextView_1.setText(R.string.Kiyam1);
        Kiyam_TextView_2.setText(R.string.Kiyam2);
        Kiyam_TextView_3.setText(R.string.Kiyam3);
        Kiyam_TextView_4.setText(R.string.Kiyam4);
        Kiyam_TextView_5.setText(R.string.Kiyam5);
        Kiyam_TextView_6.setText(R.string.Kiyam6);



       return v;
    }
}

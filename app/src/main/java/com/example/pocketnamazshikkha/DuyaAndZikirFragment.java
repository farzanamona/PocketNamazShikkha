package com.example.pocketnamazshikkha;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DuyaAndZikirFragment extends Fragment {

    TextView DuyaAndZikir_textview_1,DuyaAndZikir_textview_2,DuyaAndZikir_textview_3,DuyaAndZikir_textview_4,DuyaAndZikir_textview_5,DuyaAndZikir_textview_6,DuyaAndZikir_textview_7;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_duya_and_zikir_fragment, container, false);

        DuyaAndZikir_textview_1 = v.findViewById(R.id.duya_and_zikir_textView_1_id);
        DuyaAndZikir_textview_2 = v.findViewById(R.id.duya_and_zikir_textView_2_id);
        DuyaAndZikir_textview_3 = v.findViewById(R.id.duya_and_zikir_textView_3_id);
        DuyaAndZikir_textview_4 = v.findViewById(R.id.duya_and_zikir_textView_4_id);
        DuyaAndZikir_textview_5 = v.findViewById(R.id.duya_and_zikir_textView_5_id);
        DuyaAndZikir_textview_6 = v.findViewById(R.id.duya_and_zikir_textView_6_id);
        DuyaAndZikir_textview_7 = v.findViewById(R.id.duya_and_zikir_textView_7_id);


        DuyaAndZikir_textview_1.setText(R.string.ZikirDuya1);
        DuyaAndZikir_textview_2.setText(R.string.ZikirDuya2);
        DuyaAndZikir_textview_3.setText(R.string.ZikirDuya3);
        DuyaAndZikir_textview_4.setText(R.string.ZikirDuya4);
        DuyaAndZikir_textview_5.setText(R.string.ZikirDuya5);
        DuyaAndZikir_textview_6.setText(R.string.ZikirDuya6);
        DuyaAndZikir_textview_7.setText(R.string.ZikirDuya7);


        return  v;
    }
}

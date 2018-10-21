package com.yayanheryanto.hallobayawak.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.yayanheryanto.hallobayawak.R;
import com.yayanheryanto.hallobayawak.activity.DetailEnsiklopediaActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class EnsiklopediaFillFragment extends Fragment {



    public EnsiklopediaFillFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ensiklopedia_fill, container, false);

        LinearLayout linearLayout = view.findViewById(R.id.linearLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), DetailEnsiklopediaActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}

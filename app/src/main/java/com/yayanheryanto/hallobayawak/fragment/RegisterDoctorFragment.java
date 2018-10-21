package com.yayanheryanto.hallobayawak.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yayanheryanto.hallobayawak.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterDoctorFragment extends Fragment {


    public RegisterDoctorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register_doctor, container, false);
    }

}

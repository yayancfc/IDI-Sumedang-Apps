package com.yayanheryanto.hallobayawak.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.yayanheryanto.hallobayawak.R;
import com.yayanheryanto.hallobayawak.activity.DoctorKategoriActivity;
import com.yayanheryanto.hallobayawak.adapter.AdapterKategori;
import com.yayanheryanto.hallobayawak.adapter.AdapterListBasic;
import com.yayanheryanto.hallobayawak.data.DataGenerator;
import com.yayanheryanto.hallobayawak.data.DataKategori;
import com.yayanheryanto.hallobayawak.model.People;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class KategoriTanyaDokter extends Fragment {


    public KategoriTanyaDokter() {
        // Required empty public constructor
    }



    private RecyclerView recyclerView;
    private AdapterKategori mAdapter;

    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list_penyakit, container, false);

        initComponent();
        return view;
    }

    private void initComponent() {

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        List<People> items = DataKategori.getPeopleData(getContext());

        //set data and list adapter
        mAdapter = new AdapterKategori(getContext(), items);
        recyclerView.setAdapter(mAdapter);

        // on item list clicked
        mAdapter.setOnItemClickListener(new AdapterKategori.OnItemClickListener() {
            @Override
            public void onItemClick(View view, People obj, int position) {

                Intent intent = new Intent(getContext(), DoctorKategoriActivity.class);
                startActivity(intent);
            }
        });
    }

}

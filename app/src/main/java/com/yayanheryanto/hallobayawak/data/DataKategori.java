package com.yayanheryanto.hallobayawak.data;

import android.content.Context;
import android.content.res.TypedArray;

import com.yayanheryanto.hallobayawak.R;
import com.yayanheryanto.hallobayawak.model.People;
import com.yayanheryanto.hallobayawak.util.Tools;

import java.util.ArrayList;
import java.util.List;

public class DataKategori {
    public static List<People> getPeopleData(Context ctx) {
        List<People> items = new ArrayList<>();
        TypedArray drw_arr = ctx.getResources().obtainTypedArray(R.array.kategori_image);
        String name_arr[] = ctx.getResources().getStringArray(R.array.kategori_name);

        for (int i = 0; i < name_arr.length; i++) {
            People obj = new People();
            obj.image = drw_arr.getResourceId(i, -1);
            obj.name = name_arr[i];
            obj.email = Tools.getEmailFromName(obj.name);
            obj.imageDrw = ctx.getResources().getDrawable(obj.image);
            items.add(obj);
        }
        return items;
    }
}
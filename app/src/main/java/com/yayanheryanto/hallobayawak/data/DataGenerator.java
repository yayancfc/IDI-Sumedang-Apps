package com.yayanheryanto.hallobayawak.data;

import android.content.Context;
import android.content.res.TypedArray;

import com.yayanheryanto.hallobayawak.R;
import com.yayanheryanto.hallobayawak.model.CardViewImg;
import com.yayanheryanto.hallobayawak.model.People;
import com.yayanheryanto.hallobayawak.model.Social;
import com.yayanheryanto.hallobayawak.util.Tools;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@SuppressWarnings("ResourceType")
public class DataGenerator {
    public static List<People> getPeopleData(Context ctx) {
        List<People> items = new ArrayList<>();
        TypedArray drw_arr = ctx.getResources().obtainTypedArray(R.array.people_images);
        String name_arr[] = ctx.getResources().getStringArray(R.array.people_names);

        for (int i = 0; i < 5; i++) {
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

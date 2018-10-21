package com.yayanheryanto.hallobayawak.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.yayanheryanto.hallobayawak.R;

public class DoctorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        initToolbar();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void openProfileDoctor(View view) {
        Intent intent = new Intent(DoctorActivity.this, EditProfileActivity.class);
        startActivity(intent);
    }

    public void openArticle(View view) {
        Intent intent = new Intent(DoctorActivity.this, ArticleDoctorActivity.class);
        startActivity(intent);
    }

    public void openFriendsActivity(View view) {
        Intent intent = new Intent(DoctorActivity.this, FriendsActivity.class);
        startActivity(intent);
    }

    public void logout(View view) {
        Intent intent = new Intent(DoctorActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void openEnsiklopedia(View view) {
        Intent intent = new Intent(DoctorActivity.this, EnsiklopediaActivity.class);
        startActivity(intent);
    }

    public void openJobActivity(View view) {
        Intent intent = new Intent(DoctorActivity.this, JobActivity.class);
        startActivity(intent);
    }

    public void openAnswerActivity(View view) {
        Intent intent = new Intent(DoctorActivity.this, AnswerActivity.class);
        startActivity(intent);
    }

    public void jadwal(View view) {
        Intent intent = new Intent(DoctorActivity.this, ScheduleActivity.class);
        startActivity(intent);
    }
}

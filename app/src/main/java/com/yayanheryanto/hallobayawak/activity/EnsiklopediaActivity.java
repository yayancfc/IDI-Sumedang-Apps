package com.yayanheryanto.hallobayawak.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.yayanheryanto.hallobayawak.R;
import com.yayanheryanto.hallobayawak.fragment.EnsiklopediaFillFragment;

import java.util.ArrayList;
import java.util.List;

public class EnsiklopediaActivity extends AppCompatActivity {


    private ViewPager view_pager;
    private View view;

    private TabLayout tab_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ensiklopedia);
        initComponent();
        initToolbar();

        FloatingActionButton fab = findViewById(R.id.fabAdd);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnsiklopediaActivity.this, CreateEnsiklopediaActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initComponent() {

        view_pager = (ViewPager) findViewById(R.id.view_pager);
        setupViewPager(view_pager);

        tab_layout = (TabLayout) findViewById(R.id.tab_layout);
        tab_layout.setupWithViewPager(view_pager);
    }

    private void setupViewPager(ViewPager viewPager) {
        EnsiklopediaActivity.SectionsPagerAdapter adapter = new EnsiklopediaActivity.SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new EnsiklopediaFillFragment(), "Rekomendasi");
        adapter.addFragment(new EnsiklopediaFillFragment(), "Terbaru");
        adapter.addFragment(new EnsiklopediaFillFragment(), "Ilmu Bedah");
        adapter.addFragment(new EnsiklopediaFillFragment(), "Jantung");
        adapter.addFragment(new EnsiklopediaFillFragment(), "Kulit");
        adapter.addFragment(new EnsiklopediaFillFragment(), "THT");
        adapter.addFragment(new EnsiklopediaFillFragment(), "Gigi");
        adapter.addFragment(new EnsiklopediaFillFragment(), "Anak");

        viewPager.setAdapter(adapter);
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search_setting, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}

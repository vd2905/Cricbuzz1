package com.example.cricbuzz1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.cricbuzz1.databinding.ActivityOtherBinding;
import com.google.android.material.tabs.TabLayout;

import FragmentAdapter.FragmentAdapter;

public class OtherActivity extends AppCompatActivity {

    ActivityOtherBinding binding;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment_One(),"INFO");
        adapter.addFragment(new Fragment_Two(),"LIVE");
        adapter.addFragment(new Fragment_Three(),"SCORECARD");
        adapter.addFragment(new Fragment_Four(),"SQUADS");
        adapter.addFragment(new Fragment_Five(),"OVERS");
        adapter.addFragment(new Fragment_Six(),"HIGHLIGHTS");
        viewPager=findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        tabLayout=findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
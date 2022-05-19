package com.example.rijndorp_multicalc.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rijndorp_multicalc.Formula1;
import com.example.rijndorp_multicalc.Formula2;
import com.example.rijndorp_multicalc.Fragment.FragmentFormula1;
import com.example.rijndorp_multicalc.Fragment.FragmentFormula2;
import com.example.rijndorp_multicalc.R;
import com.example.rijndorp_multicalc.Adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    List<Formula1> mData = new ArrayList<>();
    List<Formula2> mData2 = new ArrayList<>();

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*dataList = findViewById(R.id.dataList);*/

        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        // Add Fragments
        viewPagerAdapter.AddFragment(new FragmentFormula1(),"Formulas 1");
        viewPagerAdapter.AddFragment(new FragmentFormula2(),"Formulas 2");



        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_calc);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_calc);



        titles = new ArrayList<>();
        images = new ArrayList<>();



    }
}
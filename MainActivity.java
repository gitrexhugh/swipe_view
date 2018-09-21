package com.example.hugh.swipe_view_t01;

//reference:https://medium.com/@droidbyme/android-material-design-tabs-tab-layout-with-swipe-884085ae80ff
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
//-----


public class MainActivity extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();//隱藏預設標題(繼承AppCompatActivity時可用)
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "Tab 1");
        adapter.addFragment(new Tab2Fragment(), "Tab 2");
        adapter.addFragment(new Tab3Fragment(), "Tab 3");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        int[] tabIcons = {
                R.drawable.backlight1_xxxhdpi,
                R.drawable.backlight_camera1_xxxhdpi,
                R.drawable.screenlight_camera1_xxxhdpi
        };
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }



}

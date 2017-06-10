package com.example.android.projectsix_tourguide2;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private PagesArrayAdapter mPagesArrayAdapter;

    private ViewPager mPages;

    @Override
    protected void onCreate(Bundle createdItems) {
        super.onCreate(createdItems);
        setContentView(R.layout.activity_main);

        Toolbar ToulBars = (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(ToulBars);

        mPagesArrayAdapter = new PagesArrayAdapter(getSupportFragmentManager());

        mPages = (ViewPager) findViewById(R.id.Pager);
        mPages.setAdapter(mPagesArrayAdapter);

        TabLayout setTabLayout = (TabLayout) findViewById(R.id.TabLayout);
        setTabLayout.setupWithViewPager(mPages);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.top_settings_button){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class PagesArrayAdapter extends FragmentPagerAdapter {

        public PagesArrayAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position){
            switch (position){
                case 0:
                    return SightseeingFragment.newInstance();
                case 1:
                    return MuseumsFragment.newInstance();
                case 2:
                    return HotelsFragment.newInstance();
                case 3:
                    return FamilyTripFragment.newInstance();
            }
            return null;
        }
        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position){
            switch (position){
                case 0:
                    return getString(R.string.group_1).toUpperCase();
                case 1:
                    return getString(R.string.group_2).toUpperCase();
                case 2:
                    return getString(R.string.group_3).toUpperCase();
                case 3:
                    return getString(R.string.group_4).toUpperCase();
            }
            return null;
        }
    }
}
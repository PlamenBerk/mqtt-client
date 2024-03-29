package com.example.mqtt.mqtt_client.Fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabFragmentA1 tab1 = new TabFragmentA1();
                return tab1;
            case 1:
                TabFragmentTvF tab2 = new TabFragmentTvF();
                return tab2;
            case 2:
                TabFragmentTvS tab3 = new TabFragmentTvS();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
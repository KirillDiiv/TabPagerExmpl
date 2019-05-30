package com.example.tabpagerexmpl;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    public MyPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override    public Fragment getItem(int position) {
        switch (position){
            case 0: return new TabFragmentOne();
            case 1: return new TabFragmentTwo();
            case 2: return new TabFragmentThree();
        }
        return null;
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override    public CharSequence getPageTitle(int position) {        switch (position){
        case 0: return "Tab 1";
        case 1: return "Tab 2";
        case 2: return "Tab 3";
        default: return null;
    }
    }
}

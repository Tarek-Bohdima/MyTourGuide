package com.example.android.mytourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class DetailsFragmentPageAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public DetailsFragmentPageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OverViewFragment();
        } else {
            return new MapFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.over_view);
        } else {
            return mContext.getString(R.string.map);
        }
    }
}

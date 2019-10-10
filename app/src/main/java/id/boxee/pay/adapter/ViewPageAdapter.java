package id.boxee.pay.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import id.boxee.pay.ActivitiesFragment;
import id.boxee.pay.StastisticsFragment;
import id.boxee.pay.SummaryFragment;

public class ViewPageAdapter extends FragmentPagerAdapter {

    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new ActivitiesFragment();
        }
        else if (position == 1)
        {
            fragment = new StastisticsFragment();
        }
        else if (position == 2)
        {
            fragment = new SummaryFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Activities";
        }
        else if (position == 1)
        {
            title = "Statistics";
        }
        else if (position == 2)
        {
            title = "Summary";
        }
        return title;
    }
}

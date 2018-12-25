package com.example.root.mytab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.root.mytab.fragment.AcceptedBookingFragment;
import com.example.root.mytab.fragment.CancelBookingFragment;
import com.example.root.mytab.fragment.CompletedBookingFragment;

public class BookingsTabsAdapter extends FragmentPagerAdapter {
    public BookingsTabsAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position)
        {
            case 0:
                return fragment = new AcceptedBookingFragment();
            case 1:
                return fragment = new CancelBookingFragment();
            case 2:
                return fragment = new CompletedBookingFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int Position)
    {
        switch (Position)
        {
            case 0:

                return "Accepted";

            case 1:
                return "Cancel";

            case 2:
                return "Completed";

            default:
                return null;
        }
    }
}

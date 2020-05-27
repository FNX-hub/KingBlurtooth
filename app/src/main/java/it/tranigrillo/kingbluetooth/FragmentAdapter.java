package it.tranigrillo.kingbluetooth;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

//adapter che permette di creare liste di fragment generici

public class FragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    FragmentAdapter(FragmentManager fragmentManager, /*Context context,*/ List<Fragment> fragments) {
        super(fragmentManager);
        this.fragments = fragments;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

}

package com.laodev.mediaeditor.adapters;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.laodev.mediaeditor.activity.ImageRecyclerFragment;
import com.laodev.mediaeditor.activity.MP4RecyclerFragment;

public class Pager extends FragmentStatePagerAdapter {
    int tabCount;

    public Pager(FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        this.tabCount = i;
    }

    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new ImageRecyclerFragment();
            case 1:
                return new MP4RecyclerFragment();
            default:
                return null;
        }
    }

    public int getCount() {
        return this.tabCount;
    }
}

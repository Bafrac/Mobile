package pinna.tp1.tp4.ui.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.Locale;

import pinna.tp1.tp4.R;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import pinna.tp1.tp4.R;

import java.util.Locale;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;
    private final ViewPager mViewPager;

    public SectionsPagerAdapter(Context context, FragmentManager fm, ViewPager vp) {
        super(fm);
        mContext = context;
        mViewPager = vp;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return NatureFragment.newInstance(0, mContext.getString(R.string.titre_section0), R.drawable.printemps);
            case 1:
                return NatureFragment.newInstance(1, mContext.getString(R.string.titre_section1), R.drawable.ete);
            case 2:
                return NatureFragment.newInstance(2, mContext.getString(R.string.titre_section2), R.drawable.automne);
            case 3:
                return NatureFragment.newInstance(3, mContext.getString(R.string.titre_section3), R.drawable.hiver);
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mContext.getString(R.string.titre_section0).toUpperCase(l);
            case 1:
                return mContext.getString(R.string.titre_section1).toUpperCase(l);
            case 2:
                return mContext.getString(R.string.titre_section2).toUpperCase(l);
            case 3:
                return mContext.getString(R.string.titre_section3).toUpperCase(l);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
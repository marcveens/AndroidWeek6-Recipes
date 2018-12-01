package marcveens.androidweek6_recipes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    List<String> collection;

    public SectionsPagerAdapter(FragmentManager fm, List<String> collection) {
        super(fm);
        this.collection = collection;
    }

    @Override
    public Fragment getItem(int position) {
        return PlaceholderFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return collection.size();
    }
}
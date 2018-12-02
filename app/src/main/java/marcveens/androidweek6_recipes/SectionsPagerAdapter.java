package marcveens.androidweek6_recipes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private List<RecipeProps> recipes;

    public SectionsPagerAdapter(FragmentManager fm, List<RecipeProps> recipes) {
        super(fm);
        this.recipes = recipes;
    }

    @Override
    public Fragment getItem(int position) {
        return PlaceholderFragment.newInstance(position, this.recipes);
    }

    @Override
    public int getCount() {
        return recipes.size();
    }
}
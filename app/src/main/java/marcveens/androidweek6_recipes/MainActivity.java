package marcveens.androidweek6_recipes;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final List<String> recipes = new ArrayList<>();

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes.add("Hi");
        recipes.add("Hello");

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), recipes);

        mViewPager = findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    private void requestData()
    {
        RecipeApiService service = RecipeApiService.retrofit.create(RecipeApiService.class);
        Call<Recipe> call = service.getRecipeByNumber(35382);
        call.enqueue(new Callback<Recipe>() {
            @Override
            public void onResponse(Call<Recipe> call, Response<Recipe> response) {
                Recipe recipeResponse = response.body();
//                setQuoteTextView(dayQuoteItem.getText());
            }
            @Override
            public void onFailure(Call<Recipe> call, Throwable t) {
            }
        });
    }
}

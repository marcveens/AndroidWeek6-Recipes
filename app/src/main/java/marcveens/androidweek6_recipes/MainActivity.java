package marcveens.androidweek6_recipes;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final List<RecipeProps> recipes = new ArrayList<>();
    private final Integer MAX_RESULTS = 3;

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.pager);

        requestRecipeList();
        refreshCarousel();
    }

    private void refreshCarousel() {
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), recipes);

        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    private void requestRecipeList()
    {
        final RecipeApiService service = RecipeApiService.retrofit.create(RecipeApiService.class);
        Call<RecipeList> call = service.getAll('r');

//        Call<Recipe> call = service.getRecipeByNumber(35382);
        call.enqueue(new Callback<RecipeList>() {
            @Override
            public void onResponse(Call<RecipeList> call, Response<RecipeList> response) {
                RecipeList recipeList = response.body();

                for (int i = 0; i < MAX_RESULTS; i++) {
                    RecipeListProps recipe = recipeList.recipes.get(i);
                    getRecipe(recipe.recipeId);
                }

                refreshCarousel();
            }
            @Override
            public void onFailure(Call<RecipeList> call, Throwable t) {
            }
        });
    }

    private void getRecipe(String recipeId) {
        final RecipeApiService service = RecipeApiService.retrofit.create(RecipeApiService.class);
        Call<Recipe> call = service.getRecipeByNumber(recipeId);
        call.enqueue(new Callback<Recipe>() {
            @Override
            public void onResponse(Call<Recipe> call, Response<Recipe> response) {
                Recipe recipe = response.body();

                recipes.add(recipe.recipe);

                refreshCarousel();
            }
            @Override
            public void onFailure(Call<Recipe> call, Throwable t) {
            }
        });
    }
}


package marcveens.androidweek6_recipes;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            RecipeDetailFragment fragment = new RecipeDetailFragment();
            transaction.replace(R.id.pager, fragment);
            transaction.commit();
        }

        requestData();
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

package marcveens.androidweek6_recipes;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RecipeApiService {
    String BASE_URL = "https://www.food2fork.com/api/get/";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

//    @GET("?key=6ed6c7686aeeb1835c3eed965406b2b8&rId={id}")
    @GET("?key=6ed6c7686aeeb1835c3eed965406b2b8")
    Call<Recipe> getRecipeByNumber(@Query("rId") int id);

}

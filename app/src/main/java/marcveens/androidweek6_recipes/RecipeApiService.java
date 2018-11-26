package marcveens.androidweek6_recipes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RecipeApiService {
    String BASE_URL = "https://www.food2fork.com/api/get/";
    String API_KEY = "6ed6c7686aeeb1835c3eed965406b2b8";

    Retrofit retrofit = new Retrofit().Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("?rId={id}&key={key}")
    Call<Recipe> getTriviaByNumber(@Path("id") int id, String API_KEY);

}

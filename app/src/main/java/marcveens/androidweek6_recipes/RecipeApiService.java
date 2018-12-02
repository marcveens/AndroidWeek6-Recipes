package marcveens.androidweek6_recipes;

import java.io.IOException;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApiService {
    String BASE_URL = "https://www.food2fork.com/api/";
    String KEY = "6ed6c7686aeeb1835c3eed965406b2b8";

    OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request();
                    HttpUrl url = request.url()
                            .newBuilder()
                            .addQueryParameter("key", KEY)
                            .build();

                    request = request
                            .newBuilder()
                            .url(url)
                            .build();

                    Response response = chain.proceed(request);
                    return response;
                }
            }).build();


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("get/")
    Call<Recipe> getRecipeByNumber(@Query("rId") String id);

    @GET("search/")
    Call<RecipeList> getAll(@Query("sort") char sort);
}

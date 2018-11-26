package marcveens.androidweek6_recipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestData();
    }

    private void requestData()
    {
        NumbersApiService service = NumbersApiService.retrofit.create(NumbersApiService.class);
        Call<TriviaItem> call = service.getTriviaByNumber(42);
        call.enqueue(new Callback<TriviaItem>() {
            @Override
            public void onResponse(Call<TriviaItem> call, Response<TriviaItem> response) {
                TriviaItem dayQuoteItem = response.body();
//                setQuoteTextView(dayQuoteItem.getText());
            }
            @Override
            public void onFailure(Call<TriviaItem> call, Throwable t) {
            }
        });
    }
}

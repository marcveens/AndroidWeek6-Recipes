package marcveens.androidweek6_recipes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import com.squareup.picasso.Picasso;

public class PlaceholderFragment extends Fragment {
    public static List<RecipeProps> recipes;
    private static final String ARG_SECTION_NUMBER = "section_number";

    public PlaceholderFragment() {
    }

    public static PlaceholderFragment newInstance(int sectionNumber, List<RecipeProps> recipesCollection) {
        recipes = recipesCollection;
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String text = "";
        View rootView = inflater.inflate(R.layout.activity_recipe, container, false);
        TextView textView = rootView.findViewById(R.id.recipe);
        ImageView imageView = rootView.findViewById(R.id.image);
        RecipeProps recipe = recipes.get(getArguments().getInt(ARG_SECTION_NUMBER));

        text += recipe.getTitle();
        text += "\n\nIngredients:\n";

        for (int i = 0; i < recipe.getIngredients().size(); i++) {
            text += "- " + recipe.getIngredients().get(i) + "\n";
        }

        textView.setText(text);

        Picasso.get().load(recipe.getImageUrl()).into(imageView);

        return rootView;
    }
}


package marcveens.androidweek6_recipes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Recipe {
    public String publisher;

    @SerializedName("f2f_url")
    @Expose
    public String url;

    public List<String> ingredients;

    @SerializedName("source_url")
    @Expose
    public String sourceUrl;

    @SerializedName("recipe_id")
    @Expose
    public Integer recipeId;

    @SerializedName("image_url")
    @Expose
    public String imageUrl;

    @SerializedName("social_rank")
    @Expose
    public Integer socialRank;

    @SerializedName("publisher_url")
    @Expose
    public String publisherUrl;

    public String title;
}
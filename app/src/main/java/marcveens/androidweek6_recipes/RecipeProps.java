package marcveens.androidweek6_recipes;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecipeProps {
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getSocialRank() {
        return socialRank;
    }

    public void setSocialRank(Integer socialRank) {
        this.socialRank = socialRank;
    }

    public String getPublisherUrl() {
        return publisherUrl;
    }

    public void setPublisherUrl(String publisherUrl) {
        this.publisherUrl = publisherUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
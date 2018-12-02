package marcveens.androidweek6_recipes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecipeListProps {
    public String publisher;
    @SerializedName("f2f_url")
    @Expose
    public String url;
    public String tile;
    @SerializedName("source_url")
    @Expose
    public String sourceUrl;
    @SerializedName("recipe_id")
    @Expose
    public String recipeId;
    @SerializedName("image_url")
    @Expose
    public String imageUrl;
    @SerializedName("social_rank")
    @Expose
    public Integer socialRank;
    @SerializedName("publisher_url")
    @Expose
    public String publisherUrl;

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

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
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
}

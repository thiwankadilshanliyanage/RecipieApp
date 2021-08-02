package com.example.recipyapp;

public class Recipies {

    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;


    public Recipies(String recipeName, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail) {
        RecipeName = recipeName;
        RecipeIngredients = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;


    }

    public String getRecipeName() {
        return RecipeName;
    }

    public String getRecipeIngredients() {
        return RecipeIngredients;
    }

    public String getRecipeMethodTitle() {
        return RecipeMethodTitle;
    }

    public String getRecipe() {
        return Recipe;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

}

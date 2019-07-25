package com.example.myrestaurant01;

import android.view.View;

public class Food {
    private String name = "";
    private String description = "";
    private double price = 0.0;
    private int imageId = 0;
    private static final int CATEGORY_ID = 0;

    //   String[] name = {"android ", ""};
    //   String[] descriptionList = {"", ""};
    //   double[] priceList = {1,1};


    public static Food [] Entrees = {
            new Food ("MC Beet Salad", "a salad that is made with the freshes and bestest beets in the world!", 6, R.drawable.beetsalad),
            new Food ("Royal Tramp Dumpling", "Dumpling that is only made for royalty only, get them while they are HOT!", 5, R.drawable.dumpling),
            new Food ("Jasmine Pearl Siu Mai", "get a hold of these precious Siu Mai shaped like a pearl!", 5, R.drawable.siumai)};

    public static Food [] Main = {
            new Food ("Poutine Siu Mai", "Our OSCAR AWARD WINNING Oriental Style Poutine!", 10, R.drawable.poutine),
            new Food ("Shrimp Baobao", "A Oriental Style Bun with a fried Shrimp, made with perfection!", 10, R.drawable.baobao),
            new Food ( "KIPIK Atlantic Salmon Tartare", "Our Salmon Tartare with spices that will blow your mind away!", 12, R.drawable.entree)};

    public static Food [] Specialty = {
            new Food ( "BlackPrince Hamburger", "A Black burger that is fit for a black prince of Asia!", 15, R.drawable.hamburger1),
            new Food ("Nationalist Beef Noodle Soup", "Beef Noodle Soup that will satisfy all your meaty needs!", 12, R.drawable.main),
            new Food ("Big Hot-Dog Shrimp", "Why Go with the Pork when you can have it with a large shrimp?", 12, R.drawable.shrimpbao)};

    public static Food [] Drink = {
            new Food ("Ladies night Drink", "A Drink for the ladies or... to get WITH the ladies!", 15, R.drawable.drink2),
            new Food ("SSJ3 Drink", "SSJ3?? Try one to know! SUPER SAIYAN OR SUPER SOUR?", 15, R.drawable.kameha),
            new Food ("Bulma Drink", "The Drink that made Bulma.. well Bulma with the fresh taste of berries!", 15, R.drawable.bulmadrink)};

    public static Food [][]allFoods = {Entrees, Main, Specialty, Drink};

    public Food(String name, String description, double price, int imageId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageId = imageId;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getImageId() {
        return imageId;
    }



    public static int getCategory(View v) {

        int categoryid = 0;
        int buttonId = v.getId();
        int entreeId = 1;
        int mainId = 2;
        int specialtyid = 3;
        int drinkid  = 4;

        switch(buttonId) {
            case R.id.btn_entree:
                categoryid = entreeId;
                break;
            case R.id.btn_main:
                categoryid = mainId;
                break;
            case R.id.btn_specialty:
                categoryid = specialtyid;
                break;
            case R.id.btn_drink:
                categoryid = drinkid;
                break;
        }
return categoryid;
    }
    public static Food[] getCategoryFoods(int categoryId){
        Food[] categoryFoods = null;
        switch(categoryId) {
            case 1:
              categoryFoods = Food.Entrees;
                break;
            case 2:
                categoryFoods = Food.Main;
                break;
            case 3:
                categoryFoods = Food.Specialty;
                break;
            case 4:
                categoryFoods = Food.Drink;
                break;
        }
        return categoryFoods;
    }

    @Override
    public String toString() {
        return name;
    }
}

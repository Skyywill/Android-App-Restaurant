package com.example.myrestaurant01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetails extends AppCompatActivity {

    int categoryId = 0;
    int itemPosition = 0;
    Food food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();
        itemPosition = bundle.getInt("itemPosition");
        categoryId = bundle.getInt("categoryId");
        Food[] categoryFoods = Food.getCategoryFoods(categoryId);
        food = categoryFoods[itemPosition];

        TextView foodName = findViewById(R.id.foodName);
        TextView foodPrice = findViewById(R.id.foodPrice);
        TextView foodDesc = findViewById(R.id.foodDescription);
        ImageView image = findViewById(R.id.imageDescription);

        foodName.setText(food.getName());
        foodPrice.setText("$" +food.getPrice());
        foodDesc.setText(food.getDescription());
        image.setImageResource(food.getImageId());
    }
}

package com.example.myrestaurant01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 /*   public void Entree (View view){
        Intent startNewActivity = new Intent (this, EntreeListActivity.class);
        startActivity(startNewActivity);
    }

    public void Main (View view){
        Intent startNewActivity = new Intent(this, MainListActivity.class);
        startActivity(startNewActivity);
    }

    public void Drink (View view) {
        Intent startNewActivity = new Intent(this, DrinkListActivity.class);
        startActivity(startNewActivity);
    }

    public void Specialty (View view) {
        Intent startNewActivity = new Intent(this, SpecialtyListActivity.class);
        startActivity(startNewActivity);
    }

    */

    public void onImageButtonClicked (View view) {

        int categoryid = Food.getCategory(view);
        Intent intent = new Intent(this, FoodListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("categoryId", categoryid);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}

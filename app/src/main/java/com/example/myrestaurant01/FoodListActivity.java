package com.example.myrestaurant01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodListActivity extends Activity {

    ListView foodList;
    int categoryId = 0;
    int itemPosition = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        foodList = findViewById(R.id.FoodList);
        Bundle bundle = getIntent().getExtras();
        categoryId = bundle.getInt("categoryId");
        createListView();
    }
    private void createListView(){
        ArrayAdapter<Food> adapter = new ArrayAdapter<Food> (this,R.layout.my_item_layout, R.id.item_name, Food.getCategoryFoods(categoryId));        //this link to the layout of my_item_layout
        foodList.setAdapter (adapter);
        foodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText (this, Food.allFoods[0][position], Toast.LENGTH_SHORT).show();        //this part makes the toast appear when click on the list in EntreeListActivity
                Intent intent = new Intent(FoodListActivity.this, ActivityDetails.class);
                itemPosition = position;
                Bundle bundleFoodlist = new Bundle();
                bundleFoodlist.putInt("itemPosition", itemPosition);
                bundleFoodlist.putInt("categoryId", categoryId);
                intent.putExtras(bundleFoodlist);
                startActivity(intent);
            }
        });

    }

}

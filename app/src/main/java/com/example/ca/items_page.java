package com.example.ca;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.GridLayout;

import java.util.ArrayList;

public class items_page extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_page);
        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setTitle("Coffee");
        String title=actionBar.getTitle().toString();


        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Alcohol Coffee", R.drawable.alcohol, "Rough coffee drinks"));
        coffees.add(new Coffee("Coffee Cocktails", R.drawable.cocktail, "Unusual coffee drinks"));
        coffees.add(new Coffee("Cold Coffee", R.drawable.cold, "Refreshing coffee drinks"));
        coffees.add(new Coffee("Coffee Bakery", R.drawable.bakery, "Deserts to a cup of coffee"));
        coffees.add(new Coffee("Hot Coffee", R.drawable.hot, "Warming Coffee Mixtures"));
        coffees.add(new Coffee("Christmas Coffee", R.drawable.ch, "Most festive coffee recipes"));
        coffees.add(new Coffee("Valentine's Coffee", R.drawable.val, "Romantic and tender drinks"));
        recyclerView = findViewById(R.id.coffee_card_recycler_view);
        RecyclerViewSpacing spacing = new RecyclerViewSpacing(20, 20);
        CoffeeAdapter adapter = new CoffeeAdapter(coffees);
        GridLayoutManager manager = new GridLayoutManager(this, 2);
        adapter.setListener(new CoffeeAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(items_page.this, CoffeeListActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
        recyclerView.addItemDecoration(spacing);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}


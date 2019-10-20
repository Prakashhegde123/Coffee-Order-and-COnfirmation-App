package com.example.ca;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CoffeeListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_list);


        int position = getIntent().getExtras().getInt("position");

        ArrayList<Coffee> list1 = new ArrayList<>();
        list1.add(new Coffee("Bavarian Coffee", R.drawable.hot, "Nice drink for a cozy evening "));
        list1.add(new Coffee("Blue Cool", R.drawable.cold, "Tender drink with strong nature "));
        list1.add(new Coffee("Brazilian Coffee", R.drawable.cocktail, "Sweet and heady coffee"));
        list1.add(new Coffee("C-52", R.drawable.alcohol, "Short drink with instantaneous effect "));
        list1.add(new Coffee("Calypso", R.drawable.val, "Simple yet impressive"));
        list1.add(new Coffee("Cappuccino cocktail with Grappa", R.drawable.val, "Sophisticated taste for gourmets"));
        list1.add(new Coffee("Coffee Cuba", R.drawable.val, "Colorful carnival in your glass"));
        list1.add(new Coffee("Coffee la Bamba", R.drawable.val, "Naughty coffee for all-night-long parties"));
        list1.add(new Coffee("Golden Spirit", R.drawable.val, "Strong and bracing man's drink"));
        list1.add(new Coffee("Hot Russian", R.drawable.val, "Bold and uncompromising"));
        list1.add(new Coffee("Hot and Sweet", R.drawable.val, "It's name speaks for itself"));
        list1.add(new Coffee("Irish Coffee", R.drawable.val, "Brutal and powerful Irish drink"));
        list1.add(new Coffee("Orange and Coffee Martini", R.drawable.val, "Refreshing and very strong"));
        list1.add(new Coffee("Royal Coffee", R.drawable.val, "A special coffee fit for royalty"));
        list1.add(new Coffee("Spanish Coffee", R.drawable.val, "Full of passion and tenderness of Spain"));
        list1.add(new Coffee("Tequila Coffee", R.drawable.val, "It is as tender as hard"));
        list1.add(new Coffee("Viennese Coffee", R.drawable.val, "Deep taste and rich flavor"));
        list1.add(new Coffee("White Lady", R.drawable.val, "Sweet and rough as a nature of true lady"));
        list1.add(new Coffee("Winter Warmer", R.drawable.val, "Spicy warming coffee"));

        ArrayList<Coffee> list2 = new ArrayList<>();
        list2.add(new Coffee("Bananarama", R.drawable.bananarama, "Coffee and banana experiment in your glass"));
        list2.add(new Coffee("Borgia Cocktail", R.drawable.borgia, "Non-trivial coffee drink"));
        list2.add(new Coffee("Caribbean Coffee", R.drawable.caribbean, "Tropical mixture of coffee and juice"));
        list2.add(new Coffee("Celebration Dream", R.drawable.celebr, "Unforgettable mixture of fruits and coffee"));
        list2.add(new Coffee("Coffee Fredo", R.drawable.fredo, "An average drink to fight morning routine"));
        list2.add(new Coffee("Coffee Dream", R.drawable.dream, "Coffee drink with a nice apple aftertaste"));
        list2.add(new Coffee("Coffee Lassi with Mango", R.drawable.lassi, "A bit spicy,a bit tender"));
        list2.add(new Coffee("Coffee Refreshing Shake", R.drawable.refre, "Refreshing shake perfect for a hot day"));
        list2.add(new Coffee("Coffee Shake", R.drawable.coffeeshake, "Simple and nice coffee drink"));
        list2.add(new Coffee("Coffee Shake with coconut milk", R.drawable.coconut, "Rich taste and flavor"));
        list2.add(new Coffee("Coffee Smoothie", R.drawable.smoothie, "Rich berry flavor and creamy texture"));
        list2.add(new Coffee("Cognac-coffee cooler", R.drawable.cognac, "Wonderful cocktail for a hot day"));
        list2.add(new Coffee("Cool Passion", R.drawable.passion, "A drink that will wake your feelings up"));
        list2.add(new Coffee("Espresso Long Nights", R.drawable.longnights, "Sophisticated tasty coffee cocktail"));
        list2.add(new Coffee("Fragolino", R.drawable.fragolino, "Mixture of strict coffee and tender strawberry"));
        list2.add(new Coffee("Ice cream cappuccino", R.drawable.icecream, "A perfect cocktail for chocolate lovers"));
        list2.add(new Coffee("Keoke Coffee", R.drawable.keoke, "Mysterious and seductive"));
        list2.add(new Coffee("Limonetta", R.drawable.limonetta, "Bold and strong beverage"));
        list2.add(new Coffee("Melondy", R.drawable.melondy, "Refreshing mix for full of life coffee lovers"));
        list2.add(new Coffee("Mint-Chocolate Coffee", R.drawable.mint, "Tender refreshing drink"));
        list2.add(new Coffee("Peach Coffee", R.drawable.peachh, "Sophisticated cocktail with delicate peach flavor"));
        list2.add(new Coffee("Polar Star", R.drawable.polar, "Tender creamy drink for a special evening"));
        list2.add(new Coffee("Shakerato", R.drawable.shakerato, "Fresh shake to start a new working week"));
        list2.add(new Coffee("Zuppa del duca", R.drawable.zuppa, "Coffee desert in your glass"));


        ArrayList<Coffee> list3 = new ArrayList<>();
        list3.add(new Coffee("Banana Mocha Cooler", R.drawable.bananamocha, "A light mix of refreshing coffee and banana flavor"));
        list3.add(new Coffee("Cafe Velutto", R.drawable.velu, "Strong and gently creamy chilled drink"));
        list3.add(new Coffee("Cafe Lecholino", R.drawable.cafelecholi, "A beautiful dessert for chocolate lovers"));
        list3.add(new Coffee("Chilled Lemon Coffee", R.drawable.lemon, "Coffee drink with an unforgettable bright taste"));
        list3.add(new Coffee("Chocolate Caramel hazelnut Ice Coffee", R.drawable.haze, "Sweet chocolate-hazelnut coffee drink"));
        list3.add(new Coffee("Coffee Granita di coffee con panno", R.drawable.granita, "The most refreshing dessert in a whole world"));
        list3.add(new Coffee("Cool Coffee Refresher", R.drawable.refre, "Unrepeatable mix of coffee and ice"));
        list3.add(new Coffee("Easy French Iced Coffee", R.drawable.french, "Easy to make but still unique drink"));
        list3.add(new Coffee("Espresso Soda", R.drawable.soda, "This coffee drink will truly surprise you"));
        list3.add(new Coffee("Frappino", R.drawable.frappe, "A cod coffee drink variation"));
        list3.add(new Coffee("Freshpresso", R.drawable.freshpresso, "Freshness of citrus in a mix with sweetness of vanilla"));
        list3.add(new Coffee("Frosty Caramel Cappuccino", R.drawable.caramelcappu, "Bright drink created to impress"));
        list3.add(new Coffee("Ice Mocha", R.drawable.icemocha, "Incredibly icy,incredibly coffee"));
        list3.add(new Coffee("Iced Coffee Latte", R.drawable.coffeelatte, "Sweet drink for adults"));
        list3.add(new Coffee("Iced Coffee Slush", R.drawable.coffeeslush, "Favorite refreshing drink now based on coffee"));
        list3.add(new Coffee("Iced Vanilla Mocchiato", R.drawable.vanillamacc, "Nice light fragrant drink based on coffee"));
        list3.add(new Coffee("Latte Mocchiato Frio", R.drawable.frio, "Delicate drink for a hot day"));
        list3.add(new Coffee("Melted Ice Cream Iced Coffee", R.drawable.meltice, "Simple but not less tasty coffee drink"));
        list3.add(new Coffee("Mocha Frappuccino", R.drawable.frappuccino, "Familiar taste that will naver make you bored"));
        list3.add(new Coffee("Thai Iced Coffee", R.drawable.thai, "Spicy and incredibly fragrant cold coffee drink"));
        list3.add(new Coffee("Vanilla Cold Coffee", R.drawable.vanillacold, "Tasty and fragrant coffee drink"));
        list3.add(new Coffee("Whipped Banana Latte", R.drawable.banana, "Thick drink with deep flavor for dessert"));

        ArrayList<Coffee> list4 = new ArrayList<>();
        list4.add(new Coffee("Almond Ring Coffee Cake", R.drawable.almond, "With such cake you will easily please your family and friends"));
        list4.add(new Coffee("Apple Cream Coffee Cake", R.drawable.apple, "A cozy cake for family evenings"));
        list4.add(new Coffee("Banana Crumb Snack Cake", R.drawable.bananacrumb, "A simple recipe that will never let you down"));
        list4.add(new Coffee("Blackberry-Peach Coffee Cake", R.drawable.peachh, "A summery colorful coffee cake"));
        list4.add(new Coffee("Blueberry Coffee Cake", R.drawable.blueberry, "A cake with a bright taste of blueberry and almond flaovor"));
        list4.add(new Coffee("Buttermilk Coffee Cake", R.drawable.buttermilk, "Coffee cake with a creamy aftertaste"));
        list4.add(new Coffee("Cherry Cream Cheese Coffee Cake", R.drawable.cherry, "A composition of a crusty bottom and soft feeling"));
        list4.add(new Coffee("Chunky Mocha Cookies", R.drawable.chunky, "Nice crunchy cookies for any day"));
        list4.add(new Coffee("Cinnamon Roll Coffee Cake", R.drawable.cinnamon, "A cake that you will cook more than once again"));
        list4.add(new Coffee("Coffee Bonbons", R.drawable.bonbons, "A funny dessert for kids and adults"));
        list4.add(new Coffee("Coffee Walnut Cake", R.drawable.walnut, "Festive and elegant coffee cake"));
        list4.add(new Coffee("Delightful Devil's Food Cake", R.drawable.devils, "A cake that your guests will remember"));
        list4.add(new Coffee("Frosty Coffee Pie", R.drawable.frostycoffeepie, "A nice coffee dessert without baking"));
        list4.add(new Coffee("Layered Mocha Cheesecake", R.drawable.layeredmocha, "Favorite dessert in new implementation"));
        list4.add(new Coffee("Lemon-Rosemary Coffee Cake", R.drawable.lemonrosemary, "Unrepeatable aroma to match your cup of favorite coffee"));
        list4.add(new Coffee("Maple Nut Coffee Cake", R.drawable.maplenut, "An autumn cake for a cup of hot coffee"));
        list4.add(new Coffee("Mapple-Mocha Brownie Torte", R.drawable.brownie, "Unusual texture and unrepeatable taste"));
        list4.add(new Coffee("Mocha Cheesecake Bars", R.drawable.mochacheese, "All you love in a single coffee dessert"));
        list4.add(new Coffee("Mocha Java Pie with Kahlua Cream", R.drawable.javapie, "Multilayered coffee pleasure"));
        list4.add(new Coffee("Pretty Cranberry Coffee Cake", R.drawable.cranberry, "Such a familiar taste of home-made cake"));
        list4.add(new Coffee("Raspberry Cream Cheese Coffee Cake", R.drawable.raspberry, "A tender cake with a bright raspberry detail"));
        list4.add(new Coffee("Sour-Cream Pumpkin Coffee Cake", R.drawable.sour, "Taste of this pie will make you fall in love "));
        list4.add(new Coffee("Special Mocha Cupcakes", R.drawable.cupcakes, "A perfect dessert to a cup of your favorite coffee"));
        list4.add(new Coffee("Spicy Cupcakes with Mocha Frosting", R.drawable.mochafrost, "Unusual taste and aroma of well known cupcakes"));
        list4.add(new Coffee("Toffee-Mocha Cream Torte", R.drawable.toffee, "Coffee cake for your festival table"));

        ArrayList<Coffee> list5 = new ArrayList<>();
        list5.add(new Coffee("Butterscotch Coffee", R.drawable.butter, "A taste of childhood recreated in an adult coffee drink"));
        list5.add(new Coffee("Cafe Melange", R.drawable.cafemelange, "Simple yet elegant coffee drink "));
        list5.add(new Coffee("Cappuccino Blanko", R.drawable.cappuccinoblanko, "Foamy and light flavored hot drink"));
        list5.add(new Coffee("Chocolate Coffee", R.drawable.chocolatecoffee, "Sweet as chocolate,energizing as coffee"));
        list5.add(new Coffee("Citrus Spiced Coffee", R.drawable.citrus, "Fresh coffee drink with a spicy note of orage"));
        list5.add(new Coffee("Coffee Apres", R.drawable.coffeeappres, "Bracing coffee drink with a tiny vanilla note "));
        list5.add(new Coffee("Creamy Caramel Mocha", R.drawable.creamycaramel, "Coffee drink that can replace a dessert"));
        list5.add(new Coffee("Creamy Vanilla Coffee", R.drawable.creamyvanilla, "A coffee drink with flavor of vanilla pie"));
        list5.add(new Coffee("Easy Espresso", R.drawable.easyespresso, "The easiest recipe of the most energizing drink"));
        list5.add(new Coffee("Eggong Coffee", R.drawable.eggong, "Couple ingredients creating together a nice drink"));
        list5.add(new Coffee("Espresso Kon Panna", R.drawable.espressokonpanna, "A simple yet so tender coffee drink"));
        list5.add(new Coffee("Frothy Mexi-Mocha Coffee", R.drawable.meximocha, "Tender and round coffee drink"));
        list5.add(new Coffee("Ginger Coffee", R.drawable.ginger, "Flavored,hot drink for a cold evening"));
        list5.add(new Coffee("Hazelnut Coffee", R.drawable.hazelnutcoffee, "Coffee drink with chocolate-hazelnut taste"));
        list5.add(new Coffee("Holiday Peppermint Mocha", R.drawable.pepparmint, "Amazing coffee for special occasion"));
        list5.add(new Coffee("Hot Buttered Coffee", R.drawable.hotbuttered, "The tastiest coffee medicine for cold and chills"));
        list5.add(new Coffee("Hot Mocha", R.drawable.hotmocha, "A hot drink with a bright temper"));
        list5.add(new Coffee("Instant Coffee Espresso", R.drawable.instant, "Espresso for those who prefer instant coffee"));
        list5.add(new Coffee("Latte Macchiato", R.drawable.lattemacchiato, "Familiar and loved by many people coffee drink"));
        list5.add(new Coffee("Mocha Cinnamon Coffee", R.drawable.mochacinnamon, "Nice and easy to cook coffee drink"));
        list5.add(new Coffee("Pumpkin Spice Latte", R.drawable.pumpkinspice, "Popular and extremely flavored coffee drink"));
        list5.add(new Coffee("Toffee-Flavored Coffee", R.drawable.toffeeflavored, "An amazing mixture of sweet toffee and rough coffee"));
        list5.add(new Coffee("Turkish Coffee", R.drawable.turki, "This strong coffee will please the roughest coffee lovers"));
        list5.add(new Coffee("Winter Dream", R.drawable.winterdream, "Will warm you up even in a severest cold"));

        ArrayList<Coffee> list6 = new ArrayList<>();
        list6.add(new Coffee("Candy Cane Coffee", R.drawable.alcohol, "A christmas mystery coffee for beautiful festive evenings"));
        list6.add(new Coffee("Christmas Coffee", R.drawable.hot, "A delightful holiday cocoa flavored coffee for special evening "));
        list6.add(new Coffee("Coffee Grog", R.drawable.cold, "Such a warming and soothing coffee for really cold winter days"));
        list6.add(new Coffee("Ginger Spice Coffee", R.drawable.cocktail, "A magical coffee that will make you feel christmas in each sip"));
        list6.add(new Coffee("Gingerbread Coffee", R.drawable.alcohol, "Such a familiar aroma of cozy christmas evenings right in your cup"));
        list6.add(new Coffee("Hot chocolate Marshmallow Coffee", R.drawable.val, "Just a perfect christmas coffee"));
        list6.add(new Coffee("Hot Ginger Coffee", R.drawable.val, "Beautiful coffee to drink in front of a fireplace"));
        list6.add(new Coffee("Spiced Christmas Coffee", R.drawable.val, "warming coffee with special ingredients "));
        list6.add(new Coffee("Streaming Mocha Cocoa", R.drawable.val, "An incredibly delicious blend of coffee"));
        list6.add(new Coffee("Winter Spiced Coffee", R.drawable.val, "Rich and tasty coffee "));

        ArrayList<Coffee> list7 = new ArrayList<>();
        list7.add(new Coffee("Cafe Rose", R.drawable.alcohol, "Unusual flavor and amazing taste"));
        list7.add(new Coffee("Chocolate Cherry Coffee", R.drawable.hot, "A sweet coffee for a sweet romantic dinner"));
        list7.add(new Coffee("Chocolate Coffee Kiss", R.drawable.cold, "Sweet as a kiss this coffee will melt your heart "));
        list7.add(new Coffee("Don Juan Coffee", R.drawable.cocktail, "Crazy mix for true coffee lovers"));
        list7.add(new Coffee("Eden", R.drawable.alcohol, "Not another boring cocktail with bright notes"));
        list7.add(new Coffee("Honey Coffee", R.drawable.val, "Spicy and sweet coffee drink for a cozy evening "));
        list7.add(new Coffee("Iced Coffee with Chile de Arbol and dark Chocolate", R.drawable.val, "Burning mix of ingredients in icy coffee drink"));
        list7.add(new Coffee("Rose Coffee", R.drawable.val, "Nice and flavored drink for your beloved"));
        list7.add(new Coffee("Spiked Chocolate Kiss Coffee", R.drawable.val, "Perfect coffee to bring you close to each other"));
        list7.add(new Coffee("Valentine White Mocha", R.drawable.val, "Nice and warm coffee to say it all for you"));


        RecyclerView recyclerView = findViewById(R.id.coffee_list_recycler_view);
        CoffeeListAdapter adapter = null;

        switch (position) {
            case 0:
                adapter = new CoffeeListAdapter(list1);
                break;
            case 1:
                adapter = new CoffeeListAdapter(list2);
                break;
            case 2:
                adapter = new CoffeeListAdapter(list3);
                break;
            case 3:
                adapter = new CoffeeListAdapter(list4);
                break;
            case 4:
                adapter = new CoffeeListAdapter(list5);
                break;
            case 5:
                adapter = new CoffeeListAdapter(list6);
                break;
            case 6:
                adapter = new CoffeeListAdapter(list7);
                break;
        }

        adapter.setListListener(new CoffeeListAdapter.listListener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(CoffeeListActivity.this, OrderActivity.class);
                intent.putExtra("listPosition", position);
                startActivity(intent);
            }
        });
        LinearLayoutManager manager = new LinearLayoutManager(this);
        CoffeeListSpacing decoration = new CoffeeListSpacing(10);
        recyclerView.addItemDecoration(decoration);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }
}

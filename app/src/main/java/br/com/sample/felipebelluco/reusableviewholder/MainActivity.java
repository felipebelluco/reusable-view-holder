package br.com.sample.felipebelluco.reusableviewholder;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context = this;

    private RecyclerView methodsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        methodsRecyclerView = findViewById(R.id.coffee_brew_methods);
        methodsRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        methodsRecyclerView.setAdapter(new BrewingMethodAdapter(R.layout.method_item, getMethods()));
    }

    /* Private Methods */

    private List<CoffeeBrewingMethod> getMethods() {
        return Arrays.asList(
                new CoffeeBrewingMethod("Turkish Pot", "579"),
                new CoffeeBrewingMethod("Infusion Brewing", "1710"),
                new CoffeeBrewingMethod("French Drip Pot", "1790"),
                new CoffeeBrewingMethod("Espresso Machine", "1822"),
                new CoffeeBrewingMethod("Vacuum Coffee Maker", "1835"),
                new CoffeeBrewingMethod("Coffee Percolator", "1865"),
                new CoffeeBrewingMethod("Melitta", "1908"),
                new CoffeeBrewingMethod("French Press", "1929"),
                new CoffeeBrewingMethod("Pump Espresso Machine", "1961"),
                new CoffeeBrewingMethod("Automatic Dip Coffee Maker", "1970"),
                new CoffeeBrewingMethod("K-Cup System", "2012")
        );
    }
}

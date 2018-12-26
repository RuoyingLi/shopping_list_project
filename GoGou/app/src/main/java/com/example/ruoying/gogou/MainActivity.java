package com.example.ruoying.gogou;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView allItemsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        allItemsTextView = (TextView) findViewById(R.id.all_shopping_items);
        String[] items = {"Milch", "Tee"};
        for (String item : items) {
            allItemsTextView.append(item + "\n");
        }
    }

}

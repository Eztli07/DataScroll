package com.example.datascroll;


import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayDeque;
import java.util.Deque;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout container = findViewById(R.id.container);


        // populate deque
        Deque<String> deck = new ArrayDeque<>();
        deck.add("Heart");
        deck.add("Club");
        deck.add("Diamond");
        deck.add("Spade");
        deck.add("Ace");
        deck.add("Two");
        deck.add("Three");
        deck.add("Four");
        deck.add("Five");
        deck.add("Six");
        deck.add("Seven");
        deck.add("Eight");
        deck.add("Nine");
        deck.add("Ten");
        deck.add("Jack");
        deck.add("Queen");
        deck.add("King");


        // go through deque and add text
        for (String item : deck) {
            TextView textView = new TextView(this);
            textView.setText(item);
            textView.setTextSize(30);
            textView.setPadding(0, 10, 0, 10);
            container.addView(textView);
        }
    }
}

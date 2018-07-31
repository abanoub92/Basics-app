package com.abanoub.unit.basicsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** This textView represents a names for some kids toys */
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Create reference to an xml layout textView */
        mTextView = findViewById(R.id.tv_toy_names);

        /* Loop for display a list of toys names */
        for (String toy : toys()){
            mTextView.append(toy + "\n\n");
        }
    }

    /**
     * This simple method to save and hold the toys name
     * @return toysNames for some kids toys names
     */
    private String[] toys(){
        String[] toysNames = {
                "Red Toy Wagon",
                "Chemistry Set",
                "Yo-Yo",
                "Pop-Up Book",
                "Generic Uncopyrighted Mouse",
                "Finger Paint",
                "Sock Monkey",
                "Microscope Set",
                "Beach Ball",
                "BB Gun",
                "Green Soldiers",
                "Bubbles",
                "Spring Toy",
                "Fortune Telling Ball",
                "Plastic Connecting Blocks",
                "Water Balloon",
                "Paint-by-Numbers Kit",
                "Tuber Head",
                "Cool Ball with Holes in It",
                "Toy Truck",
                "Flying Disc",
                "Two-Handed Pogo Stick",
                "Toy Hoop",
                "Dysmorphia Doll",
                "Toy Train",
                "Fake Vomit",
                "Toy Telephone",
                "Barrel of Primates",
                "Remote Control Car",
                "Square Puzzle Cube",
                "Football",
                "Intergalactic Electronic Phasers",
                "Baby Horse Dolls",
                "Machines that turn into other Machines",
                "Teddy Bears",
                "Shaved Ice Maker",
                "Glow Stick",
                "Squirt Guns",
                "Miniature Replica Animals Stuffed with Beads that you swore to your parents would be worth lots of money one day",
                "Creepy Gremlin Doll",
                "Neodymium-Magnet Toy"
        };

        return toysNames;
    }
}

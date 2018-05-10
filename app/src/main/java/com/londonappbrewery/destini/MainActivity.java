package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyText;
    Button topButton;
    Button bottomButton;
    int mIndex =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mIndex == 1) {
                    //Top Button Pressed for T1
                    mIndex = 3;
                    storyText.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                } else if (mIndex == 2) {
                    mIndex = 3;
                    storyText.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                } else  if (mIndex == 3) {
                    mIndex = 6;
                    storyText.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }


            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mIndex == 1) {
                    //Bottom button pressed for T1
                    mIndex =2;
                    storyText.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                } else if (mIndex == 2) {
                    mIndex = 4;
                    storyText.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                } else if (mIndex == 3) {
                    mIndex = 5;
                    storyText.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
            }
        });

    }
}

package com.example.tablayout;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Kartik extends Fragment {

    private ImageView myImageView;
    private TextView myTextView;

    // Define the delay in milliseconds
    private static final long DELAY_MS = 3000; // 3 seconds

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView= inflater.inflate(R.layout.activity_kartik,container,false);

        // Initialize your views
        myImageView = myView.findViewById(R.id.myImageView);
        myTextView = myView.findViewById(R.id.myTextView);

        // Create a Handler associated with the main UI thread's Looper
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // This code will execute after DELAY_MS milliseconds

                // 1. Make the ImageView visible
                myImageView.setVisibility(View.VISIBLE);
                // Optional: Add a fade-in animation for the image
                AlphaAnimation fadeInImage = new AlphaAnimation(0.0f, 1.0f);
                fadeInImage.setDuration(1000); // 1 second fade duration
                myImageView.startAnimation(fadeInImage);


                // 2. Make the TextView visible
                myTextView.setVisibility(View.VISIBLE);
                // Optional: Add a fade-in animation for the text
                AlphaAnimation fadeInText = new AlphaAnimation(0.0f, 1.0f);
                fadeInText.setDuration(1000); // 1 second fade duration
                myTextView.startAnimation(fadeInText);
            }
        }, DELAY_MS); // The delay in milliseconds

        return myView;
    }
}
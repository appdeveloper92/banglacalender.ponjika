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

public class Ashwin extends Fragment {
    private ImageView myImageView;
    private TextView myTextView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView= inflater.inflate(R.layout.activity_ashwin,container,false);

        myImageView = myView.findViewById(R.id.myImageView);
        myTextView = myView.findViewById(R.id.myTextView);

        // Define the delays in milliseconds
        final long IMAGE_DELAY_MS = 2000; // 2 seconds
        final long TEXT_DELAY_MS = 3000; // 3 seconds (after activity start)

        // --- Make the ImageView appear after IMAGE_DELAY_MS ---
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                myImageView.setVisibility(View.VISIBLE);

                // Optional: Add a fade-in animation for the image
                AlphaAnimation fadeInImage = new AlphaAnimation(0.0f, 1.0f);
                fadeInImage.setDuration(1000); // 1 second fade duration
                myImageView.startAnimation(fadeInImage);
            }
        }, IMAGE_DELAY_MS);

        // --- Make the TextView appear after TEXT_DELAY_MS ---
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                myTextView.setVisibility(View.VISIBLE);

                // Optional: Add a fade-in animation for the text
                AlphaAnimation fadeInText = new AlphaAnimation(0.0f, 1.0f);
                fadeInText.setDuration(1000); // 1 second fade duration
                myTextView.startAnimation(fadeInText);
            }
        }, TEXT_DELAY_MS);

        return myView;
    }
}
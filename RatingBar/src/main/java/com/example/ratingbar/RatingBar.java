package com.example.ratingbar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class RatingBar extends LinearLayout {

    private int maxStars = 5;
    private float rating = 0;
    private OnRatingChangedListener onRatingChangedListener;

    public RatingBar(Context context) {
        super(context);
        init();
    }

    public RatingBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RatingBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setOrientation(LinearLayout.HORIZONTAL);
        for (int i = 1; i <= maxStars; i++) {
            addView(createStar(Color.GRAY, i));
        }
    }

    private View createStar(int starColor, int index) {
        ImageView starIcon = new ImageView(getContext());
        starIcon.setImageResource(android.R.drawable.star_off);
        starIcon.setColorFilter(starColor, PorterDuff.Mode.SRC_ATOP);
        starIcon.setClickable(true);
        starIcon.setOnClickListener(v -> {
            rating = index;
            updateRating();
        });
        return starIcon;
    }

    private void updateRating() {
        for (int i = 0; i < getChildCount(); i++) {
            int starColor = i < rating ? Color.YELLOW : Color.GRAY;
            ImageView starIcon = (ImageView) getChildAt(i);
            starIcon.setColorFilter(starColor, PorterDuff.Mode.SRC_ATOP);
        }
        if (onRatingChangedListener != null) {
            onRatingChangedListener.onRatingChanged(rating);
        }
    }

    public void setMaxStars(int maxStars) {
        this.maxStars = maxStars;
        removeAllViews();
        init();
    }

    public void setRating(float rating) {
        this.rating = rating;
        updateRating();
    }

    public void setOnRatingChangedListener(OnRatingChangedListener listener) {
        this.onRatingChangedListener = listener;
    }

    public interface OnRatingChangedListener {
        void onRatingChanged(float rating);
    }
}

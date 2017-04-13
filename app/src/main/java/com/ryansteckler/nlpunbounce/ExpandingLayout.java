package com.ryansteckler.nlpunbounce;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by rsteckler on 9/9/14.
 */
public class ExpandingLayout extends FrameLayout {

    public ExpandingLayout(Context context) {
        super(context);
    }

    public ExpandingLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setAnimationBounds(int startTop, int finalTop, int startBottom, int finalBottom) {
    }
}
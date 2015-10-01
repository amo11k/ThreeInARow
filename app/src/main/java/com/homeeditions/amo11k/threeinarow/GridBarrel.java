package com.homeeditions.amo11k.threeinarow;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;

/**
 * Created by Jakhe on 30/09/2015.
 */
public class GridBarrel extends GridLayout{
    private Button[][] buttons;
    private static final int NUM_BUTTONS = 9;
    private static final int NUM_MATRIX = 3;


    public GridBarrel(Context context) {
        super(context);
        create();
    }
    public GridBarrel(Context context, AttributeSet attrs) {
        super(context, attrs);
        create();
    }

    public GridBarrel(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void create() {
        buttons = new Button[NUM_MATRIX][NUM_MATRIX];
        for(int i=1;i<=NUM_MATRIX;i++){
            for(int j=1;j<=NUM_MATRIX;j++){
                buttons[i-1][j-1] = new Button(getContext(),null,android.R.attr.button);
                buttons[i-1][j-1].setText("");
                addView(buttons[i-1][j-1]);

            }
        }
    }
}


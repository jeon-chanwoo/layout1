package com.cookandroid.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(1080,800);
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(540,800);
        LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(540,400);

        LinearLayout linearLayout1 = new LinearLayout(this);
        linearLayout1.setOrientation(LinearLayout.VERTICAL);
        linearLayout1.setBackgroundColor(Color.rgb(0,0,255));

        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout2.setBackgroundColor(Color.rgb(0,0,0));

        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(LinearLayout.VERTICAL);
        linearLayout3.setBackgroundColor(Color.rgb(255,0,0));

        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(LinearLayout.VERTICAL);
        linearLayout4.setBackgroundColor(Color.rgb(0,255,0));

        linearLayout2.setLayoutParams(params1);
        linearLayout1.addView(linearLayout2);

        linearLayout3.setLayoutParams(params2);
        linearLayout2.addView(linearLayout3);

        linearLayout4.setLayoutParams(params3);
        linearLayout2.addView(linearLayout4);

        setContentView(linearLayout1);

    }
}

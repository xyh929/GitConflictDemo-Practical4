package com.example.gitconflictdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View root = findViewById(R.id.main);
        int padding = Math.round(24 * getResources().getDisplayMetrics().density);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            root.setOnApplyWindowInsetsListener((view, insets) -> {
                android.graphics.Insets bars = insets.getInsets(
                        android.view.WindowInsets.Type.systemBars());
                view.setPadding(padding + bars.left, padding + bars.top,
                        padding + bars.right, padding + bars.bottom);
                return insets;
            });
        } else {
            root.setOnApplyWindowInsetsListener((view, insets) -> {
                view.setPadding(padding + insets.getSystemWindowInsetLeft(),
                        padding + insets.getSystemWindowInsetTop(),
                        padding + insets.getSystemWindowInsetRight(),
                        padding + insets.getSystemWindowInsetBottom());
                return insets;
            });
        }
        root.requestApplyInsets();

        TextView status = findViewById(R.id.statusText);
        findViewById(R.id.buttonOne).setOnClickListener(
                view -> status.setText(R.string.button_one_pressed));
        findViewById(R.id.buttonTwo).setOnClickListener(
                view -> status.setText(R.string.button_two_pressed));
    }
}

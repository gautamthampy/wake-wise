package com.example.wakewisefinal;

import android.annotation.SuppressLint;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView mBottomNav = findViewById(R.id.navigation);

        mBottomNav.setOnItemSelectedListener(item -> {
            ((TextView)findViewById(R.id.temptext)).setText(item.getTitle().toString()+": Try scrolling m8");
            return true;
        });
    }
}
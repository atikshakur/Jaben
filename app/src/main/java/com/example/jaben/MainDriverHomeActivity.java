package com.example.jaben;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainDriverHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_driver_home);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        // for  Driver Bottom Navigation:1

        BottomNavigationView bottomnav = findViewById(R.id.driver_bottom_navigation);
        bottomnav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new TodayFragment()).commit();

        // for  Driver Bottom Navigation:1
    }

    // for  Driver Bottom Navigation:2

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()) {
                        case R.id.nav_today:
                            selectedFragment = new TodayFragment();
                            break;

                        case R.id.nav_leaderboard:
                            selectedFragment = new LeaderboardFragment();
                            break;

                        case R.id.nav_earning:
                            selectedFragment = new IncomeFragment();
                            break;

                        case R.id.nav_account:
                            selectedFragment = new AcountFragment();
                            break;

                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };
    // for  Driver Bottom Navigation:2

}

package com.example.pocketnamazshikkha;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    DrawerLayout home_drawerlayout;
    ActionBarDrawerToggle home_actionBarDrawerToggle;
    Button newHomeButton_1, newHomeButton_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newHomeButton_1 = findViewById(R.id.newHomeButton1_id);
        newHomeButton_2 = findViewById(R.id.newHomeButton2_id);


        newHomeButton_1.setOnClickListener(this);
        newHomeButton_2.setOnClickListener(this);
        //NvaigationBar

        home_drawerlayout = findViewById(R.id.homeDrawer_id);
        home_actionBarDrawerToggle = new ActionBarDrawerToggle(this, home_drawerlayout, R.string.Open, R.string.Close);
        home_actionBarDrawerToggle.setDrawerIndicatorEnabled(true);

        home_drawerlayout.addDrawerListener(home_actionBarDrawerToggle);
        home_actionBarDrawerToggle.syncState();
        getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = findViewById(R.id.homeNav_id);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id == R.id.home_nav_Azan_id) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_id, new AzanAndDuyaFragment()).addToBackStack(null).commit();

                } else if (id == R.id.home_nav_Duya_id) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_id, new DuyaAndZikirFragment()).addToBackStack(null).commit();
                    Toast.makeText(MainActivity.this, "Duya & Zikir is selected", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.home_nav_Kiyam_id) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_id, new KiyamFragment()).addToBackStack(null).commit();
                    Toast.makeText(MainActivity.this, "Kiyam is selected", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.home_nav_Hadis_id) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_id, new HadisFragment()).addToBackStack(null).commit();
                    Toast.makeText(MainActivity.this, "Hadis is selected", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.home_nav_Shorto_id) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_id, new NamazConditionFragment()).addToBackStack(null).commit();
                    Toast.makeText(MainActivity.this, "Namaz Condition is selected", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.home_question_answer_id) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_id, new QuestionAndAnswerFragment()).addToBackStack(null).commit();
                    Toast.makeText(MainActivity.this, "Question And Answer is selected", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return home_actionBarDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.newHomeButton1_id) {
            Intent intent = new Intent(getApplicationContext(), ManActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.newHomeButton2_id) {
            Intent intent = new Intent(getApplicationContext(), WomanActivity.class);
            startActivity(intent);
        }


    }

    @Override
    public void onBackPressed() {
        if (home_drawerlayout.isDrawerOpen(Gravity.START)) {
            home_drawerlayout.closeDrawer(Gravity.START);
        } else {
            super.onBackPressed();
        }
    }
}

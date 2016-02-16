package com.example.walter.beeradvisor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_find_beer);

            }
    //call when the user clicks the button
    public void onClickFindBeer(View view){
        //Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Get a reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get the selected item in the spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Display selected item
        brands.setText(beerType);

    }
    }

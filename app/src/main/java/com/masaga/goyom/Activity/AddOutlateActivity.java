package com.masaga.goyom.Activity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.view.MenuItem;

import com.masaga.goyom.R;

/**
 * Created by khyati.shah on 5/10/2017.
 */

public class AddOutlateActivity extends AppCompatActivity {
    //@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_outlate);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // setupWindowAnimations();

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setupWindowAnimations() {
        Slide slide = (Slide) TransitionInflater.from(AddOutlateActivity.this).inflateTransition(R.transition.activity_slide);
        getWindow().setEnterTransition(slide);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

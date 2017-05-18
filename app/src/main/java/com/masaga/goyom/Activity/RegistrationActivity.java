package com.masaga.goyom.Activity;

import android.content.Intent;
import android.os.Bundle;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.masaga.goyom.R;

/**
 * Created by khyati.shah on 5/8/2017.
 */


public class RegistrationActivity extends AppCompatActivity {

    private FloatingActionsMenu floating_action_menu;
    private FloatingActionButton fabAddEntity, fabAddOutlate;

    //@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // setupWindowAnimations();
        floating_action_menu = (FloatingActionsMenu) findViewById(R.id.floating_action_menu);
        fabAddEntity = (FloatingActionButton) findViewById(R.id.fabAddEntity);
        fabAddOutlate = (FloatingActionButton) findViewById(R.id.fabAddOutlate);

        fabAddEntity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, AddEntityActivity.class);
                startActivity(intent);
            }
        });

        fabAddOutlate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, AddOutlateActivity.class);
                startActivity(intent);
            }
        });


    }

    /*@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setupWindowAnimations() {
        Slide slide = (Slide) TransitionInflater.from(RegistrationActivity.this).inflateTransition(R.transition.activity_slide);
        getWindow().setEnterTransition(slide);
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

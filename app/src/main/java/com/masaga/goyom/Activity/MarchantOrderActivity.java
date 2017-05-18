package com.masaga.goyom.Activity;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.masaga.goyom.R;

import ernestoyaquello.com.verticalstepperform.VerticalStepperFormLayout;
import ernestoyaquello.com.verticalstepperform.interfaces.VerticalStepperForm;

/**
 * Created by khyati.shah on 5/11/2017.
 */

public class MarchantOrderActivity extends AppCompatActivity implements VerticalStepperForm {

    private VerticalStepperFormLayout verticalStepperForm;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marchant_order);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //setupWindowAnimations();
        verticalStepperForm = (VerticalStepperFormLayout) findViewById(R.id.vertical_stepper_form);
        VerticalStepperFormLayout.Builder.newInstance(verticalStepperForm, getResources().getStringArray(R.array.steps_titles), this, MarchantOrderActivity.this)
                //.stepsSubtitles(stepsSubtitles)
                //.materialDesignInDisabledSteps(true) // false by default
                .showVerticalLineWhenStepsAreCollapsed(true) // false by default
                .primaryColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary))
                .primaryDarkColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark))
                .displayBottomNavigation(false)
                .init();

    }

    /*@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setupWindowAnimations() {
        Slide slide = (Slide) TransitionInflater.from(AddEntityActivity.this).inflateTransition(R.transition.activity_slide);
        getWindow().setEnterTransition(slide);
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View createStepContentView(int stepNumber) {
        View view = null;
        switch (stepNumber) {
            case 0:
                view = createStep1();
                break;
            case 1:
                view = createStep2();
                break;
            case 2:
                view = createStep3();
                break;
        }
        return view;
    }

    @Override
    public void onStepOpening(int stepNumber) {
        switch (stepNumber) {
            case 0:
                verticalStepperForm.setActiveStepAsCompleted();
                break;
            case 1:
                verticalStepperForm.setActiveStepAsCompleted();
                break;
            case 2:
                verticalStepperForm.setActiveStepAsCompleted();
                break;

        }
    }

    @Override
    public void sendData() {

    }

    private View createStep1() {
        LayoutInflater inflater = LayoutInflater.from(getBaseContext());
        LinearLayout parentContainer =
                (LinearLayout) inflater.inflate(R.layout.pickup_detail_step1, null, true);
        return parentContainer;
    }

    private View createStep2() {
        LayoutInflater inflater = LayoutInflater.from(getBaseContext());
        ScrollView parentContainer =
                (ScrollView) inflater.inflate(R.layout.add_stop_step2, null, true);
        FloatingActionButton fabAdd = (FloatingActionButton) parentContainer.findViewById(R.id.fabAdd);
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(MarchantOrderActivity.this, android.R.style.Theme_Holo_Light_Dialog);
                dialog.setTitle("Add Order");
                dialog.setContentView(R.layout.dialog_add_order);
                Button buttonAdd = (Button) dialog.findViewById(R.id.buttonAdd);
                buttonAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        return parentContainer;

    }

    private View createStep3() {
        LayoutInflater inflater = LayoutInflater.from(getBaseContext());
        LinearLayout parentContainer =
                (LinearLayout) inflater.inflate(R.layout.confitm_step_3, null, true);
        return parentContainer;
    }

    @Override
    public void continuePressed(int stepNumber) {
        switch (stepNumber) {
            case 0:
                validateStep1();
                break;
            case 1:
                validateStep2();
                break;
            case 2:
                validateStep3();
                break;

        }
    }

    private void validateStep1() {
        verticalStepperForm.goToNextStep();
    }

    private void validateStep2() {
        verticalStepperForm.goToNextStep();
    }

    private void validateStep3() {
        verticalStepperForm.goToNextStep();
    }
}
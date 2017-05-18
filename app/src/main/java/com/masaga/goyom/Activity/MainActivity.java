package com.masaga.goyom.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.masaga.goyom.R;

public class MainActivity extends AppCompatActivity {

    Button register_button,buttonLogin;

  //  @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // setupWindowAnimations();
        register_button = (Button) findViewById(R.id.register_button);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MarchantOrderActivity.class);
                startActivity(intent);
            }
        });
    }

    /*@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setupWindowAnimations() {
        Slide slide = (Slide) TransitionInflater.from(MainActivity.this).inflateTransition(R.transition.activity_slide);
        getWindow().setEnterTransition(slide);
    }*/
}

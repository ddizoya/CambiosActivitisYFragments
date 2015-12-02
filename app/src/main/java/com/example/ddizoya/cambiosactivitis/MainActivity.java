package com.example.ddizoya.cambiosactivitis;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        validar();

    }

    public void validar(){
        FragmentB fb = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
        if (fb == null || ! fb.isInLayout()){
            EditText eta = (EditText) findViewById(R.id.fraga);
            eta.setText("Fragment A");
            eta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                }
            });

        } else {
            EditText eta = (EditText) findViewById(R.id.fraga);
            EditText etb = (EditText) findViewById(R.id.fragb);
            eta.setText("Fragment A");
            etb.setText("Fragment B");
        }
    }









}

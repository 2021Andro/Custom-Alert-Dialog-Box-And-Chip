package com.example.customalertbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;

public class MainActivity extends AppCompatActivity {

    private Chip cNormalChip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cNormalChip = findViewById(R.id.cNormalChip);

        cNormalChip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Responds to chip click

                Toast.makeText(MainActivity.this, "Normal Chip", Toast.LENGTH_SHORT).show();

            }
        });


        cNormalChip.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Responds to chip's close icon click if one is present

            }
        });

        cNormalChip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean btnClick) {

                if (btnClick) {
                    cNormalChip.setChipBackgroundColorResource(R.color.purple_200);
                }else {

                    cNormalChip.setChipBackgroundColorResource(R.color.purple_500);
                }

            }
        });


    }
}
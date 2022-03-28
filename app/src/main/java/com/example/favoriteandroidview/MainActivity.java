package com.example.favoriteandroidview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기 20180837_송찬호");

        TextView text1, text2;
        Switch switch1;
        RadioGroup Rgroup;
        RadioButton RdoQ, RdoR, RdoS;
        ImageView imageview;
        Button btn1, btn2;

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        switch1 = (Switch) findViewById(R.id.switch1);
        Rgroup = (RadioGroup) findViewById(R.id.Rgroup);
        RdoQ = (RadioButton) findViewById(R.id.RdoQ);
        RdoR = (RadioButton) findViewById(R.id.RdoR);
        RdoS = (RadioButton) findViewById(R.id.RdoS);
        imageview = (ImageView) findViewById(R.id.imageView);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (switch1.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    Rgroup.setVisibility(View.VISIBLE);
                    imageview.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    Rgroup.setVisibility(View.INVISIBLE);
                    imageview.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                }
            }
        });

        Rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(Rgroup.getCheckedRadioButtonId()) {
                    case R.id.RdoQ:
                        imageview.setImageResource(R.drawable.q10);
                        break;
                    case R.id.RdoR:
                        imageview.setImageResource(R.drawable.r11);
                        break;
                    case R.id.RdoS:
                        imageview.setImageResource(R.drawable.s12);
                        break;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent finish = new Intent(Intent.ACTION_VIEW, Uri.parse("finish"));
                startActivity(finish);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch1.setChecked(false);
            }
        });

    }
}
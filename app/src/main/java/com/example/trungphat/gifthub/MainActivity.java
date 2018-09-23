package com.example.trungphat.gifthub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    //khai bao bien
    ImageView IMG_hinh1, IMG_hinh2 ;
    Button btn_langdh, btn_hoda, btn_suoitien;
    RadioGroup group;
    RadioButton tham_quan, an_uong, vui_choi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IMG_hinh1 = (ImageView) findViewById(R.id.IMG_hinh1);
        IMG_hinh2 = (ImageView) findViewById(R.id.IMG_hinh2);
        btn_hoda = (Button) findViewById(R.id.btn_hoda);
        btn_langdh = (Button) findViewById(R.id.btn_langdh);
        btn_suoitien = (Button) findViewById(R.id.btn_suoitien);
        group = (RadioGroup) findViewById(R.id.Group);
        tham_quan =(RadioButton) findViewById(R.id.Tham_quan);
        an_uong =(RadioButton) findViewById(R.id.An_uong);
        vui_choi =(RadioButton) findViewById(R.id.Vui_choi);

        btn_suoitien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IMG_hinh1.setBackgroundResource(R.drawable.suoitien);
            }
        });

        btn_langdh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IMG_hinh1.setBackgroundResource(R.drawable.langdh);
            }
        });

        btn_hoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IMG_hinh1.setBackgroundResource(R.drawable.hoda);
            }
        });

        tham_quan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                IMG_hinh2.setBackgroundResource((R.drawable.tham_quan));
                }
            }
        });

        an_uong.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    IMG_hinh2.setBackgroundResource((R.drawable.an_uong));
                }            }
        });

        vui_choi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    IMG_hinh2.setBackgroundResource((R.drawable.vui_choi));
                }            }
        });


    }
}

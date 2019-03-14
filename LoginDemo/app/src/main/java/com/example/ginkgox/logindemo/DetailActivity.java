package com.example.ginkgox.logindemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ginkgoX on 2019/3/13.
 */

public class DetailActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String title = getIntent().getStringExtra("title");
        TextView textView = (TextView)findViewById(R.id.tv_title);
        textView.setText(title);
        int image = getIntent().getIntExtra("image",-1);
        ImageView Iv = (ImageView) findViewById(R.id.Iv);
        Iv.setImageResource(image);
        String info = getIntent().getStringExtra("info");
        TextView tv_info = (TextView)findViewById(R.id.tv_info);
        tv_info.setText(info);
    }
}

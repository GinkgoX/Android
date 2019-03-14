package com.example.ginkgox.checkboxdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mTV;   //用于显示问题
    RadioGroup mRG; //用于显示答案
    RadioButton mRB1;   //用于显示按钮
    RadioButton mRB2;
    RadioButton mRB3;
    RadioButton mRB4;
    Button mBT; //跳转按钮
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //加载布局文件

        //加载控件绑定
        mTV = (TextView) findViewById(R.id.textview);
        mRG = (RadioGroup) findViewById(R.id.radiogroup);
        mRB1 = (RadioButton) findViewById(R.id.radiobutton1);
        mRB2 = (RadioButton) findViewById(R.id.radiobutton2);
        mRB3 = (RadioButton) findViewById(R.id.radiobutton3);
        mRB4 = (RadioButton) findViewById(R.id.radiobutton4);
        mBT = (Button) findViewById(R.id.button1);

        //设置选择按钮监听
        mRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == mRB3.getId()){
                    MyToast("正确答案 : " + mRB3.getText() + " 恭喜您回答正确 !");
                }else {
                    MyToast("很抱歉， 回答错误， 再接再厉 ！");
                }
            }
        });

        //设置跳转按钮监听
        mBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Activity_two.class);
                startActivity(intent);
                finish();
            }
        });

    }



    //定义MyToast函数显示按钮内容
    private void MyToast(String result){
        Toast mtoast = Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT);
        mtoast.setGravity(Gravity.TOP, 0 , 400);
        mtoast.show();
    }
}

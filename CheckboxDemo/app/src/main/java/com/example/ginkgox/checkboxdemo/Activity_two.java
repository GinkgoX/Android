package com.example.ginkgox.checkboxdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

/**
 * Created by ginkgoX on 2019/3/7.
 */

public class Activity_two extends Activity{
    CheckBox mCB1;  //用于显示选项
    CheckBox mCB2;
    CheckBox mCB3;
    CheckBox mCB4;
    Button mBT2;    //提交按钮
    Button mBT3;    //跳转按钮
    int num = 0;    //统计被选中按钮数

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_two);  //加载布局文件
        initUI();   //初始化控件

        //绑定监听
        mCB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(mCB1.isChecked()){
                    num++;
                    MyToast("你选择了" + mCB1.getText());
                }else{
                    num--;
                }
            }
        });

        mCB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(mCB2.isChecked()){
                    num++;
                    MyToast("你选择了" + mCB2.getText());
                }else{
                    num--;
                }
            }
        });

        mCB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(mCB3.isChecked()){
                    num++;
                    MyToast("你选择了 " + mCB3.getText());
                }else{
                    num--;
                }
            }
        });

        mCB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(mCB4.isChecked()){
                    num++;
                    MyToast("你选择了 " + mCB4.getText());
                }else{
                    num--;
                }
            }
        });

        mBT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyToast("感谢您的参与， 您一共选择了 " + num + "项");
            }
        });

        mBT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Activity_two.this, Activity_three.class);
                startActivity(intent);
                finish();
            }
        });


    }


    //初始化控件变量
    private void initUI(){
        mCB1 = (CheckBox)findViewById(R.id.checkbox1);
        mCB2 = (CheckBox)findViewById(R.id.checkbox2);
        mCB3 = (CheckBox)findViewById(R.id.checkbox3);
        mCB4 = (CheckBox)findViewById(R.id.checkbox4);
        mBT2 = (Button)findViewById(R.id.button2);
        mBT3 = (Button)findViewById(R.id.button3);
    }

    //定义Toast回显
    private  void MyToast(String result){
        Toast mtoast = Toast.makeText(Activity_two.this, result, Toast.LENGTH_SHORT);
        mtoast.setGravity(Gravity.TOP, 0, 400);
        mtoast.show();
    }
}

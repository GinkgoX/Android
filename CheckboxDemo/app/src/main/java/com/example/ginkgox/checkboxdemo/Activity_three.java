package com.example.ginkgox.checkboxdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by ginkgoX on 2019/3/7.
 */

public class Activity_three extends Activity {
    RadioGroup mRG3;    //用于显示答案
    RadioButton mRB31;  //用一显示选项
    RadioButton mRB32;
    RadioButton mRB33;
    RadioButton mRB34;
    Button mBT3;    //页面跳转

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_three);    //加载布局文件
        System.out.println("加载成功 ！ ");
        mRG3 = (RadioGroup)findViewById(R.id.radiogroup3);
        mRB31 = (RadioButton)findViewById(R.id.radiobutton31);
        mRB32 = (RadioButton)findViewById(R.id.radiobutton32);
        mRB33 = (RadioButton)findViewById(R.id.radiobutton33);
        mRB34 = (RadioButton)findViewById(R.id.radiobutton34);
        mBT3 = (Button)findViewById(R.id.button33);

        //设置事件监听
        mRG3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == mRB33.getId()){
                    MyToast("正确答案： " + mRB33.getText() + " 恭喜你，回答正确");
                }else{
                    MyToast("很遗憾， 回答错误， 再接再厉 ！ ");
                }
            }
        });

        mBT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    //听过Toast显示字符
    private void MyToast(String result){
        Toast mtoast = Toast.makeText(Activity_three.this, result, Toast.LENGTH_SHORT);
        mtoast.setGravity(Gravity.TOP, 0, 400);
        mtoast.show();
    }
}
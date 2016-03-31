package com.example.rr.toastapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mButton = (Button) findViewById(R.id.TButton);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        Toast toast=Toast.makeText(getApplicationContext()," ",Toast.LENGTH_SHORT);
//         toast.setGravity(Gravity.CENTER,0,0);//改变位置
//         toast.show();
        //-------------添加图片到Toast----------------//
//        Toast toast=Toast.makeText(getApplicationContext(),"图片",Toast.LENGTH_LONG);//图片
//         toast.setGravity(Gravity.CENTER,0,0);
//        LinearLayout toastView= (LinearLayout) toast.getView();//对Toast图片进行布局
//        ImageView imageview=new ImageView(MainActivity.this);
//        imageview.setImageResource(R.mipmap.m2);//标注图片的位置
//        toastView.addView(imageview,1);//布局与图片关联
//        toast.show();
        LayoutInflater inflater=getLayoutInflater();//实例化布局填充器
        View mylayout=inflater.inflate(R.layout.custom ,null);//定义布局
        //-----自定义内容
        ImageView IView= (ImageView) mylayout.findViewById(R.id.IVToast);
        IView.setImageResource(R.mipmap.m2);
        TextView text= (TextView) mylayout.findViewById(R.id.TVToast);//获得布局里的指定id
        text.setText("自定义");//------//
        Toast toast=new Toast(getApplicationContext());//兴建Toast
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,12,14);//定义Toast的尺寸
        toast.setDuration(Toast.LENGTH_LONG);//持续显示
        toast.setView(mylayout);
        toast.show();

    }


}

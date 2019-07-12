package com.ssb.app0712;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;
    LinearLayout linearLayout;

    FragmentManager manager;

    OneFragment oneFragment;
    TwoFragment twoFragment;
    ThreeFragment threeFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 =(Button)findViewById(R.id.listbtn);
        btn2 =(Button)findViewById(R.id.dialogbtn);
        btn3 =(Button)findViewById(R.id.fragmentbtn);

        linearLayout=(LinearLayout)findViewById(R.id.main_container);

        oneFragment = new OneFragment();
        threeFragment =new ThreeFragment();
        twoFragment = new TwoFragment();

        manager = getSupportFragmentManager();

        //첫번째 화면 만들기
        FragmentTransaction tf = manager.beginTransaction();
        tf.addToBackStack(null);
        tf.add(R.id.main_container,oneFragment);
        tf.commit();

        //버튼 클릭 이벤트 처리
        btn1.setOnClickListener((view)->{
            if(!oneFragment.isVisible()){
                FragmentTransaction tf1 = manager.beginTransaction();
                tf1.addToBackStack(null);
                tf1.replace(R.id.main_container,oneFragment);
                tf1.commit();
            }
        });

        btn2.setOnClickListener((view)->{
            if(!twoFragment.isVisible()){
               twoFragment.show(manager,null);
            }
        });

        btn3.setOnClickListener((view)->{
            if(!threeFragment.isVisible()){
                FragmentTransaction tf1= manager.beginTransaction();
                tf1.addToBackStack(null);
                tf1.replace(R.id.main_container,threeFragment);
                tf1.commit();
            }
        });



    }
}

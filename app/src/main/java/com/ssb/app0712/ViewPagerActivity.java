package com.ssb.app0712;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        ViewPager pager = findViewById(R.id.pager);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);


    }

    class MyPagerAdapter extends FragmentPagerAdapter{
        //fragment 저장할 list
        ArrayList<Fragment> fragments ;
        //생성자에 데이터 생성
        public  MyPagerAdapter(FragmentManager manager) {
            super(manager);
            fragments = new ArrayList<>();
            fragments.add(new OneFragment());
            fragments.add(new ThreeFragment());
        }
        //화면 개수 설정 메소드
        @Override
        public int getCount(){
            return fragments.size();
        }
        //출력할 Fragment를 설정하는 메소드
        @Override
        public Fragment getItem(int position){
            return fragments.get(position);
        }
    }
}

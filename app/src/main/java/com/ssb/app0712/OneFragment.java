package com.ssb.app0712;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class OneFragment extends ListFragment {
    @Override
    //화면에 출력될 내용을 만드는 메소드
    public void onViewCreated(View view, Bundle saveInstanceState){
        super.onViewCreated(view,saveInstanceState);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Xiexie");
        list.add("Annyeong");
        list.add("Gonizziwa");
        list.add("Spasiva");

        ArrayAdapter<String>adapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,list);
        setListAdapter(adapter);
    }


    //항목을 선택했을 때 호출될 메소드
    @Override
    public void onListItemClick(ListView l,View v,int position, long id){
        Toast.makeText(getActivity(),(String)l.getAdapter().getItem(position),Toast.LENGTH_LONG).show();
    }

}

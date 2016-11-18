package com.org.iii.shine09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private SimpleAdapter adapter;
    private LinkedList<HashMap<String,Object>> data;    // 資料集
    private String[] from = {"title", "content", "img"};
    private int[] to = {R.id.item_tv, R.id.item_content, R.id.item_img};
    private int[] imgs = {R.drawable.b0, R.drawable.b1, R.drawable.b2,R.drawable.b3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        initListView();
    }

    private void initListView(){
        data = new LinkedList<>();

        for (int i=0; i<20; i++) {
            HashMap<String, Object> row0 = new HashMap<>();   // 一筆資料
            row0.put(from[0], "PPAP:" + i);
            row0.put(from[1], "apple:" + i);
            row0.put(from[2], imgs[(int)(Math.random()*4)]);
            data.add(row0);
        }





        adapter = new SimpleAdapter(
                this, data, R.layout.layout_item,from,to);
        listView.setAdapter(adapter);
    }
}

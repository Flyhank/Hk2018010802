package com.n9s.flyjet.hk2018010802;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity
{
    //ArrayList<Map<String, String>> mylist = new ArrayList();
    ArrayList<Map<String, Object>> mylist = new ArrayList();
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView);

        //HashMap<String, String> m1 = new HashMap<>();             //僅字串資料
        HashMap<String, Object> m1 = new HashMap<>();  //image為int; only Object可含String&Int;
        m1.put("city", "台北");
        m1.put("code", "02");
        m1.put("img", R.drawable.tpe);      //image為int; 必須使用Object給String與Int共用
        mylist.add(m1);

        //HashMap<String, String> m2 = new HashMap<>();
        HashMap<String, Object> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        m2.put("img", R.drawable.tc);
        mylist.add(m2);

        //HashMap<String, String> m3 = new HashMap<>();
        HashMap<String, Object> m3 = new HashMap<>();
        m3.put("city", "台南");
        m3.put("code", "06");
        m3.put("img", R.drawable.tn);
        mylist.add(m3);

        //HashMap<String, String> m4= new HashMap<>();
        HashMap<String, Object> m4= new HashMap<>();
        m4.put("city", "台中");
        m4.put("code", "07");
        m4.put("img", R.drawable.kh);
        mylist.add(m4);

        //SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, mylist, android.R.layout.simple_list_item_2,
        //        new String[]{"city", "code"}, new int[]{android.R.id.text1, android.R.id.text2});        //使用Android Layout

        //SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, mylist, R.layout.myitem,
        //        new String[]{"city", "code"}, new int[]{R.id.textView, R.id.textView2});                  //使用自己的Layout

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, mylist,
                R.layout.myitem, new String[]{"city", "code", "img"},
                new int[]{R.id.textView, R.id.textView2, R.id.imageView});    //使用自己的Layout+圖示

        lv.setAdapter(adapter); //將SimpleAdapter設定至lv裡面

    }
}

package com.example.advancelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvfruit;
    ArrayList<fruit> arrfruit;
    fruitAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        adapter = new fruitAdapter(this,R.layout.fruitrow,arrfruit);
        lvfruit.setAdapter(adapter);
    }
    private void anhxa(){
        lvfruit = (ListView) findViewById(R.id.ListViewFruit);
        arrfruit = new ArrayList<>();
        arrfruit.add(new fruit("Táo","Táo mĩ",R.drawable.img));
        arrfruit.add(new fruit("Bơ ","Bơ tây nguyên",R.drawable.img_1));
        arrfruit.add(new fruit("Dưa Hấu","Dưa hấu nhật bản ",R.drawable.img_2));
        arrfruit.add(new fruit("Cherry","Quả mọng nước đỏ ",R.drawable.img_3));
        arrfruit.add(new fruit("Dâu","Dâu tằm nước Spanish",R.drawable.img_4));
    }
}
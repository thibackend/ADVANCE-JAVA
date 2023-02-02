package com.example.listview;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonHoc;
    ArrayList <String> arrCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMonHoc = (ListView) findViewById(R.id.listViewMonHoc);


        arrCourse = new ArrayList<>();
        arrCourse.add("Android");
        arrCourse.add("PHP");
        arrCourse.add("IOS");
        arrCourse.add("Unity");
        arrCourse.add("ASP.NET");
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_list_item_1,arrCourse);
        lvMonHoc.setAdapter(adapter);
//      Tạo sự kiện tại đây các sự kiện Onclick.
        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//           int i này trả về vị trí click trên listView -> 0
                Toast.makeText(MainActivity.this,arrCourse.get(i), Toast.LENGTH_SHORT).show();
            }
        });

        lvMonHoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Long click : "+i, Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
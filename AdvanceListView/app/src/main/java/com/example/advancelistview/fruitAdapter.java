package com.example.advancelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class fruitAdapter extends BaseAdapter {

    private Context context; // khai báo các biến để lưu trữ dữ liệu.
    private int layout;
    private List<fruit> fruitList;
    // tạo constructors cho các biến ;
    public fruitAdapter( Context context,int layout, List<fruit> fruitList) {
        this.context = context;
        this.layout = layout;
        this.fruitList = fruitList;
    }


    @Override
    public int getCount() {
        return fruitList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null );
        // ánh xạ.
        TextView txtTen= (TextView) view.findViewById(R.id.textViewTen);
        TextView txtMoTa = (TextView) view.findViewById(R.id.textViewMota);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.ViewHinh);
        fruit Traicay = fruitList.get(i);
        txtTen.setText(Traicay.getTen());
        txtMoTa.setText(Traicay.getMoTa());
        imgHinh.setImageResource(Traicay.getImg());
        return view;
    }
}

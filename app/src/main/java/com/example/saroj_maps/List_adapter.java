package com.example.saroj_maps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class List_adapter extends BaseAdapter {
    Context context;
    ArrayList<String> location_strs;
    TextView t1;
    public List_adapter(Context context, ArrayList<String> location_strs) {
        this.context=context;
        this.location_strs=location_strs;
    }

    @Override
    public int getCount() {
        return location_strs.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        convertView=layoutInflater.inflate(R.layout.cell,null);
        t1=convertView.findViewById(R.id.textView);
        t1.setText(location_strs.get(position));
        return convertView;
    }
}

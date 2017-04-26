package com.tasklec5.rehab.tasklec5;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by RERE on 4/26/2017.
 */

public class ShowData extends BaseAdapter {
    String []items;
    ShowData(String[] Items){
        this.items=Items;
    }
    Context context;

    @Override
    public int getCount() {
        return 0;
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
       view= LayoutInflater.from(context).inflate(R.layout.row_data,null);
        TextView textViewname=(TextView)view.findViewById(R.id.textviewusername);
        TextView textViewemail=(TextView)view.findViewById(R.id.textviewemail);
        textViewname.setText(items[i]);
        textViewemail.setText(items[i]);

        return view;
    }
}

package com.example.dsm2018.secret;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ListViewitem> listViewitems = new ArrayList<ListViewitem>();

    public ListViewAdapter() { }

    @Override
    public int getCount() {
        return listViewitems.size();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView sub = (TextView) convertView.findViewById(R.id.sub);

        ListViewitem listViewItem = listViewitems.get(position);

        name.setText(listViewItem.getName());
        sub.setText(listViewItem.getSub());

        return convertView;
    }


    @Override
    public long getItemId(int position) { return position; }

    @Override
    public Object getItem(int position) { return listViewitems.get(position); }

    public void add(String name, String sub) {
        ListViewitem item = new ListViewitem();
        item.setName(name);
        item.setSub(sub);
        listViewitems.add(item);
    }
}


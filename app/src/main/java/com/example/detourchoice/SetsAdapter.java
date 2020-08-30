package com.example.detourchoice;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SetsAdapter extends BaseAdapter {
    private  int numOfSets;

    public SetsAdapter(int numOfSets) {
        this.numOfSets = numOfSets;
    }


    @Override
    public int getCount() {
        return numOfSets;
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
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view;

        if (convertView == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.set_item_layout,viewGroup,false);

        }else {
            view = convertView;
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(viewGroup.getContext(),QuestionActivity.class);
                intent.putExtra("SETNO",i + 1);
                viewGroup.getContext().startActivity(intent);
            }
        });
        ((TextView) view.findViewById(R.id.setNo_tv)).setText(String.valueOf(i+1));
        return view;
    }
}

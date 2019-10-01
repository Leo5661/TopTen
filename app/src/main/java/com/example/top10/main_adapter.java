package com.example.top10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.ArrayList;

public class main_adapter extends ArrayAdapter<main_class> {
    Context context;
    ArrayList<main_class> main_list;


    public main_adapter(ArrayList<main_class> list,Context context) {
        super(context, 0, list);
        main_list = list;
        this.context = context;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        main_class list = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_main_view, parent, false);

        }
        ImageView mImage = convertView.findViewById(R.id.img);
        TextView mText = convertView.findViewById(R.id.txt);

        mText.setText(list.getCompany());
        mImage.setImageResource(list.getImgres());

        return  convertView;
    }

}

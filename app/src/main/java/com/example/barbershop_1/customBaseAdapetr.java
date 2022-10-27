package com.example.barbershop_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customBaseAdapetr extends BaseAdapter {
    Context context;
    String barberList[];
    int  barberImages[];
    LayoutInflater inflater;


    public customBaseAdapetr(Context ctx,String[] barberList,int[] barberImages)
    {
        this.context = ctx;
        this.barberList = barberList;
        this.barberImages = barberImages;
        inflater =LayoutInflater.from(ctx);


    }



    @Override
    public int getCount() {
        return barberList.length;
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
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_page_one,null);
        TextView tv = (TextView) view.findViewById(R.id.tvName); // נשנה ל arrayList
        ImageView im1 = (ImageView) view.findViewById(R.id.ivBarberCr); // נשנה ל arrayList
        tv.setText(barberList[position]);
        im1.setImageResource(barberImages[position]);

        return view;
    }
}

package com.example.sharna.krishokerpase;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 10/31/2016.
 */
public class MyCustomAdapter2 extends BaseAdapter
{

    String[] names,names1;
    int[] ims;
    Context ct;

    public static LayoutInflater inflater=null;

    public MyCustomAdapter2(FragmentActivity OF, String[] nameofos, int[] osimg){

        names=nameofos;
        ims=osimg;
        this.ct=OF;
        inflater=(LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    public class MyHolder{
        TextView tvs,prc1;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        MyHolder myh= new MyHolder();
        View myview;

        myview = inflater.inflate(R.layout.custom_layout_item1, null);
        myh.tvs=(TextView)myview.findViewById(R.id.textviewid);
        myh.img=(ImageView)myview.findViewById(R.id.imageviewid);

        myh.tvs.setText(names[position]);
        myh.img.setImageResource(ims[position]);
        //  myh.prc1.setText(names1[position]);

       /* myview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ct,"Clicked on "+names[position],Toast.LENGTH_LONG).show();

            }
        });*/

        return myview;
    }
}

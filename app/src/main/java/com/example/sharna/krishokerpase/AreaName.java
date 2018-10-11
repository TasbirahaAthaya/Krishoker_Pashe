package com.example.sharna.krishokerpase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AreaName extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_name);

        final String[] items={"ঢাকা" ,
                "চট্টগ্রাম" ,
                "খুলনা" ,
                "রাজশাহী" ,
                "কুমিল্লা" ,
                "বারিশাল"
              };

        lv=(ListView) findViewById(R.id.listview);


        ArrayAdapter adap =new ArrayAdapter(getApplicationContext(),R.layout.area_layout,R.id.mytexts, items);

        lv.setAdapter(adap);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(getApplicationContext(),"You clicked on item number " + items[position], Toast.LENGTH_LONG).show();

                switch (position)
                {
                    case 0:
                        Intent i= new Intent(AreaName.this,price.class);
                        i.putExtra("key","1");
                        startActivity(i);
                        break;

                    case 1:
                        Intent i1= new Intent(AreaName.this,price.class);
                        i1.putExtra("key","2");
                        startActivity(i1);
                        break;

                    case 2:
                        Intent i2= new Intent(AreaName.this,price.class);
                        i2.putExtra("key","3");
                        startActivity(i2);
                        break;

                    case 3:
                        Intent i3= new Intent(AreaName.this,price.class);
                        i3.putExtra("key","4");
                        startActivity(i3);
                        break;

                    case 4:
                        Intent i4= new Intent(AreaName.this,price.class);
                        i4.putExtra("key","5");
                        startActivity(i4);
                        break;

                    case 5:
                        Intent i5= new Intent(AreaName.this,price.class);
                        i5.putExtra("key","6");
                        startActivity(i5);
                        break;
                    default:

                }

            }
        });



    }
}

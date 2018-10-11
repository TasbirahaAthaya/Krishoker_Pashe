package com.example.sharna.krishokerpase;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ovijog extends AppCompatActivity {



    String in;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovijog);

        final Spinner ov = (Spinner) findViewById(R.id.ovijogsp);
        final Spinner pr = (Spinner) findViewById(R.id.prosnosp);

        String[] prosno = new String[]{
                "নির্বাচন করুন",
                "জমি সংক্রান্ত",
                "প্রযুক্তি",
                "কৃষিপণ্য মূল্য"
        };
        final List<String> typeList = new ArrayList<>(Arrays.asList(prosno));
        // Initializing an ArrayAdapter
        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this, R.layout.category, typeList) {
            @Override
            public boolean isEnabled(int position) {
                if (position == 0) {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) findViewById(R.id.sp1);
                if (position == 0) {
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                } else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        spinnerArrayAdapter.setDropDownViewResource(R.layout.category);
        pr.setAdapter(spinnerArrayAdapter);

        pr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position > 0) {
                    // Notify the selected item text
                    final EditText input = new EditText(ovijog.this);
                    AlertDialog alertDialog = new AlertDialog.Builder(ovijog.this).create();
                    alertDialog.setTitle("আপনার প্রশ্ন");
                    // alertDialog.setView(E_spinner);
                    alertDialog.setMessage("Enter your message");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "POST",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                    in = input.getText().toString();
                                    //  Toast.makeText(AddData.this,other, Toast.LENGTH_SHORT).show();
                                    dialog.dismiss();
                                }
                            });

                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    alertDialog.setView(input);
                    alertDialog.show();

                    /*Toast.makeText
                            (getApplicationContext(), "Selected : " + selectedItemText, Toast.LENGTH_SHORT)
                            .show();*/
                   // _type = lm.getSelectedItem().toString();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Initializing an ArrayAdapter
        final ArrayAdapter<String> spinnerArrayAdapter1 = new ArrayAdapter<String>(
                this, R.layout.category, typeList) {
            @Override
            public boolean isEnabled(int position) {
                if (position == 0) {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) findViewById(R.id.sp1);
                if (position == 0) {
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                } else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };

    }
    public void ovi(View v) {
        Intent ih= new Intent(ovijog.this,ovijogform.class);
        startActivity(ih);
    }
    public void loan(View v) {
        Intent ih1= new Intent(ovijog.this,loan.class);
        startActivity(ih1);
    }

}

package com.example.sharna.krishokerpase;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by User on 2/10/2017.
 */
public class Fragmentshomossha extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ListView mylist;
    TextView p1,p2,p3;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OneFragment.OnFragmentInteractionListener mListener;

    public Fragmentshomossha() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_shomossha, container, false);

       // View v = inflater.inflate(R.layout.fragment_one ,container,false);
        p1=(TextView)v.findViewById(R.id.p1);




        return v;


    }



    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }



}

package com.example.sharna.krishokerpase;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class OneFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ListView mylist;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public OneFragment() {
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
        View v = inflater.inflate(R.layout.fragment_one ,container,false);
        mylist=(ListView)v.findViewById(R.id.mylistview);

        String[] myos={"আলু\nমূল্য:২৪ টাকা/কেজি","পটল\nমূল্য:২০ টাকা/কেজি","পেঁয়াজ\nমূল্য:৬০ টাকা/কেজি",
                       "গম\nমূল্য:৩০ টাকা/কেজি","চাল\nমূল্য:৫০ টাকা/কেজি","বেগুন\nমূল্য:২০ টাকা/কেজি","করলা\nমূল্য:১৫ টাকা/কেজি"};
        int[] myos_img={R.drawable.alu, R.drawable.potol, R.drawable.peyaz, R.drawable.gom, R.drawable.chal,
                        R.drawable.begun, R.drawable.korola};


        MyCustomAdapter myAdap= new MyCustomAdapter(getActivity(), myos, myos_img);
        mylist.setAdapter(myAdap);
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

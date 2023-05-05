package com.rizky.fragmentshodakom;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TopupFragment#newInstance} factory method to
 * create an instance of this fragment.
 */


public class  TopupFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public TopupFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TopupFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TopupFragment newInstance(String param1, String param2) {
        TopupFragment fragment = new TopupFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_topup, container, false);

        View rootView=inflater.inflate(R.layout.fragment_topup,container,false);
        Button btnFF=(Button)rootView.findViewById(R.id.btn2);
        Button btnGA=(Button)rootView.findViewById(R.id.button3);
        Button btnML=(Button)rootView.findViewById(R.id.button4);
        Button btnPUBG=(Button)rootView.findViewById(R.id.button5);
        Button btnAOV=(Button)rootView.findViewById(R.id.button6);
        Button btnVALO=(Button)rootView.findViewById(R.id.button7);


        btnFF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),FF_Diamond.class);
                startActivity(intent);
            }
        });

        btnGA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),Ga_Diamond.class);
                startActivity(intent);
            }
        });

        btnML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),ML_Diamond.class);
                startActivity(intent);
            }
        });

        btnPUBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),PUBG_Diamond.class);
                startActivity(intent);
            }
        });

        btnAOV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),AOV_Diamond.class);
                startActivity(intent);
            }
        });

        btnVALO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),VALO_Diamond.class);
                startActivity(intent);
            }
        });

        return rootView;
    }


}
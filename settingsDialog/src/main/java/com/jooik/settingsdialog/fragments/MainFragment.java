package com.jooik.settingsdialog.fragments;


import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jooik.settingsdialog.R;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 *
 */
public class MainFragment extends Fragment
{


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_main, container, false);

        ImageView ivSubmarine = (ImageView)view.findViewById(R.id.iv_submarine);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getActivity());
        boolean displaySub = sharedPref.getBoolean("display_sub", true);

        if (displaySub)
        {
            ivSubmarine.setVisibility(View.VISIBLE);
        }
        else
        {
            ivSubmarine.setVisibility(View.GONE);
        }

        return view;
    }


}

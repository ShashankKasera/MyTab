package com.example.root.mytab.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.mytab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AcceptedBookingFragment extends Fragment {


    public AcceptedBookingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accepted_booking, container, false);
    }

}

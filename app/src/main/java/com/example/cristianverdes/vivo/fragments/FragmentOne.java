package com.example.cristianverdes.vivo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cristianverdes.vivo.R;

/**
 * Created by Cristian Verdes on 4/7/2017.
 */

public class FragmentOne extends Fragment {
    public FragmentOne(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_one, container, false);
    }
}

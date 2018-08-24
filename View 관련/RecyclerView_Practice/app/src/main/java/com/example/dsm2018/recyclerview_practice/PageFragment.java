package com.example.dsm2018.recyclerview_practice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment extends Fragment{

    private int mPageNumber;

    public static android.support.v4.app.Fragment create(int pageNumber){
        android.support.v4.app.Fragment fragment = new android.support.v4.app.Fragment();
        Bundle args = new Bundle();
        args.putInt("page", pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt("page");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup)
                inflater.inflate(R.layout.fragment_page, container, false);
        ((TextView) rootView.findViewById(R.id.number)).setText(mPageNumber + "");
        return rootView;
    }

}

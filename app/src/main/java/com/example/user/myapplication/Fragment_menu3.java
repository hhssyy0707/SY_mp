package com.example.user.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 2016-06-17.
 */
public class Fragment_menu3 extends Fragment {

    View syView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        syView = inflater.inflate(R.layout.layout_menu3,container,false);
        return syView;
    }
}

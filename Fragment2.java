package com.example.lber.tablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lber on 05/10/2016.
 */

public class Fragment2 extends Fragment {
    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b){
        View v = inflater.inflate(R.layout.fragment_2, container, false); //logica do fragment
        return v;//
    }
}

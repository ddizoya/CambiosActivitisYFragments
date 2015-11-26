package com.example.ddizoya.cambiosactivitis;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ddizoya on 26/11/15.
 */
public class FragmentB extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View w = inflater.inflate(R.layout.fragmentb, container);
        return w;
    }
}

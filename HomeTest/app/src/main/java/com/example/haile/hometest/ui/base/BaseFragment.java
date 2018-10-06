package com.example.haile.hometest.ui.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutResource(), container, false);
        mapView(view);
        setListener();
        initData();
        return view;
    }

    protected abstract int getLayoutResource();

    protected abstract void mapView(View view);

    protected abstract void setListener();

    protected abstract void initData();
}

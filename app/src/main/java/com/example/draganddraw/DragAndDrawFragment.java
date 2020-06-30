package com.example.draganddraw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class DragAndDrawFragment extends Fragment {

    public static com.example.draganddraw.DragAndDrawFragment newInstance() {
        return new com.example.draganddraw.DragAndDrawFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceSave) {
        View v =inflater.inflate(R.layout.fragment_drag_and_draw, container, false );
        return v;
    }
}


package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.cricketscoreprediction.app.R;

import java.util.Objects;

public final class FragmentBlankBinding implements ViewBinding {
    private final FrameLayout rootView;

    private FragmentBlankBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override 
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBlankBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBlankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_blank, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBlankBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new FragmentBlankBinding((FrameLayout) view);
    }
}

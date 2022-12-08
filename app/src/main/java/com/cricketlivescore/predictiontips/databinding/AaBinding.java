package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

import com.cricketlivescore.predictiontips.R;

import java.util.Objects;

public final class AaBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private AaBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    @Override
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aa, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AaBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new AaBinding((ConstraintLayout) view);
    }
}

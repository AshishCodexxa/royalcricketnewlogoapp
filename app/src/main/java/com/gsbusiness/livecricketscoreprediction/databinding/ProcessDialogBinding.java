package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;


public final class ProcessDialogBinding implements ViewBinding {
    public final ProgressBar progressBar1;
    private final RelativeLayout rootView;

    private ProcessDialogBinding(RelativeLayout relativeLayout, ProgressBar progressBar) {
        this.rootView = relativeLayout;
        this.progressBar1 = progressBar;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ProcessDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ProcessDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.process_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ProcessDialogBinding bind(View view) {
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar1);
        if (progressBar != null) {
            return new ProcessDialogBinding((RelativeLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.progressBar1)));
    }
}

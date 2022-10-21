package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class FragmentPlayerKeepimgBinding implements ViewBinding {
    public final LinearLayout llNoData;
    private final RelativeLayout rootView;

    private FragmentPlayerKeepimgBinding(RelativeLayout relativeLayout, LinearLayout linearLayout) {
        this.rootView = relativeLayout;
        this.llNoData = linearLayout;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPlayerKeepimgBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlayerKeepimgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_player_keepimg, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPlayerKeepimgBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
        if (linearLayout != null) {
            return new FragmentPlayerKeepimgBinding((RelativeLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.ll_no_data)));
    }
}

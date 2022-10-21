package com.gsbusiness.livecricketscoreprediction.Utils;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;

public final  class Glob$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final  Activity f$0;
    public final  Dialog f$1;
    public final  TextView f$2;
    public final  Animation f$3;

    public  Glob$$ExternalSyntheticLambda1(Activity activity, Dialog dialog, TextView textView, Animation animation) {
        this.f$0 = activity;
        this.f$1 = dialog;
        this.f$2 = textView;
        this.f$3 = animation;
    }

    public final void onClick(View view) {
        Glob.lambda$noInternetDialogShowFragment$1(this.f$0, this.f$1, this.f$2, this.f$3, view);
    }
}

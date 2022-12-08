package com.cricketlivescore.predictiontips.Utils;

import android.app.Activity;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;

public final  class Glob$$ExternalSyntheticLambda2 implements OnCompleteListener {
    public final  ReviewManager f$0;
    public final  Activity f$1;

    public  Glob$$ExternalSyntheticLambda2(ReviewManager reviewManager, Activity activity) {
        this.f$0 = reviewManager;
        this.f$1 = activity;
    }

    @Override
    public final void onComplete(Task task) {
        Glob.lambda$showInappReview$3(this.f$0, this.f$1, task);
    }
}

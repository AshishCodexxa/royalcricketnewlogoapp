package com.cricketscoreprediction.app.Utils;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;

public class InAppReview {
    @SuppressLint("WrongConstant")
    public static void onOpenReview(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
        boolean z = false;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                if (next.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                    ActivityInfo activityInfo = next.activityInfo;
                    ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent.setFlags(270532608);
                    intent.setComponent(componentName);
                    context.startActivity(intent);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(Glob.front_link_playstore + str));
            intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent2);
        }
    }
}

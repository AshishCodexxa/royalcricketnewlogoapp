package com.gsbusiness.livecricketscoreprediction.Utils;

import static com.gsbusiness.livecricketscoreprediction.Datalink.BaseURl;
import static com.gsbusiness.livecricketscoreprediction.Datalink.EndpointURL;
import static com.gsbusiness.livecricketscoreprediction.Datalink.FlagStartURL;
import static com.gsbusiness.livecricketscoreprediction.Datalink.PlayerstartURL;
import static com.gsbusiness.livecricketscoreprediction.Datalink.flagemptyURL;
import static com.gsbusiness.livecricketscoreprediction.Datalink.stadiumstartURL;
import static com.gsbusiness.livecricketscoreprediction.Datalink.teamsstartURL;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;

import com.facebook.ads.InterstitialAd;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.gsbusiness.livecricketscoreprediction.Activities.MainActivity;
import com.gsbusiness.livecricketscoreprediction.Activities.Player.PlayerDetailActivity;
import com.gsbusiness.livecricketscoreprediction.Ads.NativeAd;

import com.gsbusiness.livecricketscoreprediction.FantasyResearchTeamsQuery;
import com.gsbusiness.livecricketscoreprediction.GetScoreCardQuery;
import com.gsbusiness.livecricketscoreprediction.GetStatsResolverQuery;
import com.gsbusiness.livecricketscoreprediction.GetrankingsQuery;
import com.gsbusiness.livecricketscoreprediction.ListseriesQuery;
import com.gsbusiness.livecricketscoreprediction.MatcheslistQuery;
import com.gsbusiness.livecricketscoreprediction.PlayersDetailsQuery;
import com.gsbusiness.livecricketscoreprediction.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONException;

public class Glob {
    public static String BASE_URL = BaseURl;
    public static String INNINGS = "innings";
    public static String MATCH_ID = "matchID";
    public static String MATCH_STATUS = "matchStatus";
    public static String PLAYER_ID = "playerID";
    public static String endpoint = EndpointURL;
    public static String Service_Links = (endpoint + "/moreappmobapp/get_app_list.json");
    public static String TYPES = "types";
    public static String _Start = (endpoint + "/configjdwala/33.json");
    public static int adCountInCategory = 2;
    public static GetStatsResolverQuery.Batting1 battingStatsList = null;
    public static Typeface boldralway = null;
    public static GetStatsResolverQuery.Bowling1 bowlingStatsList = null;

    public static GetStatsResolverQuery.Fielding1 fieldingStatsList;
    public static String flag_empty = flagemptyURL;
    public static String flag_end = "_flag_safari.png";
    public static String flag_start = FlagStartURL;
    public static String front_link_playstore = "https://play.google.com/store/apps/details?id=";
    public static List<GetrankingsQuery.Getrankings> getrankings = new ArrayList();
    public static String innings;
    public static boolean isKeepingTab = false;
    public static String isPurchased = "isPurchased";
    public static FirebaseAnalytics mFirebaseAnalytics;
    public static String matchIds;
    public static Typeface montserrat_extra_bold;
    public static Typeface montserrat_medium;
    public static NativeAd nativeAd = null;
    public static int native_banner_priority_count = 0;
    public static int native_priority_count = 0;
    public static String native_priority_facebook = "facebook";
    public static String native_priority_google = "google";
    public static Typeface oswald_medium;
    private static String packageName = "com.android.chrome";
    public static List<FantasyResearchTeamsQuery.C5158Player> playerArrayList;
    public static List<GetScoreCardQuery.Batting> playerScore = new ArrayList();
    public static String player_end = "_headshot_safari.png";
    public static String player_start = PlayerstartURL;
    public static PlayersDetailsQuery.PlayersDetails playersDetail;
    public static Typeface ralewayfont;
    public static String share_app_text = "\nLet me recommend you this application\n\n";
    public static String stadium_end = "_actionshot_safari.jpg";
    public static String stadium_start = stadiumstartURL;
    public static String teams_end = "_flag_safari.png";
    public static String teams_start = teamsstartURL;

    static void lambda$showInappReview$2(Task task) {
    }

    public static String getDate(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(Long.parseLong(str)));
    }

    public static String getCurrentDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd LLLL yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static String getDateDay(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(Long.parseLong(str)));
    }

    public static String getDateMonth(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    public static String getDateTime(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd LLLL hh:mm a");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    public static String getTime(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    public static String getTimes(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    public static String getBanner(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        int length = jSONArray.length() - 1;
        int[] iArr = new int[length];
        try {
            return jSONArray.getString(new Random().nextInt(length));
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getTimeDiff(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
            long abs = Math.abs(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse(simpleDateFormat.format(new Date())).getTime());
            return ((abs / 3600000) % 24) + " hrs " + ((abs / 60000) % 60) + " min to start";
        } catch (ParseException e) {
            e.printStackTrace();
            return HelpFormatter.DEFAULT_OPT_PREFIX;
        }
    }

    public static String getDateDif(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        String format2 = simpleDateFormat.format(Long.valueOf(Long.parseLong(str)));
        try {
            long time = simpleDateFormat.parse(format2).getTime() - simpleDateFormat.parse(format).getTime();
            long seconds = TimeUnit.MILLISECONDS.toSeconds(time) % 60;
            long minutes = TimeUnit.MILLISECONDS.toMinutes(time) % 60;
            long hours = TimeUnit.MILLISECONDS.toHours(time) % 24;
            long days = TimeUnit.MILLISECONDS.toDays(time) / 365;
            return (TimeUnit.MILLISECONDS.toDays(time) % 365) + " days to go";
        } catch (ParseException e) {
            e.printStackTrace();
            return HelpFormatter.DEFAULT_OPT_PREFIX;
        }
    }

    public static boolean isOnline(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean checkPermission(Activity activity) {
        return ContextCompat.checkSelfPermission(activity, "android.permission.INTERNET") == 0;
    }

    public static void setOrientation(Activity activity) {
        if (Build.VERSION.SDK_INT == 26) {
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        } else {
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

    public static JSONArray shuffleJsonArray(JSONArray jSONArray) {
        try {
            Random random = new Random();
            for (int length = jSONArray.length() - 1; length >= 0; length--) {
                int nextInt = random.nextInt(length + 1);
                Object obj = jSONArray.get(nextInt);
                jSONArray.put(nextInt, jSONArray.get(length));
                jSONArray.put(length, obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONArray;
    }

    public static void log(String str, String str2) {
        Log.d(str + ":", str2 + " : ");
    }

    public static void openCustomTab(Context context) {
        AppPreference appPreference = new AppPreference(context);
        String string = appPreference.getString("package_name");
        String string2 = appPreference.getString("is_image_playstore");
        String string3 = appPreference.getString("weblink");
        if (string2 == null || !string2.equalsIgnoreCase("y")) {
            if (string3 != null && !string3.matches("")) {
                Uri parse = Uri.parse(string3);
                if (isPackageInstalled(packageName, context.getPackageManager())) {
                    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                    builder.setToolbarColor(ContextCompat.getColor(context, R.color.black));
                    builder.enableUrlBarHiding();
                    builder.build().intent.setPackage(packageName);
                    builder.build().intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    if (string3 != null && !string3.equals("")) {
                        builder.build().launchUrl(context, parse);
                        return;
                    }
                    return;
                }
                Toast.makeText(context, "Not Installed", Toast.LENGTH_SHORT).show();
            }
        } else if (string == null || string.equalsIgnoreCase("")) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com")));
        } else {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + string)));
        }
    }

    public static boolean isPackageInstalled(String str, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(str, 0);
            if (isAppEnabled(str, packageManager)) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean isAppEnabled(String str, PackageManager packageManager) {
        try {
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean isNull(String str) {
        return str == null || str.equals("") || str.equals("null");
    }

    public static String getString(String str) {
        return (str == null || str.equals("") || str.equals("null")) ? HelpFormatter.DEFAULT_OPT_PREFIX : str;
    }

    public static String getInt(String str) {
        return (str == null || str.equals("") || str.equals("null")) ? "0" : str;
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static void noInternetDialogShowActivity(Activity activity) {
        Animation loadAnimation = AnimationUtils.loadAnimation(activity, R.anim.bounce);
        Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.dialog_nointernet);
        dialog.setCancelable(false);
        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
        attributes.dimAmount = 0.7f;
        dialog.getWindow().setAttributes(attributes);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ((Button) dialog.findViewById(R.id.btn_retry)).setOnClickListener(new Glob$$ExternalSyntheticLambda0(activity, dialog, (TextView) dialog.findViewById(R.id.tv_please_turn_on), loadAnimation));
        if (!dialog.isShowing()) {
            dialog.show();
        }
    }

    static void lambda$noInternetDialogShowActivity$0(Activity activity, Dialog dialog, TextView textView, Animation animation, View view) {
        if (isOnline(activity)) {
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
            activity.finish();
            activity.overridePendingTransition(0, 0);
            activity.startActivity(activity.getIntent());
            activity.overridePendingTransition(0, 0);
            return;
        }
        textView.startAnimation(animation);
        Toast.makeText(activity, "Please connect internet", Toast.LENGTH_SHORT).show();
    }

    public static void noInternetDialogShowFragment(Activity activity) {
        Animation loadAnimation = AnimationUtils.loadAnimation(activity, R.anim.bounce);
        Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.dialog_nointernet);
        dialog.setCancelable(false);
        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
        attributes.dimAmount = 0.7f;
        dialog.getWindow().setAttributes(attributes);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ((Button) dialog.findViewById(R.id.btn_retry)).setOnClickListener(new Glob$$ExternalSyntheticLambda1(activity, dialog, (TextView) dialog.findViewById(R.id.tv_please_turn_on), loadAnimation));
        if (!dialog.isShowing()) {
            dialog.show();
        }
    }

    static void lambda$noInternetDialogShowFragment$1(Activity activity, Dialog dialog, TextView textView, Animation animation, View view) {
        if (isOnline(activity)) {
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
            activity.finish();
            activity.overridePendingTransition(0, 0);
            activity.startActivity(activity.getIntent());
            activity.overridePendingTransition(0, 0);
            return;
        }
        textView.startAnimation(animation);
        Toast.makeText(activity, "Please connect internet", Toast.LENGTH_SHORT).show();
    }

    public static void goToHome(Activity activity) {
        Intent intent = new Intent(activity, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        activity.finish();
    }

    public static void goToPlayerDetail(Activity activity, String str) {
        Intent intent = new Intent(activity, PlayerDetailActivity.class);
        intent.putExtra(PLAYER_ID, str);
        activity.startActivity(intent);
    }

    public static void freeMemory() {
        System.runFinalization();
        Runtime.getRuntime().gc();
        System.gc();
    }

    public static void showInappReview(final Activity activity) {
        ReviewManager create = ReviewManagerFactory.create(activity);
        Task<ReviewInfo> requestReviewFlow = create.requestReviewFlow();
        requestReviewFlow.addOnCompleteListener(new Glob$$ExternalSyntheticLambda2(create, activity));
        requestReviewFlow.addOnFailureListener(new OnFailureListener() {


            @Override
            public void onFailure(Exception exc) {
                Activity activity = null;
                InAppReview.onOpenReview(activity, activity.getPackageName());
            }
        });
    }

    static void lambda$showInappReview$3(ReviewManager reviewManager, final Activity activity, Task task) {
        if (task.isSuccessful()) {
            Task<Void> launchReviewFlow = reviewManager.launchReviewFlow(activity, (ReviewInfo) task.getResult());
            launchReviewFlow.addOnCompleteListener(Glob$$ExternalSyntheticLambda3.INSTANCE);
            launchReviewFlow.addOnFailureListener(new OnFailureListener() {

                @Override
                public void onFailure(Exception exc) {
                    Activity activity = null;
                    InAppReview.onOpenReview(activity.getApplication(), activity.getPackageName());
                }
            });
            return;
        }
        InAppReview.onOpenReview(activity, activity.getPackageName());
    }

    public static void logFirebase(Context context, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("logAdInformation", str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str3);
        bundle.putString("internetStatus", getNetworkClass(context));
    }

    public static String getNetworkClass(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "No Internet";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() != 0) {
            return "Mobile";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "Mobile 2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "Mobile 3G";
            case 13:
            case 18:
            case 19:
                return "Mobile 4G";
            case 20:
                return "Mobile 5G";
            default:
                return "Mobile";
        }
    }
}

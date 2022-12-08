package com.cricketlivescore.predictiontips.Adapter.Starts;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.CustomTabsIntent;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.cricketlivescore.predictiontips.Models.Starts.SliderData;
import com.cricketlivescore.predictiontips.R;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterViewHolder> {
    Context context;
    private final List<SliderData> mSliderItems;

    public SliderAdapter(Context context2, ArrayList<SliderData> arrayList) {
        this.mSliderItems = arrayList;
        this.context = context2;
    }

    @Override // com.smarteist.autoimageslider.SliderViewAdapter
    public SliderAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        return new SliderAdapterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.slider_layout, (ViewGroup) null));
    }

    public void onBindViewHolder(SliderAdapterViewHolder sliderAdapterViewHolder, int i) {
        final SliderData sliderData = this.mSliderItems.get(i);
        ((RequestBuilder) Glide.with(sliderAdapterViewHolder.itemView).load(sliderData.getImgUrl()).fitCenter()).into(sliderAdapterViewHolder.imageViewBackground);
        sliderAdapterViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                SliderAdapter.onOpenGoogleSlider(SliderAdapter.this.context, sliderData.getUrl_redirect_link());
            }
        });
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.mSliderItems.size();
    }

    public static class SliderAdapterViewHolder extends SliderAdapter.ViewHolder {
        ImageView imageViewBackground;
        View itemView;
        RelativeLayout rl_slider_item;

        public SliderAdapterViewHolder(View view) {
            super(view);
            this.imageViewBackground = (ImageView) view.findViewById(R.id.myimage);
            this.rl_slider_item = (RelativeLayout) view.findViewById(R.id.rl_slider_item);
            this.itemView = view;
        }
    }

    public static void onOpenGoogleSlider(Context context2, String str) {
        if (str != null && !str.equals("")) {
            try {
                Uri parse = Uri.parse(str);
                CustomTabsIntent build = new CustomTabsIntent.Builder().build();
                build.intent.setData(parse);
                for (ResolveInfo resolveInfo : context2.getPackageManager().queryIntentActivities(build.intent, PackageManager.MATCH_DEFAULT_ONLY)) {
                    if (TextUtils.equals(resolveInfo.activityInfo.packageName, "com.android.chrome")) {
                        build.intent.setPackage("com.android.chrome");
                    }
                }
                build.launchUrl(context2, parse);
            } catch (Exception e) {
                Glob.log("Exception: onOpenGoogleSlider: ", e.getMessage());
            }
        }
    }
}

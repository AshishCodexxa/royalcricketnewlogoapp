package com.cricketlivescore.predictiontips.Adapter.Starts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;

import com.cricketlivescore.predictiontips.Models.Starts.SliderData;
import com.cricketlivescore.predictiontips.R;
import com.cricketlivescore.predictiontips.Utils.Glob;
import java.util.ArrayList;

public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ViewHolder> {
    Context context;
    private ArrayList<SliderData> imagesData;

    public ImageListAdapter(ArrayList<SliderData> arrayList, Context context2) {
        this.imagesData = arrayList;
        this.context = context2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_view, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        ((RequestBuilder) Glide.with(this.context).load(this.imagesData.get(i).getImgUrl()).placeholder((int) R.mipmap.ic_launcher)).into(viewHolder.myimage);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                ImageListAdapter.onOpenGoogleSlider(ImageListAdapter.this.context, ((SliderData) ImageListAdapter.this.imagesData.get(i)).getUrl_redirect_link());
            }
        });
    }

    @Override 
    public int getItemCount() {
        return this.imagesData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View itemView;
        ImageView myimage;

        public ViewHolder(View view) {
            super(view);
            this.myimage = (ImageView) view.findViewById(R.id.myimage);
            this.itemView = view;
        }
    }

    public static void onOpenGoogleSlider(Context context2, String str) {
        if (str != null && !str.equals("")) {
            try {
                Uri parse = Uri.parse(str);
                CustomTabsIntent build = new CustomTabsIntent.Builder().build();
                build.intent.setData(parse);
                for (ResolveInfo resolveInfo : context2.getPackageManager().queryIntentActivities(build.intent, 65536)) {
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

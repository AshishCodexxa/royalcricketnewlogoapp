package com.cricketscoreprediction.app.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

import com.cricketscoreprediction.app.Models.ModelSubCategory;
import com.cricketscoreprediction.app.R;

import java.util.ArrayList;

public class AdapterSubCategory extends RecyclerView.Adapter<AdapterSubCategory.ViewHolder> {
    Context context;
    ArrayList<ModelSubCategory> modelSubCategories;
    OnItemClickListener onClickListener;

    public interface OnItemClickListener {
        void onItemClick(String str, String str2);
    }

    public AdapterSubCategory(Context context2, ArrayList<ModelSubCategory> arrayList, OnItemClickListener onItemClickListener) {
        this.context = context2;
        this.modelSubCategories = arrayList;
        this.onClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sub_category, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        viewHolder.txt_item_sub_category.setText(this.modelSubCategories.get(i).getName());
        Glide.with(this.context).load(this.modelSubCategories.get(i).getIcon()).into(viewHolder.img_item_sub_category);
        viewHolder.ll_item_sub_category.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterSubCategory.this.onClickListener.onItemClick(AdapterSubCategory.this.modelSubCategories.get(i).getUrl(), AdapterSubCategory.this.modelSubCategories.get(i).getName());
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.modelSubCategories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_item_sub_category;
        LinearLayout ll_item_sub_category;
        TextView txt_item_sub_category;

        public ViewHolder(View view) {
            super(view);
            this.img_item_sub_category = (ImageView) view.findViewById(R.id.img_item_sub_category);
            this.txt_item_sub_category = (TextView) view.findViewById(R.id.txt_item_sub_category);
            this.ll_item_sub_category = (LinearLayout) view.findViewById(R.id.ll_item_sub_category);
        }
    }
}

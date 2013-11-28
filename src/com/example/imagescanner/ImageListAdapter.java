package com.example.imagescanner;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class ImageListAdapter extends ArrayAdapter<String> {
  private Context mContext;
  private List<String> mImages;

  public ImageListAdapter(Context context, List<String> images) {
      super(context, R.layout.array_item, images);
      this.mContext = context;
      this.mImages = images;
  }

  public View getView(int position, View convertView, ViewGroup parent){
      if(convertView == null){
          LayoutInflater mLayoutInflater = LayoutInflater.from(mContext);
          convertView = mLayoutInflater.inflate(R.layout.array_item, null);
      }

      String title = mImages.get(position);

      TextView descriptionView = (TextView) convertView.findViewById(R.id.linkTitle);
      return convertView;
  }

}
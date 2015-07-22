package com.volokh.danylo.videolist.adapter.items;

import android.view.View;
import android.view.ViewGroup;

import com.volokh.danylo.videolist.adapter.interfaces.VideoPlayerManager;

public interface VideoItem {
    View createView(ViewGroup parent, int screenWidth);

    View update(View view, VideoPlayerManager videoPlayerManager);
}
package com.kwad.sdk.core.imageloader.core.listener;

import android.graphics.Bitmap;
import android.view.View;
import com.kwad.sdk.core.imageloader.core.assist.FailReason;

public class SimpleImageLoadingListener implements ImageLoadingListener {
    public void onLoadingCancelled(String str, View view) {
    }

    public void onLoadingComplete(String str, View view, Bitmap bitmap) {
    }

    public void onLoadingFailed(String str, View view, FailReason failReason) {
    }

    public void onLoadingStarted(String str, View view) {
    }
}
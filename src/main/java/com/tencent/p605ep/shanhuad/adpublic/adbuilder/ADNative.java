package com.tencent.p605ep.shanhuad.adpublic.adbuilder;

import com.tencent.p605ep.shanhuad.adpublic.adbuilder.ADSplashImage.AdListenerImpl;
import com.tencent.p605ep.shanhuad.adpublic.models.AdID;
import java.util.List;
import shanhuAD.C8680f;

/* renamed from: com.tencent.ep.shanhuad.adpublic.adbuilder.ADNative */
public class ADNative extends ADSplashImage {
    public void load(AdInfoListener adInfoListener, List<AdID> list) {
        this.f24760gk = adInfoListener;
        super.mo41444a(C8680f.m37693b(list, 5, 1), new AdListenerImpl());
    }
}

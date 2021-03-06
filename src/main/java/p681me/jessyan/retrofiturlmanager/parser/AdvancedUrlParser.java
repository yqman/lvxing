package p681me.jessyan.retrofiturlmanager.parser;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C8506t;
import okhttp3.C8506t.C8507a;
import p681me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import p681me.jessyan.retrofiturlmanager.cache.Cache;
import p681me.jessyan.retrofiturlmanager.cache.LruCache;

/* renamed from: me.jessyan.retrofiturlmanager.parser.AdvancedUrlParser */
public class AdvancedUrlParser implements UrlParser {
    private Cache<String, String> mCache;
    private RetrofitUrlManager mRetrofitUrlManager;

    public void init(RetrofitUrlManager retrofitUrlManager) {
        this.mRetrofitUrlManager = retrofitUrlManager;
        this.mCache = new LruCache(100);
    }

    public C8506t parseUrl(C8506t tVar, C8506t tVar2) {
        if (tVar == null) {
            return tVar2;
        }
        C8507a q = tVar2.mo40568q();
        if (TextUtils.isEmpty((CharSequence) this.mCache.get(getKey(tVar, tVar2)))) {
            for (int i = 0; i < tVar2.mo40558h(); i++) {
                q.mo40576b(0);
            }
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(tVar.mo40561j());
            if (tVar2.mo40558h() > this.mRetrofitUrlManager.getPathSize()) {
                List j = tVar2.mo40561j();
                for (int pathSize = this.mRetrofitUrlManager.getPathSize(); pathSize < j.size(); pathSize++) {
                    arrayList.add(j.get(pathSize));
                }
            } else if (tVar2.mo40558h() < this.mRetrofitUrlManager.getPathSize()) {
                StringBuilder sb = new StringBuilder();
                sb.append(tVar2.mo40549b());
                String str = "://";
                sb.append(str);
                sb.append(tVar2.mo40556f());
                sb.append(tVar2.mo40560i());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.mRetrofitUrlManager.getBaseUrl().mo40549b());
                sb2.append(str);
                sb2.append(this.mRetrofitUrlManager.getBaseUrl().mo40556f());
                sb2.append(this.mRetrofitUrlManager.getBaseUrl().mo40560i());
                throw new IllegalArgumentException(String.format("Your final path is %s, but the baseUrl of your RetrofitUrlManager#startAdvancedModel is %s", new Object[]{sb.toString(), sb2.toString()}));
            }
            for (String e : arrayList) {
                q.mo40582e(e);
            }
        } else {
            q.mo40583f((String) this.mCache.get(getKey(tVar, tVar2)));
        }
        C8506t c = q.mo40572a(tVar.mo40549b()).mo40581d(tVar.mo40556f()).mo40571a(tVar.mo40557g()).mo40580c();
        if (TextUtils.isEmpty((CharSequence) this.mCache.get(getKey(tVar, tVar2)))) {
            this.mCache.put(getKey(tVar, tVar2), c.mo40560i());
        }
        return c;
    }

    private String getKey(C8506t tVar, C8506t tVar2) {
        StringBuilder sb = new StringBuilder();
        sb.append(tVar.mo40560i());
        sb.append(tVar2.mo40560i());
        sb.append(this.mRetrofitUrlManager.getPathSize());
        return sb.toString();
    }
}

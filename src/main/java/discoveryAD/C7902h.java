package discoveryAD;

import com.tencent.qqpim.discovery.AdRequestData;
import discoveryAD.C7855C.C7857b;
import java.util.List;

/* renamed from: discoveryAD.h */
class C7902h implements C7857b {
    /* renamed from: Ac */
    final /* synthetic */ List f26898Ac;
    /* renamed from: Fc */
    final /* synthetic */ C7858c f26899Fc;
    final /* synthetic */ C7855C this$0;

    C7902h(C7855C c, C7858c cVar, List list) {
        this.this$0 = c;
        this.f26899Fc = cVar;
        this.f26898Ac = list;
    }

    /* renamed from: a */
    public void mo38122a(List<AdRequestData> list) {
        synchronized (this) {
            for (AdRequestData adRequestData : list) {
                this.f26899Fc.f26741Zc.remove(Integer.valueOf(adRequestData.positionId));
            }
            if (this.f26899Fc.f26741Zc.isEmpty()) {
                this.this$0.m34180c(this.f26898Ac, this.f26899Fc);
            }
        }
    }
}

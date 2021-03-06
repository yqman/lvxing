package com.tencent.android.tpush.p584d.p585a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import com.bytedance.embedapplog.GameReportHelper;
import com.tencent.android.tpush.common.C6914l;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.p580b.C6864a;
import com.tencent.android.tpush.p584d.C6926c;
import com.tencent.android.tpush.p584d.C6927d;
import com.tencent.android.tpush.service.p595e.C7056i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ProGuard */
/* renamed from: com.tencent.android.tpush.d.a.c */
public class C6922c extends C6926c {
    /* renamed from: a */
    public String mo33123a() {
        return "meizu";
    }

    /* renamed from: a */
    public void mo33124a(Context context) {
        String str = "OtherPushMZImpl";
        if (C7056i.m30194b(C6927d.f23008c)) {
            C6864a.m29309j(str, "registerPush Error for mz null appid");
        } else if (C7056i.m30194b(C6927d.f23009d)) {
            C6864a.m29309j(str, "registerPush Error for mz null mzAppkey");
        } else {
            List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(Constants.FLAG_ACTIVITY_NAME)).getRunningAppProcesses();
            String packageName = context.getPackageName();
            int myPid = Process.myPid();
            boolean z = false;
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid && packageName.equals(runningAppProcessInfo.processName)) {
                    z = true;
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                String str2 = "begin Mzpush register!";
                sb.append(str2);
                sb.append(C6927d.f23008c);
                String str3 = " ";
                sb.append(str3);
                sb.append(C6927d.f23009d);
                C6864a.m29303e(str, sb.toString());
                try {
                    Class cls = Class.forName("com.meizu.cloud.pushsdk.PushManager");
                    new Class[1][0] = Context.class;
                    Method method = cls.getMethod(GameReportHelper.REGISTER, new Class[]{Context.class, String.class, String.class});
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(C6927d.f23008c);
                    sb2.append(str3);
                    sb2.append(C6927d.f23009d);
                    C6864a.m29303e(str, sb2.toString());
                    method.invoke(cls, new Object[]{context, C6927d.f23008c, C6927d.f23009d});
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("registerPush Error for InvocationTargetException: ");
                    sb3.append(cause.getMessage());
                    C6864a.m29309j(str, sb3.toString());
                    cause.printStackTrace();
                } catch (Exception e2) {
                    C6864a.m29304e(str, "registerPush Error ", e2);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo33125b(Context context) {
        String str = "OtherPushMZImpl";
        try {
            Class cls = Class.forName("com.meizu.cloud.pushsdk.PushManager");
            new Class[1][0] = Context.class;
            Method method = cls.getMethod("unRegister", new Class[]{Context.class, String.class, String.class});
            StringBuilder sb = new StringBuilder();
            sb.append("begin Mzpush unregister!");
            sb.append(C6927d.f23008c);
            sb.append(" ");
            sb.append(C6927d.f23009d);
            C6864a.m29303e(str, sb.toString());
            method.invoke(cls, new Object[]{context, C6927d.f23008c, C6927d.f23009d});
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unregisterPush Error for InvocationTargetException: ");
            sb2.append(cause.getMessage());
            C6864a.m29309j(str, sb2.toString());
            cause.printStackTrace();
        } catch (Exception e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("unregisterPush Error, are you import otherpush package? ");
            sb3.append(e2);
            C6864a.m29309j(str, sb3.toString());
        }
    }

    /* renamed from: c */
    public String mo33126c(Context context) {
        String str = "OtherPushMZImpl";
        try {
            Class cls = Class.forName("com.meizu.cloud.pushsdk.PushManager");
            Object invoke = cls.getMethod("getPushId", new Class[]{Context.class}).invoke(cls, new Object[]{context});
            if (invoke != null) {
                return invoke.toString();
            }
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            StringBuilder sb = new StringBuilder();
            sb.append("getToken Error for InvocationTargetException: ");
            sb.append(cause.getMessage());
            C6864a.m29309j(str, sb.toString());
            cause.printStackTrace();
        } catch (Exception e2) {
            C6864a.m29304e(str, "getToken Error", e2);
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo33127d(Context context) {
        if (C7056i.m30194b(C6927d.f23008c) || C7056i.m30194b(C6927d.f23009d)) {
            C6914l.m29533n(context);
        }
        if (!C7056i.m30194b(C6927d.f23008c) && !C7056i.m30194b(C6927d.f23009d)) {
            return true;
        }
        return false;
    }
}

package com.jiayouya.travel.module.p276me.p279ui.dialog;

import android.content.Context;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.jiayouya.travel.R;
import com.jiayouya.travel.databinding.DialogExitBinding;
import ezy.p653ui.widget.dialog.CustomDialog;
import ezy.p653ui.widget.round.RoundText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C8271i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p679a.C8246a;
import kotlin.jvm.p679a.C8247b;

@Metadata(mo39187bv = {1, 0, 3}, mo39188d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo39189d2 = {"Lcom/jiayouya/travel/module/me/ui/dialog/ExitDialog;", "Lezy/ui/widget/dialog/CustomDialog;", "context", "Landroid/content/Context;", "action", "Lkotlin/Function0;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "binding", "Lcom/jiayouya/travel/databinding/DialogExitBinding;", "kotlin.jvm.PlatformType", "setupClick", "setupView", "app_grRelease"}, mo39190k = 1, mo39191mv = {1, 1, 15})
/* renamed from: com.jiayouya.travel.module.me.ui.dialog.c */
public final class ExitDilaog extends CustomDialog {
    /* renamed from: a */
    private final DialogExitBinding f11665a = ((DialogExitBinding) DataBindingUtil.inflate(getLayoutInflater(), R.layout.dialog_exit, null, false));
    /* access modifiers changed from: private|final */
    /* renamed from: b */
    public final C8246a<Unit> f11666b;

    @Metadata(mo39187bv = {1, 0, 3}, mo39188d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo39189d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo39190k = 3, mo39191mv = {1, 1, 15})
    /* compiled from: ExitDilaog.kt */
    /* renamed from: com.jiayouya.travel.module.me.ui.dialog.c$a */
    static final class C3211a extends Lambda implements C8247b<View, Unit> {
        final /* synthetic */ ExitDilaog this$0;

        C3211a(ExitDilaog cVar) {
            this.this$0 = cVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.f27778a;
        }

        public final void invoke(View view) {
            C8271i.m35386b(view, "it");
            this.this$0.dismiss();
        }
    }

    @Metadata(mo39187bv = {1, 0, 3}, mo39188d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo39189d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo39190k = 3, mo39191mv = {1, 1, 15})
    /* compiled from: ExitDilaog.kt */
    /* renamed from: com.jiayouya.travel.module.me.ui.dialog.c$b */
    static final class C3212b extends Lambda implements C8247b<View, Unit> {
        final /* synthetic */ ExitDilaog this$0;

        C3212b(ExitDilaog cVar) {
            this.this$0 = cVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.f27778a;
        }

        public final void invoke(View view) {
            C8271i.m35386b(view, "it");
            this.this$0.dismiss();
            this.this$0.f11666b.invoke();
        }
    }

    public ExitDilaog(Context context, C8246a<Unit> aVar) {
        C8271i.m35386b(context, "context");
        C8271i.m35386b(aVar, "action");
        super(context);
        this.f11666b = aVar;
        DialogExitBinding dialogExitBinding = this.f11665a;
        C8271i.m35382a((Object) dialogExitBinding, "binding");
        setView(dialogExitBinding.getRoot());
        m14151b();
        m14150a();
    }

    /* renamed from: a */
    private final void m14150a() {
        setDimAmount(0.7f);
        DialogExitBinding dialogExitBinding = this.f11665a;
        C8271i.m35382a((Object) dialogExitBinding, "binding");
        View root = dialogExitBinding.getRoot();
        C8271i.m35382a((Object) root, "binding.root");
        root.getLayoutParams().width = dp2px(260.0f);
    }

    /* renamed from: b */
    private final void m14151b() {
        RoundText roundText = this.f11665a.f10382a;
        C8271i.m35382a((Object) roundText, "binding.btnCancel");
        ezy.p642a.View.m34750a(roundText, 0, new C3211a(this), 1, null);
        RoundText roundText2 = this.f11665a.f10383b;
        C8271i.m35382a((Object) roundText2, "binding.btnConfirm");
        ezy.p642a.View.m34750a(roundText2, 0, new C3212b(this), 1, null);
    }
}

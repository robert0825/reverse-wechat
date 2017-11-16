package com.tencent.mm.plugin.sns.lucky.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.k;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static Dialog e(Context paramContext, final View paramView)
  {
    GMTrace.i(8817299423232L, 65694);
    View localView = LayoutInflater.from(paramContext).inflate(i.g.peR, null);
    Object localObject;
    if (v.bPH()) {
      localObject = "font_1.otf";
    }
    for (;;)
    {
      TextView localTextView = (TextView)localView.findViewById(i.f.pbs);
      if (!bg.nm((String)localObject)) {
        localTextView.setTypeface(Typeface.createFromAsset(paramContext.getAssets(), (String)localObject));
      }
      if (!v.bPG()) {
        localTextView.setTextSize(1, 10.0F);
      }
      localObject = new Dialog(paramContext, i.k.eme);
      ((Dialog)localObject).setContentView(localView);
      ((Dialog)localObject).setTitle(null);
      ((Dialog)localObject).setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(8816896770048L, 65691);
          w.i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog onCancel");
          if ((this.pqs != null) && (this.pqs.isShowing())) {
            this.pqs.dismiss();
          }
          GMTrace.o(8816896770048L, 65691);
        }
      });
      ((TextView)localView.findViewById(i.f.paL)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8808306835456L, 65627);
          w.i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog onClick");
          if ((this.pqs != null) && (this.pqs.isShowing())) {
            this.pqs.dismiss();
          }
          paramAnonymousView = paramView;
          if (paramAnonymousView != null) {
            paramAnonymousView.performClick();
          }
          GMTrace.o(8808306835456L, 65627);
        }
      });
      paramView = localView.findViewById(i.f.peo);
      int i = BackwardSupportUtil.b.a(paramContext, 10.0F);
      bg.j(paramView, i, i, i, i);
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8827768406016L, 65772);
          w.i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog OnClick: close");
          if ((this.pqs != null) && (this.pqs.isShowing())) {
            this.pqs.dismiss();
          }
          GMTrace.o(8827768406016L, 65772);
        }
      });
      ((Dialog)localObject).show();
      GMTrace.o(8817299423232L, 65694);
      return (Dialog)localObject;
      if (v.bPI()) {
        localObject = "font_2.otf";
      } else {
        localObject = null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
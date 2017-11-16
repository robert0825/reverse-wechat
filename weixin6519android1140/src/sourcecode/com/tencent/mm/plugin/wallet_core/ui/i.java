package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.la;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.y.q;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public final class i
{
  public static Dialog a(final Context paramContext, final String paramString1, String paramString2, List<String> paramList, String paramString3, int paramInt, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    GMTrace.i(19317823373312L, 143929);
    View localView = LayoutInflater.from(paramContext).inflate(a.g.sPt, null);
    ImageView localImageView = (ImageView)localView.findViewById(a.f.bps);
    int i = BackwardSupportUtil.b.a(paramContext, 15.0F);
    bg.j(localImageView, i, i, i, i);
    TextView localTextView2 = (TextView)localView.findViewById(a.f.dIf);
    TextView localTextView3 = (TextView)localView.findViewById(a.f.sAJ);
    LinearLayout localLinearLayout = (LinearLayout)localView.findViewById(a.f.sAK);
    Button localButton = (Button)localView.findViewById(a.f.sHZ);
    TextView localTextView1 = (TextView)localView.findViewById(a.f.sAI);
    localTextView2.setText(paramString1);
    localTextView3.setText(paramString2);
    localLinearLayout.removeAllViews();
    paramString1 = paramList.iterator();
    while (paramString1.hasNext())
    {
      paramString2 = (String)paramString1.next();
      paramList = LayoutInflater.from(paramContext).inflate(a.g.sPu, null);
      ((TextView)paramList.findViewById(a.f.sLp)).setText(paramString2);
      localLinearLayout.addView(paramList);
    }
    localButton.setText(paramString3);
    if (paramInt > 0)
    {
      paramInt = paramString4.length();
      i = (paramString4 + paramString5).length();
      paramString1 = new SpannableString(paramString4 + paramString5);
      paramString1.setSpan(new ForegroundColorSpan(paramContext.getResources().getColor(a.c.smW)), paramInt, i, 33);
      localTextView1.setText(paramString1);
    }
    for (;;)
    {
      localTextView1.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14697109651456L, 109502);
          paramAnonymousView = new Intent();
          String str = this.rmT;
          w.i("MicroMsg.WalletIdCardTip", "go to url %s", new Object[] { str });
          paramAnonymousView.putExtra("rawUrl", str);
          paramAnonymousView.putExtra("geta8key_username", q.zE());
          paramAnonymousView.putExtra("pay_channel", 1);
          d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(14697109651456L, 109502);
        }
      });
      paramString1 = new Dialog(paramContext, a.j.eme);
      paramString1.setContentView(localView);
      paramString1.setTitle(null);
      paramString1.setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(14697646522368L, 109506);
          w.i("MicroMsg.WalletIdCardTip", "SnsLuckyMoneyNewYearTipsUI onCancel");
          if ((this.pqs != null) && (this.pqs.isShowing())) {
            this.pqs.dismiss();
          }
          GMTrace.o(14697646522368L, 109506);
        }
      });
      localImageView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14697378086912L, 109504);
          if ((this.pqs != null) && (this.pqs.isShowing())) {
            this.pqs.dismiss();
          }
          GMTrace.o(14697378086912L, 109504);
        }
      });
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14696706998272L, 109499);
          paramAnonymousView = new Intent();
          String str = this.rmV;
          w.i("MicroMsg.WalletIdCardTip", "go to url %s", new Object[] { str });
          paramAnonymousView.putExtra("rawUrl", str);
          paramAnonymousView.putExtra("geta8key_username", q.zE());
          paramAnonymousView.putExtra("pay_channel", 1);
          d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView);
          if ((paramString1 != null) && (paramString1.isShowing())) {
            paramString1.dismiss();
          }
          GMTrace.o(14696706998272L, 109499);
        }
      });
      paramString1.show();
      GMTrace.o(19317823373312L, 143929);
      return paramString1;
      localTextView1.setText("");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
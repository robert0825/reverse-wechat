package com.tencent.mm.plugin.wallet_payu.a;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.wallet_core.ui.f;
import com.tencent.mm.plugin.wallet_core.ui.f.a;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class c
{
  public static void a(Context paramContext, TextView paramTextView)
  {
    GMTrace.i(7934683643904L, 59118);
    if ((paramContext != null) && (paramTextView != null)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      f localf1 = new f(paramContext);
      localf1.rmz = new f.a()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7934146772992L, 59114);
          w.i("MicroMsg.PayUUtil", "hy: user clicked the span");
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", "https://www.payu.co.za/wechat/terms-and-conditions/");
          paramAnonymousView.putExtra("showShare", false);
          d.b(this.val$context, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(7934146772992L, 59114);
        }
      };
      f localf2 = new f(paramContext);
      localf2.rmz = new f.a()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7933475684352L, 59109);
          w.i("MicroMsg.PayUUtil", "hy: user clicked the tos span");
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?lang=en_US&check=false&t=weixin_agreement&s=terms");
          paramAnonymousView.putExtra("showShare", false);
          d.b(this.val$context, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(7933475684352L, 59109);
        }
      };
      paramContext = paramContext.getText(a.i.teV).toString();
      SpannableString localSpannableString = new SpannableString(paramContext);
      localSpannableString.setSpan(localf1, 94, 115, 33);
      localSpannableString.setSpan(localf2, paramContext.length() - 3, paramContext.length(), 33);
      paramTextView.setText(localSpannableString);
      paramTextView.setMovementMethod(LinkMovementMethod.getInstance());
      GMTrace.o(7934683643904L, 59118);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
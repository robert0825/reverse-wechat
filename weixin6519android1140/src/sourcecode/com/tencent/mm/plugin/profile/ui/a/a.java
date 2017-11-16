package com.tencent.mm.plugin.profile.ui.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;

public final class a
  implements e
{
  public Activity eNu;
  public r luk;
  public com.tencent.mm.plugin.profile.a.a nPi;
  public aj nPj;
  
  public a(Activity paramActivity)
  {
    GMTrace.i(6736253550592L, 50189);
    this.nPj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6736119332864L, 50188);
        if (!a.this.eNu.isFinishing())
        {
          a locala = a.this;
          Activity localActivity = a.this.eNu;
          a.this.eNu.getString(R.l.cUG);
          locala.luk = h.a(localActivity, a.this.eNu.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(6736790421504L, 50193);
              at.wS().c(a.this.nPi);
              a.this.luk = null;
              GMTrace.o(6736790421504L, 50193);
            }
          });
        }
        GMTrace.o(6736119332864L, 50188);
        return false;
      }
    }, false);
    this.eNu = paramActivity;
    GMTrace.o(6736253550592L, 50189);
  }
  
  private void EP(String paramString)
  {
    GMTrace.i(6736521986048L, 50191);
    this.nPj.stopTimer();
    if (this.luk != null) {
      this.luk.dismiss();
    }
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    paramString.putExtra("title", this.eNu.getString(R.l.dlA));
    paramString.putExtra("zoom", true);
    paramString.putExtra("vertical_scroll", false);
    d.b(this.eNu, "webview", ".ui.tools.WebViewUI", paramString);
    GMTrace.o(6736521986048L, 50191);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6736387768320L, 50190);
    at.wS().b(205, this);
    paramString = (com.tencent.mm.plugin.profile.a.a)paramk;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      EP(paramString.getURL());
      GMTrace.o(6736387768320L, 50190);
      return;
    }
    if (paramInt1 != 4) {
      w.e("MicroMsg.ViewTWeibo", "view weibo failed: " + paramInt1 + ", " + paramInt2);
    }
    EP("http://t.qq.com/" + paramString.nKY);
    GMTrace.o(6736387768320L, 50190);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
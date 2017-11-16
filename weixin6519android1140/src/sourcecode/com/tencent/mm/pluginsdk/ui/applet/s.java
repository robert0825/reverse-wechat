package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class s
  implements e
{
  public Context context;
  public r luk;
  private aj nPj;
  public l ozU;
  private String txY;
  
  public s(Context paramContext)
  {
    GMTrace.i(935094910976L, 6967);
    this.nPj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(959790972928L, 7151);
        s locals = s.this;
        Context localContext = s.this.context;
        s.this.context.getString(R.l.cUG);
        locals.luk = h.a(localContext, s.this.context.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(958180360192L, 7139);
            at.wS().c(s.this.ozU);
            s.this.luk = null;
            GMTrace.o(958180360192L, 7139);
          }
        });
        GMTrace.o(959790972928L, 7151);
        return false;
      }
    }, false);
    this.context = paramContext;
    GMTrace.o(935094910976L, 6967);
  }
  
  private void Po(String paramString)
  {
    GMTrace.i(935363346432L, 6969);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.context.getString(R.l.dkq, new Object[] { paramString }));
    localIntent.putExtra("useJs", true);
    localIntent.putExtra("vertical_scroll", true);
    localIntent.putExtra("neverGetA8Key", true);
    d.b(this.context, "webview", ".ui.tools.ContactQZoneWebView", localIntent);
    GMTrace.o(935363346432L, 6969);
  }
  
  public final void Pn(String paramString)
  {
    GMTrace.i(935229128704L, 6968);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.ViewQZone", "go fail, qqNum is null");
      GMTrace.o(935229128704L, 6968);
      return;
    }
    this.txY = paramString;
    at.AR();
    String str1 = (String)c.xh().get(46, null);
    at.AR();
    String str2 = bg.nl((String)c.xh().get(72, null));
    w.i("MicroMsg.ViewQZone", "get a2key:[%s], get new a2key:[%s]", new Object[] { str1, str2 });
    if ((bg.nm(str1)) && (bg.nm(str2)))
    {
      Po(paramString);
      GMTrace.o(935229128704L, 6968);
      return;
    }
    at.wS().a(233, this);
    this.ozU = new l(o.bj(paramString), (int)System.currentTimeMillis());
    at.wS().a(this.ozU, 0);
    this.nPj.z(3000L, 3000L);
    GMTrace.o(935229128704L, 6968);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(935497564160L, 6970);
    this.nPj.stopTimer();
    if (this.luk != null) {
      this.luk.dismiss();
    }
    at.wS().b(233, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (l)paramk;
      paramk = paramString.Lc();
      if ((paramk == null) || (paramk.length() == 0))
      {
        Po(this.txY);
        GMTrace.o(935497564160L, 6970);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramk);
      localIntent.putExtra("useJs", true);
      localIntent.putExtra("vertical_scroll", true);
      localIntent.putExtra("neverGetA8Key", true);
      localIntent.putExtra("geta8key_session_id", paramString.Lk());
      d.b(this.context, "webview", ".ui.tools.ContactQZoneWebView", localIntent);
      GMTrace.o(935497564160L, 6970);
      return;
    }
    w.e("MicroMsg.ViewQZone", "getA8Key fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    Po(this.txY);
    GMTrace.o(935497564160L, 6970);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
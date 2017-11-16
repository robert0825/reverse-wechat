package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.q;

public class d
{
  protected String appId;
  protected Context context;
  protected a jjc;
  protected String openId;
  
  public d(Context paramContext, String paramString1, String paramString2, a parama)
  {
    GMTrace.i(12839133642752L, 95659);
    this.context = paramContext;
    this.appId = paramString1;
    this.openId = paramString2;
    this.jjc = parama;
    GMTrace.o(12839133642752L, 95659);
  }
  
  protected void Pj()
  {
    GMTrace.i(12839402078208L, 95661);
    h.b(this.context, R.l.dNm, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12830006837248L, 95591);
        paramAnonymousDialogInterface = p.a.tma;
        if (paramAnonymousDialogInterface != null) {
          paramAnonymousDialogInterface.L(d.this.openId, q.zH(), d.this.appId);
        }
        d.this.jjc.dl(true);
        GMTrace.o(12830006837248L, 95591);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12839670513664L, 95663);
        paramAnonymousDialogInterface = p.a.tma;
        if (paramAnonymousDialogInterface != null) {
          paramAnonymousDialogInterface.L(d.this.openId, q.zH(), d.this.appId);
        }
        d.this.jjc.dl(false);
        GMTrace.o(12839670513664L, 95663);
      }
    });
    GMTrace.o(12839402078208L, 95661);
  }
  
  public final void agL()
  {
    GMTrace.i(12839267860480L, 95660);
    if ((this.openId == null) || (this.openId.length() == 0))
    {
      w.w("MicroMsg.OpenIdChecker", "doCheck, openId is null");
      this.jjc.dl(true);
      GMTrace.o(12839267860480L, 95660);
      return;
    }
    f localf = g.aP(this.appId, false);
    if (localf == null)
    {
      w.e("MicroMsg.OpenIdChecker", "doCheck fail, local app is null, appId = " + this.appId);
      this.jjc.dl(true);
      GMTrace.o(12839267860480L, 95660);
      return;
    }
    if (t.nm(localf.field_openId))
    {
      w.w("MicroMsg.OpenIdChecker", "doCheck fail, local openId is null, appId = " + this.appId);
      w.d("MicroMsg.OpenIdChecker", "doCheck, trigger getappsetting, appId = " + this.appId);
      an.aWA().LD(this.appId);
      this.jjc.dl(true);
      GMTrace.o(12839267860480L, 95660);
      return;
    }
    if (this.openId.equalsIgnoreCase(localf.field_openId))
    {
      w.d("MicroMsg.OpenIdChecker", "doCheck succ, appId = " + this.appId);
      this.jjc.dl(true);
      GMTrace.o(12839267860480L, 95660);
      return;
    }
    w.w("MicroMsg.OpenIdChecker", "doCheck fail, appId = " + this.appId + ", openId = " + this.openId + ", localOpenId = " + localf.field_openId);
    Pj();
    GMTrace.o(12839267860480L, 95660);
  }
  
  public static abstract interface a
  {
    public abstract void dl(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\base\stub\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
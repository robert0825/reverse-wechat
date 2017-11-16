package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Req;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;

final class c
{
  aj gsj;
  d ioh;
  public r luk;
  boolean rIK;
  boolean rIL;
  final a rIM;
  public OAuthUI rIN;
  
  private c(OAuthUI paramOAuthUI, a parama, d paramd)
  {
    GMTrace.i(12278774628352L, 91484);
    this.rIK = false;
    this.rIL = false;
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12318503075840L, 91780);
        if (c.this.rIN.isFinishing())
        {
          w.w("MicroMsg.OAuthSession", "onTimerExpired, context is finishing");
          GMTrace.o(12318503075840L, 91780);
          return false;
        }
        c localc = c.this;
        OAuthUI localOAuthUI = c.this.rIN;
        c.this.rIN.getString(R.l.cUG);
        localc.luk = h.a(localOAuthUI, c.this.rIN.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(12134087917568L, 90406);
            try
            {
              paramAnonymous2DialogInterface.dismiss();
              GMTrace.o(12134087917568L, 90406);
              return;
            }
            catch (Exception paramAnonymous2DialogInterface)
            {
              w.e("MicroMsg.OAuthSession", "onCancel, ex = " + paramAnonymous2DialogInterface.getMessage());
              GMTrace.o(12134087917568L, 90406);
            }
          }
        });
        GMTrace.o(12318503075840L, 91780);
        return false;
      }
    }, false);
    this.rIN = paramOAuthUI;
    this.rIM = parama;
    this.ioh = paramd;
    GMTrace.o(12278774628352L, 91484);
  }
  
  public static c a(OAuthUI paramOAuthUI, String paramString, SendAuth.Req paramReq, a parama, d paramd)
  {
    GMTrace.i(12278908846080L, 91485);
    paramOAuthUI = new c(paramOAuthUI, parama, paramd);
    parama = paramReq.scope;
    paramReq = paramReq.state;
    if (paramOAuthUI.rIK) {
      w.e("MicroMsg.OAuthSession", "already getting");
    }
    for (;;)
    {
      GMTrace.o(12278908846080L, 91485);
      return paramOAuthUI;
      paramOAuthUI.rIL = true;
      paramd = new Bundle();
      paramd.putString("geta8key_data_appid", paramString);
      paramd.putString("geta8key_data_scope", parama);
      paramd.putString("geta8key_data_state", paramReq);
      try
      {
        paramOAuthUI.ioh.q(233, paramd);
        paramOAuthUI.rIK = true;
        paramOAuthUI.gsj.z(3000L, 3000L);
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          w.w("MicroMsg.OAuthSession", "startGetA8Key, ex = " + paramString.getMessage());
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(c paramc, String paramString, boolean paramBoolean);
    
    public abstract void c(boolean paramBoolean, String paramString1, String paramString2, String paramString3);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
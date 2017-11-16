package com.tencent.mm.pluginsdk.i;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.Set;

public final class a
{
  private i tpk;
  private j tpl;
  private k tpm;
  private g tpn;
  private h tpo;
  private f tpp;
  
  public a()
  {
    GMTrace.i(698334838784L, 5203);
    GMTrace.o(698334838784L, 5203);
  }
  
  private static void a(b paramb)
  {
    GMTrace.i(698603274240L, 5205);
    if (paramb != null)
    {
      Iterator localIterator = paramb.tpq.iterator();
      while (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        at.wS().b(localInteger.intValue(), paramb);
      }
      paramb.activity = null;
    }
    GMTrace.o(698603274240L, 5205);
  }
  
  public final boolean a(Activity paramActivity, o paramo)
  {
    GMTrace.i(698469056512L, 5204);
    if ((paramo.type == 0) || (paramo.action == 0))
    {
      GMTrace.o(698469056512L, 5204);
      return false;
    }
    if (this.tpp == null) {
      this.tpp = new f(paramActivity);
    }
    if (this.tpp.a(paramo))
    {
      GMTrace.o(698469056512L, 5204);
      return true;
    }
    switch (paramo.type)
    {
    default: 
      w.e("MicroMsg.BaseErrorHelper", "Unkown error type");
    }
    for (;;)
    {
      GMTrace.o(698469056512L, 5204);
      return false;
      if (this.tpk == null) {
        this.tpk = new i(paramActivity);
      }
      this.tpk.a(paramo);
      continue;
      if (this.tpl == null) {
        this.tpl = new j(paramActivity);
      }
      this.tpl.a(paramo);
      continue;
      if (this.tpm == null) {
        this.tpm = new k(paramActivity);
      }
      this.tpm.a(paramo);
      continue;
      if (this.tpn == null) {
        this.tpn = new g(paramActivity);
      }
      this.tpn.a(paramo);
      continue;
      if (this.tpo == null) {
        this.tpo = new h(paramActivity);
      }
      this.tpo.a(paramo);
      continue;
      if (this.tpp == null) {
        this.tpp = new f(paramActivity);
      }
      this.tpp.a(paramo);
    }
  }
  
  public final void close()
  {
    GMTrace.i(698737491968L, 5206);
    a(this.tpk);
    a(this.tpl);
    a(this.tpm);
    a(this.tpn);
    a(this.tpo);
    a(this.tpp);
    GMTrace.o(698737491968L, 5206);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.freewifi.d;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.n;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.y.at;

public abstract class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  protected Activity activity;
  protected b fUa;
  protected com.tencent.mm.ad.e fUd;
  protected com.tencent.mm.ad.e lqP;
  
  public c()
  {
    GMTrace.i(7252589150208L, 54036);
    GMTrace.o(7252589150208L, 54036);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7253260238848L, 54041);
    this.lqP = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7253260238848L, 54041);
    return i;
  }
  
  public final void a(final int paramInt1, final int paramInt2, final int paramInt3, final String paramString, final q paramq, final byte[] paramArrayOfByte)
  {
    GMTrace.i(7252723367936L, 54037);
    m.yv("netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " returns [" + paramInt2 + "," + paramInt3 + "]");
    if (this.lqP != null) {
      this.lqP.a(paramInt2, paramInt3, paramString, this);
    }
    if ((this.activity != null) && (this.activity.isFinishing()))
    {
      GMTrace.o(7252723367936L, 54037);
      return;
    }
    if (this.fUd != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7247488876544L, 53998);
          c.this.b(paramInt1, paramInt2, paramInt3, paramString);
          if (c.this.fUd != null) {
            c.this.fUd.a(paramInt2, paramInt3, paramString, c.this);
          }
          GMTrace.o(7247488876544L, 53998);
        }
      });
    }
    GMTrace.o(7252723367936L, 54037);
  }
  
  protected abstract void aBl();
  
  protected void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(7252857585664L, 54038);
    GMTrace.o(7252857585664L, 54038);
  }
  
  public final void b(com.tencent.mm.ad.e parame)
  {
    GMTrace.i(7253126021120L, 54040);
    this.fUd = parame;
    m.yv("netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " is started.");
    at.wS().a(this, 0);
    GMTrace.o(7253126021120L, 54040);
  }
  
  public final c u(Activity paramActivity)
  {
    GMTrace.i(7253394456576L, 54042);
    this.activity = paramActivity;
    GMTrace.o(7253394456576L, 54042);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
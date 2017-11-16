package com.tencent.mm.plugin.scanner.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.kb;
import com.tencent.mm.plugin.scanner.util.e;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public Activity mActivity;
  public String osY;
  public e osZ;
  public com.tencent.mm.plugin.scanner.util.a ota;
  public e.a otb;
  public c otc;
  public c otd;
  
  public b()
  {
    GMTrace.i(6057380282368L, 45131);
    this.otb = new e.a()
    {
      public final void l(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(6050400960512L, 45079);
        w.i("MicroMsg.ExternRequestDealQBarStrHandler", "Deal QBar String notify, id:%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        kb localkb = new kb();
        localkb.eOr.eOp = paramAnonymousInt;
        localkb.eOr.activity = b.this.mActivity;
        localkb.eOr.eBB = b.this.osY;
        localkb.eOr.eOs = paramAnonymousBundle;
        com.tencent.mm.sdk.b.a.vgX.m(localkb);
        GMTrace.o(6050400960512L, 45079);
      }
    };
    this.otc = new c() {};
    this.otd = new c() {};
    GMTrace.o(6057380282368L, 45131);
  }
  
  public final void bco()
  {
    GMTrace.i(6057514500096L, 45132);
    if (this.osZ != null)
    {
      this.osZ.bdq();
      this.osZ = null;
    }
    this.mActivity = null;
    this.osY = null;
    GMTrace.o(6057514500096L, 45132);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
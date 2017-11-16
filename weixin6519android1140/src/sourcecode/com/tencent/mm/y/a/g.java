package com.tencent.mm.y.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.util.HashMap;

public class g
  implements aq
{
  private c gpL;
  
  public g()
  {
    GMTrace.i(690952863744L, 5148);
    this.gpL = null;
    GMTrace.o(690952863744L, 5148);
  }
  
  private static g BX()
  {
    GMTrace.i(691087081472L, 5149);
    g localg = (g)p.o(g.class);
    GMTrace.o(691087081472L, 5149);
    return localg;
  }
  
  public static c BY()
  {
    GMTrace.i(691892387840L, 5155);
    h.xw().wG();
    if (BX().gpL == null) {
      BX().gpL = new c();
    }
    c localc = BX().gpL;
    GMTrace.o(691892387840L, 5155);
    return localc;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(691489734656L, 5152);
    c localc = BY();
    long l = System.currentTimeMillis();
    try
    {
      localc.hc((String)h.xy().xh().get(328193, null));
      if (localc.BW()) {
        f.he(localc.gpF.gpB);
      }
      w.i("MicroMsg.abtest.AbTestManager", "[Abtest] init use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(691489734656L, 5152);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.abtest.AbTestManager", "[Abtest] updateAbTestCase exception:%s", new Object[] { localException.toString() });
      }
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(691623952384L, 5153);
    GMTrace.o(691623952384L, 5153);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(691355516928L, 5151);
    GMTrace.o(691355516928L, 5151);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(691758170112L, 5154);
    c localc = BY();
    localc.gpG = null;
    localc.gpF = null;
    GMTrace.o(691758170112L, 5154);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(691221299200L, 5150);
    GMTrace.o(691221299200L, 5150);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
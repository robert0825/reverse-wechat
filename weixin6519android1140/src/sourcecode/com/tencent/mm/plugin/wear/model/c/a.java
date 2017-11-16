package com.tencent.mm.plugin.wear.model.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.protocal.c.bsb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class a
{
  public static final void dC(int paramInt1, int paramInt2)
  {
    GMTrace.i(9196330287104L, 68518);
    bsb localbsb = com.tencent.mm.plugin.wear.model.a.bBm().rzt.rzK.rAy;
    if (localbsb != null)
    {
      w.v("MicroMsg.Wear.ReportKVUtil", "report kv operation=%d scene=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      g.ork.i(11632, new Object[] { Integer.valueOf(paramInt1), localbsb.jhn, localbsb.vbp, Integer.valueOf(paramInt2) });
    }
    GMTrace.o(9196330287104L, 68518);
  }
  
  public static final void jn(boolean paramBoolean)
  {
    GMTrace.i(9196598722560L, 68520);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(249);
    localIDKey.SetKey(12);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    if (paramBoolean)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(249);
      localIDKey.SetKey(13);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    g.ork.b(localArrayList, false);
    GMTrace.o(9196598722560L, 68520);
  }
  
  public static final void xi(int paramInt)
  {
    GMTrace.i(9196464504832L, 68519);
    g.ork.a(249L, paramInt, 1L, false);
    GMTrace.o(9196464504832L, 68519);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
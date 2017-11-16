package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.fq;
import com.tencent.mm.g.a.fq.a;
import com.tencent.mm.g.a.fq.b;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements h.a
{
  public c(Context paramContext)
  {
    GMTrace.i(7527467057152L, 56084);
    fq localfq = new fq();
    localfq.eIa.opType = 3;
    localfq.eIa.context = paramContext;
    a.vgX.m(localfq);
    GMTrace.o(7527467057152L, 56084);
  }
  
  public final Bitmap a(h.a.b paramb)
  {
    GMTrace.i(7527869710336L, 56087);
    fq localfq = new fq();
    localfq.eIa.opType = 2;
    localfq.eIa.eIh = false;
    if (paramb.eIf)
    {
      localfq.eIa.eIc = paramb.eIc;
      localfq.eIa.eIf = paramb.eIf;
    }
    for (;;)
    {
      a.vgX.m(localfq);
      w.d("MicroMsg.FavImageServiceProxy", "getSuitableBigImg favLocalId %s, dataId %s, retBmp %s, fromCache", new Object[] { Long.valueOf(paramb.ohY), paramb.eIc.lhq, localfq.eIb.eIi, Boolean.valueOf(localfq.eIa.eIf) });
      paramb = localfq.eIb.eIi;
      GMTrace.o(7527869710336L, 56087);
      return paramb;
      localfq.eIa.eIc = paramb.eIc;
      localfq.eIa.eDp = paramb.ohY;
      localfq.eIa.maxWidth = paramb.maxWidth;
      localfq.eIa.eIg = paramb.eIg;
    }
  }
  
  public final Bitmap a(h.a.c paramc)
  {
    GMTrace.i(7527735492608L, 56086);
    fq localfq = new fq();
    localfq.eIa.opType = 0;
    localfq.eIa.eIc = paramc.eIc;
    localfq.eIa.eDp = paramc.ohY;
    a.vgX.m(localfq);
    w.d("MicroMsg.FavImageServiceProxy", "getThumb favLocalId %s, retBmp %s", new Object[] { Long.valueOf(paramc.ohY), localfq.eIb.eIi });
    paramc = localfq.eIb.eIi;
    GMTrace.o(7527735492608L, 56086);
    return paramc;
  }
  
  public final void a(h.a.a parama)
  {
    GMTrace.i(7527601274880L, 56085);
    w.d("MicroMsg.FavImageServiceProxy", "attachThumb favLocalId %s", new Object[] { Long.valueOf(parama.ohY) });
    fq localfq = new fq();
    localfq.eIa.opType = 1;
    localfq.eIa.eId = parama.eId;
    localfq.eIa.eIc = parama.eIc;
    localfq.eIa.eDp = parama.ohY;
    localfq.eIa.eIe = parama.eIe;
    localfq.eIa.width = parama.width;
    localfq.eIa.height = parama.height;
    a.vgX.m(localfq);
    GMTrace.o(7527601274880L, 56085);
  }
  
  public final void baO()
  {
    GMTrace.i(7528003928064L, 56088);
    fq localfq = new fq();
    localfq.eIa.opType = 4;
    a.vgX.m(localfq);
    GMTrace.o(7528003928064L, 56088);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
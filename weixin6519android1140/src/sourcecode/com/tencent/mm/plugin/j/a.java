package com.tencent.mm.plugin.j;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.c;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.protocal.c.aqh;
import com.tencent.mm.protocal.c.iy;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.y.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.p;

public final class a
  extends p
  implements com.tencent.mm.plugin.auth.a.a
{
  private static a jMy;
  
  private a()
  {
    super(g.class);
    GMTrace.i(14600607105024L, 108783);
    GMTrace.o(14600607105024L, 108783);
  }
  
  public static a ank()
  {
    try
    {
      GMTrace.i(14600741322752L, 108784);
      if (jMy == null) {
        jMy = new a();
      }
      a locala = jMy;
      GMTrace.o(14600741322752L, 108784);
      return locala;
    }
    finally {}
  }
  
  public final void a(i.f paramf, i.g paramg, boolean paramBoolean)
  {
    GMTrace.i(14600875540480L, 108785);
    GMTrace.o(14600875540480L, 108785);
  }
  
  public final void a(y.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    GMTrace.i(14601009758208L, 108786);
    if (paramb.tKW.kAW != 0) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14601278193664L, 108788);
          g.a locala = new g.a();
          long l2 = -1L;
          g.Gh();
          long l1 = l2;
          if (g.Gj() != null)
          {
            l1 = l2;
            if (this.jMz != null)
            {
              g.Gh();
              g.Gj().a(this.jMz, this.jMA, this.jMB);
              l1 = locala.tD();
            }
          }
          w.d("MicroMsg.PinCdnTransport", "dkrsa setautoauthtick [%d %d]", new Object[] { Long.valueOf(locala.tD()), Long.valueOf(l1) });
          GMTrace.o(14601278193664L, 108788);
        }
      });
    }
    GMTrace.o(14601009758208L, 108786);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\j\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
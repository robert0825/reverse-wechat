package com.tencent.mm.modelcdntran;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.iy;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.io.File;
import java.util.HashMap;
import java.util.Random;

public class g
  implements aq
{
  private b gAr;
  private c gAs;
  private com.tencent.mm.ad.c gAt;
  public long gAu;
  public ae gAv;
  private com.tencent.mm.ad.e gAw;
  
  public g()
  {
    GMTrace.i(575794053120L, 4290);
    this.gAr = null;
    this.gAs = null;
    this.gAu = 0L;
    this.gAv = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(20993531707392L, 156414);
        if (paramAnonymousMessage.what != 1)
        {
          GMTrace.o(20993531707392L, 156414);
          return;
        }
        if (g.this.gAu == 0L)
        {
          GMTrace.o(20993531707392L, 156414);
          return;
        }
        int i = paramAnonymousMessage.arg1;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreCdnTransport", "try get dns again scene[%d] lastGetDnsErrorTime[%d]  diff[%d]", new Object[] { Integer.valueOf(i), Long.valueOf(g.this.gAu), Long.valueOf(bg.aH(g.this.gAu)) });
        h.wS().a(new e(i), 0);
        GMTrace.o(20993531707392L, 156414);
      }
    };
    this.gAw = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(20994605449216L, 156422);
        if (!(paramAnonymousk instanceof e))
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.SubCoreCdnTransport", "get cdn dns on scene end but is not [NetSceneGetCdnDns]");
          GMTrace.o(20994605449216L, 156422);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreCdnTransport", "%d get cdn dns on scene end errType[%d] errCode[%d] errMsg[%s] lastGetDnsErrorTime[%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Long.valueOf(g.this.gAu) });
        if ("doScene failed".equals(paramAnonymousString))
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SubCoreCdnTransport", "%d get cdn dns cache do nothing.", new Object[] { Integer.valueOf(hashCode()) });
          GMTrace.o(20994605449216L, 156422);
          return;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(546L, paramAnonymousInt1 + 10, 1L, true);
        if (paramAnonymousInt1 == 0)
        {
          if (g.this.gAu > 0L)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(546L, 52L, 1L, true);
            g.this.gAu = 0L;
          }
          GMTrace.o(20994605449216L, 156422);
          return;
        }
        if (paramAnonymousInt1 != 4)
        {
          if (g.this.gAu == 0L)
          {
            paramAnonymousInt1 = ((e)paramAnonymousk).scene;
            g.this.gAu = bg.Pv();
            g.this.gAv.removeMessages(1);
            g.this.gAv.sendMessageDelayed(g.this.gAv.obtainMessage(1, paramAnonymousInt1, 0), 30000L);
            com.tencent.mm.plugin.report.service.g.ork.a(546L, 50L, 1L, true);
            GMTrace.o(20994605449216L, 156422);
            return;
          }
          g.this.gAu = 0L;
          com.tencent.mm.plugin.report.service.g.ork.a(546L, 51L, 1L, true);
          GMTrace.o(20994605449216L, 156422);
          return;
        }
        GMTrace.o(20994605449216L, 156422);
      }
    };
    GMTrace.o(575794053120L, 4290);
  }
  
  public static g Gh()
  {
    GMTrace.i(575928270848L, 4291);
    g localg = (g)p.o(g.class);
    GMTrace.o(575928270848L, 4291);
    return localg;
  }
  
  public static String Gi()
  {
    GMTrace.i(576330924032L, 4294);
    h.xw().wG();
    String str = h.xy().cachePath + "cdndnsinfo/";
    GMTrace.o(576330924032L, 4294);
    return str;
  }
  
  public static com.tencent.mm.ad.c Gj()
  {
    GMTrace.i(16420733714432L, 122344);
    com.tencent.mm.ad.c localc = Gh().gAt;
    GMTrace.o(16420733714432L, 122344);
    return localc;
  }
  
  public static c Gk()
  {
    GMTrace.i(576867794944L, 4298);
    if (Gh().gAs == null) {
      Gh().gAs = new c();
    }
    c localc = Gh().gAs;
    GMTrace.o(576867794944L, 4298);
    return localc;
  }
  
  public static b Gl()
  {
    GMTrace.i(577002012672L, 4299);
    if (Gh().gAr == null)
    {
      h.xw();
      if (!com.tencent.mm.kernel.a.wK()) {
        break label68;
      }
    }
    Object localObject;
    for (Gh().gAr = new b(h.xy().cachePath, Gk());; Gh().gAr = new b((String)localObject, Gk()))
    {
      localObject = Gh().gAr;
      GMTrace.o(577002012672L, 4299);
      return (b)localObject;
      label68:
      localObject = com.tencent.mm.a.g.n(("mm" + new Random().nextLong()).getBytes());
      localObject = com.tencent.mm.storage.w.ghv + (String)localObject + "/";
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.SubCoreCdnTransport", "hy: cdn temp path: %s", new Object[] { localObject });
    }
  }
  
  public final void Gm()
  {
    GMTrace.i(20993665925120L, 156415);
    fU(0);
    GMTrace.o(20993665925120L, 156415);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(576599359488L, 4296);
    onAccountRelease();
    h.xw().wG();
    File localFile = new File(Gi());
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    this.gAt = new com.tencent.mm.ad.c()
    {
      public final void a(iy paramAnonymousiy1, iy paramAnonymousiy2, iy paramAnonymousiy3)
      {
        GMTrace.i(578344189952L, 4309);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SubCoreCdnTransport", "cdntra infoUpdate dns info " + paramAnonymousiy1.toString() + " getCore().engine:" + g.Gl());
        if (g.Gl() != null)
        {
          g.Gl().a(paramAnonymousiy1, paramAnonymousiy2, paramAnonymousiy3, null, null, null);
          h.xB().A(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(582639157248L, 4341);
              if (g.Gk() != null) {
                g.Gk().br(false);
              }
              GMTrace.o(582639157248L, 4341);
            }
            
            public final String toString()
            {
              GMTrace.i(582773374976L, 4342);
              String str = super.toString() + "|infoUpdate";
              GMTrace.o(582773374976L, 4342);
              return str;
            }
          });
        }
        GMTrace.o(578344189952L, 4309);
      }
    };
    h.wS().a(379, this.gAw);
    GMTrace.o(576599359488L, 4296);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(576465141760L, 4295);
    GMTrace.o(576465141760L, 4295);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(576196706304L, 4293);
    GMTrace.o(576196706304L, 4293);
  }
  
  public final void fU(int paramInt)
  {
    GMTrace.i(20993800142848L, 156416);
    this.gAu = 0L;
    this.gAv.removeMessages(1);
    h.wS().a(new e(paramInt), 0);
    GMTrace.o(20993800142848L, 156416);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(577136230400L, 4300);
    this.gAt = null;
    Object localObject;
    if (this.gAr != null)
    {
      localObject = this.gAr;
      CdnLogic.setCallBack(null);
      ((b)localObject).gzv = null;
      this.gAr = null;
    }
    if (this.gAs != null)
    {
      localObject = this.gAs;
      if (h.xw().wL()) {
        h.xy().xh().b((m.b)localObject);
      }
      ((c)localObject).gzC.removeCallbacksAndMessages(null);
      h.xx().b(((c)localObject).gzE);
      h.xx().fYr.b(379, (com.tencent.mm.ad.e)localObject);
      com.tencent.mm.sdk.b.a.vgX.c(((c)localObject).gzD);
      this.gAs = null;
    }
    this.gAu = 0L;
    this.gAv.removeCallbacksAndMessages(null);
    h.wS().b(379, this.gAw);
    GMTrace.o(577136230400L, 4300);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(576062488576L, 4292);
    GMTrace.o(576062488576L, 4292);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcdntran\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.aw;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import java.util.HashMap;
import java.util.Map;

public class t
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private n gQl;
  private b gQm;
  private o gQn;
  private p gQo;
  private q gQp;
  private r gQq;
  private l gQr;
  private aj gQs;
  
  static
  {
    GMTrace.i(12948252655616L, 96472);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("PACKAGE_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(12949594832896L, 96482);
        String[] arrayOfString = n.fTX;
        GMTrace.o(12949594832896L, 96482);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("CHATTINGBGINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(12937917890560L, 96395);
        String[] arrayOfString = b.fTX;
        GMTrace.o(12937917890560L, 96395);
        return arrayOfString;
      }
    });
    GMTrace.o(12948252655616L, 96472);
  }
  
  public t()
  {
    GMTrace.i(12947044696064L, 96463);
    this.gQn = new o();
    this.gQo = new p();
    this.gQp = new q();
    this.gQq = new r();
    this.gQr = null;
    this.gQs = new aj(h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12948521091072L, 96474);
        w.d("MicroMsg.SubCorePacakge", "dkregcode Update RegonCode here TRULY!");
        s.Kh().update();
        GMTrace.o(12948521091072L, 96474);
        return false;
      }
      
      public final String toString()
      {
        GMTrace.i(12948655308800L, 96475);
        String str = super.toString() + "|regCodeUpdater";
        GMTrace.o(12948655308800L, 96475);
        return str;
      }
    }, false);
    GMTrace.o(12947044696064L, 96463);
  }
  
  private static t Ki()
  {
    GMTrace.i(12947178913792L, 96464);
    t localt = (t)com.tencent.mm.y.p.o(t.class);
    GMTrace.o(12947178913792L, 96464);
    return localt;
  }
  
  public static n Kj()
  {
    GMTrace.i(12947313131520L, 96465);
    h.xw().wG();
    if (Ki().gQl == null) {
      Ki().gQl = new n(h.xy().fYV);
    }
    n localn = Ki().gQl;
    GMTrace.o(12947313131520L, 96465);
    return localn;
  }
  
  public static b Kk()
  {
    GMTrace.i(12947447349248L, 96466);
    h.xw().wG();
    if (Ki().gQm == null) {
      Ki().gQm = new b(h.xy().fYV);
    }
    b localb = Ki().gQm;
    GMTrace.o(12947447349248L, 96466);
    return localb;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(12947715784704L, 96468);
    if (paramBoolean)
    {
      w.d("MicroMsg.SubCorePacakge", "dkregcode Update RegonCode here !");
      this.gQs.z(10000L, 10000L);
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.gQn);
    com.tencent.mm.sdk.b.a.vgX.b(this.gQo);
    com.tencent.mm.sdk.b.a.vgX.b(this.gQp);
    com.tencent.mm.sdk.b.a.vgX.b(this.gQq);
    if (this.gQr != null) {
      this.gQr.gQf.clear();
    }
    for (;;)
    {
      com.tencent.mm.sdk.b.a.vgX.b(this.gQr.gQg);
      com.tencent.mm.sdk.b.a.vgX.b(this.gQr.gQh);
      GMTrace.o(12947715784704L, 96468);
      return;
      this.gQr = new l();
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(12948118437888L, 96471);
    GMTrace.o(12948118437888L, 96471);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(12947984220160L, 96470);
    GMTrace.o(12947984220160L, 96470);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(12947581566976L, 96467);
    com.tencent.mm.sdk.b.a.vgX.c(this.gQn);
    com.tencent.mm.sdk.b.a.vgX.c(this.gQo);
    com.tencent.mm.sdk.b.a.vgX.c(this.gQp);
    com.tencent.mm.sdk.b.a.vgX.c(this.gQq);
    com.tencent.mm.sdk.b.a.vgX.c(this.gQr.gQg);
    com.tencent.mm.sdk.b.a.vgX.c(this.gQr.gQh);
    GMTrace.o(12947581566976L, 96467);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(12947850002432L, 96469);
    HashMap localHashMap = fIv;
    GMTrace.o(12947850002432L, 96469);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
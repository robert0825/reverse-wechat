package com.tencent.mm.ac;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.Builder;
import com.tencent.mm.plugin.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class n
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private i gtl;
  private d gtm;
  private c gtn;
  private g gto;
  private String gtp;
  private aj gtq;
  
  static
  {
    GMTrace.i(377957122048L, 2816);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("IMG_FLAG_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(374467461120L, 2790);
        String[] arrayOfString = i.fTX;
        GMTrace.o(374467461120L, 2790);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("HDHEADIMGINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(386949709824L, 2883);
        String[] arrayOfString = g.fTX;
        GMTrace.o(386949709824L, 2883);
        return arrayOfString;
      }
    });
    GMTrace.o(377957122048L, 2816);
  }
  
  public n()
  {
    GMTrace.i(376078073856L, 2802);
    this.gtq = new aj(h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(383460048896L, 2857);
        if ((!h.xw().wL()) || (n.Dh() == null))
        {
          w.w("MicroMsg.SubCoreAvatar", "upAssetsHandler onTimerExpired acc:%b astg:%s ", new Object[] { Boolean.valueOf(h.xw().wL()), n.Dh() });
          GMTrace.o(383460048896L, 2857);
          return false;
        }
        if (((Boolean)h.xy().xh().get(90113, Boolean.valueOf(false))).booleanValue())
        {
          n.Dw();
          n.Dx();
        }
        h.xy().xh().set(90113, Boolean.valueOf(false));
        GMTrace.o(383460048896L, 2857);
        return false;
      }
      
      public final String toString()
      {
        GMTrace.i(383594266624L, 2858);
        String str = super.toString() + "|upAssetsHandler";
        GMTrace.o(383594266624L, 2858);
        return str;
      }
    }, false);
    GMTrace.o(376078073856L, 2802);
  }
  
  public static d Dh()
  {
    GMTrace.i(376480727040L, 2805);
    h.xw().wG();
    if (Dt().gtm == null) {
      Dt().gtm = new d();
    }
    d locald = Dt().gtm;
    GMTrace.o(376480727040L, 2805);
    return locald;
  }
  
  public static i Di()
  {
    GMTrace.i(376346509312L, 2804);
    h.xw().wG();
    if (Dt().gtl == null) {
      Dt().gtl = new i(h.xy().fYV);
    }
    i locali = Dt().gtl;
    GMTrace.o(376346509312L, 2804);
    return locali;
  }
  
  public static n Dt()
  {
    GMTrace.i(376212291584L, 2803);
    n localn = (n)p.o(n.class);
    GMTrace.o(376212291584L, 2803);
    return localn;
  }
  
  public static g Du()
  {
    GMTrace.i(376614944768L, 2806);
    h.xw().wG();
    if (Dt().gto == null) {
      Dt().gto = new g(h.xy().fYV);
    }
    g localg = Dt().gto;
    GMTrace.o(376614944768L, 2806);
    return localg;
  }
  
  public static c Dv()
  {
    GMTrace.i(376749162496L, 2807);
    h.xw().wG();
    if (Dt().gtn == null) {
      Dt().gtn = new c();
    }
    c localc = Dt().gtn;
    GMTrace.o(376749162496L, 2807);
    return localc;
  }
  
  public static void Dw()
  {
    GMTrace.i(16086128918528L, 119851);
    for (;;)
    {
      try
      {
        Context localContext = ab.getContext();
        Iterator localIterator = d.gsu.keySet().iterator();
        if (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (!d.gsu.containsKey(str)) {
            break label148;
          }
          i = ((Integer)d.gsu.get(str)).intValue();
          if (i == 0) {
            continue;
          }
          w.d("MicroMsg.SubCoreAvatar", "updateAssetsAvatar user:%s ", new Object[] { str });
          Dh().d(str, com.tencent.mm.compatible.f.a.decodeResource(localContext.getResources(), i));
          continue;
        }
        GMTrace.o(16086128918528L, 119851);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.SubCoreAvatar", "exception:%s", new Object[] { bg.f(localException) });
        GMTrace.o(16086128918528L, 119851);
        return;
      }
      return;
      label148:
      int i = 0;
    }
  }
  
  public static boolean Dx()
  {
    GMTrace.i(377688686592L, 2814);
    if (bg.a((Boolean)h.xy().xh().get(59, null), false))
    {
      GMTrace.o(377688686592L, 2814);
      return true;
    }
    Dh();
    String str = d.t(q.zE(), false);
    if ((FileOp.aZ(str)) || (FileOp.aZ(str + ".bm"))) {}
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(377688686592L, 2814);
      return true;
    }
    str = q.zE();
    if (bg.nm(str))
    {
      GMTrace.o(377688686592L, 2814);
      return false;
    }
    Bitmap localBitmap = d.b.ie(b.yU() + "user_" + com.tencent.mm.a.g.n(str.getBytes()) + ".png");
    if ((localBitmap == null) || (localBitmap.isRecycled()))
    {
      GMTrace.o(377688686592L, 2814);
      return false;
    }
    boolean bool = Dh().d(str, localBitmap);
    GMTrace.o(377688686592L, 2814);
    return bool;
  }
  
  static Context getContext()
  {
    GMTrace.i(377420251136L, 2812);
    Context localContext = ab.getContext();
    GMTrace.o(377420251136L, 2812);
    return localContext;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(377286033408L, 2811);
    FileOp.la(h.xy().fYU + "sfs");
    this.gtp = com.tencent.mm.plugin.f.a.aea();
    FileOp.a(this.gtp, null, new SFSContext.Builder().setDBDirectory(h.xy().cachePath + "sfs").setStoragePath(b.zk()).setName("avatar"));
    if (paramBoolean)
    {
      w.d("MicroMsg.SubCoreAvatar", "update all plugin avatars");
      h.xy().xh().set(90113, Boolean.valueOf(true));
    }
    try
    {
      String str = q.zE();
      d locald = Dh();
      d.u(str, false);
      d.u(str, true);
      locald.c(str, null);
      this.gtq.z(10000L, 10000L);
      GMTrace.o(377286033408L, 2811);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SubCoreAvatar", localException, "Failed to refresh avatar.", new Object[0]);
      }
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(377554468864L, 2813);
    if (this.gtp != null)
    {
      FileOp.kR(this.gtp);
      this.gtp = com.tencent.mm.plugin.f.a.aea();
      FileOp.a(this.gtp, null, new SFSContext.Builder().setDBDirectory(h.xy().cachePath + "sfs").setStoragePath(b.zk()).setName("avatar"));
    }
    GMTrace.o(377554468864L, 2813);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(377017597952L, 2809);
    GMTrace.o(377017597952L, 2809);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(376883380224L, 2808);
    this.gtq.stopTimer();
    if (Dt().gtm != null) {
      d.reset();
    }
    Object localObject = Dt().gtn;
    if (localObject != null) {
      h.wS().b(123, (com.tencent.mm.ad.e)localObject);
    }
    localObject = Dt().gtl;
    if (localObject != null) {
      ((i)localObject).gsX.clear();
    }
    if (this.gtp != null)
    {
      FileOp.kR(this.gtp);
      this.gtp = null;
    }
    GMTrace.o(376883380224L, 2808);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(377151815680L, 2810);
    HashMap localHashMap = fIv;
    GMTrace.o(377151815680L, 2810);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
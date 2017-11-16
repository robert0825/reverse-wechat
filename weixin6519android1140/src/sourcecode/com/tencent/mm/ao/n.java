package com.tencent.mm.ao;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.cache.e.a;
import com.tencent.mm.g.a.ok;
import com.tencent.mm.modelsfs.SFSContext;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class n
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private h gJA;
  private b gJB;
  private i gJC;
  private c gJD;
  private g gJE;
  private a gJF;
  private o gJG;
  private com.tencent.mm.sdk.b.c gJH;
  private com.tencent.mm.ao.a.a gJI;
  private SFSContext gJJ;
  private SFSContext gJK;
  private f gJz;
  
  static
  {
    GMTrace.i(3510867329024L, 26158);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("IMGINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(3541737406464L, 26388);
        String[] arrayOfString = f.fTX;
        GMTrace.o(3541737406464L, 26388);
        return arrayOfString;
      }
    });
    GMTrace.o(3510867329024L, 26158);
  }
  
  public n()
  {
    GMTrace.i(3508719845376L, 26142);
    this.gJC = new i();
    this.gJD = null;
    this.gJE = new g();
    this.gJF = null;
    this.gJG = null;
    this.gJH = new com.tencent.mm.sdk.b.c() {};
    this.gJI = null;
    this.gJJ = null;
    this.gJK = null;
    GMTrace.o(3508719845376L, 26142);
  }
  
  private static n IW()
  {
    try
    {
      GMTrace.i(3508854063104L, 26143);
      n localn = (n)p.o(n.class);
      GMTrace.o(3508854063104L, 26143);
      return localn;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static h IX()
  {
    GMTrace.i(3508988280832L, 26144);
    if (IW().gJA == null) {
      IW().gJA = new h();
    }
    h localh = IW().gJA;
    GMTrace.o(3508988280832L, 26144);
    return localh;
  }
  
  public static b IY()
  {
    GMTrace.i(3509122498560L, 26145);
    com.tencent.mm.kernel.h.xw().wG();
    if (IW().gJB == null) {
      IW().gJB = new b();
    }
    b localb = IW().gJB;
    GMTrace.o(3509122498560L, 26145);
    return localb;
  }
  
  public static f IZ()
  {
    GMTrace.i(3509256716288L, 26146);
    com.tencent.mm.kernel.h.xw().wG();
    if (IW().gJz == null) {
      IW().gJz = new f(com.tencent.mm.kernel.h.xy().fYV);
    }
    f localf = IW().gJz;
    GMTrace.o(3509256716288L, 26146);
    return localf;
  }
  
  public static c Ja()
  {
    GMTrace.i(3509390934016L, 26147);
    com.tencent.mm.kernel.h.xw().wG();
    if (IW().gJD == null) {
      IW().gJD = new c();
    }
    c localc = IW().gJD;
    GMTrace.o(3509390934016L, 26147);
    return localc;
  }
  
  public static a Jb()
  {
    GMTrace.i(3509525151744L, 26148);
    com.tencent.mm.kernel.h.xw().wG();
    if (IW().gJF == null) {
      IW().gJF = new a(Looper.getMainLooper());
    }
    a locala = IW().gJF;
    GMTrace.o(3509525151744L, 26148);
    return locala;
  }
  
  public static o Jc()
  {
    GMTrace.i(3509659369472L, 26149);
    com.tencent.mm.kernel.h.xw().wG();
    if (IW().gJG == null) {
      IW().gJG = new o();
    }
    o localo = IW().gJG;
    GMTrace.o(3509659369472L, 26149);
    return localo;
  }
  
  public static com.tencent.mm.ao.a.a Jd()
  {
    GMTrace.i(3509793587200L, 26150);
    com.tencent.mm.kernel.h.xw().wG();
    if (IW().gJI == null) {
      IW().gJI = com.tencent.mm.ao.a.a.Jk();
    }
    com.tencent.mm.ao.a.a locala = IW().gJI;
    GMTrace.o(3509793587200L, 26150);
    return locala;
  }
  
  public static SFSContext Je()
  {
    GMTrace.i(3509927804928L, 26151);
    GMTrace.o(3509927804928L, 26151);
    return null;
  }
  
  public static void Jf()
  {
    GMTrace.i(3510196240384L, 26153);
    Object localObject = IW().gJz;
    if (localObject != null)
    {
      w.i("MicroMsg.ImgInfoStorage", "clearCacheMap stack:%s", new Object[] { bg.bQW() });
      ((f)localObject).gHy.a(new f.3((f)localObject));
    }
    localObject = IW().gJI;
    if (localObject != null) {
      ((com.tencent.mm.ao.a.a)localObject).detach();
    }
    GMTrace.o(3510196240384L, 26153);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(3510598893568L, 26156);
    d.c.a(Integer.valueOf(3), this.gJE);
    d.c.a(Integer.valueOf(23), this.gJE);
    e.a.a("local_cdn_img_cache", this.gJC);
    com.tencent.mm.sdk.b.a.vgX.b(this.gJH);
    GMTrace.o(3510598893568L, 26156);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(3510733111296L, 26157);
    GMTrace.o(3510733111296L, 26157);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(3510464675840L, 26155);
    GMTrace.o(3510464675840L, 26155);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(3510062022656L, 26152);
    n localn = IW();
    if (localn.gJA != null)
    {
      ??? = localn.gJA;
      ((h)???).eyZ = 0;
      com.tencent.mm.kernel.h.xx().fYr.b(110, (com.tencent.mm.ad.e)???);
    }
    a locala;
    if (localn.gJF != null) {
      locala = localn.gJF;
    }
    synchronized (locala.gGm)
    {
      locala.gGm.clear();
      locala.gGn = 0L;
      Ja().a(locala);
      com.tencent.mm.sdk.b.a.vgX.c(locala.gGy);
      com.tencent.mm.sdk.b.a.vgX.c(locala.gGz);
      if (localn.gJD == null) {
        break label202;
      }
      ??? = localn.gJD;
      w.i("ModelImage.DownloadImgService", "on detach");
      w.i("ModelImage.DownloadImgService", "cancel all net scene");
      ((c)???).gGI = true;
      ((c)???).b(((c)???).gGG);
      if (((c)???).gGE.size() > 0) {
        ((c)???).b((c.b)((c)???).gGE.get(0));
      }
    }
    ((c)???).ID();
    com.tencent.mm.kernel.h.xx().fYr.b(109, (com.tencent.mm.ad.e)???);
    label202:
    if (((n)localObject1).gJG != null)
    {
      ??? = ((n)localObject1).gJG;
      w.i("MicroMsg.UrlImageCacheService", "detach");
      ((o)???).gJM.clear();
      ((o)???).gJO = true;
    }
    Jf();
    d.c.aE(Integer.valueOf(3));
    d.c.aE(Integer.valueOf(23));
    e.a.a("local_cdn_img_cache", null);
    com.tencent.mm.sdk.b.a.vgX.c(this.gJH);
    if (((n)localObject1).gJI != null)
    {
      ((n)localObject1).gJI.detach();
      ((n)localObject1).gJI = null;
    }
    if (((n)localObject1).gJJ != null)
    {
      ((n)localObject1).gJJ.release();
      ((n)localObject1).gJJ = null;
    }
    if (((n)localObject1).gJK != null)
    {
      ((n)localObject1).gJK.release();
      ((n)localObject1).gJK = null;
    }
    GMTrace.o(3510062022656L, 26152);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(3510330458112L, 26154);
    HashMap localHashMap = fIv;
    GMTrace.o(3510330458112L, 26154);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
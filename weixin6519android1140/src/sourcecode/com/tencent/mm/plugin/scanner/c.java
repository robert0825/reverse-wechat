package com.tencent.mm.plugin.scanner;

import android.annotation.SuppressLint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.g.a;
import com.tencent.mm.plugin.scanner.a.j;
import com.tencent.mm.plugin.scanner.a.m;
import com.tencent.mm.plugin.scanner.a.n;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  @SuppressLint({"UseSparseArrays"})
  private static HashMap<Integer, g.d> jvQ;
  public String fYU;
  private g.a jvS;
  public com.tencent.mm.plugin.ab.a.b osA;
  private j osB;
  private n osC;
  private m osD;
  private com.tencent.mm.plugin.scanner.history.a.b osE;
  private com.tencent.mm.plugin.scanner.a.b osF;
  
  static
  {
    GMTrace.i(6184887123968L, 46081);
    jvQ = new HashMap();
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("SCANHISTORY_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6183276511232L, 46069);
        String[] arrayOfString = com.tencent.mm.plugin.scanner.history.a.b.fTX;
        GMTrace.o(6183276511232L, 46069);
        return arrayOfString;
      }
    });
    GMTrace.o(6184887123968L, 46081);
  }
  
  public c()
  {
    GMTrace.i(6183410728960L, 46070);
    this.osA = new com.tencent.mm.plugin.ab.a.b();
    this.osB = new j();
    this.osC = new n();
    this.osD = new m();
    this.osF = new com.tencent.mm.plugin.scanner.a.b();
    GMTrace.o(6183410728960L, 46070);
  }
  
  public static c bcm()
  {
    GMTrace.i(6183544946688L, 46071);
    c localc2 = (c)at.AK().gZ("plugin.scanner");
    c localc1 = localc2;
    if (localc2 == null)
    {
      localc1 = new c();
      at.AK().a("plugin.scanner", localc1);
    }
    GMTrace.o(6183544946688L, 46071);
    return localc1;
  }
  
  public static com.tencent.mm.plugin.scanner.history.a.b bcn()
  {
    GMTrace.i(6184618688512L, 46079);
    h.xw().wG();
    if (bcm().osE == null)
    {
      localObject = bcm();
      at.AR();
      ((c)localObject).osE = new com.tencent.mm.plugin.scanner.history.a.b(com.tencent.mm.y.c.yH());
    }
    Object localObject = bcm().osE;
    GMTrace.o(6184618688512L, 46079);
    return (com.tencent.mm.plugin.scanner.history.a.b)localObject;
  }
  
  public static String zo()
  {
    GMTrace.i(6184350253056L, 46077);
    String str = bcm().fYU;
    GMTrace.o(6184350253056L, 46077);
    return str;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6184081817600L, 46075);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.zn() + "CommonOneMicroMsg.db";
    this.jvS = com.tencent.mm.platformtools.g.a(hashCode(), (String)localObject, jvQ, false);
    localObject = this.osF;
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.scanner.a.b)localObject).otc);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.scanner.a.b)localObject).otd);
    com.tencent.mm.sdk.b.a.vgX.b(this.osB);
    com.tencent.mm.sdk.b.a.vgX.b(this.osC.otG);
    com.tencent.mm.sdk.b.a.vgX.b(this.osC.otH);
    com.tencent.mm.sdk.b.a.vgX.a(this.osD);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6182873858048L, 46066);
        if (!at.AU())
        {
          GMTrace.o(6182873858048L, 46066);
          return;
        }
        if (bg.nm(c.this.fYU))
        {
          w.e("MicroMsg.scanner.SubCoreScanner", "accPath == null in onAccountPostReset");
          GMTrace.o(6182873858048L, 46066);
          return;
        }
        bg.d(c.this.fYU + "image/scan/img", "scanbook", 604800000L);
        GMTrace.o(6182873858048L, 46066);
      }
      
      public final String toString()
      {
        GMTrace.i(6183008075776L, 46067);
        String str = super.toString() + "|onAccountPostReset";
        GMTrace.o(6183008075776L, 46067);
        return str;
      }
    });
    GMTrace.o(6184081817600L, 46075);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(6184216035328L, 46076);
    Object localObject1 = new StringBuilder("onSdcardMount ");
    at.AR();
    w.d("MicroMsg.scanner.SubCoreScanner", com.tencent.mm.y.c.zo());
    Object localObject2 = bcm();
    at.AR();
    localObject1 = com.tencent.mm.y.c.zo();
    w.d("MicroMsg.scanner.SubCoreScanner", "resetAccPath on accPath : " + (String)localObject1);
    ((c)localObject2).fYU = ((String)localObject1);
    localObject2 = new File((String)localObject1);
    if (!((File)localObject2).exists()) {
      ((File)localObject2).mkdirs();
    }
    localObject2 = new File((String)localObject1 + "image/scan/img");
    if (!((File)localObject2).exists()) {
      ((File)localObject2).mkdirs();
    }
    localObject1 = new File((String)localObject1 + "image/scan/music");
    if (!((File)localObject1).exists()) {
      ((File)localObject1).mkdirs();
    }
    GMTrace.o(6184216035328L, 46076);
  }
  
  public final String dv(String paramString1, String paramString2)
  {
    GMTrace.i(6184484470784L, 46078);
    if ((at.AU()) && (!bg.nm(paramString1)))
    {
      paramString1 = String.format("%s/scanbook%s_%s", new Object[] { this.fYU + "image/scan/img", paramString2, com.tencent.mm.a.g.n(paramString1.getBytes()) });
      GMTrace.o(6184484470784L, 46078);
      return paramString1;
    }
    GMTrace.o(6184484470784L, 46078);
    return "";
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6183947599872L, 46074);
    GMTrace.o(6183947599872L, 46074);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6183679164416L, 46072);
    com.tencent.mm.sdk.b.a.vgX.c(this.osB);
    com.tencent.mm.sdk.b.a.vgX.c(this.osC.otG);
    com.tencent.mm.sdk.b.a.vgX.c(this.osC.otH);
    com.tencent.mm.sdk.b.a.vgX.c(this.osD);
    Object localObject = this.osF;
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.scanner.a.b)localObject).otc);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.scanner.a.b)localObject).otd);
    ((com.tencent.mm.plugin.scanner.a.b)localObject).bco();
    localObject = this.osA;
    ((com.tencent.mm.plugin.ab.a.b)localObject).gJM.clear();
    ((com.tencent.mm.plugin.ab.a.b)localObject).nYO.clear();
    ((com.tencent.mm.plugin.ab.a.b)localObject).nYP.clear();
    if (this.jvS != null)
    {
      this.jvS.hA(hashCode());
      this.jvS = null;
    }
    this.fYU = "";
    GMTrace.o(6183679164416L, 46072);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(6183813382144L, 46073);
    HashMap localHashMap = fIv;
    GMTrace.o(6183813382144L, 46073);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
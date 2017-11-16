package com.tencent.mm.plugin.appbrand.permission;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.page.m;
import com.tencent.mm.protocal.c.aiy;
import com.tencent.mm.protocal.c.ajx;
import com.tencent.mm.protocal.c.ajy;
import com.tencent.mm.protocal.c.ajz;
import com.tencent.mm.protocal.c.aka;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public final class b
{
  public static final LinkedList<Runnable> ixu;
  public static final a ixv;
  public static boolean ixw;
  public final String hyD;
  public final b ixs;
  public final String ixt;
  
  static
  {
    GMTrace.i(10568438120448L, 78741);
    ixu = new LinkedList();
    ixv = new a();
    ixw = false;
    GMTrace.o(10568438120448L, 78741);
  }
  
  private b(b paramb, String paramString1, String paramString2)
  {
    GMTrace.i(10566424854528L, 78726);
    this.ixs = paramb;
    this.hyD = paramString1;
    this.ixt = paramString2;
    GMTrace.o(10566424854528L, 78726);
  }
  
  public static void a(final String paramString1, final String paramString2, final b paramb)
  {
    GMTrace.i(10566827507712L, 78729);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(10566827507712L, 78729);
      return;
    }
    paramb = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19691753963520L, 146715);
        b.b(this.eud, paramString2, new b.c(paramb));
        GMTrace.o(19691753963520L, 146715);
      }
    };
    d.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19692022398976L, 146717);
        if (b.ixw)
        {
          b.ixu.add(this.ixD);
          w.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, another request already running, put this in queue, appId %s, api %s", new Object[] { paramString1, paramString2 });
          GMTrace.o(19692022398976L, 146717);
          return;
        }
        b.ixw = true;
        this.ixD.run();
        GMTrace.o(19692022398976L, 146717);
      }
    });
    GMTrace.o(10566827507712L, 78729);
  }
  
  public static void b(String paramString1, String paramString2, b paramb)
  {
    GMTrace.i(16057540542464L, 119638);
    if (ixv.bj(paramString1, paramString2))
    {
      w.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, before cgi, appId %s, api %s, found in AUTH_CACHE, return ok", new Object[] { paramString1, paramString2 });
      paramb.ZQ();
      GMTrace.o(16057540542464L, 119638);
      return;
    }
    w.i("MicroMsg.AppBrandJsApiUserAuth", "requestUSerAuth, before cgi, appId %s, api %s", new Object[] { paramString1, paramString2 });
    paramString1 = new b(paramb, paramString1, paramString2);
    paramString2 = new com.tencent.mm.ad.b.a();
    paramString2.gtE = 1116;
    paramString2.uri = "/cgi-bin/mmbiz-bin/js-userauth";
    paramb = new ajx();
    paramb.lQa = paramString1.hyD;
    paramb.uyH = paramString1.ixt;
    paramString2.gtF = paramb;
    paramString2.gtG = new ajy();
    com.tencent.mm.ipcinvoker.wx_extension.b.a(paramString2.DA(), new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
      {
        GMTrace.i(10559982403584L, 78678);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.gtD.gtK == null))
        {
          w.e("MicroMsg.AppBrandJsApiUserAuth", "checkAuth, cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.gtD.gtK });
          b.ixv.y(b.this.hyD, b.this.ixt);
          b.this.ixs.ZR();
          GMTrace.o(10559982403584L, 78678);
          return;
        }
        paramAnonymousString = b.this;
        Object localObject = (ajy)paramAnonymousb.gtD.gtK;
        w.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, appId %s, api %s, checkAuth Response.errcode %d", new Object[] { paramAnonymousString.hyD, paramAnonymousString.ixt, Integer.valueOf(((ajy)localObject).uyv.eGy) });
        if (((ajy)localObject).uyv.eGy == 0)
        {
          b.ixv.put(paramAnonymousString.hyD, paramAnonymousString.ixt);
          paramAnonymousString.ixs.ZQ();
          GMTrace.o(10559982403584L, 78678);
          return;
        }
        if (((ajy)localObject).uyv.eGy != 53536)
        {
          paramAnonymousString.ixs.ZR();
          GMTrace.o(10559982403584L, 78678);
          return;
        }
        paramAnonymousb = ((ajy)localObject).tWL;
        localObject = ((ajy)localObject).uyI;
        af.t(new b.3(paramAnonymousString, com.tencent.mm.plugin.appbrand.a.nI(paramAnonymousString.hyD), paramAnonymousb, (String)localObject));
        GMTrace.o(10559982403584L, 78678);
      }
    });
    GMTrace.o(16057540542464L, 119638);
  }
  
  public static boolean bi(String paramString1, String paramString2)
  {
    GMTrace.i(10566693289984L, 78728);
    boolean bool = ixv.bj(paramString1, paramString2);
    GMTrace.o(10566693289984L, 78728);
    return bool;
  }
  
  public final void ap(String paramString, final int paramInt)
  {
    GMTrace.i(16057406324736L, 119637);
    com.tencent.mm.ad.b.a locala = new com.tencent.mm.ad.b.a();
    locala.gtE = 1027;
    locala.uri = "/cgi-bin/mmbiz-bin/js-usersetauth";
    ajz localajz = new ajz();
    localajz.lQa = this.hyD;
    localajz.tWJ = paramString;
    localajz.uys = paramInt;
    locala.gtF = localajz;
    locala.gtG = new aka();
    com.tencent.mm.ipcinvoker.wx_extension.b.a(locala.DA(), new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
      {
        GMTrace.i(10561593016320L, 78690);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.gtD.gtK == null))
        {
          w.e("MicroMsg.AppBrandJsApiUserAuth", "setAuth, cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.gtD.gtK });
          GMTrace.o(10561593016320L, 78690);
          return;
        }
        if ((((aka)paramAnonymousb.gtD.gtK).uyv.eGy == 0) && (1 == paramInt))
        {
          w.i("MicroMsg.AppBrandJsApiUserAuth", "setAuth, add allow cache appId = %s, api = %s", new Object[] { b.this.hyD, b.this.ixt });
          b.ixv.put(b.this.hyD, b.this.ixt);
          GMTrace.o(10561593016320L, 78690);
          return;
        }
        GMTrace.o(10561593016320L, 78690);
      }
    });
    GMTrace.o(16057406324736L, 119637);
  }
  
  private static final class a
  {
    final HashMap<String, HashSet<String>> ixE;
    
    public a()
    {
      GMTrace.i(14432432291840L, 107530);
      this.ixE = new HashMap();
      GMTrace.o(14432432291840L, 107530);
    }
    
    /* Error */
    final boolean bj(String paramString1, String paramString2)
    {
      // Byte code:
      //   0: ldc2_w 35
      //   3: ldc 37
      //   5: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_1
      //   9: invokestatic 43	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   12: ifne +10 -> 22
      //   15: aload_2
      //   16: invokestatic 43	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   19: ifeq +13 -> 32
      //   22: ldc2_w 35
      //   25: ldc 37
      //   27: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   30: iconst_0
      //   31: ireturn
      //   32: aload_0
      //   33: monitorenter
      //   34: aload_0
      //   35: getfield 28	com/tencent/mm/plugin/appbrand/permission/b$a:ixE	Ljava/util/HashMap;
      //   38: aload_1
      //   39: invokevirtual 47	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
      //   42: checkcast 49	java/util/HashSet
      //   45: astore_1
      //   46: aload_1
      //   47: ifnull +25 -> 72
      //   50: aload_1
      //   51: aload_2
      //   52: invokevirtual 53	java/util/HashSet:contains	(Ljava/lang/Object;)Z
      //   55: ifeq +17 -> 72
      //   58: iconst_1
      //   59: istore_3
      //   60: aload_0
      //   61: monitorexit
      //   62: ldc2_w 35
      //   65: ldc 37
      //   67: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   70: iload_3
      //   71: ireturn
      //   72: iconst_0
      //   73: istore_3
      //   74: goto -14 -> 60
      //   77: astore_1
      //   78: aload_0
      //   79: monitorexit
      //   80: aload_1
      //   81: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	82	0	this	a
      //   0	82	1	paramString1	String
      //   0	82	2	paramString2	String
      //   59	15	3	bool	boolean
      // Exception table:
      //   from	to	target	type
      //   34	46	77	finally
      //   50	58	77	finally
      //   60	62	77	finally
      //   78	80	77	finally
    }
    
    final void put(String paramString1, String paramString2)
    {
      GMTrace.i(14432700727296L, 107532);
      if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
      {
        GMTrace.o(14432700727296L, 107532);
        return;
      }
      try
      {
        HashSet localHashSet2 = (HashSet)this.ixE.get(paramString1);
        HashSet localHashSet1 = localHashSet2;
        if (localHashSet2 == null)
        {
          localHashSet1 = new HashSet();
          this.ixE.put(paramString1, localHashSet1);
        }
        localHashSet1.add(paramString2);
        GMTrace.o(14432700727296L, 107532);
        return;
      }
      finally {}
    }
    
    final void y(String paramString1, String paramString2)
    {
      GMTrace.i(14432834945024L, 107533);
      if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
      {
        GMTrace.o(14432834945024L, 107533);
        return;
      }
      try
      {
        paramString1 = (HashSet)this.ixE.get(paramString1);
        if (paramString1 != null) {
          paramString1.remove(paramString2);
        }
        GMTrace.o(14432834945024L, 107533);
        return;
      }
      finally {}
    }
  }
  
  public static abstract interface b
  {
    public abstract void ZQ();
    
    public abstract void ZR();
    
    public abstract void onCancel();
  }
  
  private static final class c
    implements b.b
  {
    private final b.b ixF;
    
    public c(b.b paramb)
    {
      GMTrace.i(10561995669504L, 78693);
      this.ixF = paramb;
      GMTrace.o(10561995669504L, 78693);
    }
    
    private void ZS()
    {
      GMTrace.i(10562532540416L, 78697);
      d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10565887983616L, 78722);
          Runnable localRunnable = (Runnable)b.ixu.pollFirst();
          if (localRunnable != null)
          {
            localRunnable.run();
            GMTrace.o(10565887983616L, 78722);
            return;
          }
          w.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, poll null from queue, all requests done");
          b.ixw = false;
          GMTrace.o(10565887983616L, 78722);
        }
      });
      GMTrace.o(10562532540416L, 78697);
    }
    
    public final void ZQ()
    {
      GMTrace.i(10562129887232L, 78694);
      if (this.ixF != null) {
        this.ixF.ZQ();
      }
      ZS();
      GMTrace.o(10562129887232L, 78694);
    }
    
    public final void ZR()
    {
      GMTrace.i(10562264104960L, 78695);
      if (this.ixF != null) {
        this.ixF.ZR();
      }
      ZS();
      GMTrace.o(10562264104960L, 78695);
    }
    
    public final void onCancel()
    {
      GMTrace.i(10562398322688L, 78696);
      if (this.ixF != null) {
        this.ixF.onCancel();
      }
      ZS();
      GMTrace.o(10562398322688L, 78696);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\permission\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
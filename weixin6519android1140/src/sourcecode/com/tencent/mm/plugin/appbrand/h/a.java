package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.h.a.b;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLContext;

public final class a
{
  public static int FAILED;
  public static int SUCCESS;
  public String hyD;
  public int isH;
  public String isI;
  public SSLContext isJ;
  public final String isK;
  protected final ArrayList<String> isL;
  public final ArrayList<b> isM;
  
  static
  {
    GMTrace.i(10681852100608L, 79586);
    SUCCESS = 0;
    FAILED = -1;
    GMTrace.o(10681852100608L, 79586);
  }
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(19902610014208L, 148286);
    this.isI = (e.fRX + "appbrand/");
    this.isL = new ArrayList();
    this.isM = new ArrayList();
    this.hyD = paramString1;
    this.isH = com.tencent.mm.plugin.appbrand.a.nK(paramString1).hQT;
    this.isJ = i.rv(this.hyD);
    this.isK = paramString2;
    GMTrace.o(19902610014208L, 148286);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(20766569529344L, 154723);
    if (paramb == null)
    {
      GMTrace.o(20766569529344L, 154723);
      return;
    }
    this.isL.add(paramb.hXm);
    rk(paramb.hXm);
    paramb.YX();
    GMTrace.o(20766569529344L, 154723);
  }
  
  public final void rk(String paramString)
  {
    GMTrace.i(16058480066560L, 119645);
    if (paramString == null)
    {
      GMTrace.o(16058480066560L, 119645);
      return;
    }
    synchronized (this.isM)
    {
      Iterator localIterator = this.isM.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (paramString.equals(localb.hXm)) {
          this.isM.remove(localb);
        }
      }
      GMTrace.o(16058480066560L, 119645);
      return;
    }
  }
  
  public final b rl(String paramString)
  {
    GMTrace.i(17693117775872L, 131824);
    if (paramString == null)
    {
      GMTrace.o(17693117775872L, 131824);
      return null;
    }
    synchronized (this.isM)
    {
      Iterator localIterator = this.isM.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (paramString.equals(localb.hXm))
        {
          GMTrace.o(17693117775872L, 131824);
          return localb;
        }
      }
      GMTrace.o(17693117775872L, 131824);
      return null;
    }
  }
  
  public final boolean rm(String paramString)
  {
    GMTrace.i(20766703747072L, 154724);
    boolean bool = this.isL.contains(paramString);
    GMTrace.o(20766703747072L, 154724);
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract void b(int paramInt, long paramLong1, long paramLong2);
    
    public abstract void b(int paramInt1, String paramString1, String paramString2, int paramInt2);
    
    public abstract void qG(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
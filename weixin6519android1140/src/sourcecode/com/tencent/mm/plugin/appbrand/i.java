package com.tencent.mm.plugin.appbrand;

import android.support.v4.e.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class i
{
  private static final Map<String, i> fVJ;
  private static final i hzH;
  public volatile String hzI;
  public final AtomicInteger hzJ;
  public final AtomicBoolean hzK;
  public int hzL;
  
  static
  {
    GMTrace.i(17337709232128L, 129176);
    fVJ = new a();
    hzH = new i();
    GMTrace.o(17337709232128L, 129176);
  }
  
  private i()
  {
    GMTrace.i(17337038143488L, 129171);
    this.hzJ = new AtomicInteger();
    this.hzK = new AtomicBoolean(false);
    this.hzL = 0;
    GMTrace.o(17337038143488L, 129171);
  }
  
  static i oa(String paramString)
  {
    GMTrace.i(17337172361216L, 129172);
    paramString = ob(paramString);
    GMTrace.o(17337172361216L, 129172);
    return paramString;
  }
  
  private static i ob(String paramString)
  {
    GMTrace.i(18191736635392L, 135539);
    if (bg.nm(paramString))
    {
      GMTrace.o(18191736635392L, 135539);
      return null;
    }
    synchronized (fVJ)
    {
      i locali2 = (i)fVJ.get(paramString);
      i locali1 = locali2;
      if (locali2 == null)
      {
        locali1 = new i();
        fVJ.put(paramString, locali1);
      }
      GMTrace.o(18191736635392L, 135539);
      return locali1;
    }
  }
  
  private static i oc(String paramString)
  {
    GMTrace.i(18191870853120L, 135540);
    if (bg.nm(paramString))
    {
      GMTrace.o(18191870853120L, 135540);
      return null;
    }
    synchronized (fVJ)
    {
      paramString = (i)fVJ.get(paramString);
      GMTrace.o(18191870853120L, 135540);
      return paramString;
    }
  }
  
  public static i od(String paramString)
  {
    GMTrace.i(17337440796672L, 129174);
    paramString = oc(paramString);
    if (paramString == null)
    {
      paramString = hzH;
      GMTrace.o(17337440796672L, 129174);
      return paramString;
    }
    GMTrace.o(17337440796672L, 129174);
    return paramString;
  }
  
  public static i oe(String paramString)
  {
    GMTrace.i(17337575014400L, 129175);
    paramString = ob(paramString);
    GMTrace.o(17337575014400L, 129175);
    return paramString;
  }
  
  static void remove(String paramString)
  {
    GMTrace.i(17337306578944L, 129173);
    if (bg.nm(paramString))
    {
      GMTrace.o(17337306578944L, 129173);
      return;
    }
    synchronized (fVJ)
    {
      fVJ.remove(paramString);
      GMTrace.o(17337306578944L, 129173);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
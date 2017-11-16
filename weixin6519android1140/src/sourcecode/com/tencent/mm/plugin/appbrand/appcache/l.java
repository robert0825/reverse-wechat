package com.tencent.mm.plugin.appbrand.appcache;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bv.a;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.k;
import java.io.InputStream;
import java.util.Locale;
import java.util.Map;

public final class l
{
  private static c hIU;
  
  private static c SB()
  {
    try
    {
      GMTrace.i(20685502021632L, 154119);
      if (hIU == null) {
        load();
      }
      c localc = hIU;
      GMTrace.o(20685502021632L, 154119);
      return localc;
    }
    finally {}
  }
  
  public static WxaPkgWrappingInfo SC()
  {
    GMTrace.i(20685904674816L, 154122);
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = SB().SD();
    GMTrace.o(20685904674816L, 154122);
    return localWxaPkgWrappingInfo;
  }
  
  public static void load()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(20685367803904L, 154118);
        if (hIU != null)
        {
          GMTrace.o(20685367803904L, 154118);
          return;
        }
        if ((!ab.bQc()) || (com.tencent.mm.plugin.appbrand.launching.p.SF()))
        {
          hIU = a.hIW;
          GMTrace.o(20685367803904L, 154118);
          continue;
        }
        localObject2 = null;
      }
      finally {}
      try
      {
        WxaPkgWrappingInfo localWxaPkgWrappingInfo = (WxaPkgWrappingInfo)XIPCInvoker.a("com.tencent.mm", IPCVoid.fVT, b.class);
        localObject2 = localWxaPkgWrappingInfo;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.WxaCommLibRuntimeReader", localException, "ipc read lib", new Object[0]);
          continue;
          Object localObject2 = new d((WxaPkgWrappingInfo)localObject2);
        }
      }
      if ((localObject2 != null) && (!((WxaPkgWrappingInfo)localObject2).hKE)) {
        break;
      }
      localObject2 = a.hIW;
      hIU = (c)localObject2;
      GMTrace.o(20685367803904L, 154118);
    }
  }
  
  public static String om(String paramString)
  {
    GMTrace.i(20685636239360L, 154120);
    Object localObject = SB();
    InputStream localInputStream = ((c)localObject).openRead(paramString);
    localObject = String.format(Locale.US, "[%d | %s | %b]", new Object[] { Integer.valueOf(((c)localObject).SD().hKB), bg.eK(((c)localObject).SD().hKD), Boolean.valueOf(((c)localObject).SD().hKE) });
    int i;
    if (localInputStream == null) {
      i = -1;
    }
    try
    {
      for (;;)
      {
        w.i("MicroMsg.WxaCommLibRuntimeReader", "read %s, %s, ret %d", new Object[] { paramString, localObject, Integer.valueOf(i) });
        if (localInputStream != null) {
          break;
        }
        GMTrace.o(20685636239360L, 154120);
        return "";
        i = localInputStream.available();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.WxaCommLibRuntimeReader", "read %s, %s, e %s", new Object[] { paramString, localObject, localException });
      }
      paramString = (String)((w.b)w.b.a.hKl.get(String.class)).b(paramString, localInputStream);
      GMTrace.o(20685636239360L, 154120);
    }
    return paramString;
  }
  
  public static k on(String paramString)
  {
    GMTrace.i(20685770457088L, 154121);
    Object localObject = SB();
    InputStream localInputStream = ((c)localObject).openRead(paramString);
    localObject = String.format(Locale.US, "[%d | %s | %b]", new Object[] { Integer.valueOf(((c)localObject).SD().hKB), bg.eK(((c)localObject).SD().hKD), Boolean.valueOf(((c)localObject).SD().hKE) });
    int i;
    if (localInputStream == null) {
      i = -1;
    }
    try
    {
      for (;;)
      {
        w.i("MicroMsg.WxaCommLibRuntimeReader", "read %s, %s, ret %d", new Object[] { paramString, localObject, Integer.valueOf(i) });
        if (localInputStream != null) {
          break;
        }
        GMTrace.o(20685770457088L, 154121);
        return null;
        i = localInputStream.available();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.WxaCommLibRuntimeReader", "read %s, %s, e %s", new Object[] { paramString, localObject, localException });
      }
      paramString = (k)((w.b)w.b.a.hKl.get(k.class)).b(paramString, localInputStream);
      GMTrace.o(20685770457088L, 154121);
    }
    return paramString;
  }
  
  private static final class a
    implements l.c
  {
    static final a hIW;
    final WxaPkgWrappingInfo hIV;
    
    static
    {
      GMTrace.i(20683086102528L, 154101);
      hIW = new a();
      GMTrace.o(20683086102528L, 154101);
    }
    
    public a()
    {
      GMTrace.i(20682951884800L, 154100);
      this.hIV = new WxaPkgWrappingInfo();
      this.hIV.hKE = true;
      this.hIV.hKB = 0;
      this.hIV.hKC = 75;
      this.hIV.hKF = "";
      GMTrace.o(20682951884800L, 154100);
    }
    
    public final WxaPkgWrappingInfo SD()
    {
      GMTrace.i(20682817667072L, 154099);
      WxaPkgWrappingInfo localWxaPkgWrappingInfo = this.hIV;
      GMTrace.o(20682817667072L, 154099);
      return localWxaPkgWrappingInfo;
    }
    
    public final InputStream openRead(String paramString)
    {
      GMTrace.i(20682683449344L, 154098);
      paramString = o.openRead(paramString);
      GMTrace.o(20682683449344L, 154098);
      return paramString;
    }
  }
  
  private static final class b
    implements i<IPCVoid, WxaPkgWrappingInfo>
  {
    private b()
    {
      GMTrace.i(20683891408896L, 154107);
      GMTrace.o(20683891408896L, 154107);
    }
    
    private WxaPkgWrappingInfo bX(boolean paramBoolean)
    {
      GMTrace.i(20684025626624L, 154108);
      Object localObject = s.bZ(paramBoolean);
      if ((((Pair)localObject).first == s.a.hJQ) && (((Pair)localObject).second == null) && (!paramBoolean)) {
        a.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20683488755712L, 154104);
            new j().bW(false);
            GMTrace.o(20683488755712L, 154104);
          }
        });
      }
      localObject = (WxaPkgWrappingInfo)((Pair)localObject).second;
      GMTrace.o(20684025626624L, 154108);
      return (WxaPkgWrappingInfo)localObject;
    }
  }
  
  static abstract interface c
  {
    public abstract WxaPkgWrappingInfo SD();
    
    public abstract InputStream openRead(String paramString);
  }
  
  private static final class d
    implements l.c
  {
    private final WxaPkgWrappingInfo hIV;
    private final p hIY;
    
    public d(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
    {
      GMTrace.i(20684965150720L, 154115);
      this.hIV = paramWxaPkgWrappingInfo;
      this.hIY = new p(paramWxaPkgWrappingInfo.hKI);
      GMTrace.o(20684965150720L, 154115);
    }
    
    public final WxaPkgWrappingInfo SD()
    {
      GMTrace.i(20685233586176L, 154117);
      WxaPkgWrappingInfo localWxaPkgWrappingInfo = this.hIV;
      GMTrace.o(20685233586176L, 154117);
      return localWxaPkgWrappingInfo;
    }
    
    public final InputStream openRead(String paramString)
    {
      GMTrace.i(20685099368448L, 154116);
      this.hIY.SH();
      paramString = this.hIY.op(paramString);
      GMTrace.o(20685099368448L, 154116);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
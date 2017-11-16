package com.tencent.mm.plugin.webview.wepkg.utils;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.webview.wepkg.model.f;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  public static final String hLB;
  public static final Set<Integer> rZn;
  public static a rZo;
  public static boolean rZp;
  
  static
  {
    GMTrace.i(12368834723840L, 92155);
    rZn = new HashSet();
    rZo = new a();
    rZp = false;
    String str2 = e.ghz;
    String str1 = str2;
    if (!str2.endsWith("/")) {
      str1 = str2 + "/";
    }
    hLB = str1 + "wepkg/pkgfiles/";
    GMTrace.o(12368834723840L, 92155);
  }
  
  public static final class a
  {
    public final Map<String, f> rZq;
    
    public a()
    {
      GMTrace.i(12371519078400L, 92175);
      this.rZq = new ConcurrentHashMap();
      GMTrace.o(12371519078400L, 92175);
    }
    
    public final f Nd(String paramString)
    {
      GMTrace.i(15169958707200L, 113025);
      if (bg.nm(paramString))
      {
        GMTrace.o(15169958707200L, 113025);
        return null;
      }
      paramString = (f)this.rZq.get(paramString);
      GMTrace.o(15169958707200L, 113025);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\utils\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
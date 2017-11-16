package com.tencent.mm.plugin.webview.wepkg.downloader;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.j.a.d.t;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class b
{
  public static Object lock;
  public static b rXa;
  h rXb;
  
  static
  {
    GMTrace.i(12375411392512L, 92204);
    lock = new Object();
    GMTrace.o(12375411392512L, 92204);
  }
  
  public b()
  {
    GMTrace.i(12375277174784L, 92203);
    this.rXb = new h(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(24), new t("WepkgDownloaderPool", "WepkgDownloaderThread"));
    GMTrace.o(12375277174784L, 92203);
  }
  
  public static b bGf()
  {
    GMTrace.i(12375142957056L, 92202);
    if (rXa == null) {}
    synchronized (lock)
    {
      if (rXa == null) {
        rXa = new b();
      }
      ??? = rXa;
      GMTrace.o(12375142957056L, 92202);
      return (b)???;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\downloader\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
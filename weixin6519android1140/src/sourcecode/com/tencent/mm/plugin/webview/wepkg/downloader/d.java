package com.tencent.mm.plugin.webview.wepkg.downloader;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Future;

public final class d
{
  private static Object lock;
  public static d rXl;
  HashMap<String, c> rXm;
  
  static
  {
    GMTrace.i(12373129691136L, 92187);
    lock = new Object();
    GMTrace.o(12373129691136L, 92187);
  }
  
  public d()
  {
    GMTrace.i(12372592820224L, 92183);
    this.rXm = new HashMap();
    GMTrace.o(12372592820224L, 92183);
  }
  
  private boolean a(c paramc)
  {
    GMTrace.i(12372861255680L, 92185);
    if (this.rXm.containsKey(paramc.rXc.rXz))
    {
      paramc.rXi = true;
      try
      {
        if (paramc.rXe != null) {
          paramc.rXe.disconnect();
        }
        if (paramc.rXd != null) {
          paramc.rXd.cancel(false);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.i("MicroMsg.Wepkg.WePkgDownloadTask", "stop, " + localException.getMessage());
        }
      }
      this.rXm.remove(paramc.rXc.rXz);
      GMTrace.o(12372861255680L, 92185);
      return true;
    }
    GMTrace.o(12372861255680L, 92185);
    return false;
  }
  
  public static d bGh()
  {
    GMTrace.i(12372458602496L, 92182);
    if (rXl == null) {}
    synchronized (lock)
    {
      if (rXl == null) {
        rXl = new d();
      }
      ??? = rXl;
      GMTrace.o(12372458602496L, 92182);
      return (d)???;
    }
  }
  
  public final boolean MR(String paramString)
  {
    GMTrace.i(12372727037952L, 92184);
    if (this.rXm.containsKey(paramString)) {
      this.rXm.remove(paramString);
    }
    GMTrace.o(12372727037952L, 92184);
    return true;
  }
  
  public final boolean bGi()
  {
    GMTrace.i(12372995473408L, 92186);
    if ((this.rXm == null) || (this.rXm.size() == 0))
    {
      GMTrace.o(12372995473408L, 92186);
      return false;
    }
    Object localObject = this.rXm.values();
    ArrayList localArrayList = new ArrayList();
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add((c)((Iterator)localObject).next());
    }
    localObject = localArrayList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      c localc = (c)((Iterator)localObject).next();
      if (localc.rXc.rXE) {
        a(localc);
      }
    }
    localArrayList.clear();
    GMTrace.o(12372995473408L, 92186);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\downloader\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
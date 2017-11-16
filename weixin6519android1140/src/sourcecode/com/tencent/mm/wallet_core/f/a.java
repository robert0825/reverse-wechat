package com.tencent.mm.wallet_core.f;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import java.util.WeakHashMap;

public final class a
{
  private WeakHashMap<Object, Boolean> xDS;
  
  public a()
  {
    GMTrace.i(20855958536192L, 155389);
    this.xDS = new WeakHashMap();
    GMTrace.o(20855958536192L, 155389);
  }
  
  public static a cmc()
  {
    try
    {
      GMTrace.i(20856092753920L, 155390);
      a locala = a.xDT;
      GMTrace.o(20856092753920L, 155390);
      return locala;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean ci(Object paramObject)
  {
    GMTrace.i(21067485675520L, 156965);
    if (com.tencent.mm.plugin.normsg.a.d.nxJ.bh(paramObject))
    {
      if (this.xDS.containsKey(paramObject))
      {
        GMTrace.o(21067485675520L, 156965);
        return false;
      }
      com.tencent.mm.plugin.report.d.oqe.a(715L, 0L, 1L, false);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<st><Manufacturer>").append(Build.MANUFACTURER).append("</Manufacturer><Model>").append(Build.MODEL).append("</Model><VersionRelease>").append(Build.VERSION.RELEASE).append("</VersionRelease><VersionIncremental>").append(Build.VERSION.INCREMENTAL).append("</VersionIncremental><Display>").append(Build.DISPLAY).append("</Display></st>");
      com.tencent.mm.plugin.secinforeport.a.d.oFb.Gk(localStringBuilder.toString());
      this.xDS.put(paramObject, Boolean.valueOf(true));
      GMTrace.o(21067485675520L, 156965);
      return false;
    }
    GMTrace.o(21067485675520L, 156965);
    return true;
  }
  
  private static final class a
  {
    static a xDT;
    
    static
    {
      GMTrace.i(20855824318464L, 155388);
      xDT = new a();
      GMTrace.o(20855824318464L, 155388);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
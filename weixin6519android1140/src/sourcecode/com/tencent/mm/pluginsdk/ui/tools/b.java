package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
{
  public static boolean PC(String paramString)
  {
    GMTrace.i(1105148772352L, 8234);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppNewIconUtil", "markNew fail, appId is empty");
      GMTrace.o(1105148772352L, 8234);
      return false;
    }
    t localt = h.xy().xh();
    if (localt == null)
    {
      w.e("MicroMsg.AppNewIconUtil", "markNew fail, cfgStg is null");
      GMTrace.o(1105148772352L, 8234);
      return false;
    }
    a locala = new a();
    locala.FN((String)localt.get(69121, null));
    if (!locala.qtx.contains(paramString)) {
      locala.qtx.add(paramString);
    }
    localt.set(69121, locala.bNh());
    GMTrace.o(1105148772352L, 8234);
    return true;
  }
  
  public static boolean PD(String paramString)
  {
    GMTrace.i(1105282990080L, 8235);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppNewIconUtil", "unmarkNew fail, appId is empty");
      GMTrace.o(1105282990080L, 8235);
      return false;
    }
    t localt = h.xy().xh();
    if (localt == null)
    {
      w.e("MicroMsg.AppNewIconUtil", "unmarkNew fail, cfgStg is null");
      GMTrace.o(1105282990080L, 8235);
      return false;
    }
    a locala = new a();
    locala.FN((String)localt.get(69121, null));
    if (locala.qtx.contains(paramString)) {
      locala.qtx.remove(paramString);
    }
    localt.set(69121, locala.bNh());
    GMTrace.o(1105282990080L, 8235);
    return true;
  }
  
  private static final class a
  {
    List<String> qtx;
    
    public a()
    {
      GMTrace.i(1061528010752L, 7909);
      this.qtx = new ArrayList();
      GMTrace.o(1061528010752L, 7909);
    }
    
    final void FN(String paramString)
    {
      GMTrace.i(1061796446208L, 7911);
      this.qtx = new ArrayList();
      if ((paramString == null) || (paramString.length() == 0))
      {
        GMTrace.o(1061796446208L, 7911);
        return;
      }
      paramString = paramString.split(";");
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramString[i];
        this.qtx.add(localObject);
        i += 1;
      }
      GMTrace.o(1061796446208L, 7911);
    }
    
    final String bNh()
    {
      GMTrace.i(1061662228480L, 7910);
      if ((this.qtx == null) || (this.qtx.size() == 0))
      {
        GMTrace.o(1061662228480L, 7910);
        return "";
      }
      Object localObject = new StringBuffer();
      Iterator localIterator = this.qtx.iterator();
      while (localIterator.hasNext())
      {
        ((StringBuffer)localObject).append((String)localIterator.next());
        ((StringBuffer)localObject).append(";");
      }
      localObject = ((StringBuffer)localObject).toString();
      GMTrace.o(1061662228480L, 7910);
      return (String)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
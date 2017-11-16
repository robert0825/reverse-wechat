package com.tencent.mm.bk;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private static final Map<Integer, Integer> tIX;
  
  static
  {
    GMTrace.i(13046634250240L, 97205);
    tIX = new HashMap();
    GMTrace.o(13046634250240L, 97205);
  }
  
  public static void PY(String paramString)
  {
    GMTrace.i(13046500032512L, 97204);
    paramString = paramString + bNB();
    Iterator localIterator = tIX.entrySet().iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((localEntry != null) && (localEntry.getKey() != null) && (localEntry.getValue() != null) && (((Integer)localEntry.getValue()).intValue() != 0))
      {
        localStringBuilder.append(localEntry.getKey());
        localStringBuilder.append('=');
        localStringBuilder.append(localEntry.getValue());
        localStringBuilder.append(',');
      }
    }
    tIX.clear();
    if (localStringBuilder.length() > 0)
    {
      w.d("MicroMsg.PostTaskFMessageCardStat", "append fmesage card click");
      bq.m(10, localStringBuilder.toString());
    }
    paramString = paramString + bNB();
    w.d("MicroMsg.PostTaskFMessageCardStat", "dkfm :" + paramString);
    try
    {
      at.AR();
      c.xh().set(66819, Long.valueOf(bg.Pu()));
      GMTrace.o(13046500032512L, 97204);
      return;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.PostTaskFMessageCardStat", "e:" + paramString.getMessage());
      GMTrace.o(13046500032512L, 97204);
    }
  }
  
  public static String bNB()
  {
    GMTrace.i(13046365814784L, 97203);
    StringBuilder localStringBuilder = new StringBuilder("[a=");
    if (at.AR() == null) {}
    for (String str = "0";; str = "1")
    {
      str = str + " ";
      if (at.AR() != null) {
        break;
      }
      GMTrace.o(13046365814784L, 97203);
      return str;
    }
    localStringBuilder = new StringBuilder().append(str).append("c=");
    at.AR();
    if (c.xh() == null)
    {
      str = "0";
      str = str + " ";
      localStringBuilder = new StringBuilder().append(str).append("u=");
      if (!at.AU()) {
        break label163;
      }
    }
    label163:
    for (str = "1";; str = "0")
    {
      str = str + "]";
      GMTrace.o(13046365814784L, 97203);
      return str;
      str = "1";
      break;
    }
  }
  
  public static void run()
  {
    GMTrace.i(13046097379328L, 97201);
    at.AR();
    if (bg.aG(bg.a((Long)c.xh().get(66819, null), 0L)) * 1000L > 1800000L) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        PY("");
      }
      GMTrace.o(13046097379328L, 97201);
      return;
    }
  }
  
  public static void zK(int paramInt)
  {
    GMTrace.i(13046231597056L, 97202);
    int i = bg.e((Integer)tIX.get(Integer.valueOf(paramInt)));
    tIX.put(Integer.valueOf(paramInt), Integer.valueOf(i + 1));
    GMTrace.o(13046231597056L, 97202);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bk\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
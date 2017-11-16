package com.tencent.mm.bk;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.i;
import com.tencent.mm.av.i.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  public static void bNH()
  {
    GMTrace.i(13045828943872L, 97199);
    int i;
    if ((at.AU()) && (!at.wF())) {
      i = 1;
    }
    while ((i != 0) && (rv()))
    {
      at.AR();
      Object localObject1 = (String)c.xh().get(77829, null);
      if (localObject1 != null)
      {
        Object localObject2 = a.Qa((String)localObject1);
        if ((localObject2 != null) && (((Map)localObject2).size() > 0))
        {
          localObject1 = new LinkedList();
          localObject2 = ((Map)localObject2).entrySet().iterator();
          for (;;)
          {
            if (((Iterator)localObject2).hasNext())
            {
              Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
              a locala = (a)localEntry.getValue();
              if (locala != null)
              {
                i = locala.hitCount;
                int j = locala.gPZ;
                if ((i > 0) || (j > 0)) {
                  ((List)localObject1).add(new i.a(10166, (String)localEntry.getKey() + "," + i + "," + j));
                }
                w.d("PostTaskTenMinutesLogicState", "report PostTaskTenMinutesLogicState  name " + (String)localEntry.getKey() + " " + i + "  " + j);
                continue;
                i = 0;
                break;
              }
            }
          }
          if (!((List)localObject1).isEmpty())
          {
            at.AR();
            c.yJ().b(new i((List)localObject1));
            at.AR();
            c.xh().set(77829, null);
          }
        }
      }
    }
    at.AR();
    c.xh().set(77828, Long.valueOf(bg.Pu()));
    w.d("PostTaskTenMinutesLogicState", "report PostTaskTenMinutesLogicState done ");
    GMTrace.o(13045828943872L, 97199);
  }
  
  public static boolean rv()
  {
    GMTrace.i(13045963161600L, 97200);
    at.AR();
    if (bg.aG(bg.a((Long)c.xh().get(77828, null), 0L)) * 1000L > 1800000L)
    {
      GMTrace.o(13045963161600L, 97200);
      return true;
    }
    GMTrace.o(13045963161600L, 97200);
    return false;
  }
  
  public static final class a
  {
    public int gPZ;
    public int hitCount;
    
    public a()
    {
      GMTrace.i(13046768467968L, 97206);
      this.hitCount = 0;
      this.gPZ = 0;
      GMTrace.o(13046768467968L, 97206);
    }
    
    public static Map<String, a> Qa(String paramString)
    {
      GMTrace.i(13047036903424L, 97208);
      Map.Entry localEntry = null;
      localObject3 = null;
      w.d("PostTaskTenMinutesLogicState", "xml " + paramString);
      Object localObject1 = localEntry;
      if (paramString != null) {}
      for (;;)
      {
        try
        {
          localObject4 = bh.q(paramString, "voiptenmin");
          localObject1 = localEntry;
          if (localObject4 == null) {
            continue;
          }
          localObject1 = localEntry;
          if (((Map)localObject4).size() <= 0) {
            continue;
          }
          paramString = new HashMap();
          try
          {
            localObject3 = ((Map)localObject4).entrySet().iterator();
            if (!((Iterator)localObject3).hasNext()) {
              continue;
            }
            localEntry = (Map.Entry)((Iterator)localObject3).next();
            localObject4 = (String)localEntry.getKey();
            if (localObject4 == null) {
              continue;
            }
            String[] arrayOfString = ((String)localObject4).split("\\.");
            w.d("PostTaskTenMinutesLogicState", "key is " + (String)localObject4);
            w.d("PostTaskTenMinutesLogicState", "array is " + arrayOfString.length);
            if ((localObject4 == null) || (arrayOfString.length < 4)) {
              continue;
            }
            w.d("PostTaskTenMinutesLogicState", "getValue is " + (String)localEntry.getValue() + "array[1] " + arrayOfString[2]);
            if (!paramString.containsKey(arrayOfString[2])) {
              continue;
            }
            localObject1 = (a)paramString.get(arrayOfString[2]);
            if (!((String)localObject4).contains("hitcount")) {
              continue;
            }
            ((a)localObject1).hitCount = bg.getInt((String)localEntry.getValue(), 0);
            w.d("PostTaskTenMinutesLogicState", "hitCount " + ((a)localObject1).hitCount + "sendCount " + ((a)localObject1).gPZ);
            paramString.put(arrayOfString[2], localObject1);
            continue;
          }
          catch (Exception localException)
          {
            localObject3 = localException;
            localObject2 = paramString;
          }
        }
        catch (Exception paramString)
        {
          Object localObject4;
          Object localObject2 = localObject3;
          localObject3 = paramString;
          continue;
          localObject2 = paramString;
          continue;
        }
        tmp347_344[0] = bg.f((Throwable)localObject3);
        w.e("PostTaskTenMinutesLogicState", "exception:%s", tmp347_344);
        GMTrace.o(13047036903424L, 97208);
        return (Map<String, a>)localObject2;
        localObject2 = new a();
        continue;
        if (((String)localObject4).contains("sendcount")) {
          ((a)localObject2).gPZ = bg.getInt((String)localEntry.getValue(), 0);
        }
      }
    }
    
    public static String ag(Map<String, a> paramMap)
    {
      GMTrace.i(13046902685696L, 97207);
      StringBuilder localStringBuilder = new StringBuilder();
      if (paramMap != null) {
        try
        {
          if (paramMap.size() > 0)
          {
            localStringBuilder.append("<voiptenmin>");
            paramMap = paramMap.entrySet().iterator();
            while (paramMap.hasNext())
            {
              Object localObject2 = (Map.Entry)paramMap.next();
              Object localObject1 = ((Map.Entry)localObject2).getKey();
              localObject2 = (a)((Map.Entry)localObject2).getValue();
              localStringBuilder.append("<" + localObject1);
              localStringBuilder.append(" hitcount = \"");
              localStringBuilder.append(((a)localObject2).hitCount);
              localStringBuilder.append("\"");
              localStringBuilder.append(" sendcount = \"");
              localStringBuilder.append(((a)localObject2).gPZ);
              localStringBuilder.append("\"");
              localStringBuilder.append("/>");
            }
            localStringBuilder.append("</voiptenmin>");
          }
        }
        catch (Exception paramMap)
        {
          w.e("PostTaskTenMinutesLogicState", "exception:%s", new Object[] { bg.f(paramMap) });
          GMTrace.o(13046902685696L, 97207);
          return null;
        }
      }
      w.d("PostTaskTenMinutesLogicState", "mapToXml " + localStringBuilder.toString());
      paramMap = localStringBuilder.toString();
      GMTrace.o(13046902685696L, 97207);
      return paramMap;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bk\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
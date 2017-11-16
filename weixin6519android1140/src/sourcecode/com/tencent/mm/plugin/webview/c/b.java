package com.tencent.mm.plugin.webview.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class b
{
  private static b rWA;
  private static long rWz;
  private c rWB;
  public Map<String, Long> rWC;
  private long rWD;
  
  static
  {
    GMTrace.i(19463986479104L, 145018);
    rWz = 2592000L;
    GMTrace.o(19463986479104L, 145018);
  }
  
  public b()
  {
    GMTrace.i(19462912737280L, 145010);
    this.rWC = new HashMap();
    this.rWD = 0L;
    GMTrace.o(19462912737280L, 145010);
  }
  
  public static long ME(String paramString)
  {
    GMTrace.i(19463449608192L, 145014);
    long l = bg.getLong(paramString, 604800L);
    if (l > rWz)
    {
      l = rWz;
      GMTrace.o(19463449608192L, 145014);
      return l;
    }
    GMTrace.o(19463449608192L, 145014);
    return l;
  }
  
  public static b bFZ()
  {
    GMTrace.i(19463046955008L, 145011);
    if (rWA == null) {
      rWA = new b();
    }
    b localb = rWA;
    GMTrace.o(19463046955008L, 145011);
    return localb;
  }
  
  public final void MF(String paramString)
  {
    GMTrace.i(19463852261376L, 145017);
    c localc = bGa();
    paramString = String.format("delete from %s where %s=\"%s\"", new Object[] { "WebViewData", "appId", paramString });
    w.d("MicroMsg.WebViewDataStorage", "cleanAllData: " + paramString);
    boolean bool = localc.eZ("WebViewData", paramString);
    w.d("MicroMsg.WebViewDataStorage", "cleanAllData: " + bool);
    GMTrace.o(19463852261376L, 145017);
  }
  
  public final boolean a(String paramString1, final String paramString2, String paramString3, final String paramString4, final String paramString5, boolean paramBoolean)
  {
    GMTrace.i(19463315390464L, 145013);
    Object localObject = bGa().rawQuery(String.format("select %s from %s where %s=\"%s\"", new Object[] { "size", "WebViewData", "appIdKey", c.es(paramString1, paramString2) }), new String[0]);
    long l2;
    long l4;
    long l5;
    label113:
    final long l3;
    if (localObject == null)
    {
      l2 = 0L;
      l4 = paramString2.getBytes().length + paramString3.getBytes().length;
      l5 = l4 - l2;
      if (!this.rWC.containsKey(paramString1)) {
        break label247;
      }
      l1 = ((Long)this.rWC.get(paramString1)).longValue();
      l3 = l1 + l5;
      if (!paramString1.equals("wx62d9035fd4fd2059")) {
        break label393;
      }
    }
    label247:
    label393:
    for (final long l1 = l3 - 52428800L;; l1 = l3 - 10485760L)
    {
      w.i("MicroMsg.WebViewDataCenter", "prevSize = %d, valueSize = %d, diffSize = %d, newAppSize = %d, expireSize = %d", new Object[] { Long.valueOf(l2), Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l3), Long.valueOf(l1) });
      if ((l1 <= 0L) || (paramBoolean)) {
        break label404;
      }
      GMTrace.o(19463315390464L, 145013);
      return false;
      l1 = 0L;
      if (((Cursor)localObject).moveToFirst()) {
        l1 = ((Cursor)localObject).getLong(0);
      }
      ((Cursor)localObject).close();
      l2 = l1;
      break;
      localObject = bGa();
      String str = String.format("select %s from %s where %s=\"%s\"", new Object[] { "size", "WebViewData", "appIdKey", c.ac(paramString1, "###@@@@TOTAL@@@###SIZE####", "_") });
      w.d("MicroMsg.WebViewDataStorage", "getAppIdSize: " + str);
      l3 = 0L;
      localObject = ((c)localObject).rawQuery(str, new String[0]);
      l1 = l3;
      if (localObject != null)
      {
        l1 = l3;
        if (((Cursor)localObject).moveToFirst()) {
          l1 = ((Cursor)localObject).getLong(0);
        }
        ((Cursor)localObject).close();
      }
      w.d("MicroMsg.WebViewDataStorage", "getAppIdSize: " + l1);
      break label113;
    }
    label404:
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19462778519552L, 145009);
        c localc;
        Object localObject1;
        long l2;
        Object localObject2;
        label126:
        String str1;
        boolean bool;
        if (l1 > 0L)
        {
          localc = b.this.bGa();
          localObject1 = l3;
          l2 = l1;
          localObject1 = String.format("select * from %s where appId='%s' order by weight,timeStamp", new Object[] { "WebViewData", localObject1 });
          w.d("MicroMsg.WebViewDataStorage", "deleteSize querySql: " + (String)localObject1);
          localObject2 = localc.rawQuery((String)localObject1, new String[0]);
          if (localObject2 == null)
          {
            l1 = 0L;
            b.this.rWC.put(l3, Long.valueOf(paramString2 - l1));
            localc = b.this.bGa();
            localObject1 = l3;
            localObject2 = paramString4;
            str1 = paramString5;
            String str2 = bg.aq(this.rWG, "1");
            l1 = b.ME(this.rWH);
            a locala = new a();
            locala.field_appId = ((String)localObject1);
            locala.field_appIdKey = c.es((String)localObject1, (String)localObject2);
            locala.field_value = str1;
            locala.field_weight = str2;
            locala.field_expireTime = (l1 + System.currentTimeMillis() / 1000L);
            locala.field_size = (((String)localObject2).getBytes().length + str1.getBytes().length);
            locala.field_timeStamp = (System.currentTimeMillis() / 1000L);
            bool = localc.a(locala);
            w.d("MicroMsg.WebViewDataStorage", "setData: " + bool);
            localc = b.this.bGa();
            localObject1 = l3;
            if (b.this.rWC.get(l3) != null) {
              break label816;
            }
          }
        }
        label816:
        for (long l1 = 0L;; l1 = ((Long)b.this.rWC.get(l3)).longValue())
        {
          localObject2 = new a();
          ((a)localObject2).field_appId = ((String)localObject1);
          ((a)localObject2).field_appIdKey = c.ac((String)localObject1, "###@@@@TOTAL@@@###SIZE####", "_");
          ((a)localObject2).field_expireTime = Long.MAX_VALUE;
          ((a)localObject2).field_size = l1;
          w.d("MicroMsg.WebViewDataStorage", "setAppIdSize: %b, size: %d", new Object[] { Boolean.valueOf(localc.a((com.tencent.mm.sdk.e.c)localObject2)), Long.valueOf(l1) });
          localc = b.this.bGa();
          localObject1 = String.format("delete from %s where %s<%s", new Object[] { "WebViewData", "expireTime", Long.valueOf(System.currentTimeMillis() / 1000L) });
          w.d("MicroMsg.WebViewDataStorage", "clearExpireTimeData: " + (String)localObject1);
          bool = localc.eZ("WebViewData", (String)localObject1);
          w.d("MicroMsg.WebViewDataStorage", "clearExpireTimeData: " + bool);
          GMTrace.o(19462778519552L, 145009);
          return;
          localObject1 = new LinkedList();
          long l3;
          for (l1 = l2; (((Cursor)localObject2).moveToFirst()) && (l1 > 0L); l1 -= l3)
          {
            str1 = ((Cursor)localObject2).getString(1);
            l3 = ((Cursor)localObject2).getLong(6);
            ((List)localObject1).add(str1);
          }
          ((Cursor)localObject2).close();
          if (((List)localObject1).size() > 0)
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("(");
            localObject1 = ((List)localObject1).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              str1 = (String)((Iterator)localObject1).next();
              ((StringBuilder)localObject2).append("\"" + str1 + "\",");
            }
            ((StringBuilder)localObject2).deleteCharAt(((StringBuilder)localObject2).length() - 1);
            ((StringBuilder)localObject2).append(")");
            localObject1 = String.format("delete from %s where %s in %s", new Object[] { "WebViewData", "appIdKey", ((StringBuilder)localObject2).toString() });
            w.d("MicroMsg.WebViewDataStorage", "deleteSize deleteSql: " + (String)localObject1);
            bool = localc.eZ("WebViewData", (String)localObject1);
            w.d("MicroMsg.WebViewDataStorage", "deleteSize: " + bool);
          }
          l1 = l2 - l1;
          break;
          b.this.rWC.put(l3, Long.valueOf(paramString2));
          break label126;
        }
      }
    });
    GMTrace.o(19463315390464L, 145013);
    return true;
  }
  
  public final void b(String paramString, JSONArray paramJSONArray)
  {
    GMTrace.i(19463718043648L, 145016);
    c localc = bGa();
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      GMTrace.o(19463718043648L, 145016);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    int i = 0;
    for (;;)
    {
      if (i < paramJSONArray.length()) {
        try
        {
          String str = paramJSONArray.getString(i);
          localStringBuilder.append("\"" + c.es(paramString, str) + "\",");
          i += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.WebViewDataStorage", "clearData: " + localException.getMessage());
          }
        }
      }
    }
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    localStringBuilder.append(")");
    paramString = String.format("delete from %s where %s in %s", new Object[] { "WebViewData", "appIdKey", localStringBuilder.toString() });
    w.d("MicroMsg.WebViewDataStorage", "deleteData: " + paramString);
    boolean bool = localc.eZ("WebViewData", paramString);
    w.d("MicroMsg.WebViewDataStorage", "clearData: " + bool);
    GMTrace.o(19463718043648L, 145016);
  }
  
  public final c bGa()
  {
    GMTrace.i(19463181172736L, 145012);
    if (this.rWB == null)
    {
      h.xz();
      this.rWB = new c(h.xy().fYV);
    }
    c localc = this.rWB;
    GMTrace.o(19463181172736L, 145012);
    return localc;
  }
  
  public final a er(String paramString1, String paramString2)
  {
    GMTrace.i(19463583825920L, 145015);
    c localc = bGa();
    paramString1 = String.format("select * from %s where %s=\"%s\"", new Object[] { "WebViewData", "appIdKey", c.es(paramString1, paramString2) });
    w.d("MicroMsg.WebViewDataStorage", "getData: " + paramString1);
    paramString1 = localc.rawQuery(paramString1, new String[0]);
    paramString2 = new a();
    if (paramString1 != null)
    {
      if (paramString1.moveToFirst()) {
        paramString2.b(paramString1);
      }
      paramString1.close();
    }
    GMTrace.o(19463583825920L, 145015);
    return paramString2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
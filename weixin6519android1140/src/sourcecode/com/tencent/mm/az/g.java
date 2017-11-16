package com.tencent.mm.az;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.apq;
import com.tencent.mm.protocal.c.apr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public final class g
{
  public static apr gRC;
  
  public static apr KB()
  {
    GMTrace.i(1318152306688L, 9821);
    Object localObject;
    if (gRC == null)
    {
      localObject = Kz();
      gRC = new apr();
      localObject = ab.getContext().getSharedPreferences("fts_recent_biz_sp", 0).getString((String)localObject, "");
      if (!bg.nm((String)localObject)) {
        localObject = Base64.decode(((String)localObject).getBytes(), 0);
      }
    }
    try
    {
      gRC.aD((byte[])localObject);
      localObject = gRC;
      GMTrace.o(1318152306688L, 9821);
      return (apr)localObject;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  private static String Kz()
  {
    GMTrace.i(1318286524416L, 9822);
    String str = "key_pb_most_search_biz_list" + q.zE();
    GMTrace.o(1318286524416L, 9822);
    return str;
  }
  
  public static void kJ(String paramString)
  {
    GMTrace.i(1318420742144L, 9823);
    if (!s.fD(paramString))
    {
      GMTrace.o(1318420742144L, 9823);
      return;
    }
    if (gRC == null) {
      KB();
    }
    long l1 = System.currentTimeMillis();
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    if (i < gRC.jhd.size())
    {
      localObject2 = (apq)gRC.jhd.get(i);
      long l2 = (l1 - ((apq)localObject2).uFp) / 86400000L;
      ((apq)localObject2).uFo *= Math.pow(0.98D, l2);
      ((apq)localObject2).uFp = (l2 * 86400000L + ((apq)localObject2).uFp);
      w.d("MicroMsg.FTS.FTSMostSearchBizLogic", "after update: %.2f %d %s", new Object[] { Double.valueOf(((apq)localObject2).uFo), Long.valueOf(((apq)localObject2).uFp), ((apq)localObject2).tRz });
      if (!((apq)localObject2).tRz.equals(paramString)) {
        break label468;
      }
      localObject1 = localObject2;
    }
    label468:
    for (;;)
    {
      i += 1;
      break;
      if (localObject1 == null)
      {
        localObject1 = new apq();
        ((apq)localObject1).uFo = 1.0D;
        ((apq)localObject1).uFp = l1;
        ((apq)localObject1).tRz = paramString;
        gRC.jhd.add(localObject1);
        w.i("MicroMsg.FTS.FTSMostSearchBizLogic", "add new use %s", new Object[] { paramString });
      }
      for (;;)
      {
        Collections.sort(gRC.jhd, new Comparator() {});
        i = gRC.jhd.size() - 1;
        while ((i < gRC.jhd.size()) && (gRC.jhd.size() > 8))
        {
          if (((apq)gRC.jhd.get(i)).uFo < 0.5D) {
            gRC.jhd.remove(i);
          }
          i += 1;
        }
        ((apq)localObject1).uFo += 1.0D;
        w.i("MicroMsg.FTS.FTSMostSearchBizLogic", "update use %s %.2f", new Object[] { paramString, Double.valueOf(((apq)localObject1).uFo) });
      }
      paramString = ab.getContext().getSharedPreferences("fts_recent_biz_sp", 0);
      try
      {
        localObject1 = Kz();
        localObject2 = Base64.encodeToString(gRC.toByteArray(), 0);
        paramString.edit().putString((String)localObject1, (String)localObject2).commit();
        w.i("MicroMsg.FTS.FTSMostSearchBizLogic", "useBiz pbListString %s", new Object[] { localObject2 });
        GMTrace.o(1318420742144L, 9823);
        return;
      }
      catch (IOException paramString)
      {
        GMTrace.o(1318420742144L, 9823);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
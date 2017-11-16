package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.walletlock.gesture.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
{
  private static long rxf;
  
  static
  {
    GMTrace.i(20269829718016L, 151022);
    rxf = -1L;
    GMTrace.o(20269829718016L, 151022);
  }
  
  private static JSONArray KN(String paramString)
  {
    GMTrace.i(20268084887552L, 151009);
    if (paramString == null)
    {
      GMTrace.o(20268084887552L, 151009);
      return null;
    }
    try
    {
      paramString = new JSONArray(paramString);
      GMTrace.o(20268084887552L, 151009);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.FingerprintInfoStorage", paramString, "", new Object[0]);
      GMTrace.o(20268084887552L, 151009);
    }
    return null;
  }
  
  public static boolean KO(String paramString)
  {
    GMTrace.i(20268487540736L, 151012);
    w.i("MicroMsg.FingerprintInfoStorage", "alvinluo add fid to local: %s", new Object[] { paramString });
    try
    {
      Object localObject2 = KN(bAt());
      HashSet localHashSet = x((JSONArray)localObject2);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        w.w("MicroMsg.FingerprintInfoStorage", "alvinluo list is null");
        localObject1 = new JSONArray();
      }
      localObject2 = localHashSet;
      if (localHashSet == null)
      {
        w.w("MicroMsg.FingerprintInfoStorage", "alvinluo fidSet is null");
        localObject2 = new HashSet();
      }
      w.i("MicroMsg.FingerprintInfoStorage", "alvinluo fidList: %s before add fid", new Object[] { ((JSONArray)localObject1).toString() });
      if (!((HashSet)localObject2).contains(paramString))
      {
        w.w("MicroMsg.FingerprintInfoStorage", "alvinluo fidSet contains fid %s: %b", new Object[] { paramString, Boolean.valueOf(false) });
        localObject2 = new JSONObject();
        ((JSONObject)localObject2).put("fid", paramString);
        ((JSONArray)localObject1).put(localObject2);
        w.i("MicroMsg.FingerprintInfoStorage", "alvinluo list: %s", new Object[] { ((JSONArray)localObject1).toString() });
        h.xy().xh().a(w.a.vzn, ((JSONArray)localObject1).toString());
        h.xy().xh().kL(true);
        GMTrace.o(20268487540736L, 151012);
        return true;
      }
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.FingerprintInfoStorage", paramString, "", new Object[0]);
      GMTrace.o(20268487540736L, 151012);
    }
    return false;
  }
  
  public static boolean KP(String paramString)
  {
    GMTrace.i(20268621758464L, 151013);
    Object localObject = bAt();
    w.i("MicroMsg.FingerprintInfoStorage", "alvinluo fid: %s, fidInfoList: %s", new Object[] { paramString, localObject });
    localObject = x(KN((String)localObject));
    if ((localObject != null) && (((HashSet)localObject).contains(paramString)))
    {
      GMTrace.o(20268621758464L, 151013);
      return true;
    }
    GMTrace.o(20268621758464L, 151013);
    return false;
  }
  
  private static String bAt()
  {
    GMTrace.i(20268353323008L, 151011);
    String str = (String)h.xy().xh().get(w.a.vzn, null);
    GMTrace.o(20268353323008L, 151011);
    return str;
  }
  
  public static void bAu()
  {
    GMTrace.i(20268755976192L, 151014);
    w.i("MicroMsg.FingerprintInfoStorage", "alvinluo clear local fids, stack: %s", new Object[] { bg.bQW() });
    h.xy().xh().a(w.a.vzn, null);
    h.xy().xh().kL(true);
    GMTrace.o(20268755976192L, 151014);
  }
  
  public static boolean bAv()
  {
    GMTrace.i(20268890193920L, 151015);
    boolean bool = ((Boolean)h.xy().xh().get(w.a.vzm, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(20268890193920L, 151015);
    return bool;
  }
  
  public static boolean bAw()
  {
    GMTrace.i(20269158629376L, 151017);
    Object localObject = h.xy().xh();
    if (localObject == null) {
      localObject = new g();
    }
    while (((g)localObject).rxG != -1L)
    {
      com.tencent.mm.plugin.walletlock.gesture.a.e.a((g)localObject);
      if (((g)localObject).rxH / 1000L < 30L)
      {
        x(((g)localObject).rxG, ((g)localObject).rxH);
        GMTrace.o(20269158629376L, 151017);
        return true;
        localObject = (String)((t)localObject).get(w.a.vzq, null);
        if (localObject == null) {
          localObject = new g();
        } else {
          localObject = new g().aP(com.tencent.mm.plugin.walletlock.gesture.a.e.KQ((String)localObject));
        }
      }
      else
      {
        localObject = h.xy().xh();
        if (localObject != null)
        {
          ((t)localObject).a(w.a.vzq, null);
          ((t)localObject).kL(true);
        }
        GMTrace.o(20269158629376L, 151017);
        return false;
      }
    }
    GMTrace.o(20269158629376L, 151017);
    return false;
  }
  
  public static void bAx()
  {
    GMTrace.i(20269427064832L, 151019);
    rxf = -1L;
    GMTrace.o(20269427064832L, 151019);
  }
  
  public static long bAy()
  {
    GMTrace.i(20269561282560L, 151020);
    long l = rxf;
    GMTrace.o(20269561282560L, 151020);
    return l;
  }
  
  public static void ej(long paramLong)
  {
    GMTrace.i(20269695500288L, 151021);
    rxf = paramLong;
    GMTrace.o(20269695500288L, 151021);
  }
  
  public static void je(boolean paramBoolean)
  {
    GMTrace.i(20269024411648L, 151016);
    w.i("MicroMsg.FingerprintInfoStorage", "alvinluo set fingerprint lock status isOpened: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    h.xy().xh().a(w.a.vzm, Boolean.valueOf(paramBoolean));
    h.xy().xh().kL(true);
    GMTrace.o(20269024411648L, 151016);
  }
  
  private static HashSet<String> x(JSONArray paramJSONArray)
  {
    GMTrace.i(20268219105280L, 151010);
    if (paramJSONArray == null)
    {
      GMTrace.o(20268219105280L, 151010);
      return null;
    }
    try
    {
      HashSet localHashSet = new HashSet();
      int i = 0;
      while (i < paramJSONArray.length())
      {
        localHashSet.add(paramJSONArray.getJSONObject(i).getString("fid"));
        i += 1;
      }
      GMTrace.o(20268219105280L, 151010);
      return localHashSet;
    }
    catch (Exception paramJSONArray)
    {
      w.printErrStackTrace("MicroMsg.FingerprintInfoStorage", paramJSONArray, "", new Object[0]);
      GMTrace.o(20268219105280L, 151010);
    }
    return null;
  }
  
  public static void x(long paramLong1, long paramLong2)
  {
    GMTrace.i(20269292847104L, 151018);
    t localt = h.xy().xh();
    if (localt != null)
    {
      g localg = new g();
      localg.rxG = paramLong1;
      localg.rxH = paramLong2;
      localt.a(w.a.vzq, com.tencent.mm.plugin.walletlock.gesture.a.e.aO(localg.toByteArray()));
      localt.kL(true);
    }
    GMTrace.o(20269292847104L, 151018);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\fingerprint\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
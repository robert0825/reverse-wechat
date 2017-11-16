package com.tencent.mm.az;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.th;
import com.tencent.mm.protocal.c.btk;
import com.tencent.mm.protocal.c.btl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class l
{
  private static HashMap<String, w.a> gRU;
  private static m gRV;
  private static HashMap<String, Long> gRW;
  private static String gRX;
  public static e gvj;
  
  static
  {
    GMTrace.i(1307951759360L, 9745);
    HashMap localHashMap = new HashMap();
    gRU = localHashMap;
    localHashMap.put("zh_CN", w.a.vxj);
    gRU.put("zh_HK", w.a.vxl);
    gRU.put("zh_TW", w.a.vxk);
    gRU.put("en", w.a.vxm);
    gRU.put("ar", w.a.vxn);
    gRU.put("de", w.a.vxo);
    gRU.put("de_DE", w.a.vxp);
    gRU.put("es", w.a.vxq);
    gRU.put("fr", w.a.vxr);
    gRU.put("he", w.a.vxs);
    gRU.put("hi", w.a.vxt);
    gRU.put("id", w.a.vxu);
    gRU.put("in", w.a.vxv);
    gRU.put("it", w.a.vxw);
    gRU.put("iw", w.a.vxx);
    gRU.put("ja", w.a.vxy);
    gRU.put("ko", w.a.vxz);
    gRU.put("lo", w.a.vxA);
    gRU.put("ms", w.a.vxB);
    gRU.put("my", w.a.vxC);
    gRU.put("pl", w.a.vxD);
    gRU.put("pt", w.a.vxE);
    gRU.put("ru", w.a.vxF);
    gRU.put("th", w.a.vxG);
    gRU.put("tr", w.a.vxH);
    gRU.put("vi", w.a.vxI);
    gRX = "";
    gvj = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(1309025501184L, 9753);
        w.i("MicroMsg.FTS.FTSWebSearchConfigLogic", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousk instanceof m))
        {
          at.wS().b(1948, l.gvj);
          paramAnonymousString = new th();
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
            break label170;
          }
          Object localObject = (m)paramAnonymousk;
          paramAnonymousk = ((m)localObject).gSd;
          localObject = ((m)localObject).gSc;
          w.i("MicroMsg.FTS.FTSWebSearchConfigLogic", "getWebSearchConfig onSceneEnd %s", new Object[] { paramAnonymousk.tWC });
          if (l.ai(((btk)localObject).kBh, paramAnonymousk.tWC) != l.a.gRY) {
            break label159;
          }
          paramAnonymousString.eYP.result = 0;
        }
        for (;;)
        {
          a.vgX.m(paramAnonymousString);
          GMTrace.o(1309025501184L, 9753);
          return;
          label159:
          paramAnonymousString.eYP.result = -1;
          continue;
          label170:
          paramAnonymousString.eYP.result = -1;
        }
      }
    };
    GMTrace.o(1307951759360L, 9745);
  }
  
  /* Error */
  private static String KG()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc2_w 190
    //   5: sipush 9742
    //   8: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: invokestatic 197	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   14: invokevirtual 203	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   17: astore_0
    //   18: invokestatic 197	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   21: invokestatic 209	com/tencent/mm/sdk/platformtools/v:eq	(Landroid/content/Context;)Ljava/lang/String;
    //   24: astore_2
    //   25: aload_0
    //   26: new 211	java/lang/StringBuilder
    //   29: dup
    //   30: ldc -43
    //   32: invokespecial 216	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   35: aload_2
    //   36: invokevirtual 220	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokevirtual 223	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: invokevirtual 229	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   45: astore_0
    //   46: aload_0
    //   47: astore_1
    //   48: aload_1
    //   49: astore_0
    //   50: new 231	java/lang/String
    //   53: dup
    //   54: aload_1
    //   55: invokestatic 237	com/tencent/mm/loader/stub/b:c	(Ljava/io/InputStream;)[B
    //   58: invokespecial 240	java/lang/String:<init>	([B)V
    //   61: astore_2
    //   62: aload_1
    //   63: invokestatic 246	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   66: aload_2
    //   67: astore_0
    //   68: ldc2_w 190
    //   71: sipush 9742
    //   74: invokestatic 184	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   77: aload_0
    //   78: areturn
    //   79: astore_2
    //   80: aconst_null
    //   81: astore_1
    //   82: aload_1
    //   83: astore_0
    //   84: ldc -8
    //   86: aload_2
    //   87: aload_2
    //   88: invokevirtual 251	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   91: iconst_0
    //   92: anewarray 4	java/lang/Object
    //   95: invokestatic 257	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   98: aload_1
    //   99: invokestatic 246	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   102: aconst_null
    //   103: astore_0
    //   104: goto -36 -> 68
    //   107: astore_0
    //   108: aload_1
    //   109: invokestatic 246	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   112: aload_0
    //   113: athrow
    //   114: astore_2
    //   115: aload_0
    //   116: astore_1
    //   117: aload_2
    //   118: astore_0
    //   119: goto -11 -> 108
    //   122: astore_2
    //   123: goto -41 -> 82
    // Local variable table:
    //   start	length	slot	name	signature
    //   17	87	0	localObject1	Object
    //   107	9	0	localObject2	Object
    //   118	1	0	localObject3	Object
    //   1	116	1	localObject4	Object
    //   24	43	2	str	String
    //   79	9	2	localException1	Exception
    //   114	4	2	localObject5	Object
    //   122	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   18	46	79	java/lang/Exception
    //   18	46	107	finally
    //   50	62	114	finally
    //   84	98	114	finally
    //   50	62	122	java/lang/Exception
  }
  
  public static int ai(String paramString1, String paramString2)
  {
    GMTrace.i(1307280670720L, 9740);
    int i;
    try
    {
      paramString2 = new JSONObject(paramString2);
      paramString2.put("updateTime", System.currentTimeMillis());
      paramString2 = paramString2.toString();
      at.AR();
      c.xh().a(kL(paramString1), paramString2);
      i = a.gRY;
      GMTrace.o(1307280670720L, 9740);
      return i;
    }
    catch (JSONException paramString1)
    {
      i = a.gSa;
      GMTrace.o(1307280670720L, 9740);
    }
    return i;
  }
  
  public static boolean gU(int paramInt)
  {
    GMTrace.i(15313169022976L, 114092);
    if (gRW == null) {
      gRW = new HashMap();
    }
    String str = v.eq(ab.getContext());
    if ((gRX == null) || (gRX.equalsIgnoreCase(str)))
    {
      Long localLong = (Long)gRW.get(str);
      Object localObject1 = localLong;
      if (localLong == null) {
        localObject1 = Long.valueOf(0L);
      }
      if (System.currentTimeMillis() - ((Long)localObject1).longValue() < 600000L)
      {
        GMTrace.o(15313169022976L, 114092);
        return false;
      }
      long l = System.currentTimeMillis();
      gRW.put(str, Long.valueOf(l));
      w.i("MicroMsg.FTS.FTSWebSearchConfigLogic", "startToRequestConfig %s %d %d", new Object[] { str, Integer.valueOf(paramInt), Long.valueOf(0L) });
      at.AR();
      localObject1 = (String)c.xh().get(kL(str), null);
      try
      {
        if (!bg.nm((String)localObject1))
        {
          localObject1 = new JSONObject((String)localObject1);
          if (localObject1 != null) {
            break label228;
          }
          i = a.gSa;
          if (i != a.gRY) {
            break label272;
          }
          GMTrace.o(15313169022976L, 114092);
          return false;
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          int i;
          Object localObject2 = null;
          continue;
          label228:
          l = ((JSONObject)localObject2).optLong("updateTime");
          if (((JSONObject)localObject2).optLong("timevalSec") * 1000L + l < System.currentTimeMillis()) {
            i = a.gRZ;
          } else {
            i = a.gRY;
          }
        }
      }
    }
    label272:
    gRX = str;
    if (gRV != null)
    {
      at.wS().c(gRV);
      gRV = null;
    }
    gRV = new m(null, paramInt, 0L, null);
    at.wS().a(1948, gvj);
    at.wS().a(gRV, 0);
    GMTrace.o(15313169022976L, 114092);
    return true;
  }
  
  private static w.a kL(String paramString)
  {
    GMTrace.i(16268665028608L, 121211);
    w.a locala = (w.a)gRU.get(paramString);
    paramString = locala;
    if (locala == null) {
      paramString = w.a.vxm;
    }
    GMTrace.o(16268665028608L, 121211);
    return paramString;
  }
  
  public static JSONObject kM(String paramString)
  {
    GMTrace.i(1307414888448L, 9741);
    String str1 = v.eq(ab.getContext());
    try
    {
      at.AR();
      localObject1 = (String)c.xh().get(kL(str1), null);
      if (bg.nm((String)localObject1)) {
        break label190;
      }
      localObject3 = new JSONObject((String)localObject1).optJSONObject("data").optJSONObject(paramString);
      localObject1 = "Config Storage";
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject4;
        Object localObject6;
        Object localObject2 = "";
        Object localObject3 = null;
        continue;
        localObject2 = "";
        localObject3 = null;
      }
    }
    localObject4 = localObject1;
    localObject6 = localObject3;
    if (localObject3 == null) {}
    try
    {
      String str2 = KG();
      localObject4 = localObject1;
      localObject6 = localObject3;
      if (str2 != null)
      {
        localObject6 = new JSONObject(str2).optJSONObject("data").optJSONObject(paramString);
        localObject4 = "Asset";
      }
      localObject1 = localObject6;
      localObject3 = localObject4;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        Object localObject5 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject5;
      }
    }
    localObject4 = localObject1;
    if (localObject1 == null) {
      localObject4 = new JSONObject();
    }
    w.i("MicroMsg.FTS.FTSWebSearchConfigLogic", "getWebSearchConfigKeyObj %s %s %s", new Object[] { str1, paramString, localObject3 });
    GMTrace.o(1307414888448L, 9741);
    return (JSONObject)localObject4;
  }
  
  public static String kN(String paramString)
  {
    GMTrace.i(19135555698688L, 142571);
    String str = v.eq(ab.getContext());
    for (;;)
    {
      try
      {
        at.AR();
        localObject1 = (String)c.xh().get(kL(str), null);
        if (bg.nm((String)localObject1)) {
          break label189;
        }
        localObject3 = new JSONObject((String)localObject1);
        localObject1 = "Config Storage";
      }
      catch (Exception localException1)
      {
        Object localObject1;
        localObject2 = "";
        localObject3 = null;
        continue;
      }
      if (localObject3 == null)
      {
        try
        {
          localObject4 = KG();
          if (localObject4 == null) {
            break label186;
          }
          localObject4 = new JSONObject((String)localObject4);
          localObject1 = "Asset";
          localObject3 = localObject4;
          localObject4 = localObject3;
          localObject3 = localObject1;
          localObject1 = localObject4;
        }
        catch (Exception localException2)
        {
          Object localObject4;
          Object localObject5 = localObject2;
          localObject2 = localObject3;
          localObject3 = localObject5;
          continue;
          paramString = paramString.toString();
          GMTrace.o(19135555698688L, 142571);
          return paramString;
        }
        localObject4 = localObject1;
        if (localObject1 == null) {
          localObject4 = new JSONObject();
        }
        w.i("MicroMsg.FTS.FTSWebSearchConfigLogic", "getWebSearchConfigMetaKeyObj %s %s %s", new Object[] { str, paramString, localObject3 });
        paramString = ((JSONObject)localObject4).opt(paramString);
        if (paramString == null)
        {
          GMTrace.o(19135555698688L, 142571);
          return "";
        }
      }
      label186:
      continue;
      label189:
      Object localObject2 = "";
      Object localObject3 = null;
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(1318823395328L, 9826);
      gRY = 1;
      gRZ = 2;
      gSa = 3;
      gSb = new int[] { gRY, gRZ, gSa };
      GMTrace.o(1318823395328L, 9826);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
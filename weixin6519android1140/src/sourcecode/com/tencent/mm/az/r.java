package com.tencent.mm.az;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public final class r
{
  public static int KK()
  {
    GMTrace.i(1323789451264L, 9863);
    int i = Integer.valueOf(n(new File(Ko(), "config.conf")).getProperty("version", "0")).intValue();
    GMTrace.o(1323789451264L, 9863);
    return i;
  }
  
  public static final boolean KL()
  {
    GMTrace.i(14449880596480L, 107660);
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100223");
    if (localc.isValid())
    {
      if (bg.getInt((String)localc.bSg().get("switchWeAppTemplate"), 0) == 1)
      {
        GMTrace.o(14449880596480L, 107660);
        return true;
      }
      GMTrace.o(14449880596480L, 107660);
      return false;
    }
    GMTrace.o(14449880596480L, 107660);
    return false;
  }
  
  public static String Ko()
  {
    GMTrace.i(1323521015808L, 9861);
    Object localObject = new File(com.tencent.mm.compatible.util.e.ghw.replace("/data/user/0", "/data/data"), "wxa_fts/res");
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    localObject = ((File)localObject).getAbsolutePath();
    GMTrace.o(1323521015808L, 9861);
    return (String)localObject;
  }
  
  public static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    GMTrace.i(1324057886720L, 9865);
    Map localMap = a(paramInt1, paramBoolean, paramInt2, "");
    GMTrace.o(1324057886720L, 9865);
    return localMap;
  }
  
  public static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString)
  {
    GMTrace.i(19134750392320L, 142565);
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt1));
    localHashMap.put("type", String.valueOf(paramInt2));
    localHashMap.put("lang", v.eq(ab.getContext()));
    localHashMap.put("platform", "android");
    localHashMap.put("version", String.valueOf(KK()));
    String str;
    if (paramBoolean)
    {
      str = "1";
      localHashMap.put("isHomePage", str);
      if (!TextUtils.isEmpty(paramString)) {
        localHashMap.put("extParams", paramString);
      }
      paramString = com.tencent.mm.y.c.c.Ct().er("100192");
      if ((!paramString.isValid()) || (!"1".equals(paramString.bSg().get("openSearchSuggestion")))) {
        break label240;
      }
    }
    label240:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WxaFTSExportLogic", "genFTSParams scene = %d, isHomePage = %b, type = %d, isSug = %b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if (bool) {
        localHashMap.put("isSug", "1");
      }
      GMTrace.o(19134750392320L, 142565);
      return localHashMap;
      str = "0";
      break;
    }
  }
  
  public static String n(Map<String, String> paramMap)
  {
    GMTrace.i(1323923668992L, 9864);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("file://");
    localStringBuffer.append(Ko());
    localStringBuffer.append("/app.html?");
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuffer.append("&");
      localStringBuffer.append((String)localEntry.getKey());
      localStringBuffer.append("=");
      localStringBuffer.append((String)localEntry.getValue());
    }
    if (!paramMap.containsKey("sessionId"))
    {
      localStringBuffer.append("&");
      localStringBuffer.append("sessionId");
      localStringBuffer.append("=");
      localStringBuffer.append(e.gN(bg.Sy((String)paramMap.get("scene"))));
    }
    paramMap = localStringBuffer.toString();
    GMTrace.o(1323923668992L, 9864);
    return paramMap;
  }
  
  /* Error */
  public static Properties n(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 280
    //   3: sipush 9862
    //   6: invokestatic 14	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 36	java/util/Properties
    //   12: dup
    //   13: invokespecial 282	java/util/Properties:<init>	()V
    //   16: astore_3
    //   17: aload_0
    //   18: ifnull +30 -> 48
    //   21: aload_0
    //   22: invokevirtual 285	java/io/File:isFile	()Z
    //   25: ifeq +23 -> 48
    //   28: new 287	java/io/FileInputStream
    //   31: dup
    //   32: aload_0
    //   33: invokespecial 290	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   36: astore_1
    //   37: aload_1
    //   38: astore_0
    //   39: aload_3
    //   40: aload_1
    //   41: invokevirtual 294	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   44: aload_1
    //   45: invokestatic 299	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   48: ldc2_w 280
    //   51: sipush 9862
    //   54: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: aload_3
    //   58: areturn
    //   59: astore_2
    //   60: aconst_null
    //   61: astore_1
    //   62: aload_1
    //   63: astore_0
    //   64: ldc -60
    //   66: aload_2
    //   67: ldc -126
    //   69: iconst_0
    //   70: anewarray 4	java/lang/Object
    //   73: invokestatic 303	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   76: aload_1
    //   77: invokestatic 299	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   80: goto -32 -> 48
    //   83: astore_1
    //   84: aconst_null
    //   85: astore_0
    //   86: aload_0
    //   87: invokestatic 299	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   90: aload_1
    //   91: athrow
    //   92: astore_1
    //   93: goto -7 -> 86
    //   96: astore_2
    //   97: goto -35 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	paramFile	File
    //   36	41	1	localFileInputStream	java.io.FileInputStream
    //   83	8	1	localObject1	Object
    //   92	1	1	localObject2	Object
    //   59	8	2	localException1	Exception
    //   96	1	2	localException2	Exception
    //   16	42	3	localProperties	Properties
    // Exception table:
    //   from	to	target	type
    //   28	37	59	java/lang/Exception
    //   28	37	83	finally
    //   39	44	92	finally
    //   64	76	92	finally
    //   39	44	96	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
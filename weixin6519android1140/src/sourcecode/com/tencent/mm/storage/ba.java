package com.tencent.mm.storage;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ba
  extends j
{
  private t vCg;
  
  public ba(t paramt)
  {
    GMTrace.i(13536797392896L, 100857);
    this.vCg = null;
    this.vCg = paramt;
    GMTrace.o(13536797392896L, 100857);
  }
  
  public static boolean UA(String paramString)
  {
    GMTrace.i(13537602699264L, 100863);
    if (bg.nm(paramString))
    {
      GMTrace.o(13537602699264L, 100863);
      return false;
    }
    try
    {
      Map localMap = bh.q(paramString, "deviceinfoconfig");
      if (localMap == null)
      {
        GMTrace.o(13537602699264L, 100863);
        return false;
      }
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ServerConfigInfoStorage", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(13537602699264L, 100863);
      return false;
    }
    if (!h.xw().wL())
    {
      GMTrace.o(13537602699264L, 100863);
      return false;
    }
    h.xz();
    h.xy().xi().Uz(paramString);
    GMTrace.o(13537602699264L, 100863);
    return true;
  }
  
  /* Error */
  private static boolean UB(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc2_w 96
    //   5: ldc 98
    //   7: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: new 100	java/io/File
    //   13: dup
    //   14: getstatic 106	com/tencent/mm/storage/w:ghv	Ljava/lang/String;
    //   17: invokespecial 109	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: astore_2
    //   21: aload_2
    //   22: invokevirtual 112	java/io/File:exists	()Z
    //   25: ifne +8 -> 33
    //   28: aload_2
    //   29: invokevirtual 115	java/io/File:mkdirs	()Z
    //   32: pop
    //   33: aconst_null
    //   34: astore_3
    //   35: aconst_null
    //   36: astore 4
    //   38: aload_3
    //   39: astore_2
    //   40: ldc 48
    //   42: ldc 117
    //   44: iconst_2
    //   45: anewarray 52	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: new 119	java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   57: getstatic 106	com/tencent/mm/storage/w:ghv	Ljava/lang/String;
    //   60: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: ldc 126
    //   65: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: aastore
    //   72: dup
    //   73: iconst_1
    //   74: aload_0
    //   75: aastore
    //   76: invokestatic 132	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   79: aload_3
    //   80: astore_2
    //   81: new 134	java/io/FileWriter
    //   84: dup
    //   85: new 119	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   92: getstatic 106	com/tencent/mm/storage/w:ghv	Ljava/lang/String;
    //   95: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: ldc 126
    //   100: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokespecial 135	java/io/FileWriter:<init>	(Ljava/lang/String;)V
    //   109: astore_3
    //   110: aload_3
    //   111: aload_0
    //   112: invokevirtual 138	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   115: aload_3
    //   116: invokevirtual 141	java/io/FileWriter:close	()V
    //   119: aload_3
    //   120: invokevirtual 141	java/io/FileWriter:close	()V
    //   123: ldc2_w 96
    //   126: ldc 98
    //   128: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: iload_1
    //   132: ireturn
    //   133: astore_0
    //   134: ldc 48
    //   136: ldc 50
    //   138: iconst_1
    //   139: anewarray 52	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_0
    //   145: invokestatic 56	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   148: aastore
    //   149: invokestatic 62	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: goto -29 -> 123
    //   155: astore_3
    //   156: iconst_0
    //   157: istore_1
    //   158: aload 4
    //   160: astore_0
    //   161: aload_0
    //   162: astore_2
    //   163: ldc 48
    //   165: ldc 50
    //   167: iconst_1
    //   168: anewarray 52	java/lang/Object
    //   171: dup
    //   172: iconst_0
    //   173: aload_3
    //   174: invokestatic 56	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   177: aastore
    //   178: invokestatic 62	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: aload_0
    //   182: ifnull +91 -> 273
    //   185: aload_0
    //   186: invokevirtual 141	java/io/FileWriter:close	()V
    //   189: goto -66 -> 123
    //   192: astore_0
    //   193: ldc 48
    //   195: ldc 50
    //   197: iconst_1
    //   198: anewarray 52	java/lang/Object
    //   201: dup
    //   202: iconst_0
    //   203: aload_0
    //   204: invokestatic 56	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   207: aastore
    //   208: invokestatic 62	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   211: goto -88 -> 123
    //   214: astore_0
    //   215: aload_2
    //   216: ifnull +7 -> 223
    //   219: aload_2
    //   220: invokevirtual 141	java/io/FileWriter:close	()V
    //   223: aload_0
    //   224: athrow
    //   225: astore_2
    //   226: ldc 48
    //   228: ldc 50
    //   230: iconst_1
    //   231: anewarray 52	java/lang/Object
    //   234: dup
    //   235: iconst_0
    //   236: aload_2
    //   237: invokestatic 56	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   240: aastore
    //   241: invokestatic 62	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   244: goto -21 -> 223
    //   247: astore_0
    //   248: aload_3
    //   249: astore_2
    //   250: goto -35 -> 215
    //   253: astore_2
    //   254: aload_3
    //   255: astore_0
    //   256: aload_2
    //   257: astore_3
    //   258: iconst_0
    //   259: istore_1
    //   260: goto -99 -> 161
    //   263: astore_2
    //   264: aload_3
    //   265: astore_0
    //   266: aload_2
    //   267: astore_3
    //   268: iconst_1
    //   269: istore_1
    //   270: goto -109 -> 161
    //   273: goto -150 -> 123
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	paramString	String
    //   1	269	1	bool	boolean
    //   20	200	2	localObject1	Object
    //   225	12	2	localIOException	java.io.IOException
    //   249	1	2	localObject2	Object
    //   253	4	2	localException1	Exception
    //   263	4	2	localException2	Exception
    //   34	86	3	localFileWriter	java.io.FileWriter
    //   155	100	3	localException3	Exception
    //   257	11	3	localException4	Exception
    //   36	123	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   119	123	133	java/io/IOException
    //   40	79	155	java/lang/Exception
    //   81	110	155	java/lang/Exception
    //   185	189	192	java/io/IOException
    //   40	79	214	finally
    //   81	110	214	finally
    //   163	181	214	finally
    //   219	223	225	java/io/IOException
    //   110	115	247	finally
    //   115	119	247	finally
    //   110	115	253	java/lang/Exception
    //   115	119	263	java/lang/Exception
  }
  
  public static String bUr()
  {
    GMTrace.i(13537334263808L, 100861);
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    String str2 = Build.FINGERPRINT;
    String str1 = str2;
    if (str2 != null) {
      str1 = str2.replace("/", ":");
    }
    localLinkedHashMap.put("fingerprint", str1);
    localLinkedHashMap.put("manufacturer", Build.MANUFACTURER);
    localLinkedHashMap.put("device", Build.DEVICE);
    localLinkedHashMap.put("model", Build.MODEL);
    localLinkedHashMap.put("product", Build.PRODUCT);
    localLinkedHashMap.put("board", Build.BOARD);
    localLinkedHashMap.put("release", Build.VERSION.RELEASE);
    localLinkedHashMap.put("codename", Build.VERSION.CODENAME);
    localLinkedHashMap.put("incremental", Build.VERSION.INCREMENTAL);
    localLinkedHashMap.put("display", Build.DISPLAY);
    str1 = bg.a(localLinkedHashMap);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ServerConfigInfoStorage", "getLocalFingerprint  " + str1);
    GMTrace.o(13537334263808L, 100861);
    return str1;
  }
  
  public static String bUs()
  {
    GMTrace.i(13537468481536L, 100862);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("<deviceinfo>");
    ((StringBuffer)localObject).append("<MANUFACTURER name=\"");
    ((StringBuffer)localObject).append(Build.MANUFACTURER);
    ((StringBuffer)localObject).append("\">");
    ((StringBuffer)localObject).append("<MODEL name=\"");
    ((StringBuffer)localObject).append(Build.MODEL);
    ((StringBuffer)localObject).append("\">");
    ((StringBuffer)localObject).append("<VERSION_RELEASE name=\"");
    ((StringBuffer)localObject).append(Build.VERSION.RELEASE);
    ((StringBuffer)localObject).append("\">");
    ((StringBuffer)localObject).append("<VERSION_INCREMENTAL name=\"");
    ((StringBuffer)localObject).append(Build.VERSION.INCREMENTAL);
    ((StringBuffer)localObject).append("\">");
    ((StringBuffer)localObject).append("<DISPLAY name=\"");
    ((StringBuffer)localObject).append(Build.DISPLAY);
    ((StringBuffer)localObject).append("\">");
    ((StringBuffer)localObject).append("</DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ServerConfigInfoStorage", "getFingerprint  " + ((StringBuffer)localObject).toString());
    localObject = ((StringBuffer)localObject).toString();
    GMTrace.o(13537468481536L, 100862);
    return (String)localObject;
  }
  
  public final int Uz(String paramString)
  {
    GMTrace.i(13537200046080L, 100860);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ServerConfigInfoStorage", "dkconf info:[%s] ", new Object[] { paramString });
    this.vCg.set(77825, paramString);
    UB(paramString);
    super.SS(paramString);
    GMTrace.o(13537200046080L, 100860);
    return 0;
  }
  
  public final void bUp()
  {
    GMTrace.i(13536931610624L, 100858);
    Object localObject = (String)this.vCg.get(77825, null);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ServerConfigInfoStorage", "hy: readConfig xml " + (String)localObject);
    if (!bg.nm((String)localObject)) {
      super.SS((String)localObject);
    }
    int i;
    if (!bg.nm((String)localObject))
    {
      i = 1;
      if (i != 0) {
        break label208;
      }
      localObject = w.ghv + "deviceconfig.cfg";
      if (com.tencent.mm.a.e.aZ((String)localObject)) {
        break label136;
      }
      i = -1;
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ServerConfigInfoStorage", "hy: read from local retcode: %d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(13536931610624L, 100858);
      return;
      i = 0;
      break;
      label136:
      localObject = com.tencent.mm.a.e.d((String)localObject, 0, -1);
      if (bg.bq((byte[])localObject))
      {
        i = -2;
      }
      else
      {
        localObject = new String((byte[])localObject, Charset.defaultCharset());
        if (bg.nm((String)localObject))
        {
          i = -3;
        }
        else
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ServerConfigInfoStorage", "hy: read from file: %s", new Object[] { localObject });
          Uz((String)localObject);
          i = 0;
          continue;
          label208:
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ServerConfigInfoStorage", "hy: got conf from db");
          i = 0;
        }
      }
    }
  }
  
  public final String bUq()
  {
    GMTrace.i(13537065828352L, 100859);
    String str = (String)this.vCg.get(77825, null);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ServerConfigInfoStorage", "getInfoByKey xml " + str + " key 77825");
    GMTrace.o(13537065828352L, 100859);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
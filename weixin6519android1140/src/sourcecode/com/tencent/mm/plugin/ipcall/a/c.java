package com.tencent.mm.plugin.ipcall.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.ipcall.a.g.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  private static c miz;
  public boolean isInit;
  private ArrayList<Integer> miA;
  ArrayList<Integer> miB;
  
  private c()
  {
    GMTrace.i(11609833472000L, 86500);
    this.miA = new ArrayList();
    this.miB = new ArrayList();
    this.isInit = false;
    GMTrace.o(11609833472000L, 86500);
  }
  
  private void Ah(String paramString)
  {
    GMTrace.i(11610236125184L, 86503);
    if (bg.nm(paramString))
    {
      GMTrace.o(11610236125184L, 86503);
      return;
    }
    try
    {
      paramString = new JSONObject(paramString).getJSONArray("restriction");
      w.d("MicroMsg.IPCallCountryCodeConfig", "restrictionCountryCode: %d", new Object[] { Integer.valueOf(paramString.length()) });
      this.miB.clear();
      int i = 0;
      while (i < paramString.length())
      {
        int j = paramString.getInt(i);
        this.miB.add(Integer.valueOf(j));
        i += 1;
      }
      GMTrace.o(11610236125184L, 86503);
      return;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.IPCallCountryCodeConfig", paramString, "", new Object[0]);
      w.e("MicroMsg.IPCallCountryCodeConfig", "initConfigFromContent error: %s", new Object[] { paramString.getMessage() });
      GMTrace.o(11610236125184L, 86503);
    }
  }
  
  public static c aIa()
  {
    GMTrace.i(11609967689728L, 86501);
    if (miz == null) {
      miz = new c();
    }
    c localc = miz;
    GMTrace.o(11609967689728L, 86501);
    return localc;
  }
  
  private void aIb()
  {
    GMTrace.i(11610370342912L, 86504);
    this.miA.clear();
    Object localObject = g.ut().getValue("WeChatOutTopCountryCode");
    w.d("MicroMsg.IPCallCountryCodeConfig", "popularCountryConfig: %s", new Object[] { localObject });
    if (!bg.nm((String)localObject))
    {
      localObject = ((String)localObject).trim().split(",");
      int j = localObject.length;
      try
      {
        int k = localObject.length;
        int i = 0;
        while (i < k)
        {
          Integer localInteger = Integer.valueOf(bg.getInt(localObject[i], 0));
          this.miA.add(localInteger);
          i.aIw().w(localInteger.intValue(), j);
          j -= 1;
          i += 1;
        }
        GMTrace.o(11610370342912L, 86504);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        w.e("MicroMsg.IPCallCountryCodeConfig", "initPopularCountryFromDynamicConfig error: %s", new Object[] { localNumberFormatException.getMessage() });
      }
    }
    GMTrace.o(11610370342912L, 86504);
  }
  
  public final void aIc()
  {
    GMTrace.i(11610504560640L, 86505);
    Object localObject1 = i.aIw();
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" ORDER BY IPCallPopularCountry.callTimeCount DESC,IPCallPopularCountry.lastCallTime DESC");
    localObject1 = ((j)localObject1).fTZ.a("SELECT IPCallPopularCountry.countryCode,IPCallPopularCountry.callTimeCount,IPCallPopularCountry.lastCallTime FROM IPCallPopularCountry  " + ((StringBuilder)localObject2).toString(), null, 2);
    if ((localObject1 != null) && (((Cursor)localObject1).moveToFirst()))
    {
      new ArrayList();
      do
      {
        localObject2 = new com.tencent.mm.plugin.ipcall.a.g.i();
        ((com.tencent.mm.plugin.ipcall.a.g.i)localObject2).b((Cursor)localObject1);
        localArrayList.add(Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.g.i)localObject2).field_countryCode));
      } while (((Cursor)localObject1).moveToNext());
    }
    if (localObject1 != null) {
      ((Cursor)localObject1).close();
    }
    if (localArrayList.size() > 0)
    {
      this.miA = localArrayList;
      GMTrace.o(11610504560640L, 86505);
      return;
    }
    aIb();
    GMTrace.o(11610504560640L, 86505);
  }
  
  public final List<Integer> aId()
  {
    GMTrace.i(11610638778368L, 86506);
    if (!this.isInit) {
      fg(false);
    }
    ArrayList localArrayList = this.miA;
    GMTrace.o(11610638778368L, 86506);
    return localArrayList;
  }
  
  /* Error */
  public final void fg(boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: ldc2_w 240
    //   8: ldc -14
    //   10: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: aload_0
    //   14: getfield 34	com/tencent/mm/plugin/ipcall/a/c:isInit	Z
    //   17: ifeq +16 -> 33
    //   20: iload_1
    //   21: ifne +12 -> 33
    //   24: ldc2_w 240
    //   27: ldc -14
    //   29: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   32: return
    //   33: aload_0
    //   34: invokevirtual 244	com/tencent/mm/plugin/ipcall/a/c:aIc	()V
    //   37: new 177	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 178	java/lang/StringBuilder:<init>	()V
    //   44: getstatic 250	com/tencent/mm/compatible/util/e:ghv	Ljava/lang/String;
    //   47: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: ldc -4
    //   52: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 5
    //   60: aload_3
    //   61: astore_2
    //   62: new 254	java/io/File
    //   65: dup
    //   66: aload 5
    //   68: invokespecial 255	java/io/File:<init>	(Ljava/lang/String;)V
    //   71: astore 6
    //   73: aload_3
    //   74: astore_2
    //   75: aload 6
    //   77: invokevirtual 258	java/io/File:exists	()Z
    //   80: ifne +42 -> 122
    //   83: aload_3
    //   84: astore_2
    //   85: ldc 63
    //   87: ldc_w 260
    //   90: iconst_1
    //   91: anewarray 4	java/lang/Object
    //   94: dup
    //   95: iconst_0
    //   96: aload 5
    //   98: aastore
    //   99: invokestatic 83	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   102: aload_3
    //   103: astore_2
    //   104: aload_0
    //   105: iconst_1
    //   106: putfield 34	com/tencent/mm/plugin/ipcall/a/c:isInit	Z
    //   109: aconst_null
    //   110: invokestatic 265	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   113: ldc2_w 240
    //   116: ldc -14
    //   118: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   121: return
    //   122: aload_3
    //   123: astore_2
    //   124: new 267	java/io/FileInputStream
    //   127: dup
    //   128: aload 6
    //   130: invokespecial 270	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   133: astore_3
    //   134: new 272	java/io/BufferedReader
    //   137: dup
    //   138: new 274	java/io/InputStreamReader
    //   141: dup
    //   142: aload_3
    //   143: invokespecial 276	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   146: invokespecial 279	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   149: astore 4
    //   151: ldc 96
    //   153: astore_2
    //   154: aload 4
    //   156: invokevirtual 282	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   159: astore 5
    //   161: aload 5
    //   163: ifnull +26 -> 189
    //   166: new 177	java/lang/StringBuilder
    //   169: dup
    //   170: invokespecial 178	java/lang/StringBuilder:<init>	()V
    //   173: aload_2
    //   174: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: aload 5
    //   179: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   185: astore_2
    //   186: goto -32 -> 154
    //   189: ldc 63
    //   191: ldc_w 284
    //   194: iconst_1
    //   195: anewarray 4	java/lang/Object
    //   198: dup
    //   199: iconst_0
    //   200: aload_2
    //   201: aastore
    //   202: invokestatic 83	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: aload_0
    //   206: aload_2
    //   207: invokespecial 286	com/tencent/mm/plugin/ipcall/a/c:Ah	(Ljava/lang/String;)V
    //   210: aload_0
    //   211: iconst_1
    //   212: putfield 34	com/tencent/mm/plugin/ipcall/a/c:isInit	Z
    //   215: aload_3
    //   216: invokestatic 265	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   219: ldc2_w 240
    //   222: ldc -14
    //   224: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   227: return
    //   228: astore_2
    //   229: aload 4
    //   231: astore_3
    //   232: aload_2
    //   233: astore 4
    //   235: aload_3
    //   236: astore_2
    //   237: ldc 63
    //   239: aload 4
    //   241: ldc 96
    //   243: iconst_0
    //   244: anewarray 4	java/lang/Object
    //   247: invokestatic 100	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: aload_3
    //   251: astore_2
    //   252: ldc 63
    //   254: ldc_w 288
    //   257: iconst_1
    //   258: anewarray 4	java/lang/Object
    //   261: dup
    //   262: iconst_0
    //   263: aload 4
    //   265: invokevirtual 106	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   268: aastore
    //   269: invokestatic 109	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   272: aload_3
    //   273: invokestatic 265	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   276: ldc2_w 240
    //   279: ldc -14
    //   281: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   284: return
    //   285: astore 4
    //   287: aload_2
    //   288: astore_3
    //   289: aload 4
    //   291: astore_2
    //   292: aload_3
    //   293: invokestatic 265	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   296: aload_2
    //   297: athrow
    //   298: astore_2
    //   299: goto -7 -> 292
    //   302: astore 4
    //   304: goto -69 -> 235
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	307	0	this	c
    //   0	307	1	paramBoolean	boolean
    //   61	146	2	localObject1	Object
    //   228	5	2	localException1	Exception
    //   236	61	2	localObject2	Object
    //   298	1	2	localObject3	Object
    //   1	292	3	localObject4	Object
    //   3	261	4	localObject5	Object
    //   285	5	4	localObject6	Object
    //   302	1	4	localException2	Exception
    //   58	120	5	str	String
    //   71	58	6	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   62	73	228	java/lang/Exception
    //   75	83	228	java/lang/Exception
    //   85	102	228	java/lang/Exception
    //   104	109	228	java/lang/Exception
    //   124	134	228	java/lang/Exception
    //   62	73	285	finally
    //   75	83	285	finally
    //   85	102	285	finally
    //   104	109	285	finally
    //   124	134	285	finally
    //   237	250	285	finally
    //   252	272	285	finally
    //   134	151	298	finally
    //   154	161	298	finally
    //   166	186	298	finally
    //   189	215	298	finally
    //   134	151	302	java/lang/Exception
    //   154	161	302	java/lang/Exception
    //   166	186	302	java/lang/Exception
    //   189	215	302	java/lang/Exception
  }
  
  public final boolean pk(int paramInt)
  {
    GMTrace.i(11610772996096L, 86507);
    if (!this.isInit) {
      fg(false);
    }
    if ((this.miB == null) || (this.miB.size() <= 0))
    {
      GMTrace.o(11610772996096L, 86507);
      return false;
    }
    boolean bool = this.miB.contains(Integer.valueOf(paramInt));
    GMTrace.o(11610772996096L, 86507);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.c;
import com.tencent.mm.a.g;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public final class q
{
  private static boolean a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    GMTrace.i(13095489503232L, 97569);
    if (128000 < paramInt2 + 4)
    {
      GMTrace.o(13095489503232L, 97569);
      return false;
    }
    paramArrayOfByte[paramInt2] = ((byte)(paramInt1 >> 24 & 0xFF));
    paramArrayOfByte[(paramInt2 + 1)] = ((byte)(paramInt1 >> 16 & 0xFF));
    paramArrayOfByte[(paramInt2 + 2)] = ((byte)(paramInt1 >> 8 & 0xFF));
    paramArrayOfByte[(paramInt2 + 3)] = ((byte)(paramInt1 & 0xFF));
    GMTrace.o(13095489503232L, 97569);
    return true;
  }
  
  /* Error */
  public static boolean a(String paramString1, String paramString2, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 26
    //   3: ldc 28
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 34	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   12: ifne +10 -> 22
    //   15: aload_1
    //   16: invokestatic 34	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   19: ifeq +32 -> 51
    //   22: ldc 36
    //   24: ldc 38
    //   26: iconst_2
    //   27: anewarray 4	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: aload_0
    //   33: aastore
    //   34: dup
    //   35: iconst_1
    //   36: aload_1
    //   37: aastore
    //   38: invokestatic 44	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: ldc2_w 26
    //   44: ldc 28
    //   46: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   49: iconst_0
    //   50: ireturn
    //   51: aload_0
    //   52: invokestatic 50	com/tencent/mm/a/e:aY	(Ljava/lang/String;)I
    //   55: istore 5
    //   57: iload 5
    //   59: ifgt +36 -> 95
    //   62: ldc 36
    //   64: ldc 52
    //   66: iconst_2
    //   67: anewarray 4	java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: aload_0
    //   73: aastore
    //   74: dup
    //   75: iconst_1
    //   76: iload 5
    //   78: invokestatic 58	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   81: aastore
    //   82: invokestatic 44	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: ldc2_w 26
    //   88: ldc 28
    //   90: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   93: iconst_0
    //   94: ireturn
    //   95: iload 5
    //   97: ldc 18
    //   99: if_icmpgt +97 -> 196
    //   102: aload_0
    //   103: iconst_0
    //   104: iconst_m1
    //   105: invokestatic 62	com/tencent/mm/a/e:d	(Ljava/lang/String;II)[B
    //   108: astore 10
    //   110: aload 10
    //   112: aload_0
    //   113: aload_1
    //   114: iload_3
    //   115: invokestatic 65	com/tencent/mm/platformtools/q:a	([BLjava/lang/String;Ljava/lang/String;I)Z
    //   118: istore 9
    //   120: aload 10
    //   122: ifnull +69 -> 191
    //   125: aload 10
    //   127: arraylength
    //   128: istore_3
    //   129: ldc 36
    //   131: ldc 67
    //   133: iconst_3
    //   134: anewarray 4	java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: iload 9
    //   141: invokestatic 72	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   144: aastore
    //   145: dup
    //   146: iconst_1
    //   147: iload_3
    //   148: invokestatic 58	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   151: aastore
    //   152: dup
    //   153: iconst_2
    //   154: aload_0
    //   155: aastore
    //   156: invokestatic 74	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: iload 9
    //   161: ifeq +19 -> 180
    //   164: iload_2
    //   165: ifeq +15 -> 180
    //   168: new 76	java/io/File
    //   171: dup
    //   172: aload_0
    //   173: invokespecial 80	java/io/File:<init>	(Ljava/lang/String;)V
    //   176: invokestatic 84	com/tencent/mm/a/e:f	(Ljava/io/File;)Z
    //   179: pop
    //   180: ldc2_w 26
    //   183: ldc 28
    //   185: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   188: iload 9
    //   190: ireturn
    //   191: iconst_m1
    //   192: istore_3
    //   193: goto -64 -> 129
    //   196: iload 5
    //   198: ldc 85
    //   200: idiv
    //   201: iconst_1
    //   202: iadd
    //   203: istore 6
    //   205: ldc 18
    //   207: newarray <illegal type>
    //   209: astore 12
    //   211: invokestatic 89	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   214: l2i
    //   215: istore 7
    //   217: new 91	java/io/FileInputStream
    //   220: dup
    //   221: aload_0
    //   222: invokespecial 92	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   225: astore 11
    //   227: iconst_0
    //   228: istore 4
    //   230: iload 4
    //   232: iload 6
    //   234: if_icmpge +235 -> 469
    //   237: aload 11
    //   239: astore 10
    //   241: aload 11
    //   243: aload 12
    //   245: bipush 12
    //   247: ldc 85
    //   249: invokevirtual 96	java/io/FileInputStream:read	([BII)I
    //   252: istore 8
    //   254: iload 8
    //   256: ifge +37 -> 293
    //   259: aload 11
    //   261: astore 10
    //   263: ldc 36
    //   265: ldc 98
    //   267: iconst_1
    //   268: anewarray 4	java/lang/Object
    //   271: dup
    //   272: iconst_0
    //   273: aload_0
    //   274: aastore
    //   275: invokestatic 44	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   278: aload 11
    //   280: invokevirtual 102	java/io/FileInputStream:close	()V
    //   283: ldc2_w 26
    //   286: ldc 28
    //   288: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   291: iconst_0
    //   292: ireturn
    //   293: aload 11
    //   295: astore 10
    //   297: iload 7
    //   299: aload 12
    //   301: iconst_0
    //   302: invokestatic 104	com/tencent/mm/platformtools/q:a	(I[BI)Z
    //   305: pop
    //   306: aload 11
    //   308: astore 10
    //   310: iload 4
    //   312: aload 12
    //   314: iconst_4
    //   315: invokestatic 104	com/tencent/mm/platformtools/q:a	(I[BI)Z
    //   318: pop
    //   319: aload 11
    //   321: astore 10
    //   323: iload 8
    //   325: aload 12
    //   327: bipush 8
    //   329: invokestatic 104	com/tencent/mm/platformtools/q:a	(I[BI)Z
    //   332: pop
    //   333: iload 8
    //   335: ldc 85
    //   337: if_icmpge +115 -> 452
    //   340: aload 11
    //   342: astore 10
    //   344: iload 8
    //   346: bipush 12
    //   348: iadd
    //   349: newarray <illegal type>
    //   351: astore 13
    //   353: aload 11
    //   355: astore 10
    //   357: aload 12
    //   359: iconst_0
    //   360: aload 13
    //   362: iconst_0
    //   363: aload 13
    //   365: arraylength
    //   366: invokestatic 110	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   369: aload 11
    //   371: astore 10
    //   373: aload 13
    //   375: aload_0
    //   376: aload_1
    //   377: iload_3
    //   378: invokestatic 65	com/tencent/mm/platformtools/q:a	([BLjava/lang/String;Ljava/lang/String;I)Z
    //   381: istore 9
    //   383: aload 11
    //   385: astore 10
    //   387: ldc 36
    //   389: ldc 112
    //   391: bipush 6
    //   393: anewarray 4	java/lang/Object
    //   396: dup
    //   397: iconst_0
    //   398: iload 4
    //   400: invokestatic 58	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   403: aastore
    //   404: dup
    //   405: iconst_1
    //   406: iload 6
    //   408: invokestatic 58	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   411: aastore
    //   412: dup
    //   413: iconst_2
    //   414: iload 8
    //   416: invokestatic 58	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   419: aastore
    //   420: dup
    //   421: iconst_3
    //   422: iload 9
    //   424: invokestatic 72	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   427: aastore
    //   428: dup
    //   429: iconst_4
    //   430: iload 5
    //   432: invokestatic 58	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   435: aastore
    //   436: dup
    //   437: iconst_5
    //   438: aload_0
    //   439: aastore
    //   440: invokestatic 74	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   443: iload 4
    //   445: iconst_1
    //   446: iadd
    //   447: istore 4
    //   449: goto -219 -> 230
    //   452: aload 11
    //   454: astore 10
    //   456: aload 12
    //   458: aload_0
    //   459: aload_1
    //   460: iload_3
    //   461: invokestatic 65	com/tencent/mm/platformtools/q:a	([BLjava/lang/String;Ljava/lang/String;I)Z
    //   464: istore 9
    //   466: goto -83 -> 383
    //   469: iload_2
    //   470: ifeq +19 -> 489
    //   473: aload 11
    //   475: astore 10
    //   477: new 76	java/io/File
    //   480: dup
    //   481: aload_0
    //   482: invokespecial 80	java/io/File:<init>	(Ljava/lang/String;)V
    //   485: invokestatic 84	com/tencent/mm/a/e:f	(Ljava/io/File;)Z
    //   488: pop
    //   489: aload 11
    //   491: invokevirtual 102	java/io/FileInputStream:close	()V
    //   494: ldc2_w 26
    //   497: ldc 28
    //   499: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   502: iconst_1
    //   503: ireturn
    //   504: astore 12
    //   506: aconst_null
    //   507: astore_1
    //   508: aload_1
    //   509: astore 10
    //   511: ldc 36
    //   513: ldc 114
    //   515: iconst_1
    //   516: anewarray 4	java/lang/Object
    //   519: dup
    //   520: iconst_0
    //   521: aload 12
    //   523: invokestatic 117	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   526: aastore
    //   527: invokestatic 44	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   530: aload_1
    //   531: astore 10
    //   533: ldc 36
    //   535: ldc 119
    //   537: iconst_1
    //   538: anewarray 4	java/lang/Object
    //   541: dup
    //   542: iconst_0
    //   543: aload_0
    //   544: aastore
    //   545: invokestatic 44	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   548: aload_1
    //   549: ifnull +7 -> 556
    //   552: aload_1
    //   553: invokevirtual 102	java/io/FileInputStream:close	()V
    //   556: ldc2_w 26
    //   559: ldc 28
    //   561: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   564: iconst_0
    //   565: ireturn
    //   566: astore_0
    //   567: aconst_null
    //   568: astore 10
    //   570: aload 10
    //   572: ifnull +8 -> 580
    //   575: aload 10
    //   577: invokevirtual 102	java/io/FileInputStream:close	()V
    //   580: aload_0
    //   581: athrow
    //   582: astore_0
    //   583: goto -300 -> 283
    //   586: astore_0
    //   587: goto -93 -> 494
    //   590: astore_0
    //   591: goto -35 -> 556
    //   594: astore_1
    //   595: goto -15 -> 580
    //   598: astore_0
    //   599: goto -29 -> 570
    //   602: astore 12
    //   604: aload 11
    //   606: astore_1
    //   607: goto -99 -> 508
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	610	0	paramString1	String
    //   0	610	1	paramString2	String
    //   0	610	2	paramBoolean	boolean
    //   0	610	3	paramInt	int
    //   228	220	4	i	int
    //   55	376	5	j	int
    //   203	204	6	k	int
    //   215	83	7	m	int
    //   252	163	8	n	int
    //   118	347	9	bool	boolean
    //   108	468	10	localObject	Object
    //   225	380	11	localFileInputStream	java.io.FileInputStream
    //   209	248	12	arrayOfByte1	byte[]
    //   504	18	12	localException1	Exception
    //   602	1	12	localException2	Exception
    //   351	23	13	arrayOfByte2	byte[]
    // Exception table:
    //   from	to	target	type
    //   217	227	504	java/lang/Exception
    //   217	227	566	finally
    //   278	283	582	java/lang/Exception
    //   489	494	586	java/lang/Exception
    //   552	556	590	java/lang/Exception
    //   575	580	594	java/lang/Exception
    //   241	254	598	finally
    //   263	278	598	finally
    //   297	306	598	finally
    //   310	319	598	finally
    //   323	333	598	finally
    //   344	353	598	finally
    //   357	369	598	finally
    //   373	383	598	finally
    //   387	443	598	finally
    //   456	466	598	finally
    //   477	489	598	finally
    //   511	530	598	finally
    //   533	548	598	finally
    //   241	254	602	java/lang/Exception
    //   263	278	602	java/lang/Exception
    //   297	306	602	java/lang/Exception
    //   310	319	602	java/lang/Exception
    //   323	333	602	java/lang/Exception
    //   344	353	602	java/lang/Exception
    //   357	369	602	java/lang/Exception
    //   373	383	602	java/lang/Exception
    //   387	443	602	java/lang/Exception
    //   456	466	602	java/lang/Exception
    //   477	489	602	java/lang/Exception
  }
  
  public static boolean a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13095221067776L, 97567);
    paramBoolean1 = a(paramString1, paramString2, paramBoolean1, paramBoolean2, 1, 20003);
    GMTrace.o(13095221067776L, 97567);
    return paramBoolean1;
  }
  
  public static boolean a(String paramString1, final String paramString2, final boolean paramBoolean1, boolean paramBoolean2, int paramInt1, final int paramInt2)
  {
    GMTrace.i(13095086850048L, 97566);
    if (paramBoolean2)
    {
      e.b(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13094952632320L, 97565);
          q.a(this.hju, paramString2, paramBoolean1, paramInt2);
          GMTrace.o(13094952632320L, 97565);
        }
      }, "StackReportUploader_uploadFileDirect", paramInt1);
      GMTrace.o(13095086850048L, 97566);
      return true;
    }
    paramBoolean1 = a(paramString1, paramString2, paramBoolean1, paramInt2);
    GMTrace.o(13095086850048L, 97566);
    return paramBoolean1;
  }
  
  private static boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(13095623720960L, 97570);
    if (bg.bq(paramArrayOfByte))
    {
      w.e("MicroMsg.StackReportUploader", "read file failed:%s", new Object[] { paramString1 });
      GMTrace.o(13095623720960L, 97570);
      return false;
    }
    if (paramArrayOfByte.length > 128000)
    {
      w.e("MicroMsg.StackReportUploader", "file :%s data len error:%d", new Object[] { paramString1, Integer.valueOf(paramArrayOfByte.length) });
      GMTrace.o(13095623720960L, 97570);
      return false;
    }
    int i = paramArrayOfByte.length;
    String str = g.n(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(d.tJC), Integer.valueOf(i) }).getBytes()).toLowerCase();
    paramArrayOfByte = com.tencent.mm.a.q.l(paramArrayOfByte);
    if (bg.bq(paramArrayOfByte))
    {
      w.e("MicroMsg.StackReportUploader", "zip data failed file:%s", new Object[] { paramString1 });
      GMTrace.o(13095623720960L, 97570);
      return false;
    }
    Object localObject = new PByteArray();
    c.a((PByteArray)localObject, paramArrayOfByte, str.getBytes());
    paramArrayOfByte = ((PByteArray)localObject).value;
    if (bg.bq(paramArrayOfByte)) {
      w.e("MicroMsg.StackReportUploader", "encrypt data failed file:%s", new Object[] { paramString1 });
    }
    paramString1 = ab.getContext().getSharedPreferences("system_config_prefs", 0);
    localObject = "http://" + paramString1.getString("support.weixin.qq.com", "support.weixin.qq.com");
    paramString1 = new StringBuffer();
    paramString1.append((String)localObject + "/cgi-bin/mmsupport-bin/stackreport?version=");
    paramString1.append(Integer.toHexString(d.tJC));
    paramString1.append("&devicetype=");
    paramString1.append(d.DEVICE_TYPE);
    paramString1.append("&filelength=");
    paramString1.append(i);
    paramString1.append("&sum=");
    paramString1.append(str);
    paramString1.append("&reporttype=");
    paramString1.append(paramInt);
    paramString1.append("&reportvalue=");
    paramString1.append(bg.Pv() + ".0.1");
    if ((paramString2 != null) && (!paramString2.equals("")))
    {
      paramString1.append("&username=");
      paramString1.append(paramString2);
    }
    paramString2 = new DefaultHttpClient();
    paramString1 = new HttpPost(paramString1.toString());
    try
    {
      paramArrayOfByte = new ByteArrayEntity(paramArrayOfByte);
      paramArrayOfByte.setContentType("binary/octet-stream");
      paramString1.setEntity(paramArrayOfByte);
      paramArrayOfByte = paramString2.execute(paramString1);
      if ((paramArrayOfByte == null) || (paramArrayOfByte.getStatusLine() == null))
      {
        w.e("MicroMsg.StackReportUploader", "execute http failed resp null");
        GMTrace.o(13095623720960L, 97570);
        return false;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("MicroMsg.StackReportUploader", "exception:%s", new Object[] { bg.f(paramArrayOfByte) });
      w.d("MicroMsg.StackReportUploader", "execute post failed msg:%s", new Object[] { paramArrayOfByte.getMessage() });
      GMTrace.o(13095623720960L, 97570);
      return false;
    }
    if (paramArrayOfByte.getStatusLine().getStatusCode() != 200)
    {
      w.e("MicroMsg.StackReportUploader", "error response code:%d ", new Object[] { Integer.valueOf(paramArrayOfByte.getStatusLine().getStatusCode()) });
      GMTrace.o(13095623720960L, 97570);
      return false;
    }
    GMTrace.o(13095623720960L, 97570);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
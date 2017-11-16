package com.tencent.mm.plugin.backup.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.backup.a.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class d
  extends a
{
  private static String END;
  private static String iZO;
  private static String iZP;
  private static String iZQ;
  private static String iZR;
  private static String iZS;
  private static d iZT;
  private Map<String, a> iZU;
  
  static
  {
    GMTrace.i(14815892340736L, 110387);
    iZO = "icon_";
    END = "img";
    iZP = "iphone";
    iZQ = "android";
    iZR = "s60v3";
    iZS = "s60v5";
    GMTrace.o(14815892340736L, 110387);
  }
  
  public d()
  {
    GMTrace.i(14815623905280L, 110385);
    this.iZU = null;
    aff();
    GMTrace.o(14815623905280L, 110385);
  }
  
  /* Error */
  private void aff()
  {
    // Byte code:
    //   0: ldc2_w 74
    //   3: ldc 76
    //   5: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: new 78	java/util/HashMap
    //   12: dup
    //   13: invokespecial 79	java/util/HashMap:<init>	()V
    //   16: putfield 66	com/tencent/mm/plugin/backup/e/d:iZU	Ljava/util/Map;
    //   19: invokestatic 85	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   22: invokevirtual 91	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   25: astore_3
    //   26: aload_3
    //   27: ldc 93
    //   29: invokevirtual 99	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   32: astore_3
    //   33: new 101	java/io/BufferedReader
    //   36: dup
    //   37: new 103	java/io/InputStreamReader
    //   40: dup
    //   41: aload_3
    //   42: ldc 105
    //   44: invokespecial 108	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   47: invokespecial 111	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   50: astore 4
    //   52: iconst_0
    //   53: istore_1
    //   54: aload 4
    //   56: astore 5
    //   58: aload_3
    //   59: astore 6
    //   61: aload 4
    //   63: invokevirtual 115	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   66: astore 7
    //   68: aload 7
    //   70: ifnull +427 -> 497
    //   73: aload 4
    //   75: astore 5
    //   77: aload_3
    //   78: astore 6
    //   80: aload 7
    //   82: getstatic 34	com/tencent/mm/plugin/backup/e/d:iZO	Ljava/lang/String;
    //   85: invokevirtual 121	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   88: ifeq -34 -> 54
    //   91: aload 4
    //   93: astore 5
    //   95: aload_3
    //   96: astore 6
    //   98: new 6	com/tencent/mm/plugin/backup/e/d$a
    //   101: dup
    //   102: invokespecial 122	com/tencent/mm/plugin/backup/e/d$a:<init>	()V
    //   105: astore 7
    //   107: aload 4
    //   109: astore 5
    //   111: aload_3
    //   112: astore 6
    //   114: aload 4
    //   116: invokevirtual 115	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   119: astore 8
    //   121: aload 8
    //   123: ifnull +335 -> 458
    //   126: aload 4
    //   128: astore 5
    //   130: aload_3
    //   131: astore 6
    //   133: aload 8
    //   135: getstatic 38	com/tencent/mm/plugin/backup/e/d:END	Ljava/lang/String;
    //   138: invokevirtual 121	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   141: ifne +317 -> 458
    //   144: aload 4
    //   146: astore 5
    //   148: aload_3
    //   149: astore 6
    //   151: aload 8
    //   153: ldc 124
    //   155: invokevirtual 128	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   158: istore_2
    //   159: aload 4
    //   161: astore 5
    //   163: aload_3
    //   164: astore 6
    //   166: iload_2
    //   167: iconst_1
    //   168: iadd
    //   169: aload 8
    //   171: invokevirtual 132	java/lang/String:length	()I
    //   174: if_icmpge +284 -> 458
    //   177: aload 4
    //   179: astore 5
    //   181: aload_3
    //   182: astore 6
    //   184: aload 8
    //   186: iload_2
    //   187: iconst_1
    //   188: iadd
    //   189: invokevirtual 136	java/lang/String:substring	(I)Ljava/lang/String;
    //   192: astore 9
    //   194: aload 4
    //   196: astore 5
    //   198: aload_3
    //   199: astore 6
    //   201: aload 8
    //   203: getstatic 42	com/tencent/mm/plugin/backup/e/d:iZP	Ljava/lang/String;
    //   206: invokevirtual 140	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   209: ifeq +118 -> 327
    //   212: aload 4
    //   214: astore 5
    //   216: aload_3
    //   217: astore 6
    //   219: aload 7
    //   221: aload 9
    //   223: putfield 143	com/tencent/mm/plugin/backup/e/d$a:iZW	Ljava/lang/String;
    //   226: aload 4
    //   228: astore 5
    //   230: aload_3
    //   231: astore 6
    //   233: aload_0
    //   234: getfield 66	com/tencent/mm/plugin/backup/e/d:iZU	Ljava/util/Map;
    //   237: aload 7
    //   239: getfield 146	com/tencent/mm/plugin/backup/e/d$a:iZV	Ljava/lang/String;
    //   242: aload 7
    //   244: invokeinterface 152 3 0
    //   249: pop
    //   250: goto -143 -> 107
    //   253: astore 7
    //   255: aload 4
    //   257: astore 5
    //   259: aload_3
    //   260: astore 6
    //   262: ldc -102
    //   264: aload 7
    //   266: ldc -100
    //   268: iconst_0
    //   269: anewarray 158	java/lang/Object
    //   272: invokestatic 164	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   275: aload 4
    //   277: ifnull +8 -> 285
    //   280: aload 4
    //   282: invokevirtual 167	java/io/BufferedReader:close	()V
    //   285: iload_1
    //   286: istore_2
    //   287: aload_3
    //   288: ifnull +9 -> 297
    //   291: aload_3
    //   292: invokevirtual 170	java/io/InputStream:close	()V
    //   295: iload_1
    //   296: istore_2
    //   297: ldc -102
    //   299: new 172	java/lang/StringBuilder
    //   302: dup
    //   303: ldc -82
    //   305: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   308: iload_2
    //   309: invokevirtual 181	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   312: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   315: invokestatic 188	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   318: ldc2_w 74
    //   321: ldc 76
    //   323: invokestatic 57	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   326: return
    //   327: aload 4
    //   329: astore 5
    //   331: aload_3
    //   332: astore 6
    //   334: aload 8
    //   336: getstatic 46	com/tencent/mm/plugin/backup/e/d:iZQ	Ljava/lang/String;
    //   339: invokevirtual 140	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   342: ifeq +46 -> 388
    //   345: aload 4
    //   347: astore 5
    //   349: aload_3
    //   350: astore 6
    //   352: aload 7
    //   354: aload 9
    //   356: putfield 146	com/tencent/mm/plugin/backup/e/d$a:iZV	Ljava/lang/String;
    //   359: goto -133 -> 226
    //   362: astore 4
    //   364: aload 6
    //   366: astore_3
    //   367: aload 5
    //   369: ifnull +8 -> 377
    //   372: aload 5
    //   374: invokevirtual 167	java/io/BufferedReader:close	()V
    //   377: aload_3
    //   378: ifnull +7 -> 385
    //   381: aload_3
    //   382: invokevirtual 170	java/io/InputStream:close	()V
    //   385: aload 4
    //   387: athrow
    //   388: aload 4
    //   390: astore 5
    //   392: aload_3
    //   393: astore 6
    //   395: aload 8
    //   397: getstatic 50	com/tencent/mm/plugin/backup/e/d:iZR	Ljava/lang/String;
    //   400: invokevirtual 140	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   403: ifeq +20 -> 423
    //   406: aload 4
    //   408: astore 5
    //   410: aload_3
    //   411: astore 6
    //   413: aload 7
    //   415: aload 9
    //   417: putfield 191	com/tencent/mm/plugin/backup/e/d$a:iZX	Ljava/lang/String;
    //   420: goto -194 -> 226
    //   423: aload 4
    //   425: astore 5
    //   427: aload_3
    //   428: astore 6
    //   430: aload 8
    //   432: getstatic 54	com/tencent/mm/plugin/backup/e/d:iZS	Ljava/lang/String;
    //   435: invokevirtual 140	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   438: ifeq -212 -> 226
    //   441: aload 4
    //   443: astore 5
    //   445: aload_3
    //   446: astore 6
    //   448: aload 7
    //   450: aload 9
    //   452: putfield 194	com/tencent/mm/plugin/backup/e/d$a:iZY	Ljava/lang/String;
    //   455: goto -229 -> 226
    //   458: aload 4
    //   460: astore 5
    //   462: aload_3
    //   463: astore 6
    //   465: ldc -102
    //   467: new 172	java/lang/StringBuilder
    //   470: dup
    //   471: ldc -60
    //   473: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   476: aload 7
    //   478: invokevirtual 197	com/tencent/mm/plugin/backup/e/d$a:toString	()Ljava/lang/String;
    //   481: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   487: invokestatic 188	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   490: iload_1
    //   491: iconst_1
    //   492: iadd
    //   493: istore_1
    //   494: goto -440 -> 54
    //   497: aload 4
    //   499: invokevirtual 167	java/io/BufferedReader:close	()V
    //   502: iload_1
    //   503: istore_2
    //   504: aload_3
    //   505: ifnull -208 -> 297
    //   508: aload_3
    //   509: invokevirtual 170	java/io/InputStream:close	()V
    //   512: iload_1
    //   513: istore_2
    //   514: goto -217 -> 297
    //   517: astore_3
    //   518: iload_1
    //   519: istore_2
    //   520: goto -223 -> 297
    //   523: astore_3
    //   524: goto -139 -> 385
    //   527: astore 4
    //   529: aconst_null
    //   530: astore 5
    //   532: aconst_null
    //   533: astore_3
    //   534: goto -167 -> 367
    //   537: astore 4
    //   539: aconst_null
    //   540: astore 5
    //   542: goto -175 -> 367
    //   545: astore_3
    //   546: iload_1
    //   547: istore_2
    //   548: goto -251 -> 297
    //   551: astore 7
    //   553: aconst_null
    //   554: astore 4
    //   556: aconst_null
    //   557: astore_3
    //   558: iconst_0
    //   559: istore_1
    //   560: goto -305 -> 255
    //   563: astore 7
    //   565: aconst_null
    //   566: astore 4
    //   568: iconst_0
    //   569: istore_1
    //   570: goto -315 -> 255
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	573	0	this	d
    //   53	517	1	i	int
    //   158	390	2	j	int
    //   25	484	3	localObject1	Object
    //   517	1	3	localException1	Exception
    //   523	1	3	localException2	Exception
    //   533	1	3	localObject2	Object
    //   545	1	3	localException3	Exception
    //   557	1	3	localObject3	Object
    //   50	296	4	localBufferedReader	java.io.BufferedReader
    //   362	136	4	localObject4	Object
    //   527	1	4	localObject5	Object
    //   537	1	4	localObject6	Object
    //   554	13	4	localObject7	Object
    //   56	485	5	localObject8	Object
    //   59	405	6	localObject9	Object
    //   66	177	7	localObject10	Object
    //   253	224	7	localIOException1	java.io.IOException
    //   551	1	7	localIOException2	java.io.IOException
    //   563	1	7	localIOException3	java.io.IOException
    //   119	312	8	str1	String
    //   192	259	9	str2	String
    // Exception table:
    //   from	to	target	type
    //   61	68	253	java/io/IOException
    //   80	91	253	java/io/IOException
    //   98	107	253	java/io/IOException
    //   114	121	253	java/io/IOException
    //   133	144	253	java/io/IOException
    //   151	159	253	java/io/IOException
    //   166	177	253	java/io/IOException
    //   184	194	253	java/io/IOException
    //   201	212	253	java/io/IOException
    //   219	226	253	java/io/IOException
    //   233	250	253	java/io/IOException
    //   334	345	253	java/io/IOException
    //   352	359	253	java/io/IOException
    //   395	406	253	java/io/IOException
    //   413	420	253	java/io/IOException
    //   430	441	253	java/io/IOException
    //   448	455	253	java/io/IOException
    //   465	490	253	java/io/IOException
    //   61	68	362	finally
    //   80	91	362	finally
    //   98	107	362	finally
    //   114	121	362	finally
    //   133	144	362	finally
    //   151	159	362	finally
    //   166	177	362	finally
    //   184	194	362	finally
    //   201	212	362	finally
    //   219	226	362	finally
    //   233	250	362	finally
    //   262	275	362	finally
    //   334	345	362	finally
    //   352	359	362	finally
    //   395	406	362	finally
    //   413	420	362	finally
    //   430	441	362	finally
    //   448	455	362	finally
    //   465	490	362	finally
    //   497	502	517	java/lang/Exception
    //   508	512	517	java/lang/Exception
    //   372	377	523	java/lang/Exception
    //   381	385	523	java/lang/Exception
    //   26	33	527	finally
    //   33	52	537	finally
    //   280	285	545	java/lang/Exception
    //   291	295	545	java/lang/Exception
    //   26	33	551	java/io/IOException
    //   33	52	563	java/io/IOException
  }
  
  public static a tk(String paramString)
  {
    GMTrace.i(14815221252096L, 110382);
    if (iZT == null) {
      iZT = new d();
    }
    Object localObject = iZT;
    if (((d)localObject).iZU == null) {
      ((d)localObject).aff();
    }
    localObject = ((d)localObject).iZU.values().iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if ((locala.iZW != null) && (locala.iZW.equals(paramString)))
      {
        GMTrace.o(14815221252096L, 110382);
        return locala;
      }
    }
    GMTrace.o(14815221252096L, 110382);
    return null;
  }
  
  public static a tl(String paramString)
  {
    GMTrace.i(14815355469824L, 110383);
    if (iZT == null)
    {
      locald = new d();
      iZT = locald;
      a(locald);
    }
    d locald = iZT;
    if (locald.iZU == null) {
      locald.aff();
    }
    paramString = (a)locald.iZU.get(paramString);
    GMTrace.o(14815355469824L, 110383);
    return paramString;
  }
  
  public final void aec()
  {
    GMTrace.i(14815489687552L, 110384);
    iZT = null;
    GMTrace.o(14815489687552L, 110384);
  }
  
  public static final class a
  {
    public String eDW;
    public String iZV;
    public String iZW;
    public String iZX;
    public String iZY;
    
    public a()
    {
      GMTrace.i(14816563429376L, 110392);
      this.eDW = "";
      this.iZV = "";
      this.iZW = "";
      this.iZX = "";
      this.iZY = "";
      GMTrace.o(14816563429376L, 110392);
    }
    
    public final String toString()
    {
      GMTrace.i(14816697647104L, 110393);
      String str = this.iZV + " " + this.iZW + " " + this.iZX + " " + this.iZY;
      GMTrace.o(14816697647104L, 110393);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
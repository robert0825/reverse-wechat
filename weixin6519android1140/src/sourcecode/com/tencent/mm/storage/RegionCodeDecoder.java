package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class RegionCodeDecoder
{
  private static RegionCodeDecoder vCa;
  public static final String vCb;
  public String vCc;
  private String vCd;
  
  static
  {
    GMTrace.i(13302319022080L, 99110);
    vCa = null;
    vCb = e.ghu + "MicroMsg/regioncode/";
    GMTrace.o(13302319022080L, 99110);
  }
  
  public RegionCodeDecoder()
  {
    GMTrace.i(13300305756160L, 99095);
    this.vCc = "";
    this.vCd = "";
    GMTrace.o(13300305756160L, 99095);
  }
  
  /* Error */
  private static String B(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc2_w 70
    //   5: ldc 72
    //   7: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: new 74	java/io/File
    //   13: dup
    //   14: new 31	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   21: aload_0
    //   22: invokevirtual 77	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   25: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: ldc 79
    //   30: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: invokespecial 82	java/io/File:<init>	(Ljava/lang/String;)V
    //   39: astore 4
    //   41: aload 4
    //   43: invokevirtual 86	java/io/File:exists	()Z
    //   46: ifeq +102 -> 148
    //   49: new 88	java/io/BufferedReader
    //   52: dup
    //   53: new 90	java/io/FileReader
    //   56: dup
    //   57: aload 4
    //   59: invokespecial 93	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   62: invokespecial 96	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   65: astore_1
    //   66: aload_1
    //   67: astore_0
    //   68: aload_1
    //   69: invokevirtual 99	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   72: astore_2
    //   73: aload_2
    //   74: astore_0
    //   75: aload_1
    //   76: invokevirtual 102	java/io/BufferedReader:close	()V
    //   79: ldc2_w 70
    //   82: ldc 72
    //   84: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   87: aload_0
    //   88: areturn
    //   89: astore_2
    //   90: aconst_null
    //   91: astore_1
    //   92: aload_1
    //   93: astore_0
    //   94: ldc 104
    //   96: aload_2
    //   97: ldc 106
    //   99: iconst_1
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload 4
    //   107: invokevirtual 109	java/io/File:getName	()Ljava/lang/String;
    //   110: aastore
    //   111: invokestatic 115	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   114: aload_3
    //   115: astore_0
    //   116: aload_1
    //   117: ifnull -38 -> 79
    //   120: aload_1
    //   121: invokevirtual 102	java/io/BufferedReader:close	()V
    //   124: aload_3
    //   125: astore_0
    //   126: goto -47 -> 79
    //   129: astore_0
    //   130: aload_3
    //   131: astore_0
    //   132: goto -53 -> 79
    //   135: astore_1
    //   136: aconst_null
    //   137: astore_0
    //   138: aload_0
    //   139: ifnull +7 -> 146
    //   142: aload_0
    //   143: invokevirtual 102	java/io/BufferedReader:close	()V
    //   146: aload_1
    //   147: athrow
    //   148: ldc2_w 70
    //   151: ldc 72
    //   153: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   156: aconst_null
    //   157: areturn
    //   158: astore_1
    //   159: goto -80 -> 79
    //   162: astore_0
    //   163: goto -17 -> 146
    //   166: astore_1
    //   167: goto -29 -> 138
    //   170: astore_2
    //   171: goto -79 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	paramFile	File
    //   65	56	1	localBufferedReader	java.io.BufferedReader
    //   135	12	1	localObject1	Object
    //   158	1	1	localThrowable1	Throwable
    //   166	1	1	localObject2	Object
    //   72	2	2	str	String
    //   89	8	2	localThrowable2	Throwable
    //   170	1	2	localThrowable3	Throwable
    //   1	130	3	localObject3	Object
    //   39	67	4	localFile	File
    // Exception table:
    //   from	to	target	type
    //   49	66	89	java/lang/Throwable
    //   120	124	129	java/lang/Throwable
    //   49	66	135	finally
    //   75	79	158	java/lang/Throwable
    //   142	146	162	java/lang/Throwable
    //   68	73	166	finally
    //   94	114	166	finally
    //   68	73	170	java/lang/Throwable
  }
  
  private static String C(File paramFile)
  {
    GMTrace.i(17534740856832L, 130644);
    String str = g.h(paramFile);
    if (bg.nm(str))
    {
      w.e("MicroMsg.RegionCodeDecoder", "Failed to calculate hash for file %s", new Object[] { paramFile.getName() });
      GMTrace.o(17534740856832L, 130644);
      return null;
    }
    paramFile = aa.RP(str + "#" + paramFile.lastModified() + "#" + p.sZ());
    GMTrace.o(17534740856832L, 130644);
    return paramFile;
  }
  
  /* Error */
  private void D(File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc2_w 160
    //   7: ldc -94
    //   9: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aconst_null
    //   13: astore 4
    //   15: aload_1
    //   16: invokevirtual 86	java/io/File:exists	()Z
    //   19: ifeq +9 -> 28
    //   22: aload_1
    //   23: invokevirtual 166	java/io/File:list	()[Ljava/lang/String;
    //   26: astore 4
    //   28: aload_1
    //   29: invokevirtual 86	java/io/File:exists	()Z
    //   32: ifeq +25 -> 57
    //   35: aload 4
    //   37: ifnull +20 -> 57
    //   40: aload 4
    //   42: arraylength
    //   43: ifeq +14 -> 57
    //   46: ldc2_w 160
    //   49: ldc -94
    //   51: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   54: aload_0
    //   55: monitorexit
    //   56: return
    //   57: invokestatic 172	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   60: invokevirtual 178	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   63: ldc -76
    //   65: invokevirtual 185	android/content/res/AssetManager:list	(Ljava/lang/String;)[Ljava/lang/String;
    //   68: astore 4
    //   70: aload 4
    //   72: arraylength
    //   73: istore_3
    //   74: iload_2
    //   75: iload_3
    //   76: if_icmpge +145 -> 221
    //   79: aload 4
    //   81: iload_2
    //   82: aaload
    //   83: astore 5
    //   85: ldc 104
    //   87: ldc -69
    //   89: iconst_2
    //   90: anewarray 4	java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: new 31	java/lang/StringBuilder
    //   98: dup
    //   99: ldc -67
    //   101: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   104: aload 5
    //   106: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: aastore
    //   113: dup
    //   114: iconst_1
    //   115: new 31	java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   122: aload_1
    //   123: invokevirtual 193	java/io/File:getPath	()Ljava/lang/String;
    //   126: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: ldc -61
    //   131: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload 5
    //   136: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: aastore
    //   143: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   146: new 31	java/lang/StringBuilder
    //   149: dup
    //   150: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   153: aload_1
    //   154: invokevirtual 193	java/io/File:getPath	()Ljava/lang/String;
    //   157: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: ldc -61
    //   162: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload 5
    //   167: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: astore 6
    //   175: invokestatic 172	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   178: new 31	java/lang/StringBuilder
    //   181: dup
    //   182: ldc -67
    //   184: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   187: aload 5
    //   189: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: aload 6
    //   197: invokestatic 203	com/tencent/mm/sdk/platformtools/j:z	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    //   200: pop
    //   201: new 74	java/io/File
    //   204: dup
    //   205: aload 6
    //   207: invokespecial 82	java/io/File:<init>	(Ljava/lang/String;)V
    //   210: aload_1
    //   211: invokestatic 206	com/tencent/mm/storage/RegionCodeDecoder:e	(Ljava/io/File;Ljava/io/File;)V
    //   214: iload_2
    //   215: iconst_1
    //   216: iadd
    //   217: istore_2
    //   218: goto -144 -> 74
    //   221: ldc2_w 160
    //   224: ldc -94
    //   226: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   229: goto -175 -> 54
    //   232: astore_1
    //   233: aload_0
    //   234: monitorexit
    //   235: aload_1
    //   236: athrow
    //   237: astore_1
    //   238: ldc 104
    //   240: aload_1
    //   241: ldc 61
    //   243: iconst_0
    //   244: anewarray 4	java/lang/Object
    //   247: invokestatic 115	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: ldc2_w 160
    //   253: ldc -94
    //   255: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   258: goto -204 -> 54
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	261	0	this	RegionCodeDecoder
    //   0	261	1	paramFile	File
    //   1	217	2	i	int
    //   73	4	3	j	int
    //   13	67	4	arrayOfString	String[]
    //   83	105	5	str1	String
    //   173	33	6	str2	String
    // Exception table:
    //   from	to	target	type
    //   4	12	232	finally
    //   15	28	232	finally
    //   28	35	232	finally
    //   40	54	232	finally
    //   57	74	232	finally
    //   85	214	232	finally
    //   221	229	232	finally
    //   238	258	232	finally
    //   57	74	237	java/lang/Exception
    //   85	214	237	java/lang/Exception
  }
  
  public static String Ut(String paramString)
  {
    GMTrace.i(13301111062528L, 99101);
    if ((bg.nm(paramString)) || (!v.RM(paramString)))
    {
      w.e("MicroMsg.RegionCodeDecoder", "unsupported language:" + paramString);
      GMTrace.o(13301111062528L, 99101);
      return null;
    }
    String str = paramString;
    if (paramString.equalsIgnoreCase("zh_HK")) {
      str = "zh_TW";
    }
    paramString = vCb + "mmregioncode_" + str + ".txt";
    GMTrace.o(13301111062528L, 99101);
    return paramString;
  }
  
  public static final boolean Uu(String paramString)
  {
    GMTrace.i(13301245280256L, 99102);
    if (bg.nm(paramString))
    {
      GMTrace.o(13301245280256L, 99102);
      return false;
    }
    boolean bool = paramString.equalsIgnoreCase("cn");
    GMTrace.o(13301245280256L, 99102);
    return bool;
  }
  
  public static final String ai(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(13300976844800L, 99100);
    StringBuffer localStringBuffer = new StringBuffer();
    if (!bg.nm(paramString1))
    {
      localStringBuffer.append(paramString1);
      if (!bg.nm(paramString2))
      {
        localStringBuffer.append('_');
        localStringBuffer.append(paramString2);
        if (!bg.nm(paramString3))
        {
          localStringBuffer.append('_');
          localStringBuffer.append(paramString3);
        }
      }
    }
    paramString1 = localStringBuffer.toString();
    GMTrace.o(13300976844800L, 99100);
    return paramString1;
  }
  
  public static RegionCodeDecoder bUl()
  {
    GMTrace.i(13300439973888L, 99096);
    if (vCa == null) {
      vCa = new RegionCodeDecoder();
    }
    RegionCodeDecoder localRegionCodeDecoder = vCa;
    if (!v.bPK().equals(localRegionCodeDecoder.vCc)) {
      localRegionCodeDecoder.bSn();
    }
    localRegionCodeDecoder = vCa;
    GMTrace.o(13300439973888L, 99096);
    return localRegionCodeDecoder;
  }
  
  /* Error */
  public static void e(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: ldc2_w 271
    //   3: ldc_w 273
    //   6: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 104
    //   11: ldc_w 275
    //   14: iconst_1
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_0
    //   21: invokevirtual 109	java/io/File:getName	()Ljava/lang/String;
    //   24: aastore
    //   25: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   28: new 74	java/io/File
    //   31: dup
    //   32: aload_1
    //   33: new 31	java/lang/StringBuilder
    //   36: dup
    //   37: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   40: aload_0
    //   41: invokevirtual 109	java/io/File:getName	()Ljava/lang/String;
    //   44: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 79
    //   49: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokespecial 278	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   58: astore_1
    //   59: aload_0
    //   60: invokestatic 280	com/tencent/mm/storage/RegionCodeDecoder:C	(Ljava/io/File;)Ljava/lang/String;
    //   63: astore_3
    //   64: aload_3
    //   65: invokestatic 130	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   68: ifne +126 -> 194
    //   71: aload_1
    //   72: invokevirtual 86	java/io/File:exists	()Z
    //   75: ifne +11 -> 86
    //   78: aload_1
    //   79: invokevirtual 284	java/io/File:getParentFile	()Ljava/io/File;
    //   82: invokevirtual 287	java/io/File:mkdirs	()Z
    //   85: pop
    //   86: new 289	java/io/PrintWriter
    //   89: dup
    //   90: aload_1
    //   91: invokespecial 290	java/io/PrintWriter:<init>	(Ljava/io/File;)V
    //   94: astore_2
    //   95: aload_2
    //   96: astore_1
    //   97: aload_2
    //   98: aload_3
    //   99: invokevirtual 293	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   102: aload_2
    //   103: invokevirtual 294	java/io/PrintWriter:close	()V
    //   106: ldc2_w 271
    //   109: ldc_w 273
    //   112: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   115: return
    //   116: astore_0
    //   117: ldc2_w 271
    //   120: ldc_w 273
    //   123: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   126: return
    //   127: astore_3
    //   128: aconst_null
    //   129: astore_2
    //   130: aload_2
    //   131: astore_1
    //   132: ldc 104
    //   134: aload_3
    //   135: ldc_w 296
    //   138: iconst_1
    //   139: anewarray 4	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_0
    //   145: invokevirtual 109	java/io/File:getName	()Ljava/lang/String;
    //   148: aastore
    //   149: invokestatic 115	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: aload_2
    //   153: ifnull +41 -> 194
    //   156: aload_2
    //   157: invokevirtual 294	java/io/PrintWriter:close	()V
    //   160: ldc2_w 271
    //   163: ldc_w 273
    //   166: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   169: return
    //   170: astore_0
    //   171: ldc2_w 271
    //   174: ldc_w 273
    //   177: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   180: return
    //   181: astore_0
    //   182: aconst_null
    //   183: astore_1
    //   184: aload_1
    //   185: ifnull +7 -> 192
    //   188: aload_1
    //   189: invokevirtual 294	java/io/PrintWriter:close	()V
    //   192: aload_0
    //   193: athrow
    //   194: ldc2_w 271
    //   197: ldc_w 273
    //   200: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   203: return
    //   204: astore_1
    //   205: goto -13 -> 192
    //   208: astore_0
    //   209: goto -25 -> 184
    //   212: astore_3
    //   213: goto -83 -> 130
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	paramFile1	File
    //   0	216	1	paramFile2	File
    //   94	63	2	localPrintWriter	java.io.PrintWriter
    //   63	36	3	str	String
    //   127	8	3	localThrowable1	Throwable
    //   212	1	3	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   102	106	116	java/lang/Throwable
    //   86	95	127	java/lang/Throwable
    //   156	160	170	java/lang/Throwable
    //   86	95	181	finally
    //   188	192	204	java/lang/Throwable
    //   97	102	208	finally
    //   132	152	208	finally
    //   97	102	212	java/lang/Throwable
  }
  
  public static String getLocName(String paramString)
  {
    GMTrace.i(13301379497984L, 99103);
    if (bg.nm(paramString))
    {
      GMTrace.o(13301379497984L, 99103);
      return null;
    }
    paramString = DecoderJni.getLocName(paramString);
    GMTrace.o(13301379497984L, 99103);
    return paramString;
  }
  
  public final String Uv(String paramString)
  {
    GMTrace.i(13301513715712L, 99104);
    String str = getLocName(paramString);
    if (bg.nm(str))
    {
      paramString = bg.nl(paramString);
      GMTrace.o(13301513715712L, 99104);
      return paramString;
    }
    GMTrace.o(13301513715712L, 99104);
    return str;
  }
  
  public final Region[] Uw(String paramString)
  {
    GMTrace.i(13302050586624L, 99108);
    if ((bg.nm(this.vCd)) || (bg.nm(paramString)))
    {
      GMTrace.o(13302050586624L, 99108);
      return null;
    }
    paramString = DecoderJni.getProvinces(this.vCd, paramString);
    GMTrace.o(13302050586624L, 99108);
    return paramString;
  }
  
  public final String aj(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(13301782151168L, 99106);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (bg.nm(paramString3))) {}
    for (paramString1 = null; bg.nm(paramString1); paramString1 = getLocName(ai(paramString1, paramString2, paramString3)))
    {
      paramString1 = bg.nl(paramString3);
      GMTrace.o(13301782151168L, 99106);
      return paramString1;
    }
    GMTrace.o(13301782151168L, 99106);
    return paramString1;
  }
  
  public final void bSn()
  {
    GMTrace.i(13300574191616L, 99097);
    Object localObject1 = new File(vCb);
    if (!((File)localObject1).exists())
    {
      ((File)localObject1).mkdir();
      D((File)localObject1);
    }
    Object localObject2 = ((File)localObject1).list();
    if ((localObject2 == null) || (localObject2.length == 0)) {
      D((File)localObject1);
    }
    this.vCc = v.bPK();
    localObject1 = bUm();
    if (bg.nm((String)localObject1))
    {
      w.e("MicroMsg.RegionCodeDecoder", "buildMap error, no codeFile found, curLang: " + this.vCc);
      GMTrace.o(13300574191616L, 99097);
      return;
    }
    localObject2 = vCb + (String)localObject1;
    File localFile1 = new File((String)localObject2);
    localObject1 = B(localFile1);
    boolean bool;
    File localFile2;
    if (bg.nm((String)localObject1))
    {
      bool = false;
      if (bool) {
        break label340;
      }
      if (j.z(ab.getContext(), "regioncode/" + localFile1.getName(), (String)localObject2)) {
        break label287;
      }
      localFile2 = new File(localFile1.getParentFile(), "mmregioncode_en.txt");
      localObject1 = localFile2.getAbsolutePath();
      if (j.z(ab.getContext(), "regioncode/mmregioncode_en.txt", localFile2.getAbsolutePath())) {
        break label289;
      }
      localObject1 = null;
    }
    for (;;)
    {
      if (!bg.nm((String)localObject1)) {
        break label345;
      }
      w.e("MicroMsg.RegionCodeDecoder", "buildMap error, no codeFile found after verify, curLang: " + this.vCc);
      GMTrace.o(13300574191616L, 99097);
      return;
      bool = ((String)localObject1).equals(C(localFile1));
      break;
      label287:
      localObject1 = localObject2;
      label289:
      localFile2 = new File((String)localObject1);
      e(localFile2, localFile2.getParentFile());
      w.w("MicroMsg.RegionCodeDecoder", "Verifying codeFile: %s failed, after fallback, %s will be used.", new Object[] { localFile1.getName(), localFile2.getName() });
      continue;
      label340:
      localObject1 = localObject2;
    }
    label345:
    if ((!bg.nm(this.vCd)) && (this.vCd.equals(localObject2)) && (((String)localObject2).equals(localObject1)))
    {
      GMTrace.o(13300574191616L, 99097);
      return;
    }
    w.w("MicroMsg.RegionCodeDecoder", "buildMap, after verify, codeFile %s is used. curLang: %s", new Object[] { new File((String)localObject1).getName(), this.vCc });
    this.vCd = ((String)localObject1);
    DecoderJni.buildFromFile(this.vCd);
    GMTrace.o(13300574191616L, 99097);
  }
  
  public final String bUm()
  {
    GMTrace.i(13300842627072L, 99099);
    Object localObject = new StringBuilder("mmregioncode_");
    if (this.vCc.equalsIgnoreCase("zh_HK")) {}
    for (String str1 = "zh_TW";; str1 = this.vCc)
    {
      str1 = str1 + ".txt";
      localObject = new File(vCb);
      if (((File)localObject).exists()) {
        break;
      }
      ((File)localObject).mkdir();
      GMTrace.o(13300842627072L, 99099);
      return null;
    }
    localObject = ((File)localObject).list();
    if ((localObject == null) || (localObject.length == 0))
    {
      GMTrace.o(13300842627072L, 99099);
      return null;
    }
    int m = localObject.length;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      String str2 = localObject[i];
      if (str2.equals(str1))
      {
        GMTrace.o(13300842627072L, 99099);
        return str2;
      }
      k = j;
      if (j == 0)
      {
        k = j;
        if (str2.equals("mmregioncode_en.txt")) {
          k = 1;
        }
      }
      i += 1;
    }
    if (j != 0)
    {
      GMTrace.o(13300842627072L, 99099);
      return "mmregioncode_en.txt";
    }
    GMTrace.o(13300842627072L, 99099);
    return null;
  }
  
  public final Region[] bUn()
  {
    GMTrace.i(13301916368896L, 99107);
    if (bg.nm(this.vCd))
    {
      GMTrace.o(13301916368896L, 99107);
      return null;
    }
    Region[] arrayOfRegion = DecoderJni.getCountries(this.vCd);
    GMTrace.o(13301916368896L, 99107);
    return arrayOfRegion;
  }
  
  public final String fg(String paramString1, String paramString2)
  {
    Object localObject2 = null;
    GMTrace.i(13301647933440L, 99105);
    Object localObject1 = localObject2;
    if (!bg.nm(paramString1)) {
      if (!bg.nm(paramString2)) {
        break label55;
      }
    }
    label55:
    for (localObject1 = localObject2; bg.nm((String)localObject1); localObject1 = getLocName(ai(paramString1, paramString2, null)))
    {
      paramString1 = bg.nl(paramString2);
      GMTrace.o(13301647933440L, 99105);
      return paramString1;
    }
    GMTrace.o(13301647933440L, 99105);
    return (String)localObject1;
  }
  
  public final Region[] fh(String paramString1, String paramString2)
  {
    GMTrace.i(13302184804352L, 99109);
    if ((bg.nm(this.vCd)) || (bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(13302184804352L, 99109);
      return null;
    }
    paramString1 = DecoderJni.getCities(this.vCd, paramString1, paramString2);
    GMTrace.o(13302184804352L, 99109);
    return paramString1;
  }
  
  private static class DecoderJni
  {
    private DecoderJni()
    {
      GMTrace.i(13305808683008L, 99136);
      GMTrace.o(13305808683008L, 99136);
    }
    
    public static native void buildFromFile(String paramString);
    
    public static native RegionCodeDecoder.Region[] getCities(String paramString1, String paramString2, String paramString3);
    
    public static native RegionCodeDecoder.Region[] getCountries(String paramString);
    
    public static native String getLocName(String paramString);
    
    public static native RegionCodeDecoder.Region[] getProvinces(String paramString1, String paramString2);
    
    public static native void release();
  }
  
  public static class Region
  {
    private String code;
    private String countryCode;
    private boolean hasChildren;
    private boolean isCity;
    private boolean isCountry;
    private boolean isProvince;
    private String name;
    private Region parent;
    
    public Region()
    {
      GMTrace.i(13311445827584L, 99178);
      this.hasChildren = false;
      this.parent = null;
      this.isCountry = false;
      this.isProvince = false;
      this.isCity = false;
      GMTrace.o(13311445827584L, 99178);
    }
    
    public String getCode()
    {
      GMTrace.i(13311848480768L, 99181);
      String str = this.code;
      GMTrace.o(13311848480768L, 99181);
      return str;
    }
    
    public String getCountryCode()
    {
      GMTrace.i(17535680380928L, 130651);
      String str = this.countryCode;
      GMTrace.o(17535680380928L, 130651);
      return str;
    }
    
    public String getName()
    {
      GMTrace.i(13311580045312L, 99179);
      String str = this.name;
      GMTrace.o(13311580045312L, 99179);
      return str;
    }
    
    public Region getParent()
    {
      GMTrace.i(17535411945472L, 130649);
      Region localRegion = this.parent;
      GMTrace.o(17535411945472L, 130649);
      return localRegion;
    }
    
    public boolean hasChildren()
    {
      GMTrace.i(13312116916224L, 99183);
      boolean bool = this.hasChildren;
      GMTrace.o(13312116916224L, 99183);
      return bool;
    }
    
    public boolean isCity()
    {
      GMTrace.i(17803310530560L, 132645);
      boolean bool = this.isCity;
      GMTrace.o(17803310530560L, 132645);
      return bool;
    }
    
    public boolean isCountry()
    {
      GMTrace.i(17802773659648L, 132641);
      boolean bool = this.isCountry;
      GMTrace.o(17802773659648L, 132641);
      return bool;
    }
    
    public boolean isProvince()
    {
      GMTrace.i(17803042095104L, 132643);
      boolean bool = this.isProvince;
      GMTrace.o(17803042095104L, 132643);
      return bool;
    }
    
    public void setCity(boolean paramBoolean)
    {
      GMTrace.i(17803444748288L, 132646);
      this.isCity = paramBoolean;
      GMTrace.o(17803444748288L, 132646);
    }
    
    public void setCode(String paramString)
    {
      GMTrace.i(13311982698496L, 99182);
      this.code = paramString;
      GMTrace.o(13311982698496L, 99182);
    }
    
    public void setCountry(boolean paramBoolean)
    {
      GMTrace.i(17802907877376L, 132642);
      this.isCountry = paramBoolean;
      GMTrace.o(17802907877376L, 132642);
    }
    
    public void setCountryCode(String paramString)
    {
      GMTrace.i(17535546163200L, 130650);
      this.countryCode = paramString;
      GMTrace.o(17535546163200L, 130650);
    }
    
    public void setHasChildren(boolean paramBoolean)
    {
      GMTrace.i(13312251133952L, 99184);
      this.hasChildren = paramBoolean;
      GMTrace.o(13312251133952L, 99184);
    }
    
    public void setName(String paramString)
    {
      GMTrace.i(13311714263040L, 99180);
      this.name = paramString;
      GMTrace.o(13311714263040L, 99180);
    }
    
    public void setParent(Region paramRegion)
    {
      GMTrace.i(17535277727744L, 130648);
      this.parent = paramRegion;
      GMTrace.o(17535277727744L, 130648);
    }
    
    public void setProvince(boolean paramBoolean)
    {
      GMTrace.i(17803176312832L, 132644);
      this.isProvince = paramBoolean;
      GMTrace.o(17803176312832L, 132644);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\RegionCodeDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
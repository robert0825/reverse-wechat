package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.m;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class e
  implements b
{
  private MMWebView inX;
  private com.tencent.mm.plugin.webview.stub.d rQv;
  private d rQw;
  private int rSr;
  
  public e(MMWebView paramMMWebView, com.tencent.mm.plugin.webview.stub.d paramd, int paramInt, d paramd1)
  {
    GMTrace.i(12256226050048L, 91316);
    this.inX = paramMMWebView;
    this.rQv = paramd;
    this.rSr = paramInt;
    this.rQw = paramd1;
    GMTrace.o(12256226050048L, 91316);
  }
  
  private static Map<String, Integer> B(String[] paramArrayOfString)
  {
    GMTrace.i(12256628703232L, 91319);
    if (paramArrayOfString == null) {}
    for (int i = 0; i == 0; i = paramArrayOfString.length)
    {
      GMTrace.o(12256628703232L, 91319);
      return null;
    }
    HashMap localHashMap = new HashMap();
    int j = 0;
    if (j < i)
    {
      if (localHashMap.keySet().contains(paramArrayOfString[j]))
      {
        int k = ((Integer)localHashMap.get(paramArrayOfString[j])).intValue();
        localHashMap.put(paramArrayOfString[j], Integer.valueOf(k + 1));
      }
      for (;;)
      {
        j += 1;
        break;
        localHashMap.put(paramArrayOfString[j], Integer.valueOf(1));
      }
    }
    GMTrace.o(12256628703232L, 91319);
    return localHashMap;
  }
  
  private String Mx(String paramString)
  {
    GMTrace.i(12256762920960L, 91320);
    if (this.inX == null)
    {
      GMTrace.o(12256762920960L, 91320);
      return null;
    }
    String str1 = this.inX.getUrl();
    try
    {
      String str2 = m.bi(str1 + paramString);
      str2 = com.tencent.mm.compatible.util.e.fSc + str2;
      w.i("MicroMsg.JsApiResultHandler", "generate upload file name, url=%s, tag=%s, fullName=%s", new Object[] { str1, paramString, str2 });
      GMTrace.o(12256762920960L, 91320);
      return str2;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.JsApiResultHandler", "generating temp file name failed, url is " + str1);
      w.printErrStackTrace("MicroMsg.JsApiResultHandler", paramString, "", new Object[0]);
      GMTrace.o(12256762920960L, 91320);
    }
    return null;
  }
  
  /* Error */
  private static boolean ep(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 143
    //   3: ldc -111
    //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 151	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   12: ifne +10 -> 22
    //   15: aload_1
    //   16: invokestatic 151	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   19: ifeq +20 -> 39
    //   22: ldc 116
    //   24: ldc -103
    //   26: invokestatic 156	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: ldc2_w 143
    //   32: ldc -111
    //   34: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   37: iconst_0
    //   38: ireturn
    //   39: new 158	java/io/File
    //   42: dup
    //   43: aload_0
    //   44: invokespecial 159	java/io/File:<init>	(Ljava/lang/String;)V
    //   47: astore_2
    //   48: aload_2
    //   49: invokevirtual 163	java/io/File:exists	()Z
    //   52: ifne +8 -> 60
    //   55: aload_2
    //   56: invokevirtual 166	java/io/File:createNewFile	()Z
    //   59: pop
    //   60: aconst_null
    //   61: astore_2
    //   62: aconst_null
    //   63: astore_3
    //   64: new 168	java/io/BufferedOutputStream
    //   67: dup
    //   68: new 170	java/io/FileOutputStream
    //   71: dup
    //   72: aload_0
    //   73: iconst_1
    //   74: invokespecial 173	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   77: invokespecial 176	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   80: astore 4
    //   82: new 170	java/io/FileOutputStream
    //   85: dup
    //   86: aload_0
    //   87: invokespecial 177	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   90: astore 5
    //   92: aload 5
    //   94: astore_3
    //   95: aload 5
    //   97: astore_2
    //   98: aload 5
    //   100: aload_1
    //   101: invokevirtual 183	java/lang/String:getBytes	()[B
    //   104: invokevirtual 189	java/io/OutputStream:write	([B)V
    //   107: aload 5
    //   109: astore_3
    //   110: aload 5
    //   112: astore_2
    //   113: aload 5
    //   115: bipush 13
    //   117: invokevirtual 192	java/io/OutputStream:write	(I)V
    //   120: aload 5
    //   122: astore_3
    //   123: aload 5
    //   125: astore_2
    //   126: aload 5
    //   128: bipush 10
    //   130: invokevirtual 192	java/io/OutputStream:write	(I)V
    //   133: aload 5
    //   135: astore_3
    //   136: aload 5
    //   138: astore_2
    //   139: aload 5
    //   141: invokevirtual 195	java/io/OutputStream:flush	()V
    //   144: aload 5
    //   146: invokevirtual 198	java/io/OutputStream:close	()V
    //   149: ldc 116
    //   151: new 95	java/lang/StringBuilder
    //   154: dup
    //   155: ldc -56
    //   157: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   160: aload_0
    //   161: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokestatic 203	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: ldc2_w 143
    //   173: ldc -111
    //   175: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   178: iconst_1
    //   179: ireturn
    //   180: astore_1
    //   181: ldc 116
    //   183: new 95	java/lang/StringBuilder
    //   186: dup
    //   187: ldc -51
    //   189: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   192: aload_0
    //   193: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: invokestatic 132	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: ldc 116
    //   204: aload_1
    //   205: ldc -122
    //   207: iconst_0
    //   208: anewarray 4	java/lang/Object
    //   211: invokestatic 138	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: ldc2_w 143
    //   217: ldc -111
    //   219: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   222: iconst_0
    //   223: ireturn
    //   224: astore_1
    //   225: ldc 116
    //   227: aload_1
    //   228: ldc -122
    //   230: iconst_0
    //   231: anewarray 4	java/lang/Object
    //   234: invokestatic 138	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   237: goto -88 -> 149
    //   240: astore_0
    //   241: aload_3
    //   242: astore_2
    //   243: ldc 116
    //   245: aload_0
    //   246: ldc -122
    //   248: iconst_0
    //   249: anewarray 4	java/lang/Object
    //   252: invokestatic 138	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: aload_3
    //   256: astore_2
    //   257: ldc 116
    //   259: ldc -49
    //   261: invokestatic 156	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   264: aload_3
    //   265: ifnull +7 -> 272
    //   268: aload_3
    //   269: invokevirtual 198	java/io/OutputStream:close	()V
    //   272: ldc2_w 143
    //   275: ldc -111
    //   277: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   280: iconst_0
    //   281: ireturn
    //   282: astore_0
    //   283: ldc 116
    //   285: aload_0
    //   286: ldc -122
    //   288: iconst_0
    //   289: anewarray 4	java/lang/Object
    //   292: invokestatic 138	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   295: goto -23 -> 272
    //   298: astore_0
    //   299: aload_2
    //   300: ifnull +7 -> 307
    //   303: aload_2
    //   304: invokevirtual 198	java/io/OutputStream:close	()V
    //   307: aload_0
    //   308: athrow
    //   309: astore_1
    //   310: ldc 116
    //   312: aload_1
    //   313: ldc -122
    //   315: iconst_0
    //   316: anewarray 4	java/lang/Object
    //   319: invokestatic 138	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   322: goto -15 -> 307
    //   325: astore_0
    //   326: aload 4
    //   328: astore_2
    //   329: goto -30 -> 299
    //   332: astore_0
    //   333: aload 4
    //   335: astore_3
    //   336: goto -95 -> 241
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	339	0	paramString1	String
    //   0	339	1	paramString2	String
    //   47	282	2	localObject1	Object
    //   63	273	3	localObject2	Object
    //   80	254	4	localBufferedOutputStream	java.io.BufferedOutputStream
    //   90	55	5	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   55	60	180	java/io/IOException
    //   144	149	224	java/io/IOException
    //   64	82	240	java/lang/Exception
    //   98	107	240	java/lang/Exception
    //   113	120	240	java/lang/Exception
    //   126	133	240	java/lang/Exception
    //   139	144	240	java/lang/Exception
    //   268	272	282	java/io/IOException
    //   64	82	298	finally
    //   98	107	298	finally
    //   113	120	298	finally
    //   126	133	298	finally
    //   139	144	298	finally
    //   243	255	298	finally
    //   257	264	298	finally
    //   303	307	309	java/io/IOException
    //   82	92	325	finally
    //   82	92	332	java/lang/Exception
  }
  
  /* Error */
  private static boolean n(String paramString, Map<String, Integer> paramMap)
  {
    // Byte code:
    //   0: ldc2_w 210
    //   3: ldc -44
    //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 151	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   12: ifne +7 -> 19
    //   15: aload_1
    //   16: ifnonnull +20 -> 36
    //   19: ldc 116
    //   21: ldc -103
    //   23: invokestatic 156	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: ldc2_w 210
    //   29: ldc -44
    //   31: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: iconst_0
    //   35: ireturn
    //   36: new 158	java/io/File
    //   39: dup
    //   40: aload_0
    //   41: invokespecial 159	java/io/File:<init>	(Ljava/lang/String;)V
    //   44: astore_3
    //   45: aload_3
    //   46: invokevirtual 163	java/io/File:exists	()Z
    //   49: ifne +8 -> 57
    //   52: aload_3
    //   53: invokevirtual 166	java/io/File:createNewFile	()Z
    //   56: pop
    //   57: aconst_null
    //   58: astore 4
    //   60: new 168	java/io/BufferedOutputStream
    //   63: dup
    //   64: new 170	java/io/FileOutputStream
    //   67: dup
    //   68: aload_0
    //   69: iconst_1
    //   70: invokespecial 173	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   73: invokespecial 176	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   76: astore_3
    //   77: aload_1
    //   78: invokeinterface 54 1 0
    //   83: invokeinterface 216 1 0
    //   88: astore 4
    //   90: aload 4
    //   92: invokeinterface 221 1 0
    //   97: ifeq +160 -> 257
    //   100: aload 4
    //   102: invokeinterface 225 1 0
    //   107: checkcast 179	java/lang/String
    //   110: astore 5
    //   112: aload_1
    //   113: aload 5
    //   115: invokeinterface 64 2 0
    //   120: checkcast 66	java/lang/Integer
    //   123: invokevirtual 70	java/lang/Integer:intValue	()I
    //   126: istore_2
    //   127: aload_3
    //   128: new 95	java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   135: iload_2
    //   136: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   139: ldc -26
    //   141: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: aload 5
    //   146: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokevirtual 183	java/lang/String:getBytes	()[B
    //   155: invokevirtual 189	java/io/OutputStream:write	([B)V
    //   158: aload_3
    //   159: bipush 13
    //   161: invokevirtual 192	java/io/OutputStream:write	(I)V
    //   164: aload_3
    //   165: bipush 10
    //   167: invokevirtual 192	java/io/OutputStream:write	(I)V
    //   170: goto -80 -> 90
    //   173: astore_1
    //   174: aload_3
    //   175: astore_0
    //   176: ldc 116
    //   178: aload_1
    //   179: ldc -122
    //   181: iconst_0
    //   182: anewarray 4	java/lang/Object
    //   185: invokestatic 138	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: ldc 116
    //   190: ldc -49
    //   192: invokestatic 156	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   195: aload_0
    //   196: ifnull +7 -> 203
    //   199: aload_0
    //   200: invokevirtual 198	java/io/OutputStream:close	()V
    //   203: ldc2_w 210
    //   206: ldc -44
    //   208: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   211: iconst_0
    //   212: ireturn
    //   213: astore_1
    //   214: ldc 116
    //   216: new 95	java/lang/StringBuilder
    //   219: dup
    //   220: ldc -51
    //   222: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   225: aload_0
    //   226: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   232: invokestatic 132	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   235: ldc 116
    //   237: aload_1
    //   238: ldc -122
    //   240: iconst_0
    //   241: anewarray 4	java/lang/Object
    //   244: invokestatic 138	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: ldc2_w 210
    //   250: ldc -44
    //   252: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   255: iconst_0
    //   256: ireturn
    //   257: aload_3
    //   258: invokevirtual 195	java/io/OutputStream:flush	()V
    //   261: aload_3
    //   262: invokevirtual 198	java/io/OutputStream:close	()V
    //   265: ldc 116
    //   267: new 95	java/lang/StringBuilder
    //   270: dup
    //   271: ldc -56
    //   273: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   276: aload_0
    //   277: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   283: invokestatic 203	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   286: ldc2_w 210
    //   289: ldc -44
    //   291: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   294: iconst_1
    //   295: ireturn
    //   296: astore_1
    //   297: ldc 116
    //   299: aload_1
    //   300: ldc -122
    //   302: iconst_0
    //   303: anewarray 4	java/lang/Object
    //   306: invokestatic 138	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   309: goto -44 -> 265
    //   312: astore_0
    //   313: ldc 116
    //   315: aload_0
    //   316: ldc -122
    //   318: iconst_0
    //   319: anewarray 4	java/lang/Object
    //   322: invokestatic 138	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   325: goto -122 -> 203
    //   328: astore_0
    //   329: aconst_null
    //   330: astore_1
    //   331: aload_1
    //   332: ifnull +7 -> 339
    //   335: aload_1
    //   336: invokevirtual 198	java/io/OutputStream:close	()V
    //   339: aload_0
    //   340: athrow
    //   341: astore_1
    //   342: ldc 116
    //   344: aload_1
    //   345: ldc -122
    //   347: iconst_0
    //   348: anewarray 4	java/lang/Object
    //   351: invokestatic 138	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   354: goto -15 -> 339
    //   357: astore_0
    //   358: aload_3
    //   359: astore_1
    //   360: goto -29 -> 331
    //   363: astore_3
    //   364: aload_0
    //   365: astore_1
    //   366: aload_3
    //   367: astore_0
    //   368: goto -37 -> 331
    //   371: astore_1
    //   372: aload 4
    //   374: astore_0
    //   375: goto -199 -> 176
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	378	0	paramString	String
    //   0	378	1	paramMap	Map<String, Integer>
    //   126	10	2	i	int
    //   44	315	3	localObject1	Object
    //   363	4	3	localObject2	Object
    //   58	315	4	localIterator	java.util.Iterator
    //   110	35	5	str	String
    // Exception table:
    //   from	to	target	type
    //   77	90	173	java/lang/Exception
    //   90	170	173	java/lang/Exception
    //   257	261	173	java/lang/Exception
    //   52	57	213	java/io/IOException
    //   261	265	296	java/io/IOException
    //   199	203	312	java/io/IOException
    //   60	77	328	finally
    //   335	339	341	java/io/IOException
    //   77	90	357	finally
    //   90	170	357	finally
    //   257	261	357	finally
    //   176	195	363	finally
    //   60	77	371	java/lang/Exception
  }
  
  public final boolean zE(String paramString)
  {
    GMTrace.i(12256360267776L, 91317);
    if (bg.nm(paramString))
    {
      GMTrace.o(12256360267776L, 91317);
      return false;
    }
    boolean bool = s.eK(paramString, "weixin://private/setresult/");
    GMTrace.o(12256360267776L, 91317);
    return bool;
  }
  
  /* Error */
  public final boolean zF(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc2_w 246
    //   6: ldc -8
    //   8: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 30	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:inX	Lcom/tencent/mm/ui/widget/MMWebView;
    //   15: ifnull +13 -> 28
    //   18: aload_0
    //   19: getfield 30	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:inX	Lcom/tencent/mm/ui/widget/MMWebView;
    //   22: ldc -6
    //   24: aconst_null
    //   25: invokevirtual 254	com/tencent/mm/ui/widget/MMWebView:evaluateJavascript	(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //   28: aload_1
    //   29: bipush 27
    //   31: invokevirtual 258	java/lang/String:substring	(I)Ljava/lang/String;
    //   34: astore_1
    //   35: aload_1
    //   36: invokestatic 151	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   39: ifeq +21 -> 60
    //   42: ldc 116
    //   44: ldc_w 260
    //   47: invokestatic 132	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: ldc2_w 246
    //   53: ldc -8
    //   55: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   58: iconst_0
    //   59: ireturn
    //   60: aload_1
    //   61: ldc_w 262
    //   64: invokevirtual 266	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   67: istore_2
    //   68: iload_2
    //   69: ifgt +32 -> 101
    //   72: ldc 116
    //   74: ldc_w 268
    //   77: iconst_1
    //   78: anewarray 4	java/lang/Object
    //   81: dup
    //   82: iconst_0
    //   83: iload_2
    //   84: invokestatic 74	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   87: aastore
    //   88: invokestatic 270	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: ldc2_w 246
    //   94: ldc -8
    //   96: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   99: iconst_0
    //   100: ireturn
    //   101: aload_1
    //   102: iconst_0
    //   103: iload_2
    //   104: invokevirtual 273	java/lang/String:substring	(II)Ljava/lang/String;
    //   107: astore 5
    //   109: aload_1
    //   110: iload_2
    //   111: iconst_1
    //   112: iadd
    //   113: invokevirtual 258	java/lang/String:substring	(I)Ljava/lang/String;
    //   116: iconst_0
    //   117: invokestatic 279	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   120: astore_1
    //   121: aload_1
    //   122: ifnonnull +230 -> 352
    //   125: aconst_null
    //   126: astore_3
    //   127: ldc 116
    //   129: ldc_w 281
    //   132: iconst_2
    //   133: anewarray 4	java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: aload 5
    //   140: aastore
    //   141: dup
    //   142: iconst_1
    //   143: aload_3
    //   144: aastore
    //   145: invokestatic 123	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: ldc_w 283
    //   151: aload 5
    //   153: invokevirtual 286	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   156: ifeq +162 -> 318
    //   159: aload_3
    //   160: ifnull +158 -> 318
    //   163: aload_3
    //   164: ldc_w 288
    //   167: invokevirtual 291	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   170: ifeq +194 -> 364
    //   173: aload_3
    //   174: bipush 14
    //   176: invokevirtual 258	java/lang/String:substring	(I)Ljava/lang/String;
    //   179: astore_1
    //   180: aload_1
    //   181: ifnull +65 -> 246
    //   184: aload_1
    //   185: ldc_w 293
    //   188: invokevirtual 297	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   191: invokestatic 299	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:B	([Ljava/lang/String;)Ljava/util/Map;
    //   194: astore_1
    //   195: aload_0
    //   196: ldc_w 301
    //   199: invokespecial 303	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:Mx	(Ljava/lang/String;)Ljava/lang/String;
    //   202: astore 6
    //   204: aload 6
    //   206: aload_1
    //   207: invokestatic 305	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:n	(Ljava/lang/String;Ljava/util/Map;)Z
    //   210: ifeq +203 -> 413
    //   213: aload_0
    //   214: getfield 32	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:rQv	Lcom/tencent/mm/plugin/webview/stub/d;
    //   217: ifnull +29 -> 246
    //   220: aload_0
    //   221: getfield 30	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:inX	Lcom/tencent/mm/ui/widget/MMWebView;
    //   224: ifnull +22 -> 246
    //   227: aload_0
    //   228: getfield 32	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:rQv	Lcom/tencent/mm/plugin/webview/stub/d;
    //   231: iconst_0
    //   232: aload_0
    //   233: getfield 30	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:inX	Lcom/tencent/mm/ui/widget/MMWebView;
    //   236: invokevirtual 93	com/tencent/mm/ui/widget/MMWebView:getUrl	()Ljava/lang/String;
    //   239: aload 6
    //   241: invokeinterface 310 4 0
    //   246: aload_3
    //   247: ldc_w 312
    //   250: invokevirtual 291	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   253: ifeq +171 -> 424
    //   256: aload_3
    //   257: bipush 17
    //   259: invokevirtual 258	java/lang/String:substring	(I)Ljava/lang/String;
    //   262: astore_1
    //   263: aload_1
    //   264: ifnull +54 -> 318
    //   267: aload_0
    //   268: ldc_w 314
    //   271: invokespecial 303	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:Mx	(Ljava/lang/String;)Ljava/lang/String;
    //   274: astore 4
    //   276: aload 4
    //   278: aload_1
    //   279: invokestatic 316	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:ep	(Ljava/lang/String;Ljava/lang/String;)Z
    //   282: ifeq +194 -> 476
    //   285: aload_0
    //   286: getfield 32	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:rQv	Lcom/tencent/mm/plugin/webview/stub/d;
    //   289: ifnull +29 -> 318
    //   292: aload_0
    //   293: getfield 30	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:inX	Lcom/tencent/mm/ui/widget/MMWebView;
    //   296: ifnull +22 -> 318
    //   299: aload_0
    //   300: getfield 32	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:rQv	Lcom/tencent/mm/plugin/webview/stub/d;
    //   303: iconst_1
    //   304: aload_0
    //   305: getfield 30	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:inX	Lcom/tencent/mm/ui/widget/MMWebView;
    //   308: invokevirtual 93	com/tencent/mm/ui/widget/MMWebView:getUrl	()Ljava/lang/String;
    //   311: aload 4
    //   313: invokeinterface 310 4 0
    //   318: aload_0
    //   319: getfield 36	com/tencent/mm/plugin/webview/ui/tools/jsapi/e:rQw	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/d;
    //   322: aload 5
    //   324: aload_3
    //   325: invokevirtual 321	com/tencent/mm/plugin/webview/ui/tools/jsapi/d:keep_setReturnValue	(Ljava/lang/String;Ljava/lang/String;)V
    //   328: ldc2_w 246
    //   331: ldc -8
    //   333: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   336: iconst_1
    //   337: ireturn
    //   338: astore_1
    //   339: ldc 116
    //   341: ldc_w 323
    //   344: invokestatic 132	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   347: aconst_null
    //   348: astore_1
    //   349: goto -228 -> 121
    //   352: new 179	java/lang/String
    //   355: dup
    //   356: aload_1
    //   357: invokespecial 325	java/lang/String:<init>	([B)V
    //   360: astore_3
    //   361: goto -234 -> 127
    //   364: aload_3
    //   365: ldc_w 327
    //   368: invokevirtual 291	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   371: ifeq +116 -> 487
    //   374: aload_3
    //   375: bipush 15
    //   377: aload_3
    //   378: invokevirtual 330	java/lang/String:length	()I
    //   381: iconst_1
    //   382: isub
    //   383: invokevirtual 273	java/lang/String:substring	(II)Ljava/lang/String;
    //   386: astore_1
    //   387: goto -207 -> 180
    //   390: astore_1
    //   391: ldc 116
    //   393: ldc_w 332
    //   396: iconst_1
    //   397: anewarray 4	java/lang/Object
    //   400: dup
    //   401: iconst_0
    //   402: aload_1
    //   403: invokevirtual 335	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   406: aastore
    //   407: invokestatic 270	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   410: goto -164 -> 246
    //   413: ldc 116
    //   415: ldc_w 337
    //   418: invokestatic 132	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   421: goto -175 -> 246
    //   424: aload 4
    //   426: astore_1
    //   427: aload_3
    //   428: ldc_w 339
    //   431: invokevirtual 291	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   434: ifeq -171 -> 263
    //   437: aload_3
    //   438: bipush 18
    //   440: aload_3
    //   441: invokevirtual 330	java/lang/String:length	()I
    //   444: iconst_1
    //   445: isub
    //   446: invokevirtual 273	java/lang/String:substring	(II)Ljava/lang/String;
    //   449: astore_1
    //   450: goto -187 -> 263
    //   453: astore_1
    //   454: ldc 116
    //   456: ldc_w 332
    //   459: iconst_1
    //   460: anewarray 4	java/lang/Object
    //   463: dup
    //   464: iconst_0
    //   465: aload_1
    //   466: invokevirtual 335	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   469: aastore
    //   470: invokestatic 270	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   473: goto -155 -> 318
    //   476: ldc 116
    //   478: ldc_w 341
    //   481: invokestatic 132	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   484: goto -166 -> 318
    //   487: aconst_null
    //   488: astore_1
    //   489: goto -309 -> 180
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	492	0	this	e
    //   0	492	1	paramString	String
    //   67	46	2	i	int
    //   126	315	3	str1	String
    //   1	424	4	str2	String
    //   107	216	5	str3	String
    //   202	38	6	str4	String
    // Exception table:
    //   from	to	target	type
    //   109	121	338	java/lang/Exception
    //   227	246	390	android/os/RemoteException
    //   299	318	453	android/os/RemoteException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\jsapi\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.k;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  public static final String fSI;
  public SparseArray<d> fSH;
  
  static
  {
    GMTrace.i(13610751361024L, 101408);
    fSI = com.tencent.mm.storage.w.ghv + "configlist/";
    GMTrace.o(13610751361024L, 101408);
  }
  
  public c()
  {
    GMTrace.i(13608603877376L, 101392);
    this.fSH = new SparseArray();
    GMTrace.o(13608603877376L, 101392);
  }
  
  public static String ew(int paramInt)
  {
    GMTrace.i(13608738095104L, 101393);
    String str = fSI + "config_" + paramInt + ".xml";
    GMTrace.o(13608738095104L, 101393);
    return str;
  }
  
  /* Error */
  private void load(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 74
    //   3: ldc 76
    //   5: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 78	java/io/File
    //   11: dup
    //   12: iload_1
    //   13: invokestatic 80	com/tencent/mm/k/c:ew	(I)Ljava/lang/String;
    //   16: invokespecial 83	java/io/File:<init>	(Ljava/lang/String;)V
    //   19: astore_2
    //   20: aload_2
    //   21: invokevirtual 87	java/io/File:exists	()Z
    //   24: ifeq +271 -> 295
    //   27: new 89	java/io/FileInputStream
    //   30: dup
    //   31: aload_2
    //   32: invokespecial 92	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   35: astore_3
    //   36: aload_3
    //   37: astore_2
    //   38: new 94	java/io/InputStreamReader
    //   41: dup
    //   42: aload_3
    //   43: ldc 96
    //   45: invokespecial 99	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   48: astore 4
    //   50: aload_3
    //   51: astore_2
    //   52: new 101	java/io/BufferedReader
    //   55: dup
    //   56: aload 4
    //   58: invokespecial 104	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   61: astore 5
    //   63: aload_3
    //   64: astore_2
    //   65: new 106	java/lang/StringBuffer
    //   68: dup
    //   69: invokespecial 107	java/lang/StringBuffer:<init>	()V
    //   72: astore 6
    //   74: aload_3
    //   75: astore_2
    //   76: aload 5
    //   78: invokevirtual 110	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   81: astore 7
    //   83: aload 7
    //   85: ifnull +56 -> 141
    //   88: aload_3
    //   89: astore_2
    //   90: aload 6
    //   92: aload 7
    //   94: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   97: pop
    //   98: goto -24 -> 74
    //   101: astore 4
    //   103: aload_3
    //   104: astore_2
    //   105: ldc 115
    //   107: ldc 117
    //   109: iconst_1
    //   110: anewarray 4	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: aload 4
    //   117: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   120: aastore
    //   121: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload_3
    //   125: ifnull +150 -> 275
    //   128: aload_3
    //   129: invokevirtual 134	java/io/InputStream:close	()V
    //   132: ldc2_w 74
    //   135: ldc 76
    //   137: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   140: return
    //   141: aload_3
    //   142: astore_2
    //   143: aload_0
    //   144: iload_1
    //   145: aload 6
    //   147: invokevirtual 135	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   150: invokevirtual 139	com/tencent/mm/k/c:k	(ILjava/lang/String;)V
    //   153: aload_3
    //   154: astore_2
    //   155: aload 4
    //   157: invokevirtual 140	java/io/InputStreamReader:close	()V
    //   160: aload_3
    //   161: astore_2
    //   162: aload 5
    //   164: invokevirtual 141	java/io/BufferedReader:close	()V
    //   167: aload_3
    //   168: ifnull +107 -> 275
    //   171: aload_3
    //   172: invokevirtual 134	java/io/InputStream:close	()V
    //   175: ldc2_w 74
    //   178: ldc 76
    //   180: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   183: return
    //   184: astore_2
    //   185: ldc 115
    //   187: ldc 117
    //   189: iconst_1
    //   190: anewarray 4	java/lang/Object
    //   193: dup
    //   194: iconst_0
    //   195: aload_2
    //   196: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   199: aastore
    //   200: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: ldc2_w 74
    //   206: ldc 76
    //   208: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   211: return
    //   212: astore_2
    //   213: ldc 115
    //   215: ldc 117
    //   217: iconst_1
    //   218: anewarray 4	java/lang/Object
    //   221: dup
    //   222: iconst_0
    //   223: aload_2
    //   224: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   227: aastore
    //   228: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   231: ldc2_w 74
    //   234: ldc 76
    //   236: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   239: return
    //   240: astore_3
    //   241: aconst_null
    //   242: astore_2
    //   243: aload_2
    //   244: ifnull +7 -> 251
    //   247: aload_2
    //   248: invokevirtual 134	java/io/InputStream:close	()V
    //   251: aload_3
    //   252: athrow
    //   253: astore_2
    //   254: ldc 115
    //   256: ldc 117
    //   258: iconst_1
    //   259: anewarray 4	java/lang/Object
    //   262: dup
    //   263: iconst_0
    //   264: aload_2
    //   265: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   268: aastore
    //   269: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   272: goto -21 -> 251
    //   275: ldc2_w 74
    //   278: ldc 76
    //   280: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   283: return
    //   284: astore_3
    //   285: goto -42 -> 243
    //   288: astore 4
    //   290: aconst_null
    //   291: astore_3
    //   292: goto -189 -> 103
    //   295: aconst_null
    //   296: astore_3
    //   297: goto -130 -> 167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	300	0	this	c
    //   0	300	1	paramInt	int
    //   19	143	2	localObject1	Object
    //   184	12	2	localIOException1	java.io.IOException
    //   212	12	2	localIOException2	java.io.IOException
    //   242	6	2	localObject2	Object
    //   253	12	2	localIOException3	java.io.IOException
    //   35	137	3	localFileInputStream	java.io.FileInputStream
    //   240	12	3	localObject3	Object
    //   284	1	3	localObject4	Object
    //   291	6	3	localObject5	Object
    //   48	9	4	localInputStreamReader	java.io.InputStreamReader
    //   101	55	4	localException1	Exception
    //   288	1	4	localException2	Exception
    //   61	102	5	localBufferedReader	java.io.BufferedReader
    //   72	74	6	localStringBuffer	StringBuffer
    //   81	12	7	str	String
    // Exception table:
    //   from	to	target	type
    //   38	50	101	java/lang/Exception
    //   52	63	101	java/lang/Exception
    //   65	74	101	java/lang/Exception
    //   76	83	101	java/lang/Exception
    //   90	98	101	java/lang/Exception
    //   143	153	101	java/lang/Exception
    //   155	160	101	java/lang/Exception
    //   162	167	101	java/lang/Exception
    //   171	175	184	java/io/IOException
    //   128	132	212	java/io/IOException
    //   8	36	240	finally
    //   247	251	253	java/io/IOException
    //   38	50	284	finally
    //   52	63	284	finally
    //   65	74	284	finally
    //   76	83	284	finally
    //   90	98	284	finally
    //   105	124	284	finally
    //   143	153	284	finally
    //   155	160	284	finally
    //   162	167	284	finally
    //   8	36	288	java/lang/Exception
  }
  
  public static int ue()
  {
    GMTrace.i(13609811836928L, 101401);
    String str = ((a)h.h(a.class)).ut().getValue("VoiceVOIPSwitch");
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ConfigListDecoder", "voip is " + str);
    try
    {
      i = bg.getInt(str, 0);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ConfigListDecoder", "showVoiceVoipEntrance is " + i);
      GMTrace.o(13609811836928L, 101401);
      return i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ConfigListDecoder", "exception:%s", new Object[] { bg.f(localException) });
        int i = 0;
      }
    }
  }
  
  /* Error */
  public final boolean b(java.io.File paramFile1, java.io.File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aconst_null
    //   4: astore 6
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc2_w 182
    //   11: ldc -72
    //   13: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   16: aload_1
    //   17: invokevirtual 87	java/io/File:exists	()Z
    //   20: ifeq +382 -> 402
    //   23: aload_1
    //   24: invokevirtual 187	java/io/File:isDirectory	()Z
    //   27: ifeq +89 -> 116
    //   30: aload_2
    //   31: invokevirtual 87	java/io/File:exists	()Z
    //   34: ifne +8 -> 42
    //   37: aload_2
    //   38: invokevirtual 190	java/io/File:mkdir	()Z
    //   41: pop
    //   42: aload_1
    //   43: invokevirtual 194	java/io/File:listFiles	()[Ljava/io/File;
    //   46: astore 5
    //   48: iconst_0
    //   49: istore 4
    //   51: iload_3
    //   52: aload 5
    //   54: arraylength
    //   55: if_icmpge +50 -> 105
    //   58: aload 5
    //   60: iload_3
    //   61: aaload
    //   62: astore 6
    //   64: aload_0
    //   65: aload 6
    //   67: new 78	java/io/File
    //   70: dup
    //   71: aload_2
    //   72: invokevirtual 197	java/io/File:getPath	()Ljava/lang/String;
    //   75: aload 6
    //   77: invokevirtual 200	java/io/File:getName	()Ljava/lang/String;
    //   80: invokespecial 202	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: invokevirtual 204	com/tencent/mm/k/c:b	(Ljava/io/File;Ljava/io/File;)Z
    //   86: istore 4
    //   88: iload 4
    //   90: ifeq +8 -> 98
    //   93: aload_1
    //   94: invokevirtual 207	java/io/File:delete	()Z
    //   97: pop
    //   98: iload_3
    //   99: iconst_1
    //   100: iadd
    //   101: istore_3
    //   102: goto -51 -> 51
    //   105: ldc2_w 182
    //   108: ldc -72
    //   110: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   113: iload 4
    //   115: ireturn
    //   116: new 89	java/io/FileInputStream
    //   119: dup
    //   120: aload_1
    //   121: invokespecial 92	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   124: astore 5
    //   126: new 209	java/io/FileOutputStream
    //   129: dup
    //   130: aload_2
    //   131: invokespecial 210	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   134: astore_2
    //   135: sipush 1024
    //   138: newarray <illegal type>
    //   140: astore 6
    //   142: aload 5
    //   144: aload 6
    //   146: invokevirtual 214	java/io/InputStream:read	([B)I
    //   149: istore_3
    //   150: iload_3
    //   151: iconst_m1
    //   152: if_icmpeq +61 -> 213
    //   155: aload_2
    //   156: aload 6
    //   158: iconst_0
    //   159: iload_3
    //   160: invokevirtual 220	java/io/OutputStream:write	([BII)V
    //   163: goto -21 -> 142
    //   166: astore_1
    //   167: ldc 115
    //   169: ldc 117
    //   171: iconst_1
    //   172: anewarray 4	java/lang/Object
    //   175: dup
    //   176: iconst_0
    //   177: aload_1
    //   178: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   181: aastore
    //   182: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: aload 5
    //   187: ifnull +8 -> 195
    //   190: aload 5
    //   192: invokevirtual 134	java/io/InputStream:close	()V
    //   195: aload_2
    //   196: ifnull +7 -> 203
    //   199: aload_2
    //   200: invokevirtual 221	java/io/OutputStream:close	()V
    //   203: ldc2_w 182
    //   206: ldc -72
    //   208: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   211: iconst_0
    //   212: ireturn
    //   213: aload_2
    //   214: invokevirtual 224	java/io/OutputStream:flush	()V
    //   217: aload_1
    //   218: invokevirtual 207	java/io/File:delete	()Z
    //   221: pop
    //   222: aload 5
    //   224: invokevirtual 134	java/io/InputStream:close	()V
    //   227: aload_2
    //   228: invokevirtual 221	java/io/OutputStream:close	()V
    //   231: ldc2_w 182
    //   234: ldc -72
    //   236: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   239: iconst_1
    //   240: ireturn
    //   241: astore_1
    //   242: ldc 115
    //   244: ldc 117
    //   246: iconst_1
    //   247: anewarray 4	java/lang/Object
    //   250: dup
    //   251: iconst_0
    //   252: aload_1
    //   253: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   256: aastore
    //   257: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   260: goto -33 -> 227
    //   263: astore_1
    //   264: ldc 115
    //   266: ldc 117
    //   268: iconst_1
    //   269: anewarray 4	java/lang/Object
    //   272: dup
    //   273: iconst_0
    //   274: aload_1
    //   275: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   278: aastore
    //   279: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   282: goto -51 -> 231
    //   285: astore_1
    //   286: ldc 115
    //   288: ldc 117
    //   290: iconst_1
    //   291: anewarray 4	java/lang/Object
    //   294: dup
    //   295: iconst_0
    //   296: aload_1
    //   297: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   300: aastore
    //   301: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   304: goto -109 -> 195
    //   307: astore_1
    //   308: ldc 115
    //   310: ldc 117
    //   312: iconst_1
    //   313: anewarray 4	java/lang/Object
    //   316: dup
    //   317: iconst_0
    //   318: aload_1
    //   319: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   322: aastore
    //   323: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: goto -123 -> 203
    //   329: astore_1
    //   330: aconst_null
    //   331: astore_2
    //   332: aload 7
    //   334: astore 5
    //   336: aload 5
    //   338: ifnull +8 -> 346
    //   341: aload 5
    //   343: invokevirtual 134	java/io/InputStream:close	()V
    //   346: aload_2
    //   347: ifnull +7 -> 354
    //   350: aload_2
    //   351: invokevirtual 221	java/io/OutputStream:close	()V
    //   354: aload_1
    //   355: athrow
    //   356: astore 5
    //   358: ldc 115
    //   360: ldc 117
    //   362: iconst_1
    //   363: anewarray 4	java/lang/Object
    //   366: dup
    //   367: iconst_0
    //   368: aload 5
    //   370: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   373: aastore
    //   374: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   377: goto -31 -> 346
    //   380: astore_2
    //   381: ldc 115
    //   383: ldc 117
    //   385: iconst_1
    //   386: anewarray 4	java/lang/Object
    //   389: dup
    //   390: iconst_0
    //   391: aload_2
    //   392: invokestatic 123	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   395: aastore
    //   396: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: goto -45 -> 354
    //   402: ldc2_w 182
    //   405: ldc -72
    //   407: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   410: iconst_0
    //   411: ireturn
    //   412: astore_1
    //   413: aconst_null
    //   414: astore_2
    //   415: goto -79 -> 336
    //   418: astore_1
    //   419: goto -83 -> 336
    //   422: astore_1
    //   423: goto -87 -> 336
    //   426: astore_1
    //   427: aconst_null
    //   428: astore_2
    //   429: aload 6
    //   431: astore 5
    //   433: goto -266 -> 167
    //   436: astore_1
    //   437: aconst_null
    //   438: astore_2
    //   439: goto -272 -> 167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	442	0	this	c
    //   0	442	1	paramFile1	java.io.File
    //   0	442	2	paramFile2	java.io.File
    //   7	153	3	i	int
    //   49	65	4	bool	boolean
    //   46	296	5	localObject1	Object
    //   356	13	5	localIOException	java.io.IOException
    //   431	1	5	localObject2	Object
    //   4	426	6	localObject3	Object
    //   1	332	7	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   135	142	166	java/lang/Exception
    //   142	150	166	java/lang/Exception
    //   155	163	166	java/lang/Exception
    //   213	222	166	java/lang/Exception
    //   222	227	241	java/io/IOException
    //   227	231	263	java/io/IOException
    //   190	195	285	java/io/IOException
    //   199	203	307	java/io/IOException
    //   116	126	329	finally
    //   341	346	356	java/io/IOException
    //   350	354	380	java/io/IOException
    //   126	135	412	finally
    //   135	142	418	finally
    //   142	150	418	finally
    //   155	163	418	finally
    //   213	222	418	finally
    //   167	185	422	finally
    //   116	126	426	java/lang/Exception
    //   126	135	436	java/lang/Exception
  }
  
  public final d ex(int paramInt)
  {
    GMTrace.i(13609409183744L, 101398);
    if (this.fSH.get(1) == null) {
      load(1);
    }
    d locald = (d)this.fSH.get(1);
    GMTrace.o(13609409183744L, 101398);
    return locald;
  }
  
  public final String getMailAppEnterUlAndroid()
  {
    GMTrace.i(13610617143296L, 101407);
    String str = z("MailApp", "MailAppEnterMailAppUrlAndroid");
    GMTrace.o(13610617143296L, 101407);
    return str;
  }
  
  public final void init()
  {
    GMTrace.i(13609006530560L, 101395);
    int i = 0;
    while (i < d.fSJ.length)
    {
      load(d.fSJ[i]);
      i += 1;
    }
    GMTrace.o(13609006530560L, 101395);
  }
  
  public final void k(int paramInt, String paramString)
  {
    GMTrace.i(13609140748288L, 101396);
    d locald = new d(paramInt);
    locald.fSL = bh.q(paramString, "ConfigList");
    if (locald.fSL.containsKey(".ConfigList.$version")) {
      locald.version = Integer.valueOf((String)locald.fSL.get(".ConfigList.$version")).intValue();
    }
    int i = 0;
    for (;;)
    {
      Object localObject1 = new StringBuilder(".ConfigList.Config");
      String str;
      int j;
      label191:
      Object localObject2;
      label220:
      Object localObject3;
      label260:
      StringBuilder localStringBuilder;
      if (i == 0)
      {
        paramString = "";
        localObject1 = paramString;
        if (locald.fSL.get((String)localObject1 + ".$name") == null) {
          break;
        }
        str = (String)locald.fSL.get((String)localObject1 + ".$name");
        if (str.equalsIgnoreCase("JDWebViewMenu")) {
          break label538;
        }
        j = 0;
        localObject2 = new StringBuilder().append((String)localObject1).append(".Item");
        if (j != 0) {
          break label511;
        }
        paramString = "";
        localObject2 = paramString;
        localObject3 = new StringBuilder().append((String)localObject1).append(".Item");
        if (j != 0) {
          break label520;
        }
        paramString = "";
        localObject3 = paramString + ".$key";
        localStringBuilder = new StringBuilder().append((String)localObject1).append(".Item");
        if (j != 0) {
          break label529;
        }
      }
      label511:
      label520:
      label529:
      for (paramString = "";; paramString = Integer.valueOf(j))
      {
        paramString = paramString + ".$lang";
        if (!locald.fSL.containsKey(localObject2)) {
          break label538;
        }
        localObject3 = (String)locald.fSL.get(localObject3);
        localObject2 = (String)locald.fSL.get(localObject2);
        paramString = (String)locald.fSL.get(paramString);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ConfigListInfo", "itemKey " + (String)localObject3 + " itemValue " + (String)localObject2 + " itemLang " + paramString);
        if ((paramString == null) || (d.dV(paramString)))
        {
          if (!locald.fSK.containsKey(str)) {
            locald.fSK.put(str, new HashMap());
          }
          ((HashMap)locald.fSK.get(str)).put(localObject3, localObject2);
        }
        j += 1;
        break label191;
        paramString = Integer.valueOf(i);
        break;
        paramString = Integer.valueOf(j);
        break label220;
        paramString = Integer.valueOf(j);
        break label260;
      }
      label538:
      i += 1;
    }
    this.fSH.put(Integer.valueOf(paramInt).intValue(), locald);
    GMTrace.o(13609140748288L, 101396);
  }
  
  public final boolean uf()
  {
    boolean bool = true;
    GMTrace.i(13609946054656L, 101402);
    if (bg.getInt(z("WebViewConfig", "disableWePkg"), 0) == 1) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ConfigListDecoder", "disableWePkg : " + bool);
      GMTrace.o(13609946054656L, 101402);
      return bool;
      bool = false;
    }
  }
  
  public final String ug()
  {
    GMTrace.i(13610080272384L, 101403);
    String str = z("FreeWiFiConfig", "CheckURL");
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ConfigListDecoder", "get check url for free wifi : %s", new Object[] { str });
    GMTrace.o(13610080272384L, 101403);
    return str;
  }
  
  public final boolean uh()
  {
    boolean bool = true;
    GMTrace.i(13610214490112L, 101404);
    if (bg.getInt(z("ShowConfig", "showRecvTmpMsgBtn"), 0) == 1) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ConfigListDecoder", "isShowRecvTmpMsgBtn : " + bool);
      GMTrace.o(13610214490112L, 101404);
      return bool;
      bool = false;
    }
  }
  
  public final List<String> ui()
  {
    GMTrace.i(13610348707840L, 101405);
    Object localObject1 = null;
    Object localObject3 = z("IBeacon", "Content");
    Object localObject2;
    if (!bg.nm((String)localObject3))
    {
      ArrayList localArrayList = new ArrayList();
      try
      {
        localObject3 = new JSONObject(((String)localObject3).replace(",}", "}")).keys();
        for (;;)
        {
          localObject1 = localArrayList;
          if (!((Iterator)localObject3).hasNext()) {
            break;
          }
          localObject1 = ((Iterator)localObject3).next();
          if (localObject1 != null) {
            localArrayList.add(localObject1.toString());
          }
        }
        GMTrace.o(13610348707840L, 101405);
      }
      catch (JSONException localJSONException)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ConfigListDecoder", "[oneliang] json parse exception: " + localJSONException.getMessage());
        localObject2 = localArrayList;
      }
    }
    return (List<String>)localObject2;
  }
  
  public final String uj()
  {
    GMTrace.i(13610482925568L, 101406);
    String str = z("MailApp", "MailAppRedirectUrAndroid");
    GMTrace.o(13610482925568L, 101406);
    return str;
  }
  
  public final String z(String paramString1, String paramString2)
  {
    GMTrace.i(13609274966016L, 101397);
    d locald = ex(1);
    if (locald == null)
    {
      GMTrace.o(13609274966016L, 101397);
      return null;
    }
    if (locald.fSK.containsKey(paramString1))
    {
      paramString1 = (String)((HashMap)locald.fSK.get(paramString1)).get(paramString2);
      GMTrace.o(13609274966016L, 101397);
      return paramString1;
    }
    GMTrace.o(13609274966016L, 101397);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\k\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
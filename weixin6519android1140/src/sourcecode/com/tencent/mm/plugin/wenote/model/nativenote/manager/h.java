package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.a.p;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class h
{
  private static volatile h seA;
  private p seB;
  
  static
  {
    GMTrace.i(20640270647296L, 153782);
    seA = null;
    GMTrace.o(20640270647296L, 153782);
  }
  
  private h()
  {
    GMTrace.i(20639465340928L, 153776);
    this.seB = null;
    GMTrace.o(20639465340928L, 153776);
  }
  
  /* Error */
  private static p aV(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 38
    //   3: ldc 40
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnull +8 -> 17
    //   12: aload_0
    //   13: arraylength
    //   14: ifgt +13 -> 27
    //   17: ldc2_w 38
    //   20: ldc 40
    //   22: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: aconst_null
    //   26: areturn
    //   27: new 42	java/io/ByteArrayInputStream
    //   30: dup
    //   31: aload_0
    //   32: invokespecial 45	java/io/ByteArrayInputStream:<init>	([B)V
    //   35: astore_1
    //   36: new 47	java/io/ObjectInputStream
    //   39: dup
    //   40: aload_1
    //   41: invokespecial 50	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   44: astore_0
    //   45: aload_0
    //   46: astore_3
    //   47: aload_1
    //   48: astore_2
    //   49: aload_0
    //   50: invokevirtual 54	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   53: checkcast 56	com/tencent/mm/plugin/wenote/model/a/p
    //   56: astore 4
    //   58: aload_0
    //   59: invokevirtual 59	java/io/ObjectInputStream:close	()V
    //   62: aload_1
    //   63: invokevirtual 60	java/io/ByteArrayInputStream:close	()V
    //   66: aload 4
    //   68: astore_0
    //   69: ldc2_w 38
    //   72: ldc 40
    //   74: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   77: aload_0
    //   78: areturn
    //   79: astore_0
    //   80: ldc 62
    //   82: ldc 64
    //   84: iconst_1
    //   85: anewarray 4	java/lang/Object
    //   88: dup
    //   89: iconst_0
    //   90: aload_0
    //   91: aastore
    //   92: invokestatic 70	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload 4
    //   97: astore_0
    //   98: goto -29 -> 69
    //   101: astore 4
    //   103: aconst_null
    //   104: astore_0
    //   105: aconst_null
    //   106: astore_1
    //   107: aload_0
    //   108: astore_3
    //   109: aload_1
    //   110: astore_2
    //   111: ldc 62
    //   113: ldc 72
    //   115: iconst_1
    //   116: anewarray 4	java/lang/Object
    //   119: dup
    //   120: iconst_0
    //   121: aload 4
    //   123: aastore
    //   124: invokestatic 70	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload_0
    //   128: ifnull +7 -> 135
    //   131: aload_0
    //   132: invokevirtual 59	java/io/ObjectInputStream:close	()V
    //   135: aload_1
    //   136: ifnull +7 -> 143
    //   139: aload_1
    //   140: invokevirtual 60	java/io/ByteArrayInputStream:close	()V
    //   143: aconst_null
    //   144: astore_0
    //   145: goto -76 -> 69
    //   148: astore_0
    //   149: ldc 62
    //   151: ldc 64
    //   153: iconst_1
    //   154: anewarray 4	java/lang/Object
    //   157: dup
    //   158: iconst_0
    //   159: aload_0
    //   160: aastore
    //   161: invokestatic 70	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: aconst_null
    //   165: astore_0
    //   166: goto -97 -> 69
    //   169: astore_0
    //   170: aconst_null
    //   171: astore_3
    //   172: aconst_null
    //   173: astore_1
    //   174: aload_3
    //   175: ifnull +7 -> 182
    //   178: aload_3
    //   179: invokevirtual 59	java/io/ObjectInputStream:close	()V
    //   182: aload_1
    //   183: ifnull +7 -> 190
    //   186: aload_1
    //   187: invokevirtual 60	java/io/ByteArrayInputStream:close	()V
    //   190: aload_0
    //   191: athrow
    //   192: astore_1
    //   193: ldc 62
    //   195: ldc 64
    //   197: iconst_1
    //   198: anewarray 4	java/lang/Object
    //   201: dup
    //   202: iconst_0
    //   203: aload_1
    //   204: aastore
    //   205: invokestatic 70	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   208: goto -18 -> 190
    //   211: astore_0
    //   212: aconst_null
    //   213: astore_3
    //   214: goto -40 -> 174
    //   217: astore_0
    //   218: aload_2
    //   219: astore_1
    //   220: goto -46 -> 174
    //   223: astore 4
    //   225: aconst_null
    //   226: astore_0
    //   227: goto -120 -> 107
    //   230: astore 4
    //   232: goto -125 -> 107
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	paramArrayOfByte	byte[]
    //   35	152	1	localByteArrayInputStream1	java.io.ByteArrayInputStream
    //   192	12	1	localException1	Exception
    //   219	1	1	localObject	Object
    //   48	171	2	localByteArrayInputStream2	java.io.ByteArrayInputStream
    //   46	168	3	arrayOfByte	byte[]
    //   56	40	4	localp	p
    //   101	21	4	localException2	Exception
    //   223	1	4	localException3	Exception
    //   230	1	4	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   58	66	79	java/lang/Exception
    //   27	36	101	java/lang/Exception
    //   131	135	148	java/lang/Exception
    //   139	143	148	java/lang/Exception
    //   27	36	169	finally
    //   178	182	192	java/lang/Exception
    //   186	190	192	java/lang/Exception
    //   36	45	211	finally
    //   49	58	217	finally
    //   111	127	217	finally
    //   36	45	223	java/lang/Exception
    //   49	58	230	java/lang/Exception
  }
  
  /* Error */
  private static byte[] b(p paramp)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: ldc2_w 75
    //   6: ldc 77
    //   8: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: ifnonnull +13 -> 25
    //   15: ldc2_w 75
    //   18: ldc 77
    //   20: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   23: aconst_null
    //   24: areturn
    //   25: new 79	java/io/ByteArrayOutputStream
    //   28: dup
    //   29: invokespecial 80	java/io/ByteArrayOutputStream:<init>	()V
    //   32: astore_1
    //   33: new 82	java/io/ObjectOutputStream
    //   36: dup
    //   37: aload_1
    //   38: invokespecial 85	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   41: astore 5
    //   43: aload 5
    //   45: astore_3
    //   46: aload_1
    //   47: astore_2
    //   48: aload 5
    //   50: aload_0
    //   51: invokevirtual 89	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   54: aload 5
    //   56: astore_3
    //   57: aload_1
    //   58: astore_2
    //   59: aload 5
    //   61: invokevirtual 92	java/io/ObjectOutputStream:flush	()V
    //   64: aload 5
    //   66: astore_3
    //   67: aload_1
    //   68: astore_2
    //   69: aload_1
    //   70: invokevirtual 96	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   73: astore_0
    //   74: aload 5
    //   76: invokevirtual 97	java/io/ObjectOutputStream:close	()V
    //   79: aload_1
    //   80: invokevirtual 98	java/io/ByteArrayOutputStream:close	()V
    //   83: ldc2_w 75
    //   86: ldc 77
    //   88: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   91: aload_0
    //   92: areturn
    //   93: astore_1
    //   94: ldc 62
    //   96: ldc 100
    //   98: iconst_1
    //   99: anewarray 4	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: aload_1
    //   105: aastore
    //   106: invokestatic 70	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: goto -26 -> 83
    //   112: astore 4
    //   114: aconst_null
    //   115: astore_0
    //   116: aconst_null
    //   117: astore_1
    //   118: aload_0
    //   119: astore_3
    //   120: aload_1
    //   121: astore_2
    //   122: ldc 62
    //   124: ldc 102
    //   126: iconst_1
    //   127: anewarray 4	java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: aload 4
    //   134: aastore
    //   135: invokestatic 70	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   138: aload_0
    //   139: ifnull +7 -> 146
    //   142: aload_0
    //   143: invokevirtual 97	java/io/ObjectOutputStream:close	()V
    //   146: aload 6
    //   148: astore_0
    //   149: aload_1
    //   150: ifnull -67 -> 83
    //   153: aload_1
    //   154: invokevirtual 98	java/io/ByteArrayOutputStream:close	()V
    //   157: aload 6
    //   159: astore_0
    //   160: goto -77 -> 83
    //   163: astore_0
    //   164: ldc 62
    //   166: ldc 100
    //   168: iconst_1
    //   169: anewarray 4	java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: aload_0
    //   175: aastore
    //   176: invokestatic 70	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: aload 6
    //   181: astore_0
    //   182: goto -99 -> 83
    //   185: astore_0
    //   186: aconst_null
    //   187: astore_3
    //   188: aconst_null
    //   189: astore_1
    //   190: aload_3
    //   191: ifnull +7 -> 198
    //   194: aload_3
    //   195: invokevirtual 97	java/io/ObjectOutputStream:close	()V
    //   198: aload_1
    //   199: ifnull +7 -> 206
    //   202: aload_1
    //   203: invokevirtual 98	java/io/ByteArrayOutputStream:close	()V
    //   206: aload_0
    //   207: athrow
    //   208: astore_1
    //   209: ldc 62
    //   211: ldc 100
    //   213: iconst_1
    //   214: anewarray 4	java/lang/Object
    //   217: dup
    //   218: iconst_0
    //   219: aload_1
    //   220: aastore
    //   221: invokestatic 70	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: goto -18 -> 206
    //   227: astore_0
    //   228: aconst_null
    //   229: astore_3
    //   230: goto -40 -> 190
    //   233: astore_0
    //   234: aload_2
    //   235: astore_1
    //   236: goto -46 -> 190
    //   239: astore 4
    //   241: aconst_null
    //   242: astore_0
    //   243: goto -125 -> 118
    //   246: astore 4
    //   248: aload 5
    //   250: astore_0
    //   251: goto -133 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	paramp	p
    //   32	48	1	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   93	12	1	localException1	Exception
    //   117	86	1	localObject1	Object
    //   208	12	1	localException2	Exception
    //   235	1	1	localObject2	Object
    //   47	188	2	localObject3	Object
    //   45	185	3	localObject4	Object
    //   112	21	4	localException3	Exception
    //   239	1	4	localException4	Exception
    //   246	1	4	localException5	Exception
    //   41	208	5	localObjectOutputStream	java.io.ObjectOutputStream
    //   1	179	6	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   74	83	93	java/lang/Exception
    //   25	33	112	java/lang/Exception
    //   142	146	163	java/lang/Exception
    //   153	157	163	java/lang/Exception
    //   25	33	185	finally
    //   194	198	208	java/lang/Exception
    //   202	206	208	java/lang/Exception
    //   33	43	227	finally
    //   48	54	233	finally
    //   59	64	233	finally
    //   69	74	233	finally
    //   122	138	233	finally
    //   33	43	239	java/lang/Exception
    //   48	54	246	java/lang/Exception
    //   59	64	246	java/lang/Exception
    //   69	74	246	java/lang/Exception
  }
  
  public static h bHH()
  {
    GMTrace.i(20639599558656L, 153777);
    if (seA == null) {}
    try
    {
      if (seA == null) {
        seA = new h();
      }
      h localh = seA;
      GMTrace.o(20639599558656L, 153777);
      return localh;
    }
    finally {}
  }
  
  public final void a(p paramp)
  {
    GMTrace.i(20639867994112L, 153779);
    this.seB = paramp;
    byte[] arrayOfByte = b(this.seB);
    String str = "";
    paramp = str;
    if (arrayOfByte != null)
    {
      paramp = str;
      if (arrayOfByte.length > 0) {
        paramp = bg.bs(arrayOfByte);
      }
    }
    if (this.seB != null) {}
    for (str = this.seB.bGU();; str = "null")
    {
      w.i("WNNoteKeepTopManager", "setCurrentTopItem item: %s", new Object[] { str });
      w.i("WNNoteKeepTopManager", "setCurrentTopItem itemStr: %s", new Object[] { paramp });
      at.AR();
      c.xh().a(w.a.yvD, bg.nl(paramp));
      GMTrace.o(20639867994112L, 153779);
      return;
    }
  }
  
  public final p bHI()
  {
    GMTrace.i(20639733776384L, 153778);
    if (this.seB != null)
    {
      localObject = this.seB;
      GMTrace.o(20639733776384L, 153778);
      return (p)localObject;
    }
    at.AR();
    Object localObject = (String)c.xh().get(w.a.yvD, "");
    w.d("WNNoteKeepTopManager", "getCurrentTopItem itemStr: %s", new Object[] { localObject });
    if (bg.nm((String)localObject))
    {
      GMTrace.o(20639733776384L, 153778);
      return null;
    }
    localObject = bg.St((String)localObject);
    if (localObject.length <= 0)
    {
      GMTrace.o(20639733776384L, 153778);
      return null;
    }
    this.seB = aV((byte[])localObject);
    if (this.seB != null) {}
    for (localObject = this.seB.bGU();; localObject = "null")
    {
      w.d("WNNoteKeepTopManager", "getCurrentTopItem item: %s", new Object[] { localObject });
      localObject = this.seB;
      GMTrace.o(20639733776384L, 153778);
      return (p)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
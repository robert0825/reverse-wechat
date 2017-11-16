package com.tencent.mm.plugin.ipcall.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.bd;
import com.tencent.mm.plugin.ipcall.a.g.f;
import com.tencent.mm.sdk.b.c;
import java.util.ArrayList;

public final class e
{
  private static e miF;
  c htd;
  public ArrayList<f> miG;
  
  static
  {
    GMTrace.i(11567286452224L, 86183);
    miF = null;
    GMTrace.o(11567286452224L, 86183);
  }
  
  private e()
  {
    GMTrace.i(11566883799040L, 86180);
    this.miG = null;
    this.htd = new c() {};
    GMTrace.o(11566883799040L, 86180);
  }
  
  public static e aIh()
  {
    GMTrace.i(11567018016768L, 86181);
    if (miF == null) {
      miF = new e();
    }
    e locale = miF;
    GMTrace.o(11567018016768L, 86181);
    return locale;
  }
  
  /* Error */
  public final boolean aw(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 54
    //   3: ldc 56
    //   5: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 58	java/lang/String
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 61	java/lang/String:<init>	([B)V
    //   16: astore_1
    //   17: aload_1
    //   18: ldc 63
    //   20: invokestatic 69	com/tencent/mm/sdk/platformtools/bh:q	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   23: astore 4
    //   25: aload 4
    //   27: ifnull +442 -> 469
    //   30: new 71	java/util/ArrayList
    //   33: dup
    //   34: invokespecial 72	java/util/ArrayList:<init>	()V
    //   37: astore 5
    //   39: iconst_0
    //   40: istore_2
    //   41: new 74	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   48: ldc 77
    //   50: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: astore 6
    //   55: iload_2
    //   56: ifne +311 -> 367
    //   59: ldc 83
    //   61: astore_1
    //   62: aload 6
    //   64: aload_1
    //   65: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: astore_1
    //   72: aload 4
    //   74: new 74	java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   81: aload_1
    //   82: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: ldc 92
    //   87: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokeinterface 98 2 0
    //   98: checkcast 58	java/lang/String
    //   101: astore 7
    //   103: aload 7
    //   105: ifnull +326 -> 431
    //   108: new 100	com/tencent/mm/plugin/ipcall/a/g/f
    //   111: dup
    //   112: invokespecial 101	com/tencent/mm/plugin/ipcall/a/g/f:<init>	()V
    //   115: astore 6
    //   117: aload 6
    //   119: aload 7
    //   121: putfield 105	com/tencent/mm/plugin/ipcall/a/g/f:mmT	Ljava/lang/String;
    //   124: aload 6
    //   126: new 71	java/util/ArrayList
    //   129: dup
    //   130: invokespecial 72	java/util/ArrayList:<init>	()V
    //   133: putfield 108	com/tencent/mm/plugin/ipcall/a/g/f:mmU	Ljava/util/ArrayList;
    //   136: new 74	java/lang/StringBuilder
    //   139: dup
    //   140: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   143: aload_1
    //   144: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: ldc 110
    //   149: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: astore 7
    //   157: iconst_0
    //   158: istore_3
    //   159: new 112	com/tencent/mm/plugin/ipcall/a/g/e
    //   162: dup
    //   163: invokespecial 113	com/tencent/mm/plugin/ipcall/a/g/e:<init>	()V
    //   166: astore 8
    //   168: new 74	java/lang/StringBuilder
    //   171: dup
    //   172: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   175: aload 7
    //   177: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: astore 9
    //   182: iload_3
    //   183: ifne +192 -> 375
    //   186: ldc 83
    //   188: astore_1
    //   189: aload 9
    //   191: aload_1
    //   192: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   195: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: astore 9
    //   200: aload 4
    //   202: aload 9
    //   204: invokeinterface 98 2 0
    //   209: checkcast 58	java/lang/String
    //   212: astore_1
    //   213: aload_1
    //   214: ifnull +169 -> 383
    //   217: aload 4
    //   219: new 74	java/lang/StringBuilder
    //   222: dup
    //   223: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   226: aload 9
    //   228: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: ldc 115
    //   233: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: invokeinterface 98 2 0
    //   244: checkcast 58	java/lang/String
    //   247: astore 9
    //   249: aload 9
    //   251: ifnull +132 -> 383
    //   254: iload_3
    //   255: iconst_1
    //   256: iadd
    //   257: istore_3
    //   258: aload 8
    //   260: aload 9
    //   262: putfield 118	com/tencent/mm/plugin/ipcall/a/g/e:mmR	Ljava/lang/String;
    //   265: aload 8
    //   267: aload_1
    //   268: putfield 121	com/tencent/mm/plugin/ipcall/a/g/e:mmS	Ljava/lang/String;
    //   271: aload 6
    //   273: getfield 108	com/tencent/mm/plugin/ipcall/a/g/f:mmU	Ljava/util/ArrayList;
    //   276: aload 8
    //   278: invokevirtual 125	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   281: pop
    //   282: goto -123 -> 159
    //   285: astore_1
    //   286: ldc 127
    //   288: aload_1
    //   289: ldc 83
    //   291: iconst_0
    //   292: anewarray 4	java/lang/Object
    //   295: invokestatic 133	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   298: ldc 127
    //   300: ldc -121
    //   302: iconst_1
    //   303: anewarray 4	java/lang/Object
    //   306: dup
    //   307: iconst_0
    //   308: aload_1
    //   309: invokevirtual 138	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   312: aastore
    //   313: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   316: ldc2_w 54
    //   319: ldc 56
    //   321: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   324: iconst_0
    //   325: ireturn
    //   326: astore_1
    //   327: ldc 127
    //   329: aload_1
    //   330: ldc 83
    //   332: iconst_0
    //   333: anewarray 4	java/lang/Object
    //   336: invokestatic 133	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   339: ldc 127
    //   341: ldc -112
    //   343: iconst_1
    //   344: anewarray 4	java/lang/Object
    //   347: dup
    //   348: iconst_0
    //   349: aload_1
    //   350: invokevirtual 138	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   353: aastore
    //   354: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   357: ldc2_w 54
    //   360: ldc 56
    //   362: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   365: iconst_0
    //   366: ireturn
    //   367: iload_2
    //   368: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   371: astore_1
    //   372: goto -310 -> 62
    //   375: iload_3
    //   376: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   379: astore_1
    //   380: goto -191 -> 189
    //   383: ldc 127
    //   385: ldc -104
    //   387: iconst_2
    //   388: anewarray 4	java/lang/Object
    //   391: dup
    //   392: iconst_0
    //   393: aload 6
    //   395: getfield 105	com/tencent/mm/plugin/ipcall/a/g/f:mmT	Ljava/lang/String;
    //   398: aastore
    //   399: dup
    //   400: iconst_1
    //   401: aload 6
    //   403: getfield 108	com/tencent/mm/plugin/ipcall/a/g/f:mmU	Ljava/util/ArrayList;
    //   406: invokevirtual 156	java/util/ArrayList:size	()I
    //   409: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   412: aastore
    //   413: invokestatic 159	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   416: aload 5
    //   418: aload 6
    //   420: invokevirtual 125	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   423: pop
    //   424: iload_2
    //   425: iconst_1
    //   426: iadd
    //   427: istore_2
    //   428: goto -387 -> 41
    //   431: ldc 127
    //   433: ldc -95
    //   435: iconst_1
    //   436: anewarray 4	java/lang/Object
    //   439: dup
    //   440: iconst_0
    //   441: aload 5
    //   443: invokevirtual 156	java/util/ArrayList:size	()I
    //   446: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   449: aastore
    //   450: invokestatic 163	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   453: aload_0
    //   454: aload 5
    //   456: putfield 38	com/tencent/mm/plugin/ipcall/a/e:miG	Ljava/util/ArrayList;
    //   459: ldc2_w 54
    //   462: ldc 56
    //   464: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   467: iconst_1
    //   468: ireturn
    //   469: ldc 127
    //   471: ldc -91
    //   473: invokestatic 168	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   476: ldc2_w 54
    //   479: ldc 56
    //   481: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   484: iconst_0
    //   485: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	486	0	this	e
    //   0	486	1	paramArrayOfByte	byte[]
    //   40	388	2	i	int
    //   158	218	3	j	int
    //   23	195	4	localMap	java.util.Map
    //   37	418	5	localArrayList	ArrayList
    //   53	366	6	localObject1	Object
    //   101	75	7	str	String
    //   166	111	8	locale	com.tencent.mm.plugin.ipcall.a.g.e
    //   180	81	9	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   17	25	285	java/lang/Exception
    //   30	39	285	java/lang/Exception
    //   41	55	285	java/lang/Exception
    //   62	103	285	java/lang/Exception
    //   108	157	285	java/lang/Exception
    //   159	182	285	java/lang/Exception
    //   189	213	285	java/lang/Exception
    //   217	249	285	java/lang/Exception
    //   258	282	285	java/lang/Exception
    //   367	372	285	java/lang/Exception
    //   375	380	285	java/lang/Exception
    //   383	424	285	java/lang/Exception
    //   431	459	285	java/lang/Exception
    //   469	476	285	java/lang/Exception
    //   8	17	326	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.modelvideo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.e;

public final class w
{
  public static final String[] fTX;
  e fTZ;
  
  static
  {
    GMTrace.i(339839287296L, 2532);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS VideoPlayHistory ( filename text PRIMARY KEY, starttime int, playduration int, downloadway int );" };
    GMTrace.o(339839287296L, 2532);
  }
  
  public w(g paramg)
  {
    GMTrace.i(339436634112L, 2529);
    this.fTZ = paramg;
    GMTrace.o(339436634112L, 2529);
  }
  
  /* Error */
  public final boolean b(String paramString, com.tencent.mm.pointers.PInt paramPInt1, com.tencent.mm.pointers.PInt paramPInt2)
  {
    // Byte code:
    //   0: ldc2_w 41
    //   3: sipush 2531
    //   6: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aconst_null
    //   10: astore 6
    //   12: aload_0
    //   13: getfield 36	com/tencent/mm/modelvideo/w:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   16: astore 7
    //   18: aload_1
    //   19: invokestatic 48	com/tencent/mm/sdk/platformtools/bg:nk	(Ljava/lang/String;)Ljava/lang/String;
    //   22: astore_1
    //   23: aload 7
    //   25: ldc 50
    //   27: iconst_2
    //   28: anewarray 20	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: ldc 52
    //   35: aastore
    //   36: dup
    //   37: iconst_1
    //   38: ldc 54
    //   40: aastore
    //   41: ldc 56
    //   43: iconst_1
    //   44: anewarray 20	java/lang/String
    //   47: dup
    //   48: iconst_0
    //   49: aload_1
    //   50: aastore
    //   51: ldc 58
    //   53: ldc 58
    //   55: ldc 58
    //   57: iconst_2
    //   58: invokeinterface 64 9 0
    //   63: astore_1
    //   64: aload_1
    //   65: astore 6
    //   67: aload 6
    //   69: ifnull +217 -> 286
    //   72: aload 6
    //   74: astore_1
    //   75: aload 6
    //   77: invokeinterface 70 1 0
    //   82: ifeq +204 -> 286
    //   85: aload 6
    //   87: astore_1
    //   88: aload_2
    //   89: aload 6
    //   91: aload 6
    //   93: ldc 52
    //   95: invokeinterface 74 2 0
    //   100: invokeinterface 78 2 0
    //   105: putfield 84	com/tencent/mm/pointers/PInt:value	I
    //   108: aload 6
    //   110: astore_1
    //   111: aload_3
    //   112: aload 6
    //   114: aload 6
    //   116: ldc 54
    //   118: invokeinterface 74 2 0
    //   123: invokeinterface 78 2 0
    //   128: putfield 84	com/tencent/mm/pointers/PInt:value	I
    //   131: iconst_1
    //   132: istore 4
    //   134: iload 4
    //   136: istore 5
    //   138: aload 6
    //   140: ifnull +14 -> 154
    //   143: aload 6
    //   145: invokeinterface 87 1 0
    //   150: iload 4
    //   152: istore 5
    //   154: ldc 89
    //   156: new 91	java/lang/StringBuilder
    //   159: dup
    //   160: ldc 93
    //   162: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   165: iload 5
    //   167: invokevirtual 100	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   170: ldc 102
    //   172: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: aload_2
    //   176: getfield 84	com/tencent/mm/pointers/PInt:value	I
    //   179: invokevirtual 108	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   182: ldc 110
    //   184: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: aload_3
    //   188: getfield 84	com/tencent/mm/pointers/PInt:value	I
    //   191: invokevirtual 108	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   194: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: invokestatic 119	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   200: ldc2_w 41
    //   203: sipush 2531
    //   206: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   209: iload 5
    //   211: ireturn
    //   212: astore 7
    //   214: aconst_null
    //   215: astore 6
    //   217: aload 6
    //   219: astore_1
    //   220: ldc 89
    //   222: aload 7
    //   224: ldc 58
    //   226: iconst_0
    //   227: anewarray 4	java/lang/Object
    //   230: invokestatic 123	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: aload 6
    //   235: ifnull +45 -> 280
    //   238: aload 6
    //   240: invokeinterface 87 1 0
    //   245: iconst_0
    //   246: istore 5
    //   248: goto -94 -> 154
    //   251: astore_1
    //   252: aload 6
    //   254: astore_2
    //   255: aload_2
    //   256: ifnull +9 -> 265
    //   259: aload_2
    //   260: invokeinterface 87 1 0
    //   265: aload_1
    //   266: athrow
    //   267: astore_3
    //   268: aload_1
    //   269: astore_2
    //   270: aload_3
    //   271: astore_1
    //   272: goto -17 -> 255
    //   275: astore 7
    //   277: goto -60 -> 217
    //   280: iconst_0
    //   281: istore 5
    //   283: goto -129 -> 154
    //   286: iconst_0
    //   287: istore 4
    //   289: goto -155 -> 134
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	292	0	this	w
    //   0	292	1	paramString	String
    //   0	292	2	paramPInt1	com.tencent.mm.pointers.PInt
    //   0	292	3	paramPInt2	com.tencent.mm.pointers.PInt
    //   132	156	4	bool1	boolean
    //   136	146	5	bool2	boolean
    //   10	243	6	str	String
    //   16	8	7	locale	e
    //   212	11	7	localException1	Exception
    //   275	1	7	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   12	64	212	java/lang/Exception
    //   12	64	251	finally
    //   75	85	267	finally
    //   88	108	267	finally
    //   111	131	267	finally
    //   220	233	267	finally
    //   75	85	275	java/lang/Exception
    //   88	108	275	java/lang/Exception
    //   111	131	275	java/lang/Exception
  }
  
  /* Error */
  public final boolean mC(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 126
    //   3: sipush 2530
    //   6: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 130	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: ifeq +14 -> 27
    //   16: ldc2_w 126
    //   19: sipush 2530
    //   22: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: iconst_0
    //   26: ireturn
    //   27: aconst_null
    //   28: astore_3
    //   29: aload_0
    //   30: getfield 36	com/tencent/mm/modelvideo/w:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   33: astore 4
    //   35: aload_1
    //   36: invokestatic 48	com/tencent/mm/sdk/platformtools/bg:nk	(Ljava/lang/String;)Ljava/lang/String;
    //   39: astore_1
    //   40: aload 4
    //   42: ldc 50
    //   44: iconst_1
    //   45: anewarray 20	java/lang/String
    //   48: dup
    //   49: iconst_0
    //   50: ldc -124
    //   52: aastore
    //   53: ldc 56
    //   55: iconst_1
    //   56: anewarray 20	java/lang/String
    //   59: dup
    //   60: iconst_0
    //   61: aload_1
    //   62: aastore
    //   63: ldc 58
    //   65: ldc 58
    //   67: ldc 58
    //   69: invokeinterface 136 8 0
    //   74: astore_1
    //   75: aload_1
    //   76: astore_3
    //   77: aload_3
    //   78: ifnull +37 -> 115
    //   81: aload_3
    //   82: astore_1
    //   83: aload_3
    //   84: invokeinterface 70 1 0
    //   89: istore_2
    //   90: iload_2
    //   91: ifeq +24 -> 115
    //   94: aload_3
    //   95: ifnull +9 -> 104
    //   98: aload_3
    //   99: invokeinterface 87 1 0
    //   104: ldc2_w 126
    //   107: sipush 2530
    //   110: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   113: iconst_1
    //   114: ireturn
    //   115: aload_3
    //   116: ifnull +9 -> 125
    //   119: aload_3
    //   120: invokeinterface 87 1 0
    //   125: ldc2_w 126
    //   128: sipush 2530
    //   131: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   134: iconst_0
    //   135: ireturn
    //   136: astore 4
    //   138: aconst_null
    //   139: astore_3
    //   140: aload_3
    //   141: astore_1
    //   142: ldc 89
    //   144: aload 4
    //   146: ldc 58
    //   148: iconst_0
    //   149: anewarray 4	java/lang/Object
    //   152: invokestatic 123	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   155: aload_3
    //   156: ifnull -31 -> 125
    //   159: aload_3
    //   160: invokeinterface 87 1 0
    //   165: goto -40 -> 125
    //   168: astore_1
    //   169: aload_3
    //   170: ifnull +9 -> 179
    //   173: aload_3
    //   174: invokeinterface 87 1 0
    //   179: aload_1
    //   180: athrow
    //   181: astore 4
    //   183: aload_1
    //   184: astore_3
    //   185: aload 4
    //   187: astore_1
    //   188: goto -19 -> 169
    //   191: astore 4
    //   193: goto -53 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	w
    //   0	196	1	paramString	String
    //   89	2	2	bool	boolean
    //   28	157	3	str	String
    //   33	8	4	locale	e
    //   136	9	4	localException1	Exception
    //   181	5	4	localObject	Object
    //   191	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   29	75	136	java/lang/Exception
    //   29	75	168	finally
    //   83	90	181	finally
    //   142	155	181	finally
    //   83	90	191	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
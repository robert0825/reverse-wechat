package com.tencent.mm.pluginsdk.i;

public final class o
{
  public final int action;
  public final String content;
  public final int eDB;
  public final int errorCode;
  public final String title;
  public final int tpx;
  public final int type;
  public final String url;
  
  /* Error */
  public o(int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 21	java/lang/Object:<init>	()V
    //   4: ldc2_w 22
    //   7: sipush 5268
    //   10: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: iconst_0
    //   14: istore 4
    //   16: iconst_0
    //   17: istore 5
    //   19: iconst_5
    //   20: istore 6
    //   22: iload 6
    //   24: istore 9
    //   26: iload 5
    //   28: istore 8
    //   30: iload 4
    //   32: istore 7
    //   34: aload_3
    //   35: ldc 31
    //   37: invokestatic 37	com/tencent/mm/sdk/platformtools/bh:q	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   40: astore 11
    //   42: aload 11
    //   44: ifnonnull +123 -> 167
    //   47: iload 6
    //   49: istore 9
    //   51: iload 5
    //   53: istore 8
    //   55: iload 4
    //   57: istore 7
    //   59: new 39	java/lang/IllegalArgumentException
    //   62: dup
    //   63: ldc 41
    //   65: invokespecial 44	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   68: athrow
    //   69: astore 11
    //   71: ldc 46
    //   73: astore 10
    //   75: ldc 46
    //   77: astore_3
    //   78: iload 9
    //   80: istore 4
    //   82: iload 8
    //   84: istore 5
    //   86: iload 7
    //   88: istore 6
    //   90: ldc 48
    //   92: aload 11
    //   94: invokevirtual 52	java/lang/Exception:toString	()Ljava/lang/String;
    //   97: invokestatic 57	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   100: ldc 46
    //   102: astore 11
    //   104: iload 6
    //   106: istore 7
    //   108: iload 4
    //   110: istore 6
    //   112: aload_0
    //   113: iload_2
    //   114: putfield 59	com/tencent/mm/pluginsdk/i/o:errorCode	I
    //   117: aload_0
    //   118: iload_1
    //   119: putfield 61	com/tencent/mm/pluginsdk/i/o:eDB	I
    //   122: aload_0
    //   123: iload 7
    //   125: putfield 63	com/tencent/mm/pluginsdk/i/o:type	I
    //   128: aload_0
    //   129: iload 5
    //   131: putfield 65	com/tencent/mm/pluginsdk/i/o:action	I
    //   134: aload_0
    //   135: aload 11
    //   137: putfield 67	com/tencent/mm/pluginsdk/i/o:content	Ljava/lang/String;
    //   140: aload_0
    //   141: iload 6
    //   143: putfield 69	com/tencent/mm/pluginsdk/i/o:tpx	I
    //   146: aload_0
    //   147: aload 10
    //   149: putfield 71	com/tencent/mm/pluginsdk/i/o:title	Ljava/lang/String;
    //   152: aload_0
    //   153: aload_3
    //   154: putfield 73	com/tencent/mm/pluginsdk/i/o:url	Ljava/lang/String;
    //   157: ldc2_w 22
    //   160: sipush 5268
    //   163: invokestatic 76	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   166: return
    //   167: iload 6
    //   169: istore 9
    //   171: iload 5
    //   173: istore 8
    //   175: iload 4
    //   177: istore 7
    //   179: aload 11
    //   181: ldc 78
    //   183: invokeinterface 84 2 0
    //   188: checkcast 86	java/lang/String
    //   191: invokestatic 92	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   194: invokevirtual 96	java/lang/Integer:intValue	()I
    //   197: istore 4
    //   199: iload 6
    //   201: istore 9
    //   203: iload 5
    //   205: istore 8
    //   207: iload 4
    //   209: istore 7
    //   211: aload 11
    //   213: ldc 98
    //   215: invokeinterface 84 2 0
    //   220: checkcast 86	java/lang/String
    //   223: invokestatic 92	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   226: invokevirtual 96	java/lang/Integer:intValue	()I
    //   229: istore 5
    //   231: iload 6
    //   233: istore 9
    //   235: iload 5
    //   237: istore 8
    //   239: iload 4
    //   241: istore 7
    //   243: aload 11
    //   245: ldc 100
    //   247: invokeinterface 84 2 0
    //   252: checkcast 86	java/lang/String
    //   255: invokestatic 92	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   258: invokevirtual 96	java/lang/Integer:intValue	()I
    //   261: istore 6
    //   263: iload 6
    //   265: istore 9
    //   267: iload 5
    //   269: istore 8
    //   271: iload 4
    //   273: istore 7
    //   275: aload 11
    //   277: ldc 102
    //   279: invokeinterface 84 2 0
    //   284: checkcast 86	java/lang/String
    //   287: astore 10
    //   289: aload 11
    //   291: ldc 104
    //   293: invokeinterface 84 2 0
    //   298: checkcast 86	java/lang/String
    //   301: astore_3
    //   302: aload 11
    //   304: ldc 106
    //   306: invokeinterface 84 2 0
    //   311: checkcast 86	java/lang/String
    //   314: astore 11
    //   316: iload 4
    //   318: istore 7
    //   320: goto -208 -> 112
    //   323: astore 11
    //   325: ldc 46
    //   327: astore_3
    //   328: iload 4
    //   330: istore 7
    //   332: iload 6
    //   334: istore 4
    //   336: iload 7
    //   338: istore 6
    //   340: goto -250 -> 90
    //   343: astore 11
    //   345: iload 4
    //   347: istore 7
    //   349: iload 6
    //   351: istore 4
    //   353: iload 7
    //   355: istore 6
    //   357: goto -267 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	360	0	this	o
    //   0	360	1	paramInt1	int
    //   0	360	2	paramInt2	int
    //   0	360	3	paramString	String
    //   14	338	4	i	int
    //   17	251	5	j	int
    //   20	336	6	k	int
    //   32	322	7	m	int
    //   28	242	8	n	int
    //   24	242	9	i1	int
    //   73	215	10	str1	String
    //   40	3	11	localMap	java.util.Map
    //   69	24	11	localException1	Exception
    //   102	213	11	str2	String
    //   323	1	11	localException2	Exception
    //   343	1	11	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   34	42	69	java/lang/Exception
    //   59	69	69	java/lang/Exception
    //   179	199	69	java/lang/Exception
    //   211	231	69	java/lang/Exception
    //   243	263	69	java/lang/Exception
    //   275	289	69	java/lang/Exception
    //   289	302	323	java/lang/Exception
    //   302	316	343	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
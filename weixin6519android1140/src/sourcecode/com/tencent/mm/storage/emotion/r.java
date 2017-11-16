package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class r
  extends i<q>
  implements f.a
{
  public static final String[] fTX;
  private static final String[] vCP;
  private static final String[] vCQ;
  public e fTZ;
  
  static
  {
    GMTrace.i(1546590879744L, 11523);
    fTX = new String[] { i.a(q.fTp, "SmileyInfo") };
    vCP = new String[] { "key", "cnValue", "qqValue", "enValue", "twValue", "thValue", "eggIndex", "fileName" };
    vCQ = new String[] { "key" };
    GMTrace.o(1546590879744L, 11523);
  }
  
  public r(e parame)
  {
    this(parame, q.fTp, "SmileyInfo");
    GMTrace.i(1545919791104L, 11518);
    GMTrace.o(1545919791104L, 11518);
  }
  
  private r(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    GMTrace.i(1546054008832L, 11519);
    this.fTZ = parame;
    GMTrace.o(1546054008832L, 11519);
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1546188226560L, 11520);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1546188226560L, 11520);
    return 0;
  }
  
  /* Error */
  public final java.util.ArrayList<q> aqA()
  {
    // Byte code:
    //   0: ldc2_w 85
    //   3: sipush 11522
    //   6: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 88	java/util/ArrayList
    //   12: dup
    //   13: invokespecial 90	java/util/ArrayList:<init>	()V
    //   16: astore 5
    //   18: aload_0
    //   19: getfield 77	com/tencent/mm/storage/emotion/r:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   22: ldc 33
    //   24: getstatic 57	com/tencent/mm/storage/emotion/r:vCP	[Ljava/lang/String;
    //   27: ldc 92
    //   29: iconst_1
    //   30: anewarray 25	java/lang/String
    //   33: dup
    //   34: iconst_0
    //   35: ldc 94
    //   37: aastore
    //   38: aconst_null
    //   39: aconst_null
    //   40: aconst_null
    //   41: iconst_2
    //   42: invokeinterface 99 9 0
    //   47: astore_3
    //   48: aload_3
    //   49: ifnull +64 -> 113
    //   52: aload_3
    //   53: astore_2
    //   54: aload_3
    //   55: invokeinterface 105 1 0
    //   60: ifeq +53 -> 113
    //   63: aload_3
    //   64: astore_2
    //   65: new 27	com/tencent/mm/storage/emotion/q
    //   68: dup
    //   69: invokespecial 106	com/tencent/mm/storage/emotion/q:<init>	()V
    //   72: astore 4
    //   74: aload_3
    //   75: astore_2
    //   76: aload 4
    //   78: aload_3
    //   79: invokevirtual 110	com/tencent/mm/storage/emotion/q:b	(Landroid/database/Cursor;)V
    //   82: aload_3
    //   83: astore_2
    //   84: aload 4
    //   86: iconst_m1
    //   87: putfield 114	com/tencent/mm/storage/emotion/q:field_position	I
    //   90: aload_3
    //   91: astore_2
    //   92: aload 5
    //   94: aload 4
    //   96: invokevirtual 118	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   99: pop
    //   100: aload_3
    //   101: astore_2
    //   102: aload_3
    //   103: invokeinterface 121 1 0
    //   108: istore_1
    //   109: iload_1
    //   110: ifne -47 -> 63
    //   113: aload_3
    //   114: ifnull +9 -> 123
    //   117: aload_3
    //   118: invokeinterface 124 1 0
    //   123: ldc2_w 85
    //   126: sipush 11522
    //   129: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   132: aload 5
    //   134: areturn
    //   135: astore 4
    //   137: aconst_null
    //   138: astore_3
    //   139: aload_3
    //   140: astore_2
    //   141: ldc 126
    //   143: aload 4
    //   145: invokestatic 132	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   148: invokestatic 138	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   151: aload_3
    //   152: ifnull -29 -> 123
    //   155: aload_3
    //   156: invokeinterface 124 1 0
    //   161: goto -38 -> 123
    //   164: astore_3
    //   165: aconst_null
    //   166: astore_2
    //   167: aload_2
    //   168: ifnull +9 -> 177
    //   171: aload_2
    //   172: invokeinterface 124 1 0
    //   177: aload_3
    //   178: athrow
    //   179: astore_3
    //   180: goto -13 -> 167
    //   183: astore 4
    //   185: goto -46 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	this	r
    //   108	2	1	bool	boolean
    //   53	119	2	localCursor1	android.database.Cursor
    //   47	109	3	localCursor2	android.database.Cursor
    //   164	14	3	localObject1	Object
    //   179	1	3	localObject2	Object
    //   72	23	4	localq	q
    //   135	9	4	localException1	Exception
    //   183	1	4	localException2	Exception
    //   16	117	5	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   18	48	135	java/lang/Exception
    //   18	48	164	finally
    //   54	63	179	finally
    //   65	74	179	finally
    //   76	82	179	finally
    //   84	90	179	finally
    //   92	100	179	finally
    //   102	109	179	finally
    //   141	151	179	finally
    //   54	63	183	java/lang/Exception
    //   65	74	183	java/lang/Exception
    //   76	82	183	java/lang/Exception
    //   84	90	183	java/lang/Exception
    //   92	100	183	java/lang/Exception
    //   102	109	183	java/lang/Exception
  }
  
  /* Error */
  public final java.util.ArrayList<String> aqB()
  {
    // Byte code:
    //   0: ldc2_w 142
    //   3: sipush 11521
    //   6: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 88	java/util/ArrayList
    //   12: dup
    //   13: invokespecial 90	java/util/ArrayList:<init>	()V
    //   16: astore 5
    //   18: aload_0
    //   19: getfield 77	com/tencent/mm/storage/emotion/r:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   22: ldc 33
    //   24: getstatic 59	com/tencent/mm/storage/emotion/r:vCQ	[Ljava/lang/String;
    //   27: ldc 92
    //   29: iconst_1
    //   30: anewarray 25	java/lang/String
    //   33: dup
    //   34: iconst_0
    //   35: ldc 94
    //   37: aastore
    //   38: aconst_null
    //   39: aconst_null
    //   40: aconst_null
    //   41: iconst_2
    //   42: invokeinterface 99 9 0
    //   47: astore_3
    //   48: aload_3
    //   49: ifnull +42 -> 91
    //   52: aload_3
    //   53: astore_2
    //   54: aload_3
    //   55: invokeinterface 105 1 0
    //   60: ifeq +31 -> 91
    //   63: aload_3
    //   64: astore_2
    //   65: aload 5
    //   67: aload_3
    //   68: iconst_0
    //   69: invokeinterface 147 2 0
    //   74: invokevirtual 118	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   77: pop
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: invokeinterface 121 1 0
    //   86: istore_1
    //   87: iload_1
    //   88: ifne -25 -> 63
    //   91: aload_3
    //   92: ifnull +9 -> 101
    //   95: aload_3
    //   96: invokeinterface 124 1 0
    //   101: ldc2_w 142
    //   104: sipush 11521
    //   107: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   110: aload 5
    //   112: areturn
    //   113: astore 4
    //   115: aconst_null
    //   116: astore_3
    //   117: aload_3
    //   118: astore_2
    //   119: ldc 126
    //   121: aload 4
    //   123: invokestatic 132	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   126: invokestatic 138	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   129: aload_3
    //   130: ifnull -29 -> 101
    //   133: aload_3
    //   134: invokeinterface 124 1 0
    //   139: goto -38 -> 101
    //   142: astore_3
    //   143: aconst_null
    //   144: astore_2
    //   145: aload_2
    //   146: ifnull +9 -> 155
    //   149: aload_2
    //   150: invokeinterface 124 1 0
    //   155: aload_3
    //   156: athrow
    //   157: astore_3
    //   158: goto -13 -> 145
    //   161: astore 4
    //   163: goto -46 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	this	r
    //   86	2	1	bool	boolean
    //   53	97	2	localCursor1	android.database.Cursor
    //   47	87	3	localCursor2	android.database.Cursor
    //   142	14	3	localObject1	Object
    //   157	1	3	localObject2	Object
    //   113	9	4	localException1	Exception
    //   161	1	4	localException2	Exception
    //   16	95	5	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   18	48	113	java/lang/Exception
    //   18	48	142	finally
    //   54	63	157	finally
    //   65	78	157	finally
    //   80	87	157	finally
    //   119	129	157	finally
    //   54	63	161	java/lang/Exception
    //   65	78	161	java/lang/Exception
    //   80	87	161	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
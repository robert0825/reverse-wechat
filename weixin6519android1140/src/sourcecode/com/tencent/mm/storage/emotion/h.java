package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class h
  extends i<g>
  implements f.a
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(1565515579392L, 11664);
    fTX = new String[] { i.a(g.fTp, "EmotionDesignerInfo") };
    GMTrace.o(1565515579392L, 11664);
  }
  
  public h(e parame)
  {
    super(parame, g.fTp, "EmotionDesignerInfo", null);
    GMTrace.i(1564978708480L, 11660);
    this.fTZ = parame;
    GMTrace.o(1564978708480L, 11660);
  }
  
  /* Error */
  public final com.tencent.mm.protocal.c.zo UN(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 57
    //   3: sipush 11662
    //   6: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: ifeq +21 -> 34
    //   16: ldc 66
    //   18: ldc 68
    //   20: invokestatic 74	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: ldc2_w 57
    //   26: sipush 11662
    //   29: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   32: aconst_null
    //   33: areturn
    //   34: new 76	java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial 78	java/lang/StringBuilder:<init>	()V
    //   41: aload_1
    //   42: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: getstatic 86	com/tencent/mm/storage/emotion/h$a:vCL	Lcom/tencent/mm/storage/emotion/h$a;
    //   48: getfield 90	com/tencent/mm/storage/emotion/h$a:value	I
    //   51: invokevirtual 93	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   54: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: astore_1
    //   58: aload_0
    //   59: getfield 52	com/tencent/mm/storage/emotion/h:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   62: ldc 34
    //   64: iconst_1
    //   65: anewarray 26	java/lang/String
    //   68: dup
    //   69: iconst_0
    //   70: ldc 99
    //   72: aastore
    //   73: ldc 101
    //   75: iconst_1
    //   76: anewarray 26	java/lang/String
    //   79: dup
    //   80: iconst_0
    //   81: aload_1
    //   82: aastore
    //   83: aconst_null
    //   84: aconst_null
    //   85: aconst_null
    //   86: iconst_2
    //   87: invokeinterface 106 9 0
    //   92: astore_1
    //   93: aload_1
    //   94: ifnull +131 -> 225
    //   97: aload_1
    //   98: astore_2
    //   99: aload_1
    //   100: invokeinterface 112 1 0
    //   105: ifeq +120 -> 225
    //   108: aload_1
    //   109: astore_2
    //   110: new 114	com/tencent/mm/protocal/c/zo
    //   113: dup
    //   114: invokespecial 115	com/tencent/mm/protocal/c/zo:<init>	()V
    //   117: astore_3
    //   118: aload_1
    //   119: astore_2
    //   120: aload_3
    //   121: aload_1
    //   122: iconst_0
    //   123: invokeinterface 119 2 0
    //   128: invokevirtual 123	com/tencent/mm/protocal/c/zo:aD	([B)Lcom/tencent/mm/bm/a;
    //   131: pop
    //   132: aload_3
    //   133: astore_2
    //   134: aload_2
    //   135: astore_3
    //   136: aload_1
    //   137: ifnull +11 -> 148
    //   140: aload_1
    //   141: invokeinterface 126 1 0
    //   146: aload_2
    //   147: astore_3
    //   148: ldc2_w 57
    //   151: sipush 11662
    //   154: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   157: aload_3
    //   158: areturn
    //   159: astore_3
    //   160: aconst_null
    //   161: astore_1
    //   162: aload_1
    //   163: astore_2
    //   164: ldc 66
    //   166: ldc -128
    //   168: iconst_1
    //   169: anewarray 130	java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: aload_3
    //   175: invokestatic 134	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   178: aastore
    //   179: invokestatic 138	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: aload_1
    //   183: ifnull +37 -> 220
    //   186: aload_1
    //   187: invokeinterface 126 1 0
    //   192: aconst_null
    //   193: astore_3
    //   194: goto -46 -> 148
    //   197: astore_1
    //   198: aconst_null
    //   199: astore_2
    //   200: aload_2
    //   201: ifnull +9 -> 210
    //   204: aload_2
    //   205: invokeinterface 126 1 0
    //   210: aload_1
    //   211: athrow
    //   212: astore_1
    //   213: goto -13 -> 200
    //   216: astore_3
    //   217: goto -55 -> 162
    //   220: aconst_null
    //   221: astore_3
    //   222: goto -74 -> 148
    //   225: aconst_null
    //   226: astore_2
    //   227: goto -93 -> 134
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	230	0	this	h
    //   0	230	1	paramString	String
    //   98	129	2	localObject1	Object
    //   117	41	3	localObject2	Object
    //   159	16	3	localException1	Exception
    //   193	1	3	localObject3	Object
    //   216	1	3	localException2	Exception
    //   221	1	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   58	93	159	java/lang/Exception
    //   58	93	197	finally
    //   99	108	212	finally
    //   110	118	212	finally
    //   120	132	212	finally
    //   164	182	212	finally
    //   99	108	216	java/lang/Exception
    //   110	118	216	java/lang/Exception
    //   120	132	216	java/lang/Exception
  }
  
  /* Error */
  public final com.tencent.mm.protocal.c.zm UO(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 143
    //   3: sipush 11663
    //   6: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 64	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: ifeq +21 -> 34
    //   16: ldc 66
    //   18: ldc -110
    //   20: invokestatic 74	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: ldc2_w 143
    //   26: sipush 11663
    //   29: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   32: aconst_null
    //   33: areturn
    //   34: new 76	java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial 78	java/lang/StringBuilder:<init>	()V
    //   41: aload_1
    //   42: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: getstatic 149	com/tencent/mm/storage/emotion/h$a:vCN	Lcom/tencent/mm/storage/emotion/h$a;
    //   48: getfield 90	com/tencent/mm/storage/emotion/h$a:value	I
    //   51: invokevirtual 93	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   54: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: astore_1
    //   58: aload_0
    //   59: getfield 52	com/tencent/mm/storage/emotion/h:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   62: ldc 34
    //   64: iconst_1
    //   65: anewarray 26	java/lang/String
    //   68: dup
    //   69: iconst_0
    //   70: ldc 99
    //   72: aastore
    //   73: ldc 101
    //   75: iconst_1
    //   76: anewarray 26	java/lang/String
    //   79: dup
    //   80: iconst_0
    //   81: aload_1
    //   82: aastore
    //   83: aconst_null
    //   84: aconst_null
    //   85: aconst_null
    //   86: iconst_2
    //   87: invokeinterface 106 9 0
    //   92: astore_1
    //   93: aload_1
    //   94: ifnull +131 -> 225
    //   97: aload_1
    //   98: astore_2
    //   99: aload_1
    //   100: invokeinterface 112 1 0
    //   105: ifeq +120 -> 225
    //   108: aload_1
    //   109: astore_2
    //   110: new 151	com/tencent/mm/protocal/c/zm
    //   113: dup
    //   114: invokespecial 152	com/tencent/mm/protocal/c/zm:<init>	()V
    //   117: astore_3
    //   118: aload_1
    //   119: astore_2
    //   120: aload_3
    //   121: aload_1
    //   122: iconst_0
    //   123: invokeinterface 119 2 0
    //   128: invokevirtual 153	com/tencent/mm/protocal/c/zm:aD	([B)Lcom/tencent/mm/bm/a;
    //   131: pop
    //   132: aload_3
    //   133: astore_2
    //   134: aload_2
    //   135: astore_3
    //   136: aload_1
    //   137: ifnull +11 -> 148
    //   140: aload_1
    //   141: invokeinterface 126 1 0
    //   146: aload_2
    //   147: astore_3
    //   148: ldc2_w 143
    //   151: sipush 11663
    //   154: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   157: aload_3
    //   158: areturn
    //   159: astore_3
    //   160: aconst_null
    //   161: astore_1
    //   162: aload_1
    //   163: astore_2
    //   164: ldc 66
    //   166: ldc -128
    //   168: iconst_1
    //   169: anewarray 130	java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: aload_3
    //   175: invokestatic 134	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   178: aastore
    //   179: invokestatic 138	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: aload_1
    //   183: ifnull +37 -> 220
    //   186: aload_1
    //   187: invokeinterface 126 1 0
    //   192: aconst_null
    //   193: astore_3
    //   194: goto -46 -> 148
    //   197: astore_1
    //   198: aconst_null
    //   199: astore_2
    //   200: aload_2
    //   201: ifnull +9 -> 210
    //   204: aload_2
    //   205: invokeinterface 126 1 0
    //   210: aload_1
    //   211: athrow
    //   212: astore_1
    //   213: goto -13 -> 200
    //   216: astore_3
    //   217: goto -55 -> 162
    //   220: aconst_null
    //   221: astore_3
    //   222: goto -74 -> 148
    //   225: aconst_null
    //   226: astore_2
    //   227: goto -93 -> 134
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	230	0	this	h
    //   0	230	1	paramString	String
    //   98	129	2	localObject1	Object
    //   117	41	3	localObject2	Object
    //   159	16	3	localIOException1	java.io.IOException
    //   193	1	3	localObject3	Object
    //   216	1	3	localIOException2	java.io.IOException
    //   221	1	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   58	93	159	java/io/IOException
    //   58	93	197	finally
    //   99	108	212	finally
    //   110	118	212	finally
    //   120	132	212	finally
    //   164	182	212	finally
    //   99	108	216	java/io/IOException
    //   110	118	216	java/io/IOException
    //   120	132	216	java/io/IOException
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1565112926208L, 11661);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1565112926208L, 11661);
    return 0;
  }
  
  public static enum a
  {
    public int value;
    
    static
    {
      GMTrace.i(1549275234304L, 11543);
      vCL = new a("DesignerSimpleInfo", 0, 0);
      vCM = new a("PersonalDesigner", 1, 1);
      vCN = new a("DesignerEmojiList", 2, 2);
      vCO = new a[] { vCL, vCM, vCN };
      GMTrace.o(1549275234304L, 11543);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(1549141016576L, 11542);
      this.value = paramInt;
      GMTrace.o(1549141016576L, 11542);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
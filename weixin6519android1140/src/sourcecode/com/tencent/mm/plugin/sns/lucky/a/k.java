package com.tencent.mm.plugin.sns.lucky.a;

public final class k
{
  /* Error */
  public static com.tencent.mm.plugin.sns.g.i g(com.tencent.mm.storage.w.a parama)
  {
    // Byte code:
    //   0: ldc2_w 9
    //   3: ldc 11
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 19	com/tencent/mm/plugin/sns/g/i
    //   11: dup
    //   12: invokespecial 23	com/tencent/mm/plugin/sns/g/i:<init>	()V
    //   15: astore_2
    //   16: invokestatic 29	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
    //   19: pop
    //   20: invokestatic 33	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   23: invokevirtual 39	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
    //   26: aload_0
    //   27: aconst_null
    //   28: invokevirtual 45	com/tencent/mm/storage/t:get	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast 47	java/lang/String
    //   34: astore_0
    //   35: aload_0
    //   36: ifnonnull +20 -> 56
    //   39: ldc 49
    //   41: ldc 51
    //   43: invokestatic 56	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: ldc2_w 9
    //   49: ldc 11
    //   51: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   54: aload_2
    //   55: areturn
    //   56: new 19	com/tencent/mm/plugin/sns/g/i
    //   59: dup
    //   60: invokespecial 23	com/tencent/mm/plugin/sns/g/i:<init>	()V
    //   63: aload_0
    //   64: ldc 61
    //   66: invokestatic 67	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   69: invokevirtual 71	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   72: invokevirtual 75	com/tencent/mm/plugin/sns/g/i:aD	([B)Lcom/tencent/mm/bm/a;
    //   75: checkcast 19	com/tencent/mm/plugin/sns/g/i
    //   78: astore_1
    //   79: aload_1
    //   80: astore_0
    //   81: aload_1
    //   82: ifnonnull +11 -> 93
    //   85: new 19	com/tencent/mm/plugin/sns/g/i
    //   88: dup
    //   89: invokespecial 23	com/tencent/mm/plugin/sns/g/i:<init>	()V
    //   92: astore_0
    //   93: aload_0
    //   94: astore_1
    //   95: aload_0
    //   96: ifnonnull +11 -> 107
    //   99: new 19	com/tencent/mm/plugin/sns/g/i
    //   102: dup
    //   103: invokespecial 23	com/tencent/mm/plugin/sns/g/i:<init>	()V
    //   106: astore_1
    //   107: ldc2_w 9
    //   110: ldc 11
    //   112: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   115: aload_1
    //   116: areturn
    //   117: astore_1
    //   118: aload_2
    //   119: astore_0
    //   120: ldc 49
    //   122: new 77	java/lang/StringBuilder
    //   125: dup
    //   126: ldc 79
    //   128: invokespecial 82	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   131: aload_1
    //   132: invokevirtual 86	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   135: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: invokestatic 96	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   144: goto -51 -> 93
    //   147: astore_2
    //   148: aload_1
    //   149: astore_0
    //   150: aload_2
    //   151: astore_1
    //   152: goto -32 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	155	0	parama	com.tencent.mm.storage.w.a
    //   78	38	1	localObject	Object
    //   117	32	1	localException1	Exception
    //   151	1	1	localException2	Exception
    //   15	104	2	locali	com.tencent.mm.plugin.sns.g.i
    //   147	4	2	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   56	79	117	java/lang/Exception
    //   85	93	147	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
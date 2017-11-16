package com.tencent.mm.ai;

public final class b
{
  /* Error */
  public static Object g(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc2_w 9
    //   5: ldc 11
    //   7: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: new 19	java/io/ObjectInputStream
    //   13: dup
    //   14: aload_0
    //   15: invokespecial 23	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   18: astore_1
    //   19: aload_1
    //   20: astore_0
    //   21: aload_1
    //   22: invokevirtual 27	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   25: astore_2
    //   26: aload_2
    //   27: astore_0
    //   28: aload_1
    //   29: invokevirtual 31	java/io/ObjectInputStream:close	()V
    //   32: ldc2_w 9
    //   35: ldc 11
    //   37: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   40: aload_0
    //   41: areturn
    //   42: astore_1
    //   43: ldc 36
    //   45: new 38	java/lang/StringBuilder
    //   48: dup
    //   49: ldc 40
    //   51: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   54: aload_1
    //   55: invokevirtual 47	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   58: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   64: invokestatic 60	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   67: goto -35 -> 32
    //   70: astore_2
    //   71: aconst_null
    //   72: astore_1
    //   73: aload_1
    //   74: astore_0
    //   75: ldc 36
    //   77: new 38	java/lang/StringBuilder
    //   80: dup
    //   81: ldc 62
    //   83: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   86: aload_2
    //   87: invokevirtual 47	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   90: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: invokestatic 60	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: aload_3
    //   100: astore_0
    //   101: aload_1
    //   102: ifnull -70 -> 32
    //   105: aload_1
    //   106: invokevirtual 31	java/io/ObjectInputStream:close	()V
    //   109: aload_3
    //   110: astore_0
    //   111: goto -79 -> 32
    //   114: astore_0
    //   115: ldc 36
    //   117: new 38	java/lang/StringBuilder
    //   120: dup
    //   121: ldc 40
    //   123: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   126: aload_0
    //   127: invokevirtual 47	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   130: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: invokestatic 60	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   139: aload_3
    //   140: astore_0
    //   141: goto -109 -> 32
    //   144: astore_1
    //   145: aconst_null
    //   146: astore_0
    //   147: aload_0
    //   148: ifnull +7 -> 155
    //   151: aload_0
    //   152: invokevirtual 31	java/io/ObjectInputStream:close	()V
    //   155: aload_1
    //   156: athrow
    //   157: astore_0
    //   158: ldc 36
    //   160: new 38	java/lang/StringBuilder
    //   163: dup
    //   164: ldc 40
    //   166: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   169: aload_0
    //   170: invokevirtual 47	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   173: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: invokestatic 60	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   182: goto -27 -> 155
    //   185: astore_1
    //   186: goto -39 -> 147
    //   189: astore_2
    //   190: goto -117 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	paramInputStream	java.io.InputStream
    //   18	11	1	localObjectInputStream	java.io.ObjectInputStream
    //   42	13	1	localException1	Exception
    //   72	34	1	localObject1	Object
    //   144	12	1	localObject2	Object
    //   185	1	1	localObject3	Object
    //   25	2	2	localObject4	Object
    //   70	17	2	localException2	Exception
    //   189	1	2	localException3	Exception
    //   1	139	3	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   28	32	42	java/lang/Exception
    //   10	19	70	java/lang/Exception
    //   105	109	114	java/lang/Exception
    //   10	19	144	finally
    //   151	155	157	java/lang/Exception
    //   21	26	185	finally
    //   75	99	185	finally
    //   21	26	189	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ai\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
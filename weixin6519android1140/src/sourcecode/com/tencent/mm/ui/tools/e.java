package com.tencent.mm.ui.tools;

import com.tencent.gmtrace.GMTrace;

public final class e
{
  public static int xgO;
  
  static
  {
    GMTrace.i(2060107907072L, 15349);
    xgO = 0;
    GMTrace.o(2060107907072L, 15349);
  }
  
  /* Error */
  public static void f(java.io.File paramFile1, java.io.File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: ldc2_w 29
    //   7: sipush 15348
    //   10: invokestatic 16	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: aload_0
    //   14: invokevirtual 36	java/io/File:exists	()Z
    //   17: ifeq +83 -> 100
    //   20: aload_0
    //   21: invokevirtual 39	java/io/File:delete	()Z
    //   24: pop
    //   25: new 41	java/io/FileInputStream
    //   28: dup
    //   29: aload_1
    //   30: invokespecial 45	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: astore_1
    //   34: new 47	java/io/FileOutputStream
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 48	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   42: astore_0
    //   43: sipush 1024
    //   46: newarray <illegal type>
    //   48: astore_2
    //   49: aload_1
    //   50: aload_2
    //   51: invokevirtual 54	java/io/InputStream:read	([B)I
    //   54: iconst_m1
    //   55: if_icmpeq +71 -> 126
    //   58: aload_0
    //   59: aload_2
    //   60: invokevirtual 58	java/io/FileOutputStream:write	([B)V
    //   63: goto -14 -> 49
    //   66: astore_2
    //   67: ldc 60
    //   69: ldc 62
    //   71: invokestatic 68	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: aload_1
    //   75: ifnull +7 -> 82
    //   78: aload_1
    //   79: invokevirtual 71	java/io/InputStream:close	()V
    //   82: aload_0
    //   83: ifnull +7 -> 90
    //   86: aload_0
    //   87: invokevirtual 72	java/io/FileOutputStream:close	()V
    //   90: ldc2_w 29
    //   93: sipush 15348
    //   96: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   99: return
    //   100: aload_0
    //   101: invokevirtual 75	java/io/File:createNewFile	()Z
    //   104: pop
    //   105: goto -80 -> 25
    //   108: astore_0
    //   109: ldc 60
    //   111: ldc 62
    //   113: invokestatic 68	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   116: ldc2_w 29
    //   119: sipush 15348
    //   122: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   125: return
    //   126: aload_1
    //   127: invokevirtual 71	java/io/InputStream:close	()V
    //   130: aload_0
    //   131: invokevirtual 72	java/io/FileOutputStream:close	()V
    //   134: ldc2_w 29
    //   137: sipush 15348
    //   140: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   143: return
    //   144: astore_0
    //   145: ldc2_w 29
    //   148: sipush 15348
    //   151: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   154: return
    //   155: astore_0
    //   156: ldc2_w 29
    //   159: sipush 15348
    //   162: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   165: return
    //   166: astore_0
    //   167: aconst_null
    //   168: astore_1
    //   169: aload_1
    //   170: ifnull +7 -> 177
    //   173: aload_1
    //   174: invokevirtual 71	java/io/InputStream:close	()V
    //   177: aload_2
    //   178: ifnull +7 -> 185
    //   181: aload_2
    //   182: invokevirtual 72	java/io/FileOutputStream:close	()V
    //   185: aload_0
    //   186: athrow
    //   187: astore_1
    //   188: goto -3 -> 185
    //   191: astore_0
    //   192: goto -23 -> 169
    //   195: astore_3
    //   196: aload_0
    //   197: astore_2
    //   198: aload_3
    //   199: astore_0
    //   200: goto -31 -> 169
    //   203: astore_3
    //   204: aload_0
    //   205: astore_2
    //   206: aload_3
    //   207: astore_0
    //   208: goto -39 -> 169
    //   211: astore_0
    //   212: aconst_null
    //   213: astore_0
    //   214: aload_3
    //   215: astore_1
    //   216: goto -149 -> 67
    //   219: astore_0
    //   220: aconst_null
    //   221: astore_0
    //   222: goto -155 -> 67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	paramFile1	java.io.File
    //   0	225	1	paramFile2	java.io.File
    //   1	59	2	arrayOfByte	byte[]
    //   66	116	2	localException	Exception
    //   197	9	2	localFile	java.io.File
    //   3	1	3	localObject1	Object
    //   195	4	3	localObject2	Object
    //   203	12	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   43	49	66	java/lang/Exception
    //   49	63	66	java/lang/Exception
    //   100	105	108	java/io/IOException
    //   126	134	144	java/lang/Exception
    //   78	82	155	java/lang/Exception
    //   86	90	155	java/lang/Exception
    //   25	34	166	finally
    //   173	177	187	java/lang/Exception
    //   181	185	187	java/lang/Exception
    //   34	43	191	finally
    //   43	49	195	finally
    //   49	63	195	finally
    //   67	74	203	finally
    //   25	34	211	java/lang/Exception
    //   34	43	219	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
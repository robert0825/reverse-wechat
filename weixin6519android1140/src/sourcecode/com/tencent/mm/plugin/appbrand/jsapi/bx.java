package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class bx
{
  /* Error */
  public static void f(String paramString, String... paramVarArgs)
  {
    // Byte code:
    //   0: ldc2_w 9
    //   3: ldc 11
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 19	java/io/File
    //   11: dup
    //   12: invokestatic 25	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   15: invokevirtual 31	android/content/Context:getCacheDir	()Ljava/io/File;
    //   18: aload_0
    //   19: invokespecial 35	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: astore_0
    //   23: new 37	java/io/FileWriter
    //   26: dup
    //   27: aload_0
    //   28: invokespecial 40	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   31: astore 4
    //   33: aload_1
    //   34: arraylength
    //   35: istore_3
    //   36: iconst_0
    //   37: istore_2
    //   38: iload_2
    //   39: iload_3
    //   40: if_icmpge +18 -> 58
    //   43: aload 4
    //   45: aload_1
    //   46: iload_2
    //   47: aaload
    //   48: invokevirtual 44	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   51: iload_2
    //   52: iconst_1
    //   53: iadd
    //   54: istore_2
    //   55: goto -17 -> 38
    //   58: aload 4
    //   60: invokevirtual 48	java/io/FileWriter:close	()V
    //   63: ldc2_w 9
    //   66: ldc 11
    //   68: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   71: return
    //   72: astore_0
    //   73: ldc2_w 9
    //   76: ldc 11
    //   78: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   81: return
    //   82: astore_0
    //   83: aconst_null
    //   84: astore_1
    //   85: aload_1
    //   86: ifnull +7 -> 93
    //   89: aload_1
    //   90: invokevirtual 48	java/io/FileWriter:close	()V
    //   93: aload_0
    //   94: athrow
    //   95: astore_1
    //   96: goto -3 -> 93
    //   99: astore_0
    //   100: aload 4
    //   102: astore_1
    //   103: goto -18 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	paramString	String
    //   0	106	1	paramVarArgs	String[]
    //   37	18	2	i	int
    //   35	6	3	j	int
    //   31	70	4	localFileWriter	java.io.FileWriter
    // Exception table:
    //   from	to	target	type
    //   58	63	72	java/io/IOException
    //   23	33	82	finally
    //   89	93	95	java/io/IOException
    //   33	36	99	finally
    //   43	51	99	finally
  }
  
  public static int h(String... paramVarArgs)
  {
    int j = 0;
    GMTrace.i(10302687019008L, 76761);
    int m = paramVarArgs.length;
    int i = 0;
    while (i < m)
    {
      String str = paramVarArgs[i];
      int k = j;
      if (str != null) {
        k = j + str.length();
      }
      i += 1;
      j = k;
    }
    GMTrace.o(10302687019008L, 76761);
    return j;
  }
  
  /* Error */
  private static String q(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 68
    //   3: ldc 70
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokevirtual 74	java/io/File:exists	()Z
    //   12: ifne +14 -> 26
    //   15: ldc2_w 68
    //   18: ldc 70
    //   20: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   23: ldc 76
    //   25: areturn
    //   26: new 78	java/lang/StringBuffer
    //   29: dup
    //   30: invokespecial 80	java/lang/StringBuffer:<init>	()V
    //   33: astore_3
    //   34: new 82	java/io/BufferedReader
    //   37: dup
    //   38: new 84	java/io/FileReader
    //   41: dup
    //   42: aload_0
    //   43: invokespecial 85	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   46: invokespecial 88	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   49: astore_2
    //   50: aload_2
    //   51: astore_0
    //   52: sipush 1024
    //   55: newarray <illegal type>
    //   57: astore 4
    //   59: aload_2
    //   60: astore_0
    //   61: aload_2
    //   62: aload 4
    //   64: invokevirtual 92	java/io/BufferedReader:read	([C)I
    //   67: istore_1
    //   68: iload_1
    //   69: iconst_m1
    //   70: if_icmpeq +42 -> 112
    //   73: aload_2
    //   74: astore_0
    //   75: aload_3
    //   76: aload 4
    //   78: iconst_0
    //   79: iload_1
    //   80: invokestatic 96	java/lang/String:valueOf	([CII)Ljava/lang/String;
    //   83: invokevirtual 100	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   86: pop
    //   87: goto -28 -> 59
    //   90: astore_3
    //   91: aload_2
    //   92: astore_0
    //   93: aload_3
    //   94: astore_2
    //   95: aload_2
    //   96: athrow
    //   97: astore_3
    //   98: aload_0
    //   99: astore_2
    //   100: aload_3
    //   101: astore_0
    //   102: aload_2
    //   103: ifnull +7 -> 110
    //   106: aload_2
    //   107: invokevirtual 101	java/io/BufferedReader:close	()V
    //   110: aload_0
    //   111: athrow
    //   112: aload_2
    //   113: invokevirtual 101	java/io/BufferedReader:close	()V
    //   116: aload_3
    //   117: invokevirtual 105	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   120: astore_0
    //   121: ldc2_w 68
    //   124: ldc 70
    //   126: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   129: aload_0
    //   130: areturn
    //   131: astore_0
    //   132: aload_0
    //   133: athrow
    //   134: astore_0
    //   135: aload_0
    //   136: athrow
    //   137: astore_0
    //   138: aconst_null
    //   139: astore_2
    //   140: goto -38 -> 102
    //   143: astore_2
    //   144: aconst_null
    //   145: astore_0
    //   146: goto -51 -> 95
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	paramFile	File
    //   67	13	1	i	int
    //   49	91	2	localObject1	Object
    //   143	1	2	localIOException1	java.io.IOException
    //   33	43	3	localStringBuffer	StringBuffer
    //   90	4	3	localIOException2	java.io.IOException
    //   97	20	3	localObject2	Object
    //   57	20	4	arrayOfChar	char[]
    // Exception table:
    //   from	to	target	type
    //   52	59	90	java/io/IOException
    //   61	68	90	java/io/IOException
    //   75	87	90	java/io/IOException
    //   52	59	97	finally
    //   61	68	97	finally
    //   75	87	97	finally
    //   95	97	97	finally
    //   112	116	131	java/lang/Exception
    //   106	110	134	java/lang/Exception
    //   34	50	137	finally
    //   34	50	143	java/io/IOException
  }
  
  public static String qk(String paramString)
  {
    GMTrace.i(10303089672192L, 76764);
    paramString = q(new File(ab.getContext().getCacheDir(), paramString));
    GMTrace.o(10303089672192L, 76764);
    return paramString;
  }
  
  public static void ql(String paramString)
  {
    GMTrace.i(10303223889920L, 76765);
    boolean bool = new File(ab.getContext().getCacheDir(), paramString).delete();
    w.i("MicroMsg.JsApiStorageHelper", "deleteTmpFile: " + paramString + ":" + bool);
    GMTrace.o(10303223889920L, 76765);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
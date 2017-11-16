package com.tencent.mm.sdk.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Properties;

public final class a
{
  private String filePath;
  private Properties vmp;
  
  /* Error */
  public a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 17	java/lang/Object:<init>	()V
    //   4: ldc2_w 18
    //   7: ldc 20
    //   9: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: aconst_null
    //   14: putfield 28	com/tencent/mm/sdk/e/a:vmp	Ljava/util/Properties;
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield 30	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   22: aload_0
    //   23: new 32	java/util/Properties
    //   26: dup
    //   27: invokespecial 33	java/util/Properties:<init>	()V
    //   30: putfield 28	com/tencent/mm/sdk/e/a:vmp	Ljava/util/Properties;
    //   33: aload_0
    //   34: aload_1
    //   35: putfield 30	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   38: new 35	java/io/FileInputStream
    //   41: dup
    //   42: aload_1
    //   43: invokespecial 37	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   46: astore_3
    //   47: aload_3
    //   48: astore_2
    //   49: aload_0
    //   50: getfield 28	com/tencent/mm/sdk/e/a:vmp	Ljava/util/Properties;
    //   53: aload_3
    //   54: invokevirtual 41	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   57: aload_3
    //   58: invokevirtual 44	java/io/FileInputStream:close	()V
    //   61: ldc2_w 18
    //   64: ldc 20
    //   66: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   69: return
    //   70: astore_2
    //   71: ldc 49
    //   73: ldc 51
    //   75: iconst_2
    //   76: anewarray 4	java/lang/Object
    //   79: dup
    //   80: iconst_0
    //   81: aload_1
    //   82: aastore
    //   83: dup
    //   84: iconst_1
    //   85: aload_2
    //   86: invokevirtual 55	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   89: aastore
    //   90: invokestatic 61	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: ldc2_w 18
    //   96: ldc 20
    //   98: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   101: return
    //   102: astore 4
    //   104: aconst_null
    //   105: astore_3
    //   106: aload_3
    //   107: astore_2
    //   108: ldc 49
    //   110: ldc 63
    //   112: iconst_2
    //   113: anewarray 4	java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: aload_1
    //   119: aastore
    //   120: dup
    //   121: iconst_1
    //   122: aload 4
    //   124: invokevirtual 64	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   127: aastore
    //   128: invokestatic 61	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: aload_3
    //   132: ifnull +87 -> 219
    //   135: aload_3
    //   136: invokevirtual 44	java/io/FileInputStream:close	()V
    //   139: ldc2_w 18
    //   142: ldc 20
    //   144: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   147: return
    //   148: astore_2
    //   149: ldc 49
    //   151: ldc 51
    //   153: iconst_2
    //   154: anewarray 4	java/lang/Object
    //   157: dup
    //   158: iconst_0
    //   159: aload_1
    //   160: aastore
    //   161: dup
    //   162: iconst_1
    //   163: aload_2
    //   164: invokevirtual 55	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   167: aastore
    //   168: invokestatic 61	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   171: ldc2_w 18
    //   174: ldc 20
    //   176: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   179: return
    //   180: astore_3
    //   181: aconst_null
    //   182: astore_2
    //   183: aload_2
    //   184: ifnull +7 -> 191
    //   187: aload_2
    //   188: invokevirtual 44	java/io/FileInputStream:close	()V
    //   191: aload_3
    //   192: athrow
    //   193: astore_2
    //   194: ldc 49
    //   196: ldc 51
    //   198: iconst_2
    //   199: anewarray 4	java/lang/Object
    //   202: dup
    //   203: iconst_0
    //   204: aload_1
    //   205: aastore
    //   206: dup
    //   207: iconst_1
    //   208: aload_2
    //   209: invokevirtual 55	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   212: aastore
    //   213: invokestatic 61	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: goto -25 -> 191
    //   219: ldc2_w 18
    //   222: ldc 20
    //   224: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   227: return
    //   228: astore_3
    //   229: goto -46 -> 183
    //   232: astore 4
    //   234: goto -128 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	this	a
    //   0	237	1	paramString	String
    //   48	1	2	localFileInputStream1	java.io.FileInputStream
    //   70	16	2	localIOException1	java.io.IOException
    //   107	1	2	localFileInputStream2	java.io.FileInputStream
    //   148	16	2	localIOException2	java.io.IOException
    //   182	6	2	localObject1	Object
    //   193	16	2	localIOException3	java.io.IOException
    //   46	90	3	localFileInputStream3	java.io.FileInputStream
    //   180	12	3	localObject2	Object
    //   228	1	3	localObject3	Object
    //   102	21	4	localException1	Exception
    //   232	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   57	61	70	java/io/IOException
    //   38	47	102	java/lang/Exception
    //   135	139	148	java/io/IOException
    //   38	47	180	finally
    //   187	191	193	java/io/IOException
    //   49	57	228	finally
    //   108	131	228	finally
    //   49	57	232	java/lang/Exception
  }
  
  public static boolean ah(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(14006291005440L, 104355);
    boolean bool = new a(paramString1).eX(paramString2, paramString3);
    GMTrace.o(14006291005440L, 104355);
    return bool;
  }
  
  public static boolean e(String paramString1, String paramString2, long paramLong)
  {
    GMTrace.i(14006425223168L, 104356);
    boolean bool = new a(paramString1).ae(paramString2, paramLong);
    GMTrace.o(14006425223168L, 104356);
    return bool;
  }
  
  public static Long eY(String paramString1, String paramString2)
  {
    GMTrace.i(14006156787712L, 104354);
    paramString1 = new a(paramString1).SQ(paramString2);
    GMTrace.o(14006156787712L, 104354);
    return paramString1;
  }
  
  public static String getValue(String paramString1, String paramString2)
  {
    GMTrace.i(14006022569984L, 104353);
    paramString1 = new a(paramString1).getValue(paramString2);
    GMTrace.o(14006022569984L, 104353);
    return paramString1;
  }
  
  public final Long SQ(String paramString)
  {
    GMTrace.i(14005754134528L, 104351);
    paramString = getValue(paramString);
    if (paramString == null)
    {
      GMTrace.o(14005754134528L, 104351);
      return null;
    }
    try
    {
      long l = Long.parseLong(paramString);
      GMTrace.o(14005754134528L, 104351);
      return Long.valueOf(l);
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ReadConfig", "getLongValue ParseLong : %s Failed. [%s]", new Object[] { paramString, localException.getLocalizedMessage() });
      GMTrace.o(14005754134528L, 104351);
    }
    return null;
  }
  
  public final Integer SR(String paramString)
  {
    GMTrace.i(14005888352256L, 104352);
    paramString = getValue(paramString);
    if (paramString == null)
    {
      GMTrace.o(14005888352256L, 104352);
      return null;
    }
    try
    {
      int i = Integer.parseInt(paramString);
      GMTrace.o(14005888352256L, 104352);
      return Integer.valueOf(i);
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ReadConfig", "getIntegerValue ParseInteger : %s Failed. [%s]", new Object[] { paramString, localException.getLocalizedMessage() });
      GMTrace.o(14005888352256L, 104352);
    }
    return null;
  }
  
  public final boolean ae(String paramString, long paramLong)
  {
    GMTrace.i(14005351481344L, 104348);
    boolean bool = eX(paramString, String.valueOf(paramLong));
    GMTrace.o(14005351481344L, 104348);
    return bool;
  }
  
  public final boolean cI(String paramString, int paramInt)
  {
    GMTrace.i(14005485699072L, 104349);
    boolean bool = eX(paramString, String.valueOf(paramInt));
    GMTrace.o(14005485699072L, 104349);
    return bool;
  }
  
  /* Error */
  public final boolean eX(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 148
    //   3: ldc -106
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 152	java/io/FileOutputStream
    //   11: dup
    //   12: aload_0
    //   13: getfield 30	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   16: invokespecial 153	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   19: astore 6
    //   21: aload 6
    //   23: astore 5
    //   25: aload_0
    //   26: getfield 28	com/tencent/mm/sdk/e/a:vmp	Ljava/util/Properties;
    //   29: aload_1
    //   30: aload_2
    //   31: invokevirtual 157	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   34: pop
    //   35: aload 6
    //   37: astore 5
    //   39: aload_0
    //   40: getfield 28	com/tencent/mm/sdk/e/a:vmp	Ljava/util/Properties;
    //   43: aload 6
    //   45: ldc -97
    //   47: invokevirtual 163	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   50: iconst_1
    //   51: istore_3
    //   52: aload 6
    //   54: invokevirtual 164	java/io/FileOutputStream:close	()V
    //   57: ldc2_w 148
    //   60: ldc -106
    //   62: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: iload_3
    //   66: ireturn
    //   67: astore_1
    //   68: ldc 49
    //   70: ldc 51
    //   72: iconst_2
    //   73: anewarray 4	java/lang/Object
    //   76: dup
    //   77: iconst_0
    //   78: aload_0
    //   79: getfield 30	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   82: aastore
    //   83: dup
    //   84: iconst_1
    //   85: aload_1
    //   86: invokevirtual 55	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   89: aastore
    //   90: invokestatic 61	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: goto -36 -> 57
    //   96: astore_2
    //   97: aconst_null
    //   98: astore_1
    //   99: aload_1
    //   100: astore 5
    //   102: ldc 49
    //   104: ldc -90
    //   106: iconst_2
    //   107: anewarray 4	java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: aload_0
    //   113: getfield 30	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   116: aastore
    //   117: dup
    //   118: iconst_1
    //   119: aload_2
    //   120: invokevirtual 64	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   123: aastore
    //   124: invokestatic 61	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: iconst_0
    //   128: istore 4
    //   130: iload 4
    //   132: istore_3
    //   133: aload_1
    //   134: ifnull -77 -> 57
    //   137: aload_1
    //   138: invokevirtual 164	java/io/FileOutputStream:close	()V
    //   141: iload 4
    //   143: istore_3
    //   144: goto -87 -> 57
    //   147: astore_1
    //   148: ldc 49
    //   150: ldc 51
    //   152: iconst_2
    //   153: anewarray 4	java/lang/Object
    //   156: dup
    //   157: iconst_0
    //   158: aload_0
    //   159: getfield 30	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   162: aastore
    //   163: dup
    //   164: iconst_1
    //   165: aload_1
    //   166: invokevirtual 55	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   169: aastore
    //   170: invokestatic 61	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: iload 4
    //   175: istore_3
    //   176: goto -119 -> 57
    //   179: astore_1
    //   180: aconst_null
    //   181: astore 5
    //   183: aload 5
    //   185: ifnull +8 -> 193
    //   188: aload 5
    //   190: invokevirtual 164	java/io/FileOutputStream:close	()V
    //   193: aload_1
    //   194: athrow
    //   195: astore_2
    //   196: ldc 49
    //   198: ldc 51
    //   200: iconst_2
    //   201: anewarray 4	java/lang/Object
    //   204: dup
    //   205: iconst_0
    //   206: aload_0
    //   207: getfield 30	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   210: aastore
    //   211: dup
    //   212: iconst_1
    //   213: aload_2
    //   214: invokevirtual 55	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   217: aastore
    //   218: invokestatic 61	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   221: goto -28 -> 193
    //   224: astore_1
    //   225: goto -42 -> 183
    //   228: astore_2
    //   229: aload 6
    //   231: astore_1
    //   232: goto -133 -> 99
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	this	a
    //   0	235	1	paramString1	String
    //   0	235	2	paramString2	String
    //   51	125	3	bool1	boolean
    //   128	46	4	bool2	boolean
    //   23	166	5	localObject	Object
    //   19	211	6	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   52	57	67	java/io/IOException
    //   8	21	96	java/lang/Exception
    //   137	141	147	java/io/IOException
    //   8	21	179	finally
    //   188	193	195	java/io/IOException
    //   25	35	224	finally
    //   39	50	224	finally
    //   102	127	224	finally
    //   25	35	228	java/lang/Exception
    //   39	50	228	java/lang/Exception
  }
  
  public final String getValue(String paramString)
  {
    GMTrace.i(14005619916800L, 104350);
    if ((this.vmp != null) && (this.vmp.containsKey(paramString)))
    {
      paramString = this.vmp.getProperty(paramString);
      GMTrace.o(14005619916800L, 104350);
      return paramString;
    }
    GMTrace.o(14005619916800L, 104350);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
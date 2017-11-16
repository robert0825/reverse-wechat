package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.c.by;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ad
{
  public String hyD;
  public List<a> lOa;
  
  public ad(String paramString)
  {
    GMTrace.i(12606668537856L, 93927);
    this.hyD = "";
    this.lOa = new LinkedList();
    if (bg.nm(paramString))
    {
      GMTrace.o(12606668537856L, 93927);
      return;
    }
    this.hyD = paramString;
    this.lOa.addAll(aFM());
    GMTrace.o(12606668537856L, 93927);
  }
  
  public ad(String paramString, List<by> paramList)
  {
    GMTrace.i(12606802755584L, 93928);
    this.hyD = "";
    this.lOa = new LinkedList();
    if ((bg.nm(paramString)) || (paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(12606802755584L, 93928);
      return;
    }
    this.hyD = paramString;
    this.lOa.clear();
    paramString = paramList.iterator();
    while (paramString.hasNext())
    {
      paramList = (by)paramString.next();
      a locala = new a();
      locala.lOb = paramList.lSE;
      locala.eQu = paramList.jhi;
      locala.tag = paramList.lSG;
      locala.lxd = paramList.lSF;
      locala.lOd = paramList.lSH;
      locala.lOc = paramList.lSI;
      locala.lOe = paramList.lSJ;
      this.lOa.add(locala);
    }
    aFN();
    GMTrace.o(12606802755584L, 93928);
  }
  
  /* Error */
  private List<a> aFM()
  {
    // Byte code:
    //   0: ldc2_w 141
    //   3: ldc -113
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 145	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   15: aload_0
    //   16: getfield 30	com/tencent/mm/plugin/game/model/ad:hyD	Ljava/lang/String;
    //   19: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: ldc -104
    //   24: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: astore_1
    //   31: new 32	java/util/LinkedList
    //   34: dup
    //   35: invokespecial 33	java/util/LinkedList:<init>	()V
    //   38: astore 4
    //   40: invokestatic 162	com/tencent/mm/plugin/game/model/SubCoreGameCenter:aGj	()Lcom/tencent/mm/plugin/game/model/z;
    //   43: aload_1
    //   44: invokevirtual 168	com/tencent/mm/plugin/game/model/z:zI	(Ljava/lang/String;)[B
    //   47: astore_1
    //   48: aload_1
    //   49: ifnonnull +14 -> 63
    //   52: ldc2_w 141
    //   55: ldc -113
    //   57: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   60: aload 4
    //   62: areturn
    //   63: new 170	java/io/ByteArrayInputStream
    //   66: dup
    //   67: aload_1
    //   68: invokespecial 173	java/io/ByteArrayInputStream:<init>	([B)V
    //   71: astore 5
    //   73: new 175	java/io/ObjectInputStream
    //   76: dup
    //   77: aload 5
    //   79: invokespecial 178	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   82: astore_2
    //   83: aload_2
    //   84: astore_1
    //   85: aload 4
    //   87: aload_2
    //   88: invokeinterface 183 1 0
    //   93: checkcast 50	java/util/List
    //   96: invokeinterface 54 2 0
    //   101: pop
    //   102: aload 5
    //   104: invokevirtual 186	java/io/ByteArrayInputStream:close	()V
    //   107: aload_2
    //   108: invokeinterface 187 1 0
    //   113: ldc2_w 141
    //   116: ldc -113
    //   118: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   121: aload 4
    //   123: areturn
    //   124: astore_3
    //   125: aconst_null
    //   126: astore_2
    //   127: aload_2
    //   128: astore_1
    //   129: ldc -67
    //   131: aload_3
    //   132: ldc 28
    //   134: iconst_0
    //   135: anewarray 4	java/lang/Object
    //   138: invokestatic 195	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: aload 5
    //   143: invokevirtual 186	java/io/ByteArrayInputStream:close	()V
    //   146: aload_2
    //   147: ifnull -34 -> 113
    //   150: aload_2
    //   151: invokeinterface 187 1 0
    //   156: goto -43 -> 113
    //   159: astore_1
    //   160: goto -47 -> 113
    //   163: astore_2
    //   164: aconst_null
    //   165: astore_1
    //   166: aload 5
    //   168: invokevirtual 186	java/io/ByteArrayInputStream:close	()V
    //   171: aload_1
    //   172: ifnull +9 -> 181
    //   175: aload_1
    //   176: invokeinterface 187 1 0
    //   181: aload_2
    //   182: athrow
    //   183: astore_1
    //   184: goto -77 -> 107
    //   187: astore_1
    //   188: goto -75 -> 113
    //   191: astore_1
    //   192: goto -46 -> 146
    //   195: astore_3
    //   196: goto -25 -> 171
    //   199: astore_1
    //   200: goto -19 -> 181
    //   203: astore_2
    //   204: goto -38 -> 166
    //   207: astore_3
    //   208: goto -81 -> 127
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	this	ad
    //   30	99	1	localObject1	Object
    //   159	1	1	localIOException1	java.io.IOException
    //   165	11	1	localObject2	Object
    //   183	1	1	localIOException2	java.io.IOException
    //   187	1	1	localIOException3	java.io.IOException
    //   191	1	1	localIOException4	java.io.IOException
    //   199	1	1	localIOException5	java.io.IOException
    //   82	69	2	localObjectInputStream	java.io.ObjectInputStream
    //   163	19	2	localObject3	Object
    //   203	1	2	localObject4	Object
    //   124	8	3	localException1	Exception
    //   195	1	3	localIOException6	java.io.IOException
    //   207	1	3	localException2	Exception
    //   38	84	4	localLinkedList	LinkedList
    //   71	96	5	localByteArrayInputStream	java.io.ByteArrayInputStream
    // Exception table:
    //   from	to	target	type
    //   73	83	124	java/lang/Exception
    //   150	156	159	java/io/IOException
    //   73	83	163	finally
    //   102	107	183	java/io/IOException
    //   107	113	187	java/io/IOException
    //   141	146	191	java/io/IOException
    //   166	171	195	java/io/IOException
    //   175	181	199	java/io/IOException
    //   85	102	203	finally
    //   129	141	203	finally
    //   85	102	207	java/lang/Exception
  }
  
  /* Error */
  public final void aFN()
  {
    // Byte code:
    //   0: ldc2_w 197
    //   3: ldc -57
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 145	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   15: aload_0
    //   16: getfield 30	com/tencent/mm/plugin/game/model/ad:hyD	Ljava/lang/String;
    //   19: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: ldc -104
    //   24: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: astore_3
    //   31: new 201	java/io/ByteArrayOutputStream
    //   34: dup
    //   35: invokespecial 202	java/io/ByteArrayOutputStream:<init>	()V
    //   38: astore 4
    //   40: new 204	java/io/ObjectOutputStream
    //   43: dup
    //   44: aload 4
    //   46: invokespecial 207	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   49: astore_2
    //   50: aload_2
    //   51: astore_1
    //   52: aload_2
    //   53: aload_0
    //   54: getfield 35	com/tencent/mm/plugin/game/model/ad:lOa	Ljava/util/List;
    //   57: invokeinterface 213 2 0
    //   62: aload_2
    //   63: astore_1
    //   64: aload 4
    //   66: invokevirtual 217	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   69: astore 5
    //   71: aload_2
    //   72: astore_1
    //   73: invokestatic 162	com/tencent/mm/plugin/game/model/SubCoreGameCenter:aGj	()Lcom/tencent/mm/plugin/game/model/z;
    //   76: aload_3
    //   77: aload 5
    //   79: invokevirtual 221	com/tencent/mm/plugin/game/model/z:n	(Ljava/lang/String;[B)Z
    //   82: pop
    //   83: aload_2
    //   84: invokeinterface 222 1 0
    //   89: aload 4
    //   91: invokevirtual 223	java/io/ByteArrayOutputStream:close	()V
    //   94: ldc2_w 197
    //   97: ldc -57
    //   99: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   102: return
    //   103: astore_1
    //   104: ldc2_w 197
    //   107: ldc -57
    //   109: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   112: return
    //   113: astore_3
    //   114: aconst_null
    //   115: astore_2
    //   116: aload_2
    //   117: astore_1
    //   118: ldc -67
    //   120: aload_3
    //   121: ldc 28
    //   123: iconst_0
    //   124: anewarray 4	java/lang/Object
    //   127: invokestatic 195	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload_2
    //   131: ifnull +9 -> 140
    //   134: aload_2
    //   135: invokeinterface 222 1 0
    //   140: aload 4
    //   142: invokevirtual 223	java/io/ByteArrayOutputStream:close	()V
    //   145: ldc2_w 197
    //   148: ldc -57
    //   150: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   153: return
    //   154: astore_1
    //   155: ldc2_w 197
    //   158: ldc -57
    //   160: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   163: return
    //   164: astore_2
    //   165: aconst_null
    //   166: astore_1
    //   167: aload_1
    //   168: ifnull +9 -> 177
    //   171: aload_1
    //   172: invokeinterface 222 1 0
    //   177: aload 4
    //   179: invokevirtual 223	java/io/ByteArrayOutputStream:close	()V
    //   182: aload_2
    //   183: athrow
    //   184: astore_1
    //   185: goto -96 -> 89
    //   188: astore_1
    //   189: goto -49 -> 140
    //   192: astore_1
    //   193: goto -16 -> 177
    //   196: astore_1
    //   197: goto -15 -> 182
    //   200: astore_2
    //   201: goto -34 -> 167
    //   204: astore_3
    //   205: goto -89 -> 116
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	208	0	this	ad
    //   51	22	1	localObjectOutputStream1	java.io.ObjectOutputStream
    //   103	1	1	localIOException1	java.io.IOException
    //   117	1	1	localObjectOutputStream2	java.io.ObjectOutputStream
    //   154	1	1	localIOException2	java.io.IOException
    //   166	6	1	localObject1	Object
    //   184	1	1	localIOException3	java.io.IOException
    //   188	1	1	localIOException4	java.io.IOException
    //   192	1	1	localIOException5	java.io.IOException
    //   196	1	1	localIOException6	java.io.IOException
    //   49	86	2	localObjectOutputStream3	java.io.ObjectOutputStream
    //   164	19	2	localObject2	Object
    //   200	1	2	localObject3	Object
    //   30	47	3	str	String
    //   113	8	3	localException1	Exception
    //   204	1	3	localException2	Exception
    //   38	140	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   69	9	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   89	94	103	java/io/IOException
    //   40	50	113	java/lang/Exception
    //   140	145	154	java/io/IOException
    //   40	50	164	finally
    //   83	89	184	java/io/IOException
    //   134	140	188	java/io/IOException
    //   171	177	192	java/io/IOException
    //   177	182	196	java/io/IOException
    //   52	62	200	finally
    //   64	71	200	finally
    //   73	83	200	finally
    //   118	130	200	finally
    //   52	62	204	java/lang/Exception
    //   64	71	204	java/lang/Exception
    //   73	83	204	java/lang/Exception
  }
  
  public static final class a
    implements Serializable
  {
    public String eQu;
    public int lOb;
    public int lOc;
    public boolean lOd;
    public String lOe;
    public long lxd;
    public String tag;
    
    public a()
    {
      GMTrace.i(12609218674688L, 93946);
      GMTrace.o(12609218674688L, 93946);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
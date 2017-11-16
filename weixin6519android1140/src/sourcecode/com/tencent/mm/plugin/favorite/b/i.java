package com.tencent.mm.plugin.favorite.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.a.g;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class i
  implements com.tencent.mm.platformtools.i
{
  private int height;
  private String lbb;
  private String url;
  private int width;
  
  public i(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(6299643281408L, 46936);
    this.lbb = paramString1;
    this.url = paramString2;
    this.width = paramInt1;
    this.height = paramInt2;
    GMTrace.o(6299643281408L, 46936);
  }
  
  public final void I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6301119676416L, 46947);
    GMTrace.o(6301119676416L, 46947);
  }
  
  public final i.b Pl()
  {
    GMTrace.i(6299777499136L, 46937);
    GMTrace.o(6299777499136L, 46937);
    return null;
  }
  
  public final String Pm()
  {
    GMTrace.i(6299911716864L, 46938);
    String str = x.axY() + g.n(this.url.getBytes());
    GMTrace.o(6299911716864L, 46938);
    return str;
  }
  
  public final String Pn()
  {
    GMTrace.i(6300045934592L, 46939);
    String str = this.url;
    GMTrace.o(6300045934592L, 46939);
    return str;
  }
  
  public final String Po()
  {
    GMTrace.i(6300180152320L, 46940);
    String str = this.lbb;
    GMTrace.o(6300180152320L, 46940);
    return str;
  }
  
  public final String Pp()
  {
    GMTrace.i(6300314370048L, 46941);
    String str = this.lbb;
    GMTrace.o(6300314370048L, 46941);
    return str;
  }
  
  public final boolean Pq()
  {
    GMTrace.i(6300448587776L, 46942);
    GMTrace.o(6300448587776L, 46942);
    return true;
  }
  
  public final boolean Pr()
  {
    GMTrace.i(6300582805504L, 46943);
    GMTrace.o(6300582805504L, 46943);
    return false;
  }
  
  public final Bitmap Ps()
  {
    GMTrace.i(6300717023232L, 46944);
    Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYx);
    GMTrace.o(6300717023232L, 46944);
    return localBitmap;
  }
  
  public final void Pt()
  {
    GMTrace.i(6300985458688L, 46946);
    GMTrace.o(6300985458688L, 46946);
  }
  
  /* Error */
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 139
    //   3: ldc -115
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: astore_3
    //   10: getstatic 147	com/tencent/mm/platformtools/i$a:hiU	Lcom/tencent/mm/platformtools/i$a;
    //   13: aload_2
    //   14: if_acmpne +147 -> 161
    //   17: aload_1
    //   18: astore_3
    //   19: ldc -107
    //   21: ldc -105
    //   23: iconst_1
    //   24: anewarray 4	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: getfield 30	com/tencent/mm/plugin/favorite/b/i:url	Ljava/lang/String;
    //   33: aastore
    //   34: invokestatic 157	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   37: aload_1
    //   38: astore_3
    //   39: new 159	java/io/File
    //   42: dup
    //   43: invokestatic 60	com/tencent/mm/plugin/favorite/b/x:axY	()Ljava/lang/String;
    //   46: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   49: astore_2
    //   50: aload_1
    //   51: astore_3
    //   52: aload_2
    //   53: invokevirtual 165	java/io/File:exists	()Z
    //   56: ifne +10 -> 66
    //   59: aload_1
    //   60: astore_3
    //   61: aload_2
    //   62: invokevirtual 168	java/io/File:mkdirs	()Z
    //   65: pop
    //   66: aload_1
    //   67: astore_2
    //   68: aload_1
    //   69: astore_3
    //   70: aload_0
    //   71: getfield 32	com/tencent/mm/plugin/favorite/b/i:width	I
    //   74: ifle +30 -> 104
    //   77: aload_1
    //   78: astore_2
    //   79: aload_1
    //   80: astore_3
    //   81: aload_0
    //   82: getfield 34	com/tencent/mm/plugin/favorite/b/i:height	I
    //   85: ifle +19 -> 104
    //   88: aload_1
    //   89: astore_3
    //   90: aload_1
    //   91: aload_0
    //   92: getfield 32	com/tencent/mm/plugin/favorite/b/i:width	I
    //   95: aload_0
    //   96: getfield 34	com/tencent/mm/plugin/favorite/b/i:height	I
    //   99: iconst_1
    //   100: invokestatic 173	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   103: astore_2
    //   104: aload_2
    //   105: astore_3
    //   106: new 159	java/io/File
    //   109: dup
    //   110: aload_0
    //   111: invokevirtual 175	com/tencent/mm/plugin/favorite/b/i:Pm	()Ljava/lang/String;
    //   114: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   117: astore_1
    //   118: aload_2
    //   119: astore_3
    //   120: aload_1
    //   121: invokevirtual 178	java/io/File:createNewFile	()Z
    //   124: pop
    //   125: new 180	java/io/FileOutputStream
    //   128: dup
    //   129: aload_1
    //   130: invokespecial 183	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   133: astore_1
    //   134: aload_1
    //   135: astore_3
    //   136: aload_2
    //   137: getstatic 189	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   140: bipush 100
    //   142: aload_1
    //   143: invokevirtual 195	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   146: pop
    //   147: aload_1
    //   148: astore_3
    //   149: aload_1
    //   150: invokevirtual 198	java/io/FileOutputStream:flush	()V
    //   153: aload_2
    //   154: astore_3
    //   155: aload_1
    //   156: invokevirtual 201	java/io/FileOutputStream:close	()V
    //   159: aload_2
    //   160: astore_3
    //   161: ldc2_w 139
    //   164: ldc -115
    //   166: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   169: aload_3
    //   170: areturn
    //   171: astore 4
    //   173: aconst_null
    //   174: astore_1
    //   175: aload_1
    //   176: astore_3
    //   177: ldc -107
    //   179: aload 4
    //   181: ldc -53
    //   183: iconst_0
    //   184: anewarray 4	java/lang/Object
    //   187: invokestatic 207	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: aload_2
    //   191: astore_3
    //   192: aload_1
    //   193: ifnull -32 -> 161
    //   196: aload_2
    //   197: astore_3
    //   198: aload_1
    //   199: invokevirtual 201	java/io/FileOutputStream:close	()V
    //   202: aload_2
    //   203: astore_3
    //   204: goto -43 -> 161
    //   207: astore_1
    //   208: ldc -107
    //   210: aload_1
    //   211: ldc -53
    //   213: iconst_0
    //   214: anewarray 4	java/lang/Object
    //   217: invokestatic 207	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   220: goto -59 -> 161
    //   223: astore_1
    //   224: aconst_null
    //   225: astore 4
    //   227: aload 4
    //   229: ifnull +10 -> 239
    //   232: aload_2
    //   233: astore_3
    //   234: aload 4
    //   236: invokevirtual 201	java/io/FileOutputStream:close	()V
    //   239: aload_2
    //   240: astore_3
    //   241: aload_1
    //   242: athrow
    //   243: astore_1
    //   244: aload_3
    //   245: astore 4
    //   247: goto -20 -> 227
    //   250: astore 4
    //   252: goto -77 -> 175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	255	0	this	i
    //   0	255	1	paramBitmap	Bitmap
    //   0	255	2	parama	i.a
    //   0	255	3	paramString	String
    //   171	9	4	localFileNotFoundException1	java.io.FileNotFoundException
    //   225	21	4	str	String
    //   250	1	4	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   125	134	171	java/io/FileNotFoundException
    //   19	37	207	java/io/IOException
    //   39	50	207	java/io/IOException
    //   52	59	207	java/io/IOException
    //   61	66	207	java/io/IOException
    //   70	77	207	java/io/IOException
    //   81	88	207	java/io/IOException
    //   90	104	207	java/io/IOException
    //   106	118	207	java/io/IOException
    //   120	125	207	java/io/IOException
    //   155	159	207	java/io/IOException
    //   198	202	207	java/io/IOException
    //   234	239	207	java/io/IOException
    //   241	243	207	java/io/IOException
    //   125	134	223	finally
    //   136	147	243	finally
    //   149	153	243	finally
    //   177	190	243	finally
    //   136	147	250	java/io/FileNotFoundException
    //   149	153	250	java/io/FileNotFoundException
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(6301253894144L, 46948);
    GMTrace.o(6301253894144L, 46948);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
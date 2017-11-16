package com.tencent.mm.plugin.record.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.a.g;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.File;

final class o
  implements i
{
  private int height;
  private String lbb;
  private String url;
  private int width;
  
  public o(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(7506126438400L, 55925);
    this.lbb = paramString1;
    this.url = paramString2;
    this.width = paramInt1;
    this.height = paramInt2;
    paramString1 = new StringBuilder();
    at.AR();
    paramString1 = new File(c.zi() + "web/");
    if (!paramString1.exists()) {
      paramString1.mkdirs();
    }
    GMTrace.o(7506126438400L, 55925);
  }
  
  public final void I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(7507468615680L, 55935);
    GMTrace.o(7507468615680L, 55935);
  }
  
  public final i.b Pl()
  {
    GMTrace.i(7507737051136L, 55937);
    GMTrace.o(7507737051136L, 55937);
    return null;
  }
  
  public final String Pm()
  {
    GMTrace.i(7506260656128L, 55926);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = c.zi() + "web/" + g.n(this.url.getBytes());
    GMTrace.o(7506260656128L, 55926);
    return (String)localObject;
  }
  
  public final String Pn()
  {
    GMTrace.i(7506394873856L, 55927);
    String str = this.url;
    GMTrace.o(7506394873856L, 55927);
    return str;
  }
  
  public final String Po()
  {
    GMTrace.i(7506529091584L, 55928);
    String str = this.lbb;
    GMTrace.o(7506529091584L, 55928);
    return str;
  }
  
  public final String Pp()
  {
    GMTrace.i(7506663309312L, 55929);
    String str = this.lbb;
    GMTrace.o(7506663309312L, 55929);
    return str;
  }
  
  public final boolean Pq()
  {
    GMTrace.i(7506797527040L, 55930);
    GMTrace.o(7506797527040L, 55930);
    return true;
  }
  
  public final boolean Pr()
  {
    GMTrace.i(7506931744768L, 55931);
    GMTrace.o(7506931744768L, 55931);
    return false;
  }
  
  public final Bitmap Ps()
  {
    GMTrace.i(7507065962496L, 55932);
    Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYx);
    GMTrace.o(7507065962496L, 55932);
    return localBitmap;
  }
  
  public final void Pt()
  {
    GMTrace.i(7507334397952L, 55934);
    GMTrace.o(7507334397952L, 55934);
  }
  
  /* Error */
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 158
    //   3: ldc -96
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: astore_3
    //   10: getstatic 166	com/tencent/mm/platformtools/i$a:hiU	Lcom/tencent/mm/platformtools/i$a;
    //   13: aload_2
    //   14: if_acmpne +118 -> 132
    //   17: aload_1
    //   18: astore_3
    //   19: ldc -88
    //   21: ldc -86
    //   23: iconst_1
    //   24: anewarray 4	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: getfield 30	com/tencent/mm/plugin/record/a/o:url	Ljava/lang/String;
    //   33: aastore
    //   34: invokestatic 176	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   37: aload_1
    //   38: astore_2
    //   39: aload_1
    //   40: astore_3
    //   41: aload_0
    //   42: getfield 32	com/tencent/mm/plugin/record/a/o:width	I
    //   45: ifle +30 -> 75
    //   48: aload_1
    //   49: astore_2
    //   50: aload_1
    //   51: astore_3
    //   52: aload_0
    //   53: getfield 34	com/tencent/mm/plugin/record/a/o:height	I
    //   56: ifle +19 -> 75
    //   59: aload_1
    //   60: astore_3
    //   61: aload_1
    //   62: aload_0
    //   63: getfield 32	com/tencent/mm/plugin/record/a/o:width	I
    //   66: aload_0
    //   67: getfield 34	com/tencent/mm/plugin/record/a/o:height	I
    //   70: iconst_1
    //   71: invokestatic 181	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   74: astore_2
    //   75: aload_2
    //   76: astore_3
    //   77: new 45	java/io/File
    //   80: dup
    //   81: aload_0
    //   82: invokevirtual 183	com/tencent/mm/plugin/record/a/o:Pm	()Ljava/lang/String;
    //   85: invokespecial 63	java/io/File:<init>	(Ljava/lang/String;)V
    //   88: astore_1
    //   89: aload_2
    //   90: astore_3
    //   91: aload_1
    //   92: invokevirtual 186	java/io/File:createNewFile	()Z
    //   95: pop
    //   96: new 188	java/io/FileOutputStream
    //   99: dup
    //   100: aload_1
    //   101: invokespecial 191	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   104: astore_1
    //   105: aload_1
    //   106: astore_3
    //   107: aload_2
    //   108: getstatic 197	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   111: bipush 100
    //   113: aload_1
    //   114: invokevirtual 203	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   117: pop
    //   118: aload_1
    //   119: astore_3
    //   120: aload_1
    //   121: invokevirtual 206	java/io/FileOutputStream:flush	()V
    //   124: aload_2
    //   125: astore_3
    //   126: aload_1
    //   127: invokevirtual 209	java/io/FileOutputStream:close	()V
    //   130: aload_2
    //   131: astore_3
    //   132: ldc2_w 158
    //   135: ldc -96
    //   137: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   140: aload_3
    //   141: areturn
    //   142: astore 4
    //   144: aconst_null
    //   145: astore_1
    //   146: aload_1
    //   147: astore_3
    //   148: ldc -88
    //   150: aload 4
    //   152: ldc -45
    //   154: iconst_0
    //   155: anewarray 4	java/lang/Object
    //   158: invokestatic 215	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload_2
    //   162: astore_3
    //   163: aload_1
    //   164: ifnull -32 -> 132
    //   167: aload_2
    //   168: astore_3
    //   169: aload_1
    //   170: invokevirtual 209	java/io/FileOutputStream:close	()V
    //   173: aload_2
    //   174: astore_3
    //   175: goto -43 -> 132
    //   178: astore_1
    //   179: ldc -88
    //   181: aload_1
    //   182: ldc -45
    //   184: iconst_0
    //   185: anewarray 4	java/lang/Object
    //   188: invokestatic 215	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   191: goto -59 -> 132
    //   194: astore_1
    //   195: aconst_null
    //   196: astore 4
    //   198: aload 4
    //   200: ifnull +10 -> 210
    //   203: aload_2
    //   204: astore_3
    //   205: aload 4
    //   207: invokevirtual 209	java/io/FileOutputStream:close	()V
    //   210: aload_2
    //   211: astore_3
    //   212: aload_1
    //   213: athrow
    //   214: astore_1
    //   215: aload_3
    //   216: astore 4
    //   218: goto -20 -> 198
    //   221: astore 4
    //   223: goto -77 -> 146
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	226	0	this	o
    //   0	226	1	paramBitmap	Bitmap
    //   0	226	2	parama	i.a
    //   0	226	3	paramString	String
    //   142	9	4	localFileNotFoundException1	java.io.FileNotFoundException
    //   196	21	4	str	String
    //   221	1	4	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   96	105	142	java/io/FileNotFoundException
    //   19	37	178	java/io/IOException
    //   41	48	178	java/io/IOException
    //   52	59	178	java/io/IOException
    //   61	75	178	java/io/IOException
    //   77	89	178	java/io/IOException
    //   91	96	178	java/io/IOException
    //   126	130	178	java/io/IOException
    //   169	173	178	java/io/IOException
    //   205	210	178	java/io/IOException
    //   212	214	178	java/io/IOException
    //   96	105	194	finally
    //   107	118	214	finally
    //   120	124	214	finally
    //   148	161	214	finally
    //   107	118	221	java/io/FileNotFoundException
    //   120	124	221	java/io/FileNotFoundException
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(7507602833408L, 55936);
    GMTrace.o(7507602833408L, 55936);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
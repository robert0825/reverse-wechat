package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.plugin.comm.a.d;
import com.tencent.mm.plugin.n.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
  implements i
{
  private int height;
  private String lbb;
  private String url;
  private int width;
  
  public d(String paramString1, String paramString2)
  {
    GMTrace.i(1116154626048L, 8316);
    this.lbb = paramString1;
    this.url = paramString2;
    this.width = 0;
    this.height = 0;
    GMTrace.o(1116154626048L, 8316);
  }
  
  public final void I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(1117496803328L, 8326);
    GMTrace.o(1117496803328L, 8326);
  }
  
  public final i.b Pl()
  {
    GMTrace.i(1117765238784L, 8328);
    GMTrace.o(1117765238784L, 8328);
    return null;
  }
  
  public final String Pm()
  {
    GMTrace.i(1116288843776L, 8317);
    String str = b.yU() + "/" + g.n(this.url.getBytes());
    GMTrace.o(1116288843776L, 8317);
    return str;
  }
  
  public final String Pn()
  {
    GMTrace.i(1116423061504L, 8318);
    String str = this.url;
    GMTrace.o(1116423061504L, 8318);
    return str;
  }
  
  public final String Po()
  {
    GMTrace.i(1116557279232L, 8319);
    String str = this.lbb;
    GMTrace.o(1116557279232L, 8319);
    return str;
  }
  
  public final String Pp()
  {
    GMTrace.i(1116691496960L, 8320);
    String str = this.lbb;
    GMTrace.o(1116691496960L, 8320);
    return str;
  }
  
  public final boolean Pq()
  {
    GMTrace.i(1116825714688L, 8321);
    GMTrace.o(1116825714688L, 8321);
    return true;
  }
  
  public final boolean Pr()
  {
    GMTrace.i(1116959932416L, 8322);
    GMTrace.o(1116959932416L, 8322);
    return false;
  }
  
  public final Bitmap Ps()
  {
    GMTrace.i(1117094150144L, 8323);
    Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), a.d.aYx);
    GMTrace.o(1117094150144L, 8323);
    return localBitmap;
  }
  
  public final void Pt()
  {
    GMTrace.i(1117362585600L, 8325);
    GMTrace.o(1117362585600L, 8325);
  }
  
  /* Error */
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 130
    //   3: sipush 8324
    //   6: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: astore_3
    //   11: getstatic 137	com/tencent/mm/platformtools/i$a:hiU	Lcom/tencent/mm/platformtools/i$a;
    //   14: aload_2
    //   15: if_acmpne +118 -> 133
    //   18: aload_1
    //   19: astore_3
    //   20: ldc -117
    //   22: ldc -115
    //   24: iconst_1
    //   25: anewarray 4	java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: getfield 29	com/tencent/mm/pluginsdk/ui/tools/d:url	Ljava/lang/String;
    //   34: aastore
    //   35: invokestatic 147	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: aload_1
    //   39: astore_2
    //   40: aload_1
    //   41: astore_3
    //   42: aload_0
    //   43: getfield 31	com/tencent/mm/pluginsdk/ui/tools/d:width	I
    //   46: ifle +30 -> 76
    //   49: aload_1
    //   50: astore_2
    //   51: aload_1
    //   52: astore_3
    //   53: aload_0
    //   54: getfield 33	com/tencent/mm/pluginsdk/ui/tools/d:height	I
    //   57: ifle +19 -> 76
    //   60: aload_1
    //   61: astore_3
    //   62: aload_1
    //   63: aload_0
    //   64: getfield 31	com/tencent/mm/pluginsdk/ui/tools/d:width	I
    //   67: aload_0
    //   68: getfield 33	com/tencent/mm/pluginsdk/ui/tools/d:height	I
    //   71: iconst_1
    //   72: invokestatic 152	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   75: astore_2
    //   76: aload_2
    //   77: astore_3
    //   78: new 154	java/io/File
    //   81: dup
    //   82: aload_0
    //   83: invokevirtual 156	com/tencent/mm/pluginsdk/ui/tools/d:Pm	()Ljava/lang/String;
    //   86: invokespecial 159	java/io/File:<init>	(Ljava/lang/String;)V
    //   89: astore_1
    //   90: aload_2
    //   91: astore_3
    //   92: aload_1
    //   93: invokevirtual 162	java/io/File:createNewFile	()Z
    //   96: pop
    //   97: new 164	java/io/FileOutputStream
    //   100: dup
    //   101: aload_1
    //   102: invokespecial 167	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   105: astore_1
    //   106: aload_1
    //   107: astore_3
    //   108: aload_2
    //   109: getstatic 173	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   112: bipush 100
    //   114: aload_1
    //   115: invokevirtual 179	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   118: pop
    //   119: aload_1
    //   120: astore_3
    //   121: aload_1
    //   122: invokevirtual 182	java/io/FileOutputStream:flush	()V
    //   125: aload_2
    //   126: astore_3
    //   127: aload_1
    //   128: invokevirtual 185	java/io/FileOutputStream:close	()V
    //   131: aload_2
    //   132: astore_3
    //   133: ldc2_w 130
    //   136: sipush 8324
    //   139: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   142: aload_3
    //   143: areturn
    //   144: astore 4
    //   146: aconst_null
    //   147: astore_1
    //   148: aload_1
    //   149: astore_3
    //   150: ldc -117
    //   152: aload 4
    //   154: ldc -69
    //   156: iconst_0
    //   157: anewarray 4	java/lang/Object
    //   160: invokestatic 191	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload_2
    //   164: astore_3
    //   165: aload_1
    //   166: ifnull -33 -> 133
    //   169: aload_2
    //   170: astore_3
    //   171: aload_1
    //   172: invokevirtual 185	java/io/FileOutputStream:close	()V
    //   175: aload_2
    //   176: astore_3
    //   177: goto -44 -> 133
    //   180: astore_1
    //   181: ldc -117
    //   183: aload_1
    //   184: ldc -69
    //   186: iconst_0
    //   187: anewarray 4	java/lang/Object
    //   190: invokestatic 191	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: goto -60 -> 133
    //   196: astore_1
    //   197: aconst_null
    //   198: astore 4
    //   200: aload 4
    //   202: ifnull +10 -> 212
    //   205: aload_2
    //   206: astore_3
    //   207: aload 4
    //   209: invokevirtual 185	java/io/FileOutputStream:close	()V
    //   212: aload_2
    //   213: astore_3
    //   214: aload_1
    //   215: athrow
    //   216: astore_1
    //   217: aload_3
    //   218: astore 4
    //   220: goto -20 -> 200
    //   223: astore 4
    //   225: goto -77 -> 148
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	228	0	this	d
    //   0	228	1	paramBitmap	Bitmap
    //   0	228	2	parama	i.a
    //   0	228	3	paramString	String
    //   144	9	4	localFileNotFoundException1	java.io.FileNotFoundException
    //   198	21	4	str	String
    //   223	1	4	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   97	106	144	java/io/FileNotFoundException
    //   20	38	180	java/io/IOException
    //   42	49	180	java/io/IOException
    //   53	60	180	java/io/IOException
    //   62	76	180	java/io/IOException
    //   78	90	180	java/io/IOException
    //   92	97	180	java/io/IOException
    //   127	131	180	java/io/IOException
    //   171	175	180	java/io/IOException
    //   207	212	180	java/io/IOException
    //   214	216	180	java/io/IOException
    //   97	106	196	finally
    //   108	119	216	finally
    //   121	125	216	finally
    //   150	163	216	finally
    //   108	119	223	java/io/FileNotFoundException
    //   121	125	223	java/io/FileNotFoundException
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(1117631021056L, 8327);
    GMTrace.o(1117631021056L, 8327);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
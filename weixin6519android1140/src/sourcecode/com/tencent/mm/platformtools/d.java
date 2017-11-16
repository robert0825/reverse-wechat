package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class d
{
  public static String Pk()
  {
    GMTrace.i(469225177088L, 3496);
    String str = com.tencent.mm.compatible.util.e.fRZ;
    str = str.substring(str.indexOf("tencent/MicroMsg"));
    GMTrace.o(469225177088L, 3496);
    return str;
  }
  
  public static boolean a(String paramString, Context paramContext, int paramInt)
  {
    GMTrace.i(16421002149888L, 122346);
    if (o.RH(paramString))
    {
      if (!bg.nm(paramString))
      {
        String str = nd("gif");
        com.tencent.mm.a.e.bf(str);
        if (FileOp.o(paramString, str) >= 0L)
        {
          b(str, paramContext);
          Toast.makeText(paramContext, paramContext.getString(paramInt, new Object[] { Pk() }), 1).show();
          GMTrace.o(16421002149888L, 122346);
          return true;
        }
      }
      GMTrace.o(16421002149888L, 122346);
      return false;
    }
    boolean bool = a(paramString, paramContext, true, paramInt);
    GMTrace.o(16421002149888L, 122346);
    return bool;
  }
  
  /* Error */
  public static boolean a(String paramString, Context paramContext, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 97
    //   3: ldc 99
    //   5: invokestatic 14	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnull +225 -> 234
    //   12: aload_0
    //   13: ldc 101
    //   15: invokevirtual 105	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   18: ifne +216 -> 234
    //   21: ldc 107
    //   23: invokestatic 58	com/tencent/mm/platformtools/d:nd	(Ljava/lang/String;)Ljava/lang/String;
    //   26: astore 8
    //   28: aload 8
    //   30: invokestatic 64	com/tencent/mm/a/e:bf	(Ljava/lang/String;)V
    //   33: aload_0
    //   34: aload 8
    //   36: invokestatic 69	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   39: lconst_0
    //   40: lcmp
    //   41: ifge +13 -> 54
    //   44: ldc2_w 97
    //   47: ldc 99
    //   49: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   52: iconst_0
    //   53: ireturn
    //   54: aload 8
    //   56: invokestatic 112	com/tencent/mm/sdk/platformtools/MMNativeJpeg:isProgressive	(Ljava/lang/String;)Z
    //   59: ifeq +75 -> 134
    //   62: aconst_null
    //   63: astore 7
    //   65: aload 8
    //   67: invokestatic 117	com/tencent/mm/sdk/platformtools/BackwardSupportUtil$ExifHelper:Rz	(Ljava/lang/String;)I
    //   70: istore 5
    //   72: aload 8
    //   74: invokestatic 121	com/tencent/mm/sdk/platformtools/MMNativeJpeg:decodeAsBitmap	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   77: astore 6
    //   79: aload 6
    //   81: ifnull +199 -> 280
    //   84: iload 5
    //   86: i2f
    //   87: fstore 4
    //   89: aload 6
    //   91: fload 4
    //   93: invokestatic 126	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    //   96: astore_0
    //   97: aload_0
    //   98: astore 6
    //   100: getstatic 132	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   103: astore 9
    //   105: new 134	java/io/FileOutputStream
    //   108: dup
    //   109: aload 8
    //   111: invokespecial 137	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   114: astore_0
    //   115: aload 6
    //   117: aload 9
    //   119: bipush 80
    //   121: aload_0
    //   122: invokevirtual 143	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   125: pop
    //   126: aload_0
    //   127: ifnull +7 -> 134
    //   130: aload_0
    //   131: invokevirtual 146	java/io/FileOutputStream:close	()V
    //   134: aload 8
    //   136: aload_1
    //   137: invokestatic 73	com/tencent/mm/platformtools/d:b	(Ljava/lang/String;Landroid/content/Context;)V
    //   140: iload_2
    //   141: ifeq +26 -> 167
    //   144: aload_1
    //   145: aload_1
    //   146: iload_3
    //   147: iconst_1
    //   148: anewarray 4	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: invokestatic 75	com/tencent/mm/platformtools/d:Pk	()Ljava/lang/String;
    //   156: aastore
    //   157: invokevirtual 81	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   160: iconst_1
    //   161: invokestatic 87	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   164: invokevirtual 91	android/widget/Toast:show	()V
    //   167: ldc2_w 97
    //   170: ldc 99
    //   172: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   175: iconst_1
    //   176: ireturn
    //   177: astore_0
    //   178: ldc -108
    //   180: aload_0
    //   181: ldc -106
    //   183: iconst_0
    //   184: anewarray 4	java/lang/Object
    //   187: invokestatic 156	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: goto -90 -> 100
    //   193: astore_0
    //   194: aconst_null
    //   195: astore_0
    //   196: aload 8
    //   198: invokestatic 159	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   201: pop
    //   202: aload_0
    //   203: ifnull +7 -> 210
    //   206: aload_0
    //   207: invokevirtual 146	java/io/FileOutputStream:close	()V
    //   210: ldc2_w 97
    //   213: ldc 99
    //   215: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   218: iconst_0
    //   219: ireturn
    //   220: astore_0
    //   221: aload 7
    //   223: astore_1
    //   224: aload_1
    //   225: ifnull +7 -> 232
    //   228: aload_1
    //   229: invokevirtual 146	java/io/FileOutputStream:close	()V
    //   232: aload_0
    //   233: athrow
    //   234: ldc2_w 97
    //   237: ldc 99
    //   239: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   242: iconst_0
    //   243: ireturn
    //   244: astore_0
    //   245: goto -111 -> 134
    //   248: astore_0
    //   249: goto -39 -> 210
    //   252: astore_1
    //   253: goto -21 -> 232
    //   256: astore 6
    //   258: aload_0
    //   259: astore_1
    //   260: aload 6
    //   262: astore_0
    //   263: goto -39 -> 224
    //   266: astore 6
    //   268: aload_0
    //   269: astore_1
    //   270: aload 6
    //   272: astore_0
    //   273: goto -49 -> 224
    //   276: astore_1
    //   277: goto -81 -> 196
    //   280: aconst_null
    //   281: astore_0
    //   282: goto -156 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	285	0	paramString	String
    //   0	285	1	paramContext	Context
    //   0	285	2	paramBoolean	boolean
    //   0	285	3	paramInt	int
    //   87	5	4	f	float
    //   70	15	5	i	int
    //   77	39	6	localObject1	Object
    //   256	5	6	localObject2	Object
    //   266	5	6	localObject3	Object
    //   63	159	7	localObject4	Object
    //   26	171	8	str	String
    //   103	15	9	localCompressFormat	android.graphics.Bitmap.CompressFormat
    // Exception table:
    //   from	to	target	type
    //   89	97	177	java/lang/Exception
    //   65	79	193	java/lang/Exception
    //   100	115	193	java/lang/Exception
    //   178	190	193	java/lang/Exception
    //   65	79	220	finally
    //   89	97	220	finally
    //   100	115	220	finally
    //   178	190	220	finally
    //   130	134	244	java/lang/Exception
    //   206	210	248	java/lang/Exception
    //   228	232	252	java/lang/Exception
    //   115	126	256	finally
    //   196	202	266	finally
    //   115	126	276	java/lang/Exception
  }
  
  public static void b(String paramString, Context paramContext)
  {
    GMTrace.i(469090959360L, 3495);
    if (bg.nm(paramString))
    {
      GMTrace.o(469090959360L, 3495);
      return;
    }
    paramContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(paramString))));
    w.i("MicroMsg.ExportImgUtil", "refreshing media scanner on path=%s", new Object[] { paramString });
    GMTrace.o(469090959360L, 3495);
  }
  
  public static String nd(String paramString)
  {
    GMTrace.i(468956741632L, 3494);
    paramString = com.tencent.mm.compatible.util.e.fRZ + String.format("%s%d.%s", new Object[] { "mmexport", Long.valueOf(System.currentTimeMillis()), paramString });
    GMTrace.o(468956741632L, 3494);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
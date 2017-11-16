package com.tencent.mm.plugin.sns.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.f;
import com.tencent.mm.plugin.sns.h.c;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

public final class i
{
  public static String iZZ;
  public static String jaa;
  public static int ppt;
  public static String ppu;
  private static String ppv;
  private static int ppw;
  private static int ppx;
  public static int ppy;
  public static int ppz;
  
  static
  {
    GMTrace.i(8793408667648L, 65516);
    ppt = Integer.MAX_VALUE;
    iZZ = "<TimelineObject>";
    jaa = "</TimelineObject>";
    ppu = "/";
    ppv = "snsb";
    ppw = -1;
    ppx = -1;
    ppy = 4194304;
    ppz = 1048576;
    GMTrace.o(8793408667648L, 65516);
  }
  
  public static String GM(String paramString)
  {
    GMTrace.i(8786429345792L, 65464);
    paramString = "snst_" + GX(paramString);
    GMTrace.o(8786429345792L, 65464);
    return paramString;
  }
  
  public static String GN(String paramString)
  {
    GMTrace.i(18566204096512L, 138329);
    paramString = "snsu_" + GX(paramString);
    GMTrace.o(18566204096512L, 138329);
    return paramString;
  }
  
  public static String GO(String paramString)
  {
    GMTrace.i(8786563563520L, 65465);
    paramString = "snsb_" + GX(paramString);
    GMTrace.o(8786563563520L, 65465);
    return paramString;
  }
  
  public static String GP(String paramString)
  {
    GMTrace.i(8786966216704L, 65468);
    paramString = "snsu_" + GX(paramString);
    GMTrace.o(8786966216704L, 65468);
    return paramString;
  }
  
  public static String GQ(String paramString)
  {
    GMTrace.i(8788308393984L, 65478);
    paramString = "sns_tmpb_" + GX(paramString);
    GMTrace.o(8788308393984L, 65478);
    return paramString;
  }
  
  public static String GR(String paramString)
  {
    GMTrace.i(8788576829440L, 65480);
    paramString = "sns_tmpt_" + GX(paramString);
    GMTrace.o(8788576829440L, 65480);
    return paramString;
  }
  
  public static String GS(String paramString)
  {
    GMTrace.i(8788979482624L, 65483);
    paramString = "sns_tmps_" + GX(paramString);
    GMTrace.o(8788979482624L, 65483);
    return paramString;
  }
  
  public static n GT(String paramString)
  {
    GMTrace.i(8789919006720L, 65490);
    try
    {
      w.i("MicroMsg.SnsUtil", "decodeFileToBlurThumbBitmap " + FileOp.aZ(paramString));
      boolean bool = FileOp.aZ(paramString);
      if (!bool)
      {
        GMTrace.o(8789919006720L, 65490);
        return null;
      }
      paramString = GV(paramString);
      GMTrace.o(8789919006720L, 65490);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.SnsUtil", paramString, "snsdecode error", new Object[0]);
      GMTrace.o(8789919006720L, 65490);
    }
    return null;
  }
  
  /* Error */
  public static Bitmap GU(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 158
    //   3: ldc -96
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 134	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   12: istore_2
    //   13: iload_2
    //   14: ifne +13 -> 27
    //   17: ldc2_w 158
    //   20: ldc -96
    //   22: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: aconst_null
    //   26: areturn
    //   27: new 162	android/graphics/BitmapFactory$Options
    //   30: dup
    //   31: invokespecial 164	android/graphics/BitmapFactory$Options:<init>	()V
    //   34: astore 10
    //   36: aload 10
    //   38: invokestatic 170	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/BitmapFactory$Options;)V
    //   41: aload 10
    //   43: iconst_1
    //   44: putfield 173	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   47: aload 10
    //   49: getfield 173	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   52: istore_1
    //   53: iload_1
    //   54: bipush 10
    //   56: if_icmple +13 -> 69
    //   59: ldc2_w 158
    //   62: ldc -96
    //   64: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   67: aconst_null
    //   68: areturn
    //   69: aconst_null
    //   70: astore 5
    //   72: aload_0
    //   73: invokestatic 177	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   76: astore 7
    //   78: aload 7
    //   80: astore 5
    //   82: aload 7
    //   84: astore 6
    //   86: new 179	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger
    //   89: dup
    //   90: invokespecial 180	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:<init>	()V
    //   93: astore 11
    //   95: aload 7
    //   97: astore 5
    //   99: aload 7
    //   101: astore 6
    //   103: invokestatic 186	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   106: lstore_3
    //   107: aload 7
    //   109: astore 5
    //   111: aload 7
    //   113: astore 6
    //   115: aload 7
    //   117: aconst_null
    //   118: aload 10
    //   120: aload 11
    //   122: iconst_0
    //   123: iconst_0
    //   124: newarray <illegal type>
    //   126: invokestatic 192	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   129: astore 9
    //   131: aload 7
    //   133: astore 5
    //   135: aload 7
    //   137: astore 6
    //   139: lload_3
    //   140: invokestatic 196	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   143: lstore_3
    //   144: aload 7
    //   146: astore 5
    //   148: aload 7
    //   150: astore 6
    //   152: aload 10
    //   154: getfield 173	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   157: iconst_1
    //   158: if_icmple +36 -> 194
    //   161: aload 7
    //   163: astore 5
    //   165: aload 7
    //   167: astore 6
    //   169: ldc 126
    //   171: new 66	java/lang/StringBuilder
    //   174: dup
    //   175: ldc -58
    //   177: invokespecial 72	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   180: aload 10
    //   182: getfield 173	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   185: invokevirtual 201	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   188: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: invokestatic 204	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   194: aload 9
    //   196: ifnull +53 -> 249
    //   199: aload 7
    //   201: astore 5
    //   203: aload 7
    //   205: astore 6
    //   207: aload_0
    //   208: aload 9
    //   210: invokestatic 208	com/tencent/mm/plugin/sns/data/i:r	(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   213: astore 8
    //   215: aload 7
    //   217: astore 5
    //   219: aload 7
    //   221: astore 6
    //   223: aload_0
    //   224: lload_3
    //   225: invokestatic 214	com/tencent/mm/plugin/sns/h/c:V	(Ljava/lang/String;J)V
    //   228: aload 7
    //   230: ifnull +8 -> 238
    //   233: aload 7
    //   235: invokevirtual 219	java/io/InputStream:close	()V
    //   238: ldc2_w 158
    //   241: ldc -96
    //   243: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   246: aload 8
    //   248: areturn
    //   249: aload 9
    //   251: astore 8
    //   253: aload 7
    //   255: astore 5
    //   257: aload 7
    //   259: astore 6
    //   261: aload 11
    //   263: invokevirtual 223	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:getDecodeResult	()I
    //   266: sipush 2000
    //   269: if_icmplt -41 -> 228
    //   272: aload 7
    //   274: astore 5
    //   276: aload 7
    //   278: astore 6
    //   280: aload_0
    //   281: bipush 10
    //   283: aload 11
    //   285: invokestatic 229	com/tencent/mm/sdk/platformtools/MMBitmapFactory$KVStatHelper:getKVStatString	(Ljava/lang/Object;ILcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Ljava/lang/String;
    //   288: astore 8
    //   290: aload 7
    //   292: astore 5
    //   294: aload 7
    //   296: astore 6
    //   298: getstatic 235	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   301: sipush 12712
    //   304: aload 8
    //   306: invokevirtual 239	com/tencent/mm/plugin/report/service/g:A	(ILjava/lang/String;)V
    //   309: aload 9
    //   311: astore 8
    //   313: goto -85 -> 228
    //   316: astore 6
    //   318: aload 5
    //   320: astore 6
    //   322: aload 10
    //   324: aload 10
    //   326: getfield 173	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   329: iconst_1
    //   330: iadd
    //   331: putfield 173	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   334: aload 5
    //   336: ifnull -289 -> 47
    //   339: aload 5
    //   341: invokevirtual 219	java/io/InputStream:close	()V
    //   344: goto -297 -> 47
    //   347: astore 5
    //   349: goto -302 -> 47
    //   352: astore_0
    //   353: aconst_null
    //   354: astore 6
    //   356: aload 6
    //   358: ifnull +8 -> 366
    //   361: aload 6
    //   363: invokevirtual 219	java/io/InputStream:close	()V
    //   366: aload_0
    //   367: athrow
    //   368: astore_0
    //   369: ldc 126
    //   371: aload_0
    //   372: ldc -109
    //   374: iconst_0
    //   375: anewarray 4	java/lang/Object
    //   378: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   381: ldc2_w 158
    //   384: ldc -96
    //   386: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   389: aconst_null
    //   390: areturn
    //   391: astore_0
    //   392: goto -154 -> 238
    //   395: astore 5
    //   397: goto -31 -> 366
    //   400: astore_0
    //   401: goto -45 -> 356
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	404	0	paramString	String
    //   52	5	1	i	int
    //   12	2	2	bool	boolean
    //   106	119	3	l	long
    //   70	270	5	localObject1	Object
    //   347	1	5	localIOException1	IOException
    //   395	1	5	localIOException2	IOException
    //   84	213	6	localInputStream1	InputStream
    //   316	1	6	localOutOfMemoryError	OutOfMemoryError
    //   320	42	6	localObject2	Object
    //   76	219	7	localInputStream2	InputStream
    //   213	99	8	localObject3	Object
    //   129	181	9	localBitmap	Bitmap
    //   34	291	10	localOptions	BitmapFactory.Options
    //   93	191	11	localDecodeResultLogger	MMBitmapFactory.DecodeResultLogger
    // Exception table:
    //   from	to	target	type
    //   72	78	316	java/lang/OutOfMemoryError
    //   86	95	316	java/lang/OutOfMemoryError
    //   103	107	316	java/lang/OutOfMemoryError
    //   115	131	316	java/lang/OutOfMemoryError
    //   139	144	316	java/lang/OutOfMemoryError
    //   152	161	316	java/lang/OutOfMemoryError
    //   169	194	316	java/lang/OutOfMemoryError
    //   207	215	316	java/lang/OutOfMemoryError
    //   223	228	316	java/lang/OutOfMemoryError
    //   261	272	316	java/lang/OutOfMemoryError
    //   280	290	316	java/lang/OutOfMemoryError
    //   298	309	316	java/lang/OutOfMemoryError
    //   339	344	347	java/io/IOException
    //   72	78	352	finally
    //   8	13	368	java/lang/Exception
    //   27	47	368	java/lang/Exception
    //   47	53	368	java/lang/Exception
    //   233	238	368	java/lang/Exception
    //   339	344	368	java/lang/Exception
    //   361	366	368	java/lang/Exception
    //   366	368	368	java/lang/Exception
    //   233	238	391	java/io/IOException
    //   361	366	395	java/io/IOException
    //   86	95	400	finally
    //   103	107	400	finally
    //   115	131	400	finally
    //   139	144	400	finally
    //   152	161	400	finally
    //   169	194	400	finally
    //   207	215	400	finally
    //   223	228	400	finally
    //   261	272	400	finally
    //   280	290	400	finally
    //   298	309	400	finally
    //   322	334	400	finally
  }
  
  public static n GV(String paramString)
  {
    GMTrace.i(8790187442176L, 65492);
    try
    {
      boolean bool = FileOp.aZ(paramString);
      if (!bool)
      {
        GMTrace.o(8790187442176L, 65492);
        return null;
      }
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      d.b(localOptions);
      localOptions.inSampleSize = 1;
      for (;;)
      {
        int i = localOptions.inSampleSize;
        if (i > 10)
        {
          GMTrace.o(8790187442176L, 65492);
          return null;
        }
        try
        {
          Object localObject = new MMBitmapFactory.DecodeResultLogger();
          long l = bg.Pw();
          n localn = com.tencent.mm.plugin.sns.d.a.c(paramString, localOptions, (MMBitmapFactory.DecodeResultLogger)localObject);
          l = bg.aI(l);
          if (localn != null) {
            c.V(paramString, l);
          }
          for (;;)
          {
            GMTrace.o(8790187442176L, 65492);
            return localn;
            if (((MMBitmapFactory.DecodeResultLogger)localObject).getDecodeResult() >= 2000)
            {
              localObject = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 10, (MMBitmapFactory.DecodeResultLogger)localObject);
              com.tencent.mm.plugin.report.service.g.ork.A(12712, (String)localObject);
            }
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          localOptions.inSampleSize += 1;
        }
      }
      return null;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.SnsUtil", paramString, "snsdecode error", new Object[0]);
      GMTrace.o(8790187442176L, 65492);
    }
  }
  
  public static String GW(String paramString)
  {
    GMTrace.i(8790321659904L, 65493);
    paramString = new StringBuffer(paramString);
    while (paramString.length() < 25) {
      paramString.insert(0, "0");
    }
    paramString = paramString.toString();
    GMTrace.o(8790321659904L, 65493);
    return paramString;
  }
  
  private static String GX(String paramString)
  {
    GMTrace.i(8790724313088L, 65496);
    if (paramString == null)
    {
      GMTrace.o(8790724313088L, 65496);
      return "";
    }
    int j = paramString.length();
    int i = 0;
    while ((i < j) && (paramString.charAt(i) == '0')) {
      i += 1;
    }
    paramString = paramString.substring(i);
    GMTrace.o(8790724313088L, 65496);
    return paramString;
  }
  
  public static boolean GY(String paramString)
  {
    GMTrace.i(8791261184000L, 65500);
    boolean bool = paramString.startsWith(e.ghx);
    GMTrace.o(8791261184000L, 65500);
    return bool;
  }
  
  public static boolean GZ(String paramString)
  {
    GMTrace.i(8791395401728L, 65501);
    try
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(paramString, localOptions);
      int i = localOptions.outWidth;
      int j = localOptions.outHeight;
      if ((j >= i * 2) || (i >= j * 2))
      {
        GMTrace.o(8791395401728L, 65501);
        return true;
      }
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.SnsUtil", "get error setImageExtInfo");
      GMTrace.o(8791395401728L, 65501);
      return false;
    }
    GMTrace.o(8791395401728L, 65501);
    return false;
  }
  
  public static long Gr()
  {
    GMTrace.i(8792737579008L, 65511);
    long l = (int)(TimeZone.getDefault().getRawOffset() / 60000L) / 60L;
    GMTrace.o(8792737579008L, 65511);
    return l;
  }
  
  private static Rect H(Bitmap paramBitmap)
  {
    GMTrace.i(8790858530816L, 65497);
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    paramBitmap = new Rect(i / 4, 0, (int)(i * 3 / 4.0D), j);
    GMTrace.o(8790858530816L, 65497);
    return paramBitmap;
  }
  
  public static boolean Ha(String paramString)
  {
    GMTrace.i(8791529619456L, 65502);
    int i = ppy;
    int j;
    int k;
    try
    {
      paramString = d.RB(paramString);
      j = paramString.outWidth;
      k = paramString.outHeight;
      if ((k <= 0) && (j <= 0))
      {
        GMTrace.o(8791529619456L, 65502);
        return false;
      }
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.SnsUtil", "get error setImageExtInfo");
      GMTrace.o(8791529619456L, 65502);
      return false;
    }
    if ((k >= j * 2) || (j >= k * 2))
    {
      GMTrace.o(8791529619456L, 65502);
      return false;
    }
    if (k * j > i)
    {
      GMTrace.o(8791529619456L, 65502);
      return true;
    }
    GMTrace.o(8791529619456L, 65502);
    return false;
  }
  
  public static long Hb(String paramString)
  {
    GMTrace.i(8793140232192L, 65514);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(8793140232192L, 65514);
      return 0L;
    }
    long l = new BigInteger(paramString).longValue();
    w.i("MicroMsg.SnsUtil", "seq %s to snsId %d ", new Object[] { paramString, Long.valueOf(l) });
    GMTrace.o(8793140232192L, 65514);
    return l;
  }
  
  /* Error */
  public static int Hc(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 396
    //   3: ldc_w 398
    //   6: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokestatic 401	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: istore_2
    //   14: iload_2
    //   15: ifeq +14 -> 29
    //   18: ldc2_w 396
    //   21: ldc_w 398
    //   24: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: iconst_0
    //   28: ireturn
    //   29: ldc 126
    //   31: ldc_w 403
    //   34: iconst_1
    //   35: anewarray 4	java/lang/Object
    //   38: dup
    //   39: iconst_0
    //   40: aload_0
    //   41: aastore
    //   42: invokestatic 391	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: new 405	android/media/MediaMetadataRetriever
    //   48: dup
    //   49: invokespecial 406	android/media/MediaMetadataRetriever:<init>	()V
    //   52: astore 4
    //   54: aload 4
    //   56: astore_3
    //   57: aload 4
    //   59: aload_0
    //   60: invokevirtual 409	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   63: aload 4
    //   65: astore_3
    //   66: aload 4
    //   68: bipush 9
    //   70: invokevirtual 412	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   73: iconst_0
    //   74: invokestatic 416	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   77: i2l
    //   78: invokestatic 420	com/tencent/mm/sdk/platformtools/bg:eN	(J)I
    //   81: istore_1
    //   82: aload 4
    //   84: invokevirtual 423	android/media/MediaMetadataRetriever:release	()V
    //   87: ldc2_w 396
    //   90: ldc_w 398
    //   93: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   96: iload_1
    //   97: ireturn
    //   98: astore_3
    //   99: aconst_null
    //   100: astore 4
    //   102: aload 4
    //   104: astore_3
    //   105: ldc 126
    //   107: ldc_w 425
    //   110: iconst_1
    //   111: anewarray 4	java/lang/Object
    //   114: dup
    //   115: iconst_0
    //   116: aload_0
    //   117: aastore
    //   118: invokestatic 427	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: aload 4
    //   123: ifnull +8 -> 131
    //   126: aload 4
    //   128: invokevirtual 423	android/media/MediaMetadataRetriever:release	()V
    //   131: ldc2_w 396
    //   134: ldc_w 398
    //   137: invokestatic 58	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   140: iconst_0
    //   141: ireturn
    //   142: astore_0
    //   143: aconst_null
    //   144: astore_3
    //   145: aload_3
    //   146: ifnull +7 -> 153
    //   149: aload_3
    //   150: invokevirtual 423	android/media/MediaMetadataRetriever:release	()V
    //   153: aload_0
    //   154: athrow
    //   155: astore_0
    //   156: goto -11 -> 145
    //   159: astore_3
    //   160: goto -58 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	paramString	String
    //   81	16	1	i	int
    //   13	2	2	bool	boolean
    //   56	10	3	localMediaMetadataRetriever1	android.media.MediaMetadataRetriever
    //   98	1	3	localThrowable1	Throwable
    //   104	46	3	localMediaMetadataRetriever2	android.media.MediaMetadataRetriever
    //   159	1	3	localThrowable2	Throwable
    //   52	75	4	localMediaMetadataRetriever3	android.media.MediaMetadataRetriever
    // Exception table:
    //   from	to	target	type
    //   9	14	98	java/lang/Throwable
    //   29	54	98	java/lang/Throwable
    //   9	14	142	finally
    //   29	54	142	finally
    //   57	63	155	finally
    //   66	82	155	finally
    //   105	121	155	finally
    //   57	63	159	java/lang/Throwable
    //   66	82	159	java/lang/Throwable
  }
  
  private static Rect I(Bitmap paramBitmap)
  {
    GMTrace.i(8790992748544L, 65498);
    paramBitmap = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    GMTrace.o(8790992748544L, 65498);
    return paramBitmap;
  }
  
  public static void U(String paramString, long paramLong)
  {
    GMTrace.i(8789382135808L, 65486);
    long l = System.currentTimeMillis();
    w.d("MicroMsg.SnsUtil", " name " + paramString + " allTime " + (l - paramLong));
    GMTrace.o(8789382135808L, 65486);
  }
  
  public static SpannableString a(String paramString, Context paramContext, TextView paramTextView)
  {
    GMTrace.i(8792871796736L, 65512);
    if (bg.nm(paramString))
    {
      GMTrace.o(8792871796736L, 65512);
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder("<img src=\"original_label.png\"/>  ");
    localStringBuilder.append(paramString);
    paramString = new SpannableString(h.d(paramContext, localStringBuilder.toString(), (int)paramTextView.getTextSize()));
    GMTrace.o(8792871796736L, 65512);
    return paramString;
  }
  
  public static boolean a(n paramn)
  {
    GMTrace.i(8789650571264L, 65488);
    if ((paramn == null) || (paramn.isRecycled()))
    {
      GMTrace.o(8789650571264L, 65488);
      return false;
    }
    GMTrace.o(8789650571264L, 65488);
    return true;
  }
  
  public static String ar(int paramInt, String paramString)
  {
    GMTrace.i(8786026692608L, 65461);
    paramString = paramInt + "-" + paramString;
    GMTrace.o(8786026692608L, 65461);
    return paramString;
  }
  
  public static String as(int paramInt, String paramString)
  {
    GMTrace.i(8789247918080L, 65485);
    paramString = paramInt + "-" + paramString;
    GMTrace.o(8789247918080L, 65485);
    return paramString;
  }
  
  public static void b(View paramView, Context paramContext)
  {
    GMTrace.i(8792334925824L, 65508);
    ViewGroup.LayoutParams localLayoutParams;
    int i;
    int k;
    if ((paramView != null) && (com.tencent.mm.ui.ab.dZ(paramContext) > 1.0F))
    {
      float f = com.tencent.mm.ui.ab.dZ(paramContext);
      localLayoutParams = paramView.getLayoutParams();
      i = com.tencent.mm.br.a.fromDPToPix(paramContext, 60);
      if ((localLayoutParams.width >= 0) && (localLayoutParams.height >= 0))
      {
        int m = (int)(localLayoutParams.width * f);
        k = (int)(f * localLayoutParams.height);
        int j = m;
        if (m > i) {
          j = i;
        }
        localLayoutParams.width = j;
        if (k <= i) {
          break label126;
        }
      }
    }
    for (;;)
    {
      localLayoutParams.height = i;
      paramView.setLayoutParams(localLayoutParams);
      GMTrace.o(8792334925824L, 65508);
      return;
      label126:
      i = k;
    }
  }
  
  public static int bhS()
  {
    GMTrace.i(8791798054912L, 65504);
    int i = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).getInt("sns_control_flag", 0);
    GMTrace.o(8791798054912L, 65504);
    return i;
  }
  
  public static int bhT()
  {
    GMTrace.i(8792066490368L, 65506);
    int i = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).getInt("sns_respone_count", 20);
    GMTrace.o(8792066490368L, 65506);
    return i;
  }
  
  public static int bhU()
  {
    GMTrace.i(8792469143552L, 65509);
    Context localContext = com.tencent.mm.sdk.platformtools.ab.getContext();
    if (am.is2G(localContext))
    {
      GMTrace.o(8792469143552L, 65509);
      return 1;
    }
    if (am.is3G(localContext))
    {
      GMTrace.o(8792469143552L, 65509);
      return 2;
    }
    if (am.is4G(localContext))
    {
      GMTrace.o(8792469143552L, 65509);
      return 3;
    }
    if (am.isWifi(localContext))
    {
      GMTrace.o(8792469143552L, 65509);
      return 4;
    }
    GMTrace.o(8792469143552L, 65509);
    return 0;
  }
  
  public static String bs(List<anu> paramList)
  {
    GMTrace.i(8786160910336L, 65462);
    if ((paramList == null) || (paramList.size() == 0))
    {
      GMTrace.o(8786160910336L, 65462);
      return "";
    }
    Object localObject = "";
    Iterator localIterator = paramList.iterator();
    int i = 0;
    paramList = (List<anu>)localObject;
    for (;;)
    {
      localObject = paramList;
      if (localIterator.hasNext())
      {
        anu localanu = (anu)localIterator.next();
        localObject = paramList;
        if (paramList.length() > 0) {
          localObject = paramList + "-";
        }
        paramList = (String)localObject + localanu.mmR;
        i += 1;
        if (i >= 4) {
          localObject = paramList;
        }
      }
      else
      {
        GMTrace.o(8786160910336L, 65462);
        return (String)localObject;
      }
    }
  }
  
  private static String c(anu paramanu)
  {
    GMTrace.i(8786295128064L, 65463);
    if (!bg.nm(paramanu.uDc))
    {
      paramanu = paramanu.uDc;
      GMTrace.o(8786295128064L, 65463);
      return paramanu;
    }
    String str = "";
    try
    {
      paramanu = com.tencent.mm.a.g.n(paramanu.toByteArray());
      GMTrace.o(8786295128064L, 65463);
      return paramanu;
    }
    catch (Exception paramanu)
    {
      for (;;)
      {
        paramanu = str;
      }
    }
  }
  
  public static String d(anu paramanu)
  {
    GMTrace.i(8786697781248L, 65466);
    String str = "snsb_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8786697781248L, 65466);
      return paramanu;
    }
    GMTrace.o(8786697781248L, 65466);
    return str;
  }
  
  public static String dt(long paramLong)
  {
    GMTrace.i(8790455877632L, 65494);
    String str = new BigInteger(Long.toBinaryString(paramLong), 2).toString();
    GMTrace.o(8790455877632L, 65494);
    return str;
  }
  
  public static String du(long paramLong)
  {
    GMTrace.i(8790590095360L, 65495);
    if (paramLong == 0L)
    {
      GMTrace.o(8790590095360L, 65495);
      return "";
    }
    String str = GW(new BigInteger(Long.toBinaryString(paramLong), 2).toString());
    GMTrace.o(8790590095360L, 65495);
    return str;
  }
  
  public static String e(anu paramanu)
  {
    GMTrace.i(8786831998976L, 65467);
    String str = "snst_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8786831998976L, 65467);
      return paramanu;
    }
    GMTrace.o(8786831998976L, 65467);
    return str;
  }
  
  public static String f(anu paramanu)
  {
    GMTrace.i(8787100434432L, 65469);
    String str = "snsu_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8787100434432L, 65469);
      return paramanu;
    }
    GMTrace.o(8787100434432L, 65469);
    return str;
  }
  
  public static boolean f(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8792603361280L, 65510);
    if ((paramm.field_type == 3) || (paramm.field_type == 4) || (paramm.field_type == 5) || (paramm.field_type == 6) || (paramm.field_type == 9) || (paramm.field_type == 10) || (paramm.field_type == 11) || (paramm.field_type == 12) || (paramm.field_type == 13) || (paramm.field_type == 14) || (paramm.field_type == 17) || (paramm.field_type == 22) || (paramm.field_type == 23))
    {
      GMTrace.o(8792603361280L, 65510);
      return true;
    }
    GMTrace.o(8792603361280L, 65510);
    return false;
  }
  
  public static String g(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8793006014464L, 65513);
    if (paramm == null)
    {
      GMTrace.o(8793006014464L, 65513);
      return "0";
    }
    paramm = dt(paramm.field_snsId);
    GMTrace.o(8793006014464L, 65513);
    return paramm;
  }
  
  public static String g(anu paramanu)
  {
    GMTrace.i(8787234652160L, 65470);
    String str = "snsblurt_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8787234652160L, 65470);
      return paramanu;
    }
    GMTrace.o(8787234652160L, 65470);
    return str;
  }
  
  public static String h(anu paramanu)
  {
    GMTrace.i(8787368869888L, 65471);
    String str = "snsblurs_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8787368869888L, 65471);
      return paramanu;
    }
    GMTrace.o(8787368869888L, 65471);
    return str;
  }
  
  public static Bitmap i(List<n> paramList, int paramInt)
  {
    GMTrace.i(8791126966272L, 65499);
    Object localObject1 = paramList.iterator();
    while (((Iterator)localObject1).hasNext()) {
      if (!a((n)((Iterator)localObject1).next()))
      {
        GMTrace.o(8791126966272L, 65499);
        return null;
      }
    }
    if (paramInt <= 0)
    {
      GMTrace.o(8791126966272L, 65499);
      return null;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
    int i = paramList.size();
    LinkedList localLinkedList = new LinkedList();
    int k = paramInt >> 1;
    int j = k + 2;
    k -= 2;
    Object localObject2;
    label184:
    Object localObject3;
    Rect localRect;
    if (i == 2)
    {
      localObject1 = new Rect(0, 0, k, paramInt);
      localObject2 = new Rect(j, 0, paramInt, paramInt);
      localLinkedList.add(localObject1);
      localLinkedList.add(localObject2);
      localObject2 = new Canvas(localBitmap);
      ((Canvas)localObject2).drawColor(-1);
      i = 0;
      paramInt = 0;
      if ((paramInt >= paramList.size()) || (i >= 4)) {
        break label517;
      }
      localObject3 = ((n)paramList.get(paramInt)).yq();
      localRect = (Rect)localLinkedList.get(paramInt);
      switch (paramList.size())
      {
      default: 
        localObject1 = I((Bitmap)localObject3);
      }
    }
    for (;;)
    {
      ((Canvas)localObject2).drawBitmap((Bitmap)localObject3, (Rect)localObject1, localRect, null);
      i += 1;
      paramInt += 1;
      break label184;
      if (i == 3)
      {
        localObject1 = new Rect(0, 0, k, paramInt);
        localObject2 = new Rect(j, 0, paramInt, k);
        localObject3 = new Rect(j, j, paramInt, paramInt);
        localLinkedList.add(localObject1);
        localLinkedList.add(localObject2);
        localLinkedList.add(localObject3);
        break;
      }
      if (i < 4) {
        break;
      }
      localObject1 = new Rect(0, 0, k, k);
      localObject2 = new Rect(0, j, k, paramInt);
      localObject3 = new Rect(j, 0, paramInt, k);
      localRect = new Rect(j, j, paramInt, paramInt);
      localLinkedList.add(localObject1);
      localLinkedList.add(localObject2);
      localLinkedList.add(localObject3);
      localLinkedList.add(localRect);
      break;
      localObject1 = I((Bitmap)localObject3);
      continue;
      localObject1 = H((Bitmap)localObject3);
      continue;
      if (paramInt == 0) {
        localObject1 = H((Bitmap)localObject3);
      } else {
        localObject1 = I((Bitmap)localObject3);
      }
    }
    label517:
    ((Canvas)localObject2).save(31);
    ((Canvas)localObject2).restore();
    GMTrace.o(8791126966272L, 65499);
    return localBitmap;
  }
  
  public static String i(anu paramanu)
  {
    GMTrace.i(8787637305344L, 65473);
    String str = "snstblur_src_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8787637305344L, 65473);
      return paramanu;
    }
    GMTrace.o(8787637305344L, 65473);
    return str;
  }
  
  public static String j(anu paramanu)
  {
    GMTrace.i(8787771523072L, 65474);
    String str = "sight_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8787771523072L, 65474);
      return paramanu;
    }
    GMTrace.o(8787771523072L, 65474);
    return str;
  }
  
  public static String k(anu paramanu)
  {
    GMTrace.i(8787905740800L, 65475);
    String str = "sightad_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str, paramanu.uDb);
      GMTrace.o(8787905740800L, 65475);
      return paramanu;
    }
    GMTrace.o(8787905740800L, 65475);
    return str;
  }
  
  public static String l(anu paramanu)
  {
    GMTrace.i(8788039958528L, 65476);
    String str = "snsb_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8788039958528L, 65476);
      return paramanu;
    }
    GMTrace.o(8788039958528L, 65476);
    return str;
  }
  
  public static String m(anu paramanu)
  {
    GMTrace.i(8788174176256L, 65477);
    String str = "sns_tmpb_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8788174176256L, 65477);
      return paramanu;
    }
    GMTrace.o(8788174176256L, 65477);
    return str;
  }
  
  public static boolean m(Bitmap paramBitmap)
  {
    GMTrace.i(8789516353536L, 65487);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(8789516353536L, 65487);
      return false;
    }
    GMTrace.o(8789516353536L, 65487);
    return true;
  }
  
  public static String n(anu paramanu)
  {
    GMTrace.i(8788442611712L, 65479);
    String str = "sns_tmpt_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8788442611712L, 65479);
      return paramanu;
    }
    GMTrace.o(8788442611712L, 65479);
    return str;
  }
  
  public static String o(anu paramanu)
  {
    GMTrace.i(8788711047168L, 65481);
    String str = "sns_tmpu_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8788711047168L, 65481);
      return paramanu;
    }
    GMTrace.o(8788711047168L, 65481);
    return str;
  }
  
  public static String p(anu paramanu)
  {
    GMTrace.i(8788845264896L, 65482);
    String str = "sns_tmps_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8788845264896L, 65482);
      return paramanu;
    }
    GMTrace.o(8788845264896L, 65482);
    return str;
  }
  
  public static String q(anu paramanu)
  {
    GMTrace.i(8789113700352L, 65484);
    String str = "sns_tmpsad_" + GX(paramanu.mmR);
    if (paramanu.uDa == 1)
    {
      paramanu = f.m(str + c(paramanu), paramanu.uDb);
      GMTrace.o(8789113700352L, 65484);
      return paramanu;
    }
    GMTrace.o(8789113700352L, 65484);
    return str;
  }
  
  public static Bitmap r(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(8789784788992L, 65489);
    if (paramBitmap == null)
    {
      GMTrace.o(8789784788992L, 65489);
      return null;
    }
    if (bg.nm(paramString)) {
      str = "";
    }
    while (bg.nm(str))
    {
      GMTrace.o(8789784788992L, 65489);
      return paramBitmap;
      i = paramString.lastIndexOf(ppu);
      if ((i > 0) && (i + 1 < paramString.length()))
      {
        str = paramString.substring(i + 1);
        if ((str.startsWith(ppv)) || (str.startsWith("sns_tmpb_")))
        {
          str = paramString;
          continue;
        }
        if ((str.startsWith("snst_")) || (str.startsWith("snsu_")))
        {
          str = "";
          continue;
        }
      }
      str = paramString;
    }
    j = 0;
    Exif localExif = new Exif();
    Object localObject4 = null;
    Object localObject3 = null;
    localObject2 = localObject3;
    localObject1 = localObject4;
    try
    {
      w.i("MicroMsg.SnsUtil", "[tomys] parsing jpg, path: %s, size: %s", new Object[] { paramString, Long.valueOf(FileOp.kX(paramString)) });
      localObject2 = localObject3;
      localObject1 = localObject4;
      paramString = FileOp.openRead(paramString);
      localObject2 = paramString;
      localObject1 = paramString;
      localExif.parseFromStream(paramString);
      localObject2 = paramString;
      localObject1 = paramString;
      i = localExif.getOrientationInDegree();
      j = i;
      i = j;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        localObject1 = localObject2;
        w.printErrStackTrace("MicroMsg.SnsUtil", paramString, "Failed parsing JPEG file: " + str, new Object[0]);
        i = j;
        if (localObject2 != null) {
          try
          {
            ((InputStream)localObject2).close();
            i = j;
          }
          catch (Throwable paramString)
          {
            i = j;
          }
        }
      }
    }
    finally
    {
      if (localObject1 == null) {}
    }
    try
    {
      paramString.close();
      i = j;
    }
    catch (Throwable paramString)
    {
      try
      {
        ((InputStream)localObject1).close();
        throw paramString;
        paramString = paramString;
        i = j;
      }
      catch (Throwable paramBitmap)
      {
        for (;;) {}
      }
    }
    w.d("MicroMsg.SnsUtil", "exifPath : %s degree : %d", new Object[] { str, Integer.valueOf(i) });
    paramString = d.b(paramBitmap, i);
    GMTrace.o(8789784788992L, 65489);
    return paramString;
  }
  
  public static boolean uh(int paramInt)
  {
    GMTrace.i(8791663837184L, 65503);
    com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).edit().putInt("sns_control_flag", paramInt).commit();
    GMTrace.o(8791663837184L, 65503);
    return true;
  }
  
  public static boolean ui(int paramInt)
  {
    GMTrace.i(8791932272640L, 65505);
    com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).edit().putInt("sns_respone_count", paramInt).commit();
    GMTrace.o(8791932272640L, 65505);
    return true;
  }
  
  public static String z(CharSequence paramCharSequence)
  {
    int i = 0;
    GMTrace.i(8792200708096L, 65507);
    if (paramCharSequence == null)
    {
      GMTrace.o(8792200708096L, 65507);
      return "";
    }
    paramCharSequence = new SpannableString(paramCharSequence);
    com.tencent.mm.pluginsdk.ui.d.m[] arrayOfm = (com.tencent.mm.pluginsdk.ui.d.m[])paramCharSequence.getSpans(0, paramCharSequence.length(), com.tencent.mm.pluginsdk.ui.d.m.class);
    w.d("MicroMsg.SnsUtil", "removeClickSpanInString, clickSpans.length:%d", new Object[] { Integer.valueOf(arrayOfm.length) });
    while (i < arrayOfm.length)
    {
      paramCharSequence.removeSpan(arrayOfm[i]);
      i += 1;
    }
    paramCharSequence = paramCharSequence.toString();
    GMTrace.o(8792200708096L, 65507);
    return paramCharSequence;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\data\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
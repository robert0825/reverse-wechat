package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.memory.l;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.d.a;
import com.tencent.mm.plugin.sns.data.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.protocal.c.anr;
import com.tencent.mm.protocal.c.anx;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
  extends j
{
  public static final String[] fTX;
  private static int pmG;
  private static int pnu;
  private static Point puw;
  public com.tencent.mm.bu.g goN;
  
  static
  {
    GMTrace.i(8307674710016L, 61897);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS SnsMedia ( local_id INTEGER PRIMARY KEY, seqId LONG, type INT, createTime LONG, userName VARCHAR(40), totallen INT, offset INT, local_flag INT, tmp_path TEXT, nums INT, try_times INT, StrId VARCHAR(40), upload_buf TEXT, reserved1 INT, reserved2 TEXT, reserved3 TEXT, reserved4 TEXT, reserved5 TEXT )", "CREATE INDEX IF NOT EXISTS serverSnsMediaTimeIndex ON SnsMedia ( createTime )" };
    pnu = 0;
    pmG = 0;
    puw = new Point();
    GMTrace.o(8307674710016L, 61897);
  }
  
  public r(com.tencent.mm.bu.g paramg)
  {
    GMTrace.i(8304721920000L, 61875);
    this.goN = paramg;
    GMTrace.o(8304721920000L, 61875);
  }
  
  private static String IG(String paramString)
  {
    GMTrace.i(8304990355456L, 61877);
    if (paramString == null)
    {
      GMTrace.o(8304990355456L, 61877);
      return "";
    }
    String str2 = com.tencent.mm.a.g.n(paramString.getBytes());
    paramString = "";
    String str1 = "";
    if (str2.length() > 0) {
      paramString = str2.charAt(0) + "/";
    }
    if (str2.length() >= 2) {
      str1 = str2.charAt(1) + "/";
    }
    paramString = ae.getAccSnsPath() + paramString + str1;
    GMTrace.o(8304990355456L, 61877);
    return paramString;
  }
  
  /* Error */
  public static boolean II(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc2_w 110
    //   5: ldc 112
    //   7: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: invokestatic 118	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   14: astore_0
    //   15: aload_0
    //   16: astore_2
    //   17: new 120	android/graphics/BitmapFactory$Options
    //   20: dup
    //   21: invokespecial 121	android/graphics/BitmapFactory$Options:<init>	()V
    //   24: astore_3
    //   25: aload_0
    //   26: astore_2
    //   27: aload_3
    //   28: iconst_1
    //   29: putfield 125	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   32: aload_0
    //   33: astore_2
    //   34: aload_0
    //   35: aconst_null
    //   36: aload_3
    //   37: aconst_null
    //   38: iconst_0
    //   39: iconst_0
    //   40: newarray <illegal type>
    //   42: invokestatic 131	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   45: pop
    //   46: aload_0
    //   47: astore_2
    //   48: aload_3
    //   49: getfield 135	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   52: astore_3
    //   53: aload_0
    //   54: astore_2
    //   55: ldc -119
    //   57: new 80	java/lang/StringBuilder
    //   60: dup
    //   61: ldc -117
    //   63: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   66: aload_3
    //   67: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: invokestatic 148	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   76: aload_0
    //   77: astore_2
    //   78: aload_3
    //   79: invokevirtual 151	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   82: ldc -103
    //   84: invokevirtual 157	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   87: istore_1
    //   88: iload_1
    //   89: iflt +21 -> 110
    //   92: aload_0
    //   93: ifnull +7 -> 100
    //   96: aload_0
    //   97: invokevirtual 162	java/io/InputStream:close	()V
    //   100: ldc2_w 110
    //   103: ldc 112
    //   105: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   108: iconst_1
    //   109: ireturn
    //   110: aload_0
    //   111: ifnull +7 -> 118
    //   114: aload_0
    //   115: invokevirtual 162	java/io/InputStream:close	()V
    //   118: ldc2_w 110
    //   121: ldc 112
    //   123: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   126: iconst_0
    //   127: ireturn
    //   128: astore_0
    //   129: aload_2
    //   130: ifnull +7 -> 137
    //   133: aload_2
    //   134: invokevirtual 162	java/io/InputStream:close	()V
    //   137: ldc2_w 110
    //   140: ldc 112
    //   142: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   145: iconst_0
    //   146: ireturn
    //   147: astore_0
    //   148: aconst_null
    //   149: astore_2
    //   150: aload_2
    //   151: ifnull +7 -> 158
    //   154: aload_2
    //   155: invokevirtual 162	java/io/InputStream:close	()V
    //   158: aload_0
    //   159: athrow
    //   160: astore_0
    //   161: goto -61 -> 100
    //   164: astore_0
    //   165: goto -47 -> 118
    //   168: astore_0
    //   169: goto -32 -> 137
    //   172: astore_2
    //   173: goto -15 -> 158
    //   176: astore_3
    //   177: aload_0
    //   178: astore_2
    //   179: aload_3
    //   180: astore_0
    //   181: goto -31 -> 150
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	paramString	String
    //   87	2	1	i	int
    //   1	154	2	str1	String
    //   172	1	2	localIOException	IOException
    //   178	1	2	str2	String
    //   24	55	3	localObject1	Object
    //   176	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   10	15	128	java/lang/Exception
    //   17	25	128	java/lang/Exception
    //   27	32	128	java/lang/Exception
    //   34	46	128	java/lang/Exception
    //   48	53	128	java/lang/Exception
    //   55	76	128	java/lang/Exception
    //   78	88	128	java/lang/Exception
    //   10	15	147	finally
    //   96	100	160	java/io/IOException
    //   114	118	164	java/io/IOException
    //   133	137	168	java/io/IOException
    //   154	158	172	java/io/IOException
    //   17	25	176	finally
    //   27	32	176	finally
    //   34	46	176	finally
    //   48	53	176	finally
    //   55	76	176	finally
    //   78	88	176	finally
  }
  
  public static Bitmap IJ(String paramString)
  {
    int j = 640;
    GMTrace.i(8307540492288L, 61896);
    localObject1 = com.tencent.mm.sdk.platformtools.d.RB(paramString);
    int i;
    if (((BitmapFactory.Options)localObject1).outWidth >= ((BitmapFactory.Options)localObject1).outHeight)
    {
      i = 960;
      if (((BitmapFactory.Options)localObject1).outWidth < ((BitmapFactory.Options)localObject1).outHeight) {
        break label114;
      }
    }
    Object localObject2;
    for (;;)
    {
      localObject2 = new MMBitmapFactory.DecodeResultLogger();
      localObject1 = com.tencent.mm.sdk.platformtools.d.a(paramString, j, i, false, (MMBitmapFactory.DecodeResultLogger)localObject2, 0);
      if (localObject1 != null) {
        break label121;
      }
      if (((MMBitmapFactory.DecodeResultLogger)localObject2).getDecodeResult() >= 2000)
      {
        paramString = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 10, (MMBitmapFactory.DecodeResultLogger)localObject2);
        com.tencent.mm.plugin.report.service.g.ork.A(12712, paramString);
      }
      GMTrace.o(8307540492288L, 61896);
      return null;
      i = 640;
      break;
      label114:
      j = 960;
    }
    try
    {
      label121:
      localObject2 = new Exif();
      ((Exif)localObject2).parseFromFile(paramString);
      localObject2 = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject1, ((Exif)localObject2).getOrientationInDegree());
      paramString = (String)localObject2;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.snsMediaStorage", localIOException, "parse exif failed: " + paramString, new Object[0]);
        paramString = (String)localObject1;
      }
    }
    GMTrace.o(8307540492288L, 61896);
    return paramString;
  }
  
  public static boolean X(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(15402289594368L, 114756);
    boolean bool = d(paramString1, paramString2, paramString3, true);
    GMTrace.o(15402289594368L, 114756);
    return bool;
  }
  
  private int a(h paramh)
  {
    GMTrace.i(8305929879552L, 61884);
    Object localObject1 = ae.getAccSnsPath();
    String str1 = ae.getAccSnsTmpPath();
    w.i("MicroMsg.snsMediaStorage", "SnsMediaStorage %s %s", new Object[] { localObject1, str1 });
    long l = System.currentTimeMillis();
    Object localObject3 = paramh.path;
    int i = paramh.type;
    if (!FileOp.aZ((String)localObject3))
    {
      GMTrace.o(8305929879552L, 61884);
      return -1;
    }
    Object localObject2 = com.tencent.mm.a.g.n(((String)localObject3 + System.currentTimeMillis()).getBytes());
    String str2 = i.GQ((String)localObject2);
    w.d("MicroMsg.snsMediaStorage", "insert : original img path = " + (String)localObject3);
    if (!FileOp.aZ(str1))
    {
      w.i("MicroMsg.snsMediaStorage", "create snstmp path " + str1);
      FileOp.la(str1);
    }
    if (!FileOp.aZ((String)localObject1))
    {
      w.i("MicroMsg.snsMediaStorage", "create snsPath " + (String)localObject1);
      FileOp.la((String)localObject1);
    }
    localObject1 = new a();
    paramh = a(paramh, (String)localObject3);
    int j = paramh.width;
    int k = paramh.height;
    int m = paramh.fileSize;
    ((a)localObject1).pMP = ((String)localObject3);
    ((a)localObject1).pMR = j;
    ((a)localObject1).pMS = k;
    ((a)localObject1).pMT = m;
    if (!d(str1, (String)localObject3, str2, true))
    {
      GMTrace.o(8305929879552L, 61884);
      return -1;
    }
    w.d("MicroMsg.snsMediaStorage", "insert0 " + (System.currentTimeMillis() - l));
    w.d("MicroMsg.snsMediaStorage", "insert: compressed bigMediaPath = " + str2);
    j = (int)FileOp.kX(str1 + str2);
    localObject3 = a(paramh, str1 + str2);
    k = ((h)localObject3).width;
    m = ((h)localObject3).height;
    ((a)localObject1).pMU = k;
    ((a)localObject1).pMV = m;
    ((a)localObject1).pMW = j;
    paramh = new q();
    paramh.pMK = ((String)localObject2);
    paramh.hcs = ((int)bg.Pu());
    paramh.type = i;
    localObject2 = new anx();
    ((anx)localObject2).uCQ = ((h)localObject3).ppn;
    ((anx)localObject2).uDl = ((h)localObject3).ppm;
    ((anx)localObject2).token = ((h)localObject3).ppp;
    ((anx)localObject2).uDu = ((h)localObject3).ppq;
    ((anx)localObject2).uDI = 0;
    ((anx)localObject2).uDH = new anr();
    ((anx)localObject2).gsq = 0;
    ((anx)localObject2).lPj = ((h)localObject3).desc;
    w.d("MicroMsg.snsMediaStorage", "upload.filterId " + ((h)localObject3).ppl);
    ((anx)localObject2).uDk = ((h)localObject3).ppl;
    ((anx)localObject2).uDK = 2;
    ((anx)localObject2).eDW = com.tencent.mm.a.g.bg(str1 + str2);
    try
    {
      paramh.pMO = ((anx)localObject2).toByteArray();
      paramh.bmu();
      paramh.pMJ = j;
      w.i("MicroMsg.snsMediaStorage", "insert a local snsMedia  totallen  :" + j + " filepath: " + str1 + str2);
      j = (int)this.goN.insert("SnsMedia", "local_id", paramh.bmt());
      w.d("MicroMsg.snsMediaStorage", "insert localId " + j);
      localObject2 = "Locall_path" + j;
      ((a)localObject1).pMQ = String.valueOf(j);
      localObject3 = Exif.fromFile(((a)localObject1).pMP);
      i = 0;
      if (((a)localObject1).pMP.indexOf("png") >= 0)
      {
        i = 1;
        com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
        locald.q("20 localID", ((a)localObject1).pMQ + ",");
        locald.q("21 MediaType", i + ",");
        locald.q("22 OriginWidth", ((a)localObject1).pMR + ",");
        locald.q("23 OriginHeight", ((a)localObject1).pMS + ",");
        locald.q("24 CompressedWidth", ((a)localObject1).pMU + ",");
        locald.q("25 CompressedHeight", ((a)localObject1).pMV + ",");
        locald.q("26 OriginSize", ((a)localObject1).pMT + ",");
        locald.q("27 CompressedSize", ((a)localObject1).pMW + ",");
        locald.q("28 FNumber", ((Exif)localObject3).fNumber + ",");
        locald.q("29 ExposureTime", ((Exif)localObject3).exposureTime + ",");
        locald.q("30 ISO", ((Exif)localObject3).isoSpeedRatings + ",");
        locald.q("31 Flash", ((Exif)localObject3).flash + ",");
        locald.q("32 LensModel", a.IK(((Exif)localObject3).model) + ",");
        locald.q("33 CreatTime", a.IK(((Exif)localObject3).dateTimeOriginal) + ",");
        locald.q("34 IsFromWeChat", "0,");
        locald.q("35 Scene", "1,");
        w.v("MicroMsg.snsMediaStorage", "report logbuffer MMImageExifInfo(14525): %s, orgPath:%s", new Object[] { locald.LT(), ((a)localObject1).pMP });
        com.tencent.mm.plugin.report.service.g.ork.i(14525, new Object[] { locald });
        localObject1 = i.GQ((String)localObject2);
        localObject3 = IG((String)localObject2);
        FileOp.la((String)localObject3);
        w.i("MicroMsg.snsMediaStorage", "checkcntpath " + (String)localObject3);
        FileOp.o(str1 + str2, (String)localObject3 + (String)localObject1);
        str1 = (String)localObject3 + i.GM((String)localObject2);
        str2 = (String)localObject3 + i.GN((String)localObject2);
        FileOp.deleteFile(str1);
        FileOp.deleteFile(str2);
        w.i("MicroMsg.snsMediaStorage", "insert done " + (System.currentTimeMillis() - l) + " targetPath : " + (String)localObject3 + (String)localObject1 + "  now delete...:" + str1 + " & " + str2);
        paramh.pMK = ((String)localObject2);
        a(j, paramh);
        GMTrace.o(8305929879552L, 61884);
        return j;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
        continue;
        if ((((a)localObject1).pMP.indexOf("jpg") >= 0) || (((a)localObject1).pMP.indexOf("jpeg") >= 0)) {
          i = 2;
        } else if (((a)localObject1).pMP.indexOf("mp3") >= 0) {
          i = 3;
        }
      }
    }
  }
  
  /* Error */
  private static h a(h paramh, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 577
    //   3: ldc_w 579
    //   6: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 120	android/graphics/BitmapFactory$Options
    //   12: dup
    //   13: invokespecial 121	android/graphics/BitmapFactory$Options:<init>	()V
    //   16: astore 9
    //   18: aload 9
    //   20: iconst_1
    //   21: putfield 125	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   24: aload_1
    //   25: invokestatic 118	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   28: astore 6
    //   30: aload 6
    //   32: instanceof 581
    //   35: ifeq +348 -> 383
    //   38: new 583	com/tencent/mm/sdk/platformtools/i
    //   41: dup
    //   42: aload 6
    //   44: checkcast 581	java/io/FileInputStream
    //   47: invokespecial 586	com/tencent/mm/sdk/platformtools/i:<init>	(Ljava/io/FileInputStream;)V
    //   50: astore 7
    //   52: aload 7
    //   54: astore 6
    //   56: aload 6
    //   58: astore 8
    //   60: aload 6
    //   62: ldc_w 587
    //   65: invokevirtual 591	java/io/InputStream:mark	(I)V
    //   68: aload 6
    //   70: astore 8
    //   72: aload 6
    //   74: aconst_null
    //   75: aload 9
    //   77: invokestatic 596	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   80: pop
    //   81: aload 6
    //   83: astore 8
    //   85: aload 6
    //   87: invokevirtual 599	java/io/InputStream:reset	()V
    //   90: aload 6
    //   92: astore 8
    //   94: new 206	com/tencent/mm/compatible/util/Exif
    //   97: dup
    //   98: invokespecial 207	com/tencent/mm/compatible/util/Exif:<init>	()V
    //   101: astore 7
    //   103: aload 6
    //   105: astore 8
    //   107: aload 7
    //   109: aload 6
    //   111: invokevirtual 603	com/tencent/mm/compatible/util/Exif:parseFromStream	(Ljava/io/InputStream;)I
    //   114: pop
    //   115: aload 6
    //   117: astore 8
    //   119: aload 7
    //   121: invokevirtual 213	com/tencent/mm/compatible/util/Exif:getOrientationInDegree	()I
    //   124: istore_2
    //   125: iload_2
    //   126: bipush 90
    //   128: if_icmpeq +10 -> 138
    //   131: iload_2
    //   132: sipush 270
    //   135: if_icmpne +79 -> 214
    //   138: aload 6
    //   140: astore 8
    //   142: aload 9
    //   144: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   147: istore_3
    //   148: aload 6
    //   150: astore 8
    //   152: iload_3
    //   153: istore_2
    //   154: aload 9
    //   156: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   159: istore 4
    //   161: iload_3
    //   162: istore 5
    //   164: iload 4
    //   166: istore_2
    //   167: aload 6
    //   169: ifnull +14 -> 183
    //   172: aload 6
    //   174: invokevirtual 162	java/io/InputStream:close	()V
    //   177: iload 4
    //   179: istore_2
    //   180: iload_3
    //   181: istore 5
    //   183: aload_0
    //   184: iload_2
    //   185: putfield 290	com/tencent/mm/plugin/sns/data/h:width	I
    //   188: aload_0
    //   189: iload 5
    //   191: putfield 293	com/tencent/mm/plugin/sns/data/h:height	I
    //   194: aload_0
    //   195: aload_1
    //   196: invokestatic 316	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   199: l2i
    //   200: putfield 296	com/tencent/mm/plugin/sns/data/h:fileSize	I
    //   203: ldc2_w 577
    //   206: ldc_w 579
    //   209: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   212: aload_0
    //   213: areturn
    //   214: aload 6
    //   216: astore 8
    //   218: aload 9
    //   220: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   223: istore_3
    //   224: aload 6
    //   226: astore 8
    //   228: iload_3
    //   229: istore_2
    //   230: aload 9
    //   232: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   235: istore 4
    //   237: goto -76 -> 161
    //   240: astore 7
    //   242: aconst_null
    //   243: astore 6
    //   245: iconst_0
    //   246: istore_2
    //   247: aload 6
    //   249: astore 8
    //   251: ldc -119
    //   253: aload 7
    //   255: new 80	java/lang/StringBuilder
    //   258: dup
    //   259: ldc_w 605
    //   262: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   265: aload_1
    //   266: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: iconst_0
    //   273: anewarray 221	java/lang/Object
    //   276: invokestatic 225	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   279: aload 6
    //   281: ifnull +92 -> 373
    //   284: aload 6
    //   286: invokevirtual 162	java/io/InputStream:close	()V
    //   289: iconst_0
    //   290: istore_3
    //   291: iload_2
    //   292: istore 5
    //   294: iload_3
    //   295: istore_2
    //   296: goto -113 -> 183
    //   299: astore 6
    //   301: iconst_0
    //   302: istore_3
    //   303: iload_2
    //   304: istore 5
    //   306: iload_3
    //   307: istore_2
    //   308: goto -125 -> 183
    //   311: astore_0
    //   312: aconst_null
    //   313: astore 8
    //   315: aload 8
    //   317: ifnull +8 -> 325
    //   320: aload 8
    //   322: invokevirtual 162	java/io/InputStream:close	()V
    //   325: aload_0
    //   326: athrow
    //   327: astore 6
    //   329: iload_3
    //   330: istore 5
    //   332: iload 4
    //   334: istore_2
    //   335: goto -152 -> 183
    //   338: astore_1
    //   339: goto -14 -> 325
    //   342: astore_0
    //   343: aload 6
    //   345: astore 8
    //   347: goto -32 -> 315
    //   350: astore_0
    //   351: goto -36 -> 315
    //   354: astore 7
    //   356: iconst_0
    //   357: istore_2
    //   358: goto -111 -> 247
    //   361: astore 7
    //   363: iconst_0
    //   364: istore_2
    //   365: goto -118 -> 247
    //   368: astore 7
    //   370: goto -123 -> 247
    //   373: iconst_0
    //   374: istore_3
    //   375: iload_2
    //   376: istore 5
    //   378: iload_3
    //   379: istore_2
    //   380: goto -197 -> 183
    //   383: goto -327 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	386	0	paramh	h
    //   0	386	1	paramString	String
    //   124	256	2	i	int
    //   147	232	3	j	int
    //   159	174	4	k	int
    //   162	215	5	m	int
    //   28	257	6	localObject1	Object
    //   299	1	6	localIOException1	IOException
    //   327	17	6	localIOException2	IOException
    //   50	70	7	localObject2	Object
    //   240	14	7	localException1	Exception
    //   354	1	7	localException2	Exception
    //   361	1	7	localException3	Exception
    //   368	1	7	localException4	Exception
    //   58	288	8	localObject3	Object
    //   16	215	9	localOptions	BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   9	30	240	java/lang/Exception
    //   284	289	299	java/io/IOException
    //   9	30	311	finally
    //   172	177	327	java/io/IOException
    //   320	325	338	java/io/IOException
    //   30	52	342	finally
    //   60	68	350	finally
    //   72	81	350	finally
    //   85	90	350	finally
    //   94	103	350	finally
    //   107	115	350	finally
    //   119	125	350	finally
    //   142	148	350	finally
    //   154	161	350	finally
    //   218	224	350	finally
    //   230	237	350	finally
    //   251	279	350	finally
    //   30	52	354	java/lang/Exception
    //   60	68	361	java/lang/Exception
    //   72	81	361	java/lang/Exception
    //   85	90	361	java/lang/Exception
    //   94	103	361	java/lang/Exception
    //   107	115	361	java/lang/Exception
    //   119	125	361	java/lang/Exception
    //   142	148	361	java/lang/Exception
    //   218	224	361	java/lang/Exception
    //   154	161	368	java/lang/Exception
    //   230	237	368	java/lang/Exception
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Bitmap.CompressFormat paramCompressFormat, int paramInt5, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(8307272056832L, 61894);
    Object localObject5 = null;
    Object localObject3 = localObject5;
    Object localObject4;
    double d2;
    double d3;
    try
    {
      w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, srcWidth: %s, srcHeight: %s, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt3) });
      localObject3 = localObject5;
      Object localObject2 = new BitmapFactory.Options();
      localObject3 = localObject5;
      localObject4 = new MMBitmapFactory.DecodeResultLogger();
      localObject3 = localObject5;
      d2 = paramInt2 * 1.0D / paramInt3;
      localObject3 = localObject5;
      d3 = paramInt1 * 1.0D / paramInt4;
      if ((paramInt1 == paramInt4) && (paramInt2 == paramInt3))
      {
        localObject3 = localObject5;
        localObject2 = a.b(paramString1, (BitmapFactory.Options)localObject2, (MMBitmapFactory.DecodeResultLogger)localObject4);
      }
      for (;;)
      {
        localObject3 = localObject5;
        w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, result bm: %s", new Object[] { localObject2 });
        if (localObject2 == null)
        {
          localObject3 = localObject5;
          if (((MMBitmapFactory.DecodeResultLogger)localObject4).getDecodeResult() >= 2000)
          {
            localObject3 = localObject5;
            paramString1 = MMBitmapFactory.KVStatHelper.getKVStatString(paramString1, 10, (MMBitmapFactory.DecodeResultLogger)localObject4);
            localObject3 = localObject5;
            com.tencent.mm.plugin.report.service.g.ork.A(12712, paramString1);
          }
          GMTrace.o(8307272056832L, 61894);
          return false;
          localObject3 = localObject5;
          ((BitmapFactory.Options)localObject2).inSampleSize = 1;
          if (paramInt2 <= paramInt3)
          {
            if (paramInt1 > paramInt4)
            {
              break label710;
              label238:
              localObject3 = localObject5;
              Object localObject1;
              ((BitmapFactory.Options)localObject2).inSampleSize = ((int)localObject1);
              localObject3 = localObject5;
              if (((BitmapFactory.Options)localObject2).inSampleSize <= 1) {
                localObject3 = localObject5;
              }
            }
            for (((BitmapFactory.Options)localObject2).inSampleSize = 1;; ((BitmapFactory.Options)localObject2).inSampleSize += 1)
            {
              localObject3 = localObject5;
              if (paramInt2 * paramInt1 / ((BitmapFactory.Options)localObject2).inSampleSize / ((BitmapFactory.Options)localObject2).inSampleSize <= 2764800) {
                break;
              }
              localObject3 = localObject5;
            }
          }
        }
        else
        {
          try
          {
            ((OutputStream)localObject3).close();
            GMTrace.o(8307272056832L, 61894);
            return false;
            d1 = d2;
            break label238;
            localObject3 = localObject5;
            w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, sampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject2).inSampleSize) });
            localObject3 = localObject5;
            localObject2 = a.b(paramString1, (BitmapFactory.Options)localObject2, (MMBitmapFactory.DecodeResultLogger)localObject4);
            continue;
            localObject3 = localObject5;
            w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()) });
            localObject4 = localObject2;
            if (paramBoolean)
            {
              if (d2 >= d3) {
                break label674;
              }
              localObject3 = localObject5;
              paramInt1 = (int)Math.ceil(paramInt4 * 1.0D * paramInt2 / paramInt1);
              paramInt2 = paramInt4;
            }
            for (;;)
            {
              localObject3 = localObject5;
              i = BackwardSupportUtil.ExifHelper.Rz(paramString1);
              if (i == 90) {
                break;
              }
              paramInt3 = paramInt2;
              paramInt4 = paramInt1;
              if (i == 270) {
                break;
              }
              localObject3 = localObject5;
              localObject4 = Bitmap.createScaledBitmap((Bitmap)localObject2, paramInt3, paramInt4, true);
              paramString1 = (String)localObject2;
              if (localObject4 != null)
              {
                if (localObject2 == localObject4) {
                  break label733;
                }
                localObject3 = localObject5;
                l.yn().h((Bitmap)localObject2);
                break label733;
              }
              localObject3 = localObject5;
              w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScalebyUpload, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(paramString1.getWidth()), Integer.valueOf(paramString1.getHeight()) });
              localObject4 = paramString1;
              localObject3 = localObject5;
              paramString1 = FileOp.hA(paramString2 + paramString3);
              localObject3 = paramString1;
              com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject4, paramInt5, paramCompressFormat, paramString1, false);
              localObject3 = paramString1;
              l.yn().h((Bitmap)localObject4);
              localObject3 = paramString1;
              paramString1.close();
              GMTrace.o(8307272056832L, 61894);
              return true;
              d1 = paramInt3 * 1.0D * paramInt1 / paramInt2;
              localObject3 = localObject5;
              d1 = Math.ceil(d1);
              paramInt2 = (int)d1;
              paramInt1 = paramInt3;
            }
          }
          catch (IOException paramString1)
          {
            for (;;) {}
          }
        }
      }
    }
    catch (IOException paramString1)
    {
      w.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "create thumbnail from orig failed: %s", new Object[] { paramString3 });
      if (localObject3 == null) {}
    }
    for (;;)
    {
      double d1;
      int i;
      label674:
      label710:
      if (d2 < d3)
      {
        d1 = d3;
        break;
        paramInt3 = paramInt1;
        paramInt4 = paramInt2;
        continue;
        label733:
        paramString1 = (String)localObject4;
      }
    }
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, int paramInt3, Bitmap.CompressFormat paramCompressFormat, int paramInt4, String paramString2, String paramString3)
  {
    GMTrace.i(20064342376448L, 149491);
    localObject3 = null;
    localObject1 = localObject3;
    try
    {
      w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, srcWidth: %d, srcHeight: %d, fixShort: %d, quality:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      localObject1 = localObject3;
      Object localObject2 = new BitmapFactory.Options();
      localObject1 = localObject3;
      Object localObject4 = new MMBitmapFactory.DecodeResultLogger();
      int i;
      if (paramInt2 > paramInt1)
      {
        i = paramInt1;
        if (i != paramInt3) {
          break label196;
        }
        localObject1 = localObject3;
        localObject2 = a.b(paramString1, (BitmapFactory.Options)localObject2, (MMBitmapFactory.DecodeResultLogger)localObject4);
      }
      for (;;)
      {
        localObject1 = localObject3;
        w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, result bm: %s", new Object[] { localObject2 });
        if (localObject2 == null)
        {
          localObject1 = localObject3;
          if (((MMBitmapFactory.DecodeResultLogger)localObject4).getDecodeResult() >= 2000)
          {
            localObject1 = localObject3;
            paramString1 = MMBitmapFactory.KVStatHelper.getKVStatString(paramString1, 10, (MMBitmapFactory.DecodeResultLogger)localObject4);
            localObject1 = localObject3;
            com.tencent.mm.plugin.report.service.g.ork.A(12712, paramString1);
          }
          GMTrace.o(20064342376448L, 149491);
          return false;
          i = paramInt2;
          break;
          label196:
          localObject1 = localObject3;
          ((BitmapFactory.Options)localObject2).inSampleSize = 1;
          if (i > paramInt3)
          {
            localObject1 = localObject3;
            ((BitmapFactory.Options)localObject2).inSampleSize = (i / paramInt3);
            localObject1 = localObject3;
            if (((BitmapFactory.Options)localObject2).inSampleSize <= 1) {
              localObject1 = localObject3;
            }
          }
          for (((BitmapFactory.Options)localObject2).inSampleSize = 1;; ((BitmapFactory.Options)localObject2).inSampleSize += 1)
          {
            localObject1 = localObject3;
            if (paramInt2 * paramInt1 / ((BitmapFactory.Options)localObject2).inSampleSize / ((BitmapFactory.Options)localObject2).inSampleSize <= 5529600) {
              break;
            }
            localObject1 = localObject3;
          }
        }
        try
        {
          ((OutputStream)localObject1).close();
          GMTrace.o(20064342376448L, 149491);
          return false;
          localObject1 = localObject3;
          w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, sampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject2).inSampleSize) });
          localObject1 = localObject3;
          localObject2 = a.b(paramString1, (BitmapFactory.Options)localObject2, (MMBitmapFactory.DecodeResultLogger)localObject4);
          continue;
          localObject1 = localObject3;
          j = paramInt1 * paramInt3 / i;
          localObject1 = localObject3;
          paramInt3 = paramInt2 * paramInt3 / i;
          localObject1 = localObject3;
          int n = BackwardSupportUtil.ExifHelper.Rz(paramString1);
          if (n != 90)
          {
            k = j;
            m = paramInt3;
            if (n != 270)
            {
              localObject1 = localObject3;
              w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, bm.width: %s, bm.height: %s, new:[%d,%d], src:[%d, %d], shortEdge:%d,degree:%d", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(n) });
              localObject1 = localObject3;
              localObject4 = Bitmap.createScaledBitmap((Bitmap)localObject2, k, m, true);
              if (localObject4 != null)
              {
                paramString1 = (String)localObject4;
                if (localObject2 != localObject4)
                {
                  localObject1 = localObject3;
                  l.yn().h((Bitmap)localObject2);
                  paramString1 = (String)localObject4;
                }
                localObject1 = localObject3;
                w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScaleFixShort, bm.width: %s, bm.height: %s, quality:%d", new Object[] { Integer.valueOf(paramString1.getWidth()), Integer.valueOf(paramString1.getHeight()), Integer.valueOf(paramInt4) });
                localObject1 = localObject3;
                localObject2 = FileOp.hA(paramString2 + paramString3);
                localObject1 = localObject2;
                com.tencent.mm.sdk.platformtools.d.a(paramString1, paramInt4, paramCompressFormat, (OutputStream)localObject2, false);
                localObject1 = localObject2;
                l.yn().h(paramString1);
                localObject1 = localObject2;
                ((OutputStream)localObject2).close();
                localObject1 = null;
                w.i("MicroMsg.snsMediaStorage", "createThumbNailUnScaleFixShort saving to %s, size:%d", new Object[] { paramString2 + paramString3, Long.valueOf(FileOp.kX(paramString2 + paramString3)) });
                GMTrace.o(20064342376448L, 149491);
                return true;
              }
            }
          }
        }
        catch (IOException paramString1)
        {
          for (;;)
          {
            int j;
            continue;
            paramString1 = (String)localObject2;
            continue;
            int k = paramInt3;
            int m = j;
          }
        }
      }
    }
    catch (IOException paramString1)
    {
      w.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "create thumbnail from orig failed: %s", new Object[] { paramString3 });
      if (localObject1 == null) {}
    }
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(8306869403648L, 61891);
    BitmapFactory.Options localOptions = com.tencent.mm.sdk.platformtools.d.RB(paramString1);
    if ((localOptions == null) || (localOptions.outWidth <= 0) || (localOptions.outHeight <= 0))
    {
      GMTrace.o(8306869403648L, 61891);
      return false;
    }
    paramBoolean = a(paramString1, localOptions.outWidth, localOptions.outHeight, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, paramString3, paramBoolean);
    GMTrace.o(8306869403648L, 61891);
    return paramBoolean;
  }
  
  public static boolean a(String paramString1, String paramString2, String paramString3, float paramFloat)
  {
    GMTrace.i(8307137839104L, 61893);
    i = 1;
    for (;;)
    {
      try
      {
        localObject3 = FileOp.openRead(paramString1 + paramString2);
      }
      catch (Exception localException1)
      {
        Object localObject3;
        BitmapFactory.Options localOptions;
        int j;
        label134:
        double d7;
        double d8;
        Object localObject2;
        Object localObject1;
        double d6;
        label311:
        Object localObject4 = null;
        i = 1;
        d1 = 0.0D;
        d2 = 0.0D;
        if (localObject4 != null) {
          try
          {
            ((InputStream)localObject4).close();
            d4 = d2;
            d2 = 240.0D;
            d3 = 240.0D;
          }
          catch (IOException localIOException) {}
        }
        d4 = d2;
        d2 = 240.0D;
        d3 = 240.0D;
        continue;
        paramString2 = Bitmap.CompressFormat.JPEG;
        continue;
      }
      try
      {
        localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        MMBitmapFactory.decodeStream((InputStream)localObject3, null, localOptions, null, 0, new int[0]);
        ((InputStream)localObject3).close();
      }
      catch (Exception localException4)
      {
        i = 1;
        d1 = 0.0D;
        d2 = 0.0D;
        continue;
      }
      try
      {
        d4 = localOptions.outWidth;
        j = localOptions.outHeight;
        d1 = j;
        if ((d4 > 120.0D) || (d1 > 120.0D)) {
          i = 0;
        }
      }
      catch (Exception localException2)
      {
        Object localObject5 = null;
        i = 1;
        d1 = 0.0D;
        d2 = 0.0D;
      }
    }
    try
    {
      localObject3 = localOptions.outMimeType;
      if (d4 < 0.0D) {
        break label540;
      }
      if (d1 >= 0.0D) {
        break label529;
      }
    }
    catch (Exception localException3)
    {
      Object localObject6 = null;
      d2 = d4;
      break label426;
      d3 = d5;
      break label311;
      d2 = d1;
      d5 = d4;
      break label134;
      d2 = 240.0D;
      d5 = 240.0D;
      break label134;
    }
    d7 = paramFloat;
    d8 = paramFloat / 200.0F * 44.0F;
    d3 = paramFloat / 200.0F * 160.0F;
    if ((localObject2 > 0.0D) && (localObject1 > 0.0D))
    {
      d3 = Math.min(d7 / localObject2, d7 / localObject1);
      localObject2 *= d3;
      d6 = d3 * localObject1;
      d2 = d6;
      d3 = d5;
      if (d5 < d8)
      {
        d2 = 1.0D * d8 / d5;
        d3 = d5 * d2;
        d2 = d6 * d2;
      }
      d5 = d2;
      d6 = d3;
      if (d2 < d8)
      {
        d5 = 1.0D * d8 / d2;
        d6 = d3 * d5;
        d5 = d2 * d5;
      }
      d2 = d6;
      if (d6 > d7) {
        d2 = d7;
      }
      if (d5 > d7)
      {
        d3 = d7;
        d5 = d3;
        d3 = d2;
      }
    }
    else
    {
      for (d2 = d5;; d2 = d3)
      {
        localObject3 = paramString1 + paramString2;
        j = (int)d4;
        int k = (int)d1;
        int m = (int)d2;
        int n = (int)d3;
        if (i == 0) {
          break;
        }
        paramString2 = Bitmap.CompressFormat.PNG;
        boolean bool = a((String)localObject3, j, k, m, n, paramString2, 70, paramString1, paramString3, false);
        GMTrace.o(8307137839104L, 61893);
        return bool;
      }
    }
  }
  
  public static boolean b(String paramString1, String paramString2, String paramString3, float paramFloat)
  {
    GMTrace.i(8307406274560L, 61895);
    Object localObject1;
    for (;;)
    {
      MMBitmapFactory.DecodeResultLogger localDecodeResultLogger;
      int i1;
      int n;
      int m;
      int k;
      try
      {
        FileOp.deleteFile(paramString1 + paramString3);
        localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
        localObject1 = com.tencent.mm.sdk.platformtools.d.RB(paramString1 + paramString2);
        if (localObject1 == null)
        {
          w.e("MicroMsg.snsMediaStorage", "createUserAlbum, getImageOptions error");
          GMTrace.o(8307406274560L, 61895);
          return false;
        }
        if ((((BitmapFactory.Options)localObject1).outMimeType != null) && ((((BitmapFactory.Options)localObject1).outMimeType.toLowerCase().endsWith("png")) || (((BitmapFactory.Options)localObject1).outMimeType.toLowerCase().endsWith("vcodec"))))
        {
          localObject1 = com.tencent.mm.sdk.platformtools.d.a(paramString1 + paramString2, (int)paramFloat, (int)paramFloat, true, localDecodeResultLogger, 0);
          if (localObject1 != null) {
            break;
          }
          w.i("MicroMsg.snsMediaStorage", "bitmap error " + paramString1 + paramString2);
          if (localDecodeResultLogger.getDecodeResult() >= 2000)
          {
            paramString3 = MMBitmapFactory.KVStatHelper.getKVStatString(paramString1 + paramString2, 10, localDecodeResultLogger);
            com.tencent.mm.plugin.report.service.g.ork.A(12712, paramString3);
          }
          FileOp.deleteFile(paramString1 + paramString2);
          GMTrace.o(8307406274560L, 61895);
          return false;
        }
        i1 = ((BitmapFactory.Options)localObject1).outWidth;
        n = ((BitmapFactory.Options)localObject1).outHeight;
        m = (int)paramFloat;
        k = (int)paramFloat;
        ((BitmapFactory.Options)localObject1).inJustDecodeBounds = false;
        w.i("MicroMsg.snsMediaStorage", "createUserAlbum, srcWidth: %s, srcHeight: %s, dstWidth: %s, dstHeight: %s", new Object[] { Integer.valueOf(i1), Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(k) });
        if ((i1 == m) && (n == k))
        {
          localObject1 = a.b(paramString1 + paramString2, (BitmapFactory.Options)localObject1, localDecodeResultLogger);
          continue;
        }
        if (n * 1.0D / k <= i1 * 1.0D / m) {
          break label638;
        }
        j = (int)Math.ceil(m * 1.0D * n / i1);
        i = m;
        w.d("MicroMsg.snsMediaStorage", "createUserAlbum, newWidth: %s, newHeight: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        ((BitmapFactory.Options)localObject1).inSampleSize = 1;
        if ((n <= j) && (i1 <= i)) {
          break label668;
        }
        ((BitmapFactory.Options)localObject1).inSampleSize = 1;
        if ((n > j) || (i1 > i))
        {
          d1 = n * 1.0D / j;
          double d2 = i1 * 1.0D / i;
          if (d1 >= d2) {
            break label1120;
          }
          d1 = d2;
          ((BitmapFactory.Options)localObject1).inSampleSize = ((int)d1);
          if (((BitmapFactory.Options)localObject1).inSampleSize <= 1) {
            ((BitmapFactory.Options)localObject1).inSampleSize = 1;
          }
        }
        if (n * i1 / ((BitmapFactory.Options)localObject1).inSampleSize / ((BitmapFactory.Options)localObject1).inSampleSize <= 2764800) {
          break label668;
        }
        ((BitmapFactory.Options)localObject1).inSampleSize += 1;
        continue;
        GMTrace.o(8307406274560L, 61895);
      }
      catch (Exception paramString1)
      {
        w.e("MicroMsg.snsMediaStorage", "createUserAlbum error: %s", new Object[] { paramString1.getMessage() });
        w.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "", new Object[0]);
      }
      return true;
      label638:
      double d1 = k * 1.0D * i1 / n;
      i = (int)Math.ceil(d1);
      int j = k;
      continue;
      label668:
      w.i("MicroMsg.snsMediaStorage", "createUserAlbum, inSampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject1).inSampleSize) });
      if (n / i1 == k / m)
      {
        localObject1 = a.b(paramString1 + paramString2, (BitmapFactory.Options)localObject1, localDecodeResultLogger);
        w.i("MicroMsg.snsMediaStorage", "createUserAlbum, directly use inSampleSize");
      }
      else
      {
        paramFloat = Math.max(i / i1, j / n);
        i = (int)(m / paramFloat);
        j = (int)(k / paramFloat);
        i = Math.min(i1, i);
        j = Math.min(n, j);
        k = Math.max(0, i1 - i >> 1);
        m = Math.max(0, n - j >> 1);
        Object localObject2 = new Rect();
        ((Rect)localObject2).left = k;
        ((Rect)localObject2).right = (k + i);
        ((Rect)localObject2).top = m;
        ((Rect)localObject2).bottom = (m + j);
        String str = paramString1 + paramString2;
        long l = System.currentTimeMillis();
        localObject2 = l.yn().a(str, (Rect)localObject2, (BitmapFactory.Options)localObject1, localDecodeResultLogger);
        localObject1 = localObject2;
        if (localObject2 != null) {
          localObject1 = i.r(str, (Bitmap)localObject2);
        }
        w.d("MicroMsg.SnsBitmapUtil", "regionDecodeWithRotateByExif used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        w.i("MicroMsg.snsMediaStorage", "createUserAlbum, dstWidth: %s, dstHeight: %s, startX: %s, startY: %s, scaleFactor: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Float.valueOf(paramFloat) });
      }
    }
    w.i("MicroMsg.snsMediaStorage", "createUserAlbum, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject1).getWidth()), Integer.valueOf(((Bitmap)localObject1).getHeight()) });
    int i = 1;
    if ((((Bitmap)localObject1).getHeight() <= 120) && (((Bitmap)localObject1).getWidth() <= 120)) {}
    for (;;)
    {
      if (i != 0) {}
      for (paramString2 = Bitmap.CompressFormat.PNG;; paramString2 = Bitmap.CompressFormat.JPEG)
      {
        com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject1, 100, paramString2, paramString1 + paramString3, false);
        l.yn().h((Bitmap)localObject1);
        break;
      }
      label1120:
      break;
      i = 0;
    }
  }
  
  public static boolean bmw()
  {
    GMTrace.i(8306198315008L, 61886);
    if ("hevc".equals(com.tencent.mm.platformtools.r.hkY))
    {
      GMTrace.o(8306198315008L, 61886);
      return true;
    }
    boolean bool = ae.bjn();
    GMTrace.o(8306198315008L, 61886);
    return bool;
  }
  
  public static boolean bmx()
  {
    GMTrace.i(8306332532736L, 61887);
    if ("wxpc".equals(com.tencent.mm.platformtools.r.hkY))
    {
      GMTrace.o(8306332532736L, 61887);
      return true;
    }
    boolean bool = ae.bjo();
    GMTrace.o(8306332532736L, 61887);
    return bool;
  }
  
  public static boolean bmy()
  {
    GMTrace.i(8306600968192L, 61889);
    if ((pmG >= 1080) && (pnu >= 1080))
    {
      GMTrace.o(8306600968192L, 61889);
      return true;
    }
    GMTrace.o(8306600968192L, 61889);
    return false;
  }
  
  /* Error */
  public static boolean d(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 835
    //   3: ldc_w 837
    //   6: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 173	com/tencent/mm/sdk/platformtools/d:RB	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   13: astore 20
    //   15: aload 20
    //   17: ifnull +951 -> 968
    //   20: aload 20
    //   22: getfield 135	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   25: astore 21
    //   27: ldc -119
    //   29: new 80	java/lang/StringBuilder
    //   32: dup
    //   33: ldc_w 839
    //   36: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   39: aload 21
    //   41: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: invokestatic 148	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: aload 21
    //   52: ifnull +916 -> 968
    //   55: aload 21
    //   57: invokevirtual 151	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   60: astore 21
    //   62: aload 21
    //   64: ldc_w 572
    //   67: invokevirtual 157	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   70: iflt +864 -> 934
    //   73: iconst_1
    //   74: istore 17
    //   76: aload 20
    //   78: ifnull +913 -> 991
    //   81: aload 20
    //   83: getfield 135	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   86: astore 21
    //   88: aload 21
    //   90: ifnull +901 -> 991
    //   93: aload 21
    //   95: invokevirtual 151	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   98: astore 21
    //   100: aload 21
    //   102: ldc_w 572
    //   105: invokevirtual 157	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   108: iflt +866 -> 974
    //   111: iconst_1
    //   112: istore 10
    //   114: bipush 100
    //   116: istore 7
    //   118: iload_3
    //   119: ifeq +3019 -> 3138
    //   122: iload 7
    //   124: istore 8
    //   126: invokestatic 845	com/tencent/mm/modelcdntran/g:Gk	()Lcom/tencent/mm/modelcdntran/c;
    //   129: pop
    //   130: iload 7
    //   132: istore 8
    //   134: bipush 64
    //   136: invokestatic 851	com/tencent/mm/modelcdntran/c:fT	(I)Z
    //   139: ifne +23 -> 162
    //   142: iload 7
    //   144: istore 8
    //   146: invokestatic 853	com/tencent/mm/plugin/sns/storage/r:bmw	()Z
    //   149: ifne +13 -> 162
    //   152: iload 7
    //   154: istore 8
    //   156: invokestatic 855	com/tencent/mm/plugin/sns/storage/r:bmx	()Z
    //   159: ifeq +933 -> 1092
    //   162: iload 7
    //   164: istore 8
    //   166: invokestatic 861	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   169: invokestatic 867	com/tencent/mm/sdk/platformtools/am:isWifi	(Landroid/content/Context;)Z
    //   172: ifeq +825 -> 997
    //   175: iload 7
    //   177: istore 8
    //   179: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   182: ldc_w 875
    //   185: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   188: bipush 70
    //   190: invokestatic 884	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   193: istore 7
    //   195: iload 7
    //   197: istore 8
    //   199: ldc -119
    //   201: ldc_w 886
    //   204: bipush 7
    //   206: anewarray 221	java/lang/Object
    //   209: dup
    //   210: iconst_0
    //   211: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   214: ldc_w 875
    //   217: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   220: aastore
    //   221: dup
    //   222: iconst_1
    //   223: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   226: ldc_w 888
    //   229: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   232: aastore
    //   233: dup
    //   234: iconst_2
    //   235: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   238: ldc_w 890
    //   241: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   244: aastore
    //   245: dup
    //   246: iconst_3
    //   247: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   250: ldc_w 892
    //   253: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   256: aastore
    //   257: dup
    //   258: iconst_4
    //   259: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   262: ldc_w 894
    //   265: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   268: aastore
    //   269: dup
    //   270: iconst_5
    //   271: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   274: ldc_w 896
    //   277: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   280: aastore
    //   281: dup
    //   282: bipush 6
    //   284: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   287: ldc_w 898
    //   290: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   293: aastore
    //   294: invokestatic 744	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   297: ldc -119
    //   299: ldc_w 900
    //   302: iconst_2
    //   303: anewarray 221	java/lang/Object
    //   306: dup
    //   307: iconst_0
    //   308: iload 7
    //   310: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   313: aastore
    //   314: dup
    //   315: iconst_1
    //   316: iload_3
    //   317: invokestatic 905	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   320: aastore
    //   321: invokestatic 245	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   324: iload 7
    //   326: bipush 10
    //   328: if_icmple +10 -> 338
    //   331: iload 7
    //   333: bipush 100
    //   335: if_icmple +2800 -> 3135
    //   338: bipush 60
    //   340: istore 7
    //   342: iload 10
    //   344: ifeq +2781 -> 3125
    //   347: aload_1
    //   348: invokestatic 910	com/tencent/mm/sdk/platformtools/MMNativeJpeg:queryQuality	(Ljava/lang/String;)I
    //   351: istore 11
    //   353: iload 11
    //   355: iload 7
    //   357: if_icmpge +2761 -> 3118
    //   360: iload 11
    //   362: bipush 25
    //   364: if_icmple +2754 -> 3118
    //   367: iload 11
    //   369: istore 9
    //   371: aload_1
    //   372: invokestatic 316	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   375: l2i
    //   376: istore 14
    //   378: iconst_0
    //   379: istore 8
    //   381: sipush 1080
    //   384: istore 13
    //   386: iload 8
    //   388: istore 7
    //   390: invokestatic 861	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   393: invokestatic 867	com/tencent/mm/sdk/platformtools/am:isWifi	(Landroid/content/Context;)Z
    //   396: ifeq +794 -> 1190
    //   399: iload 8
    //   401: istore 7
    //   403: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   406: ldc_w 912
    //   409: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   412: astore 21
    //   414: iload 8
    //   416: istore 7
    //   418: aload 21
    //   420: ldc_w 914
    //   423: invokevirtual 918	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   426: iconst_0
    //   427: aaload
    //   428: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   431: invokevirtual 924	java/lang/Integer:intValue	()I
    //   434: istore 8
    //   436: iload 8
    //   438: istore 7
    //   440: aload 21
    //   442: ldc_w 914
    //   445: invokevirtual 918	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   448: iconst_1
    //   449: aaload
    //   450: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   453: invokevirtual 924	java/lang/Integer:intValue	()I
    //   456: istore 12
    //   458: iload 8
    //   460: istore 7
    //   462: iload 12
    //   464: istore 8
    //   466: ldc -119
    //   468: ldc_w 926
    //   471: bipush 6
    //   473: anewarray 221	java/lang/Object
    //   476: dup
    //   477: iconst_0
    //   478: iload 7
    //   480: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   483: aastore
    //   484: dup
    //   485: iconst_1
    //   486: iload 8
    //   488: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   491: aastore
    //   492: dup
    //   493: iconst_2
    //   494: getstatic 39	com/tencent/mm/plugin/sns/storage/r:pmG	I
    //   497: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   500: aastore
    //   501: dup
    //   502: iconst_3
    //   503: getstatic 37	com/tencent/mm/plugin/sns/storage/r:pnu	I
    //   506: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   509: aastore
    //   510: dup
    //   511: iconst_4
    //   512: iload 9
    //   514: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   517: aastore
    //   518: dup
    //   519: iconst_5
    //   520: iload_3
    //   521: invokestatic 905	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   524: aastore
    //   525: invokestatic 245	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   528: iload 7
    //   530: ifgt +884 -> 1414
    //   533: iload 8
    //   535: ifgt +879 -> 1414
    //   538: iconst_0
    //   539: istore 7
    //   541: sipush 1080
    //   544: istore 8
    //   546: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   549: ldc_w 928
    //   552: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   555: bipush 100
    //   557: invokestatic 884	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   560: istore 13
    //   562: iload 13
    //   564: istore 12
    //   566: iload 13
    //   568: ifgt +7 -> 575
    //   571: bipush 100
    //   573: istore 12
    //   575: iload 12
    //   577: sipush 1024
    //   580: imul
    //   581: istore 15
    //   583: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   586: ldc_w 930
    //   589: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   592: sipush 200
    //   595: invokestatic 884	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   598: istore 13
    //   600: iload 13
    //   602: istore 12
    //   604: iload 13
    //   606: ifgt +8 -> 614
    //   609: sipush 200
    //   612: istore 12
    //   614: iload 12
    //   616: sipush 1024
    //   619: imul
    //   620: istore 16
    //   622: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   625: ldc_w 932
    //   628: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   631: bipush 10
    //   633: invokestatic 884	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   636: istore 12
    //   638: iload 12
    //   640: ifle +10 -> 650
    //   643: iload 12
    //   645: bipush 100
    //   647: if_icmplt +2465 -> 3112
    //   650: bipush 10
    //   652: istore 12
    //   654: iconst_0
    //   655: istore 13
    //   657: iload 10
    //   659: ifeq +826 -> 1485
    //   662: aload_1
    //   663: invokestatic 453	com/tencent/mm/compatible/util/Exif:fromFile	(Ljava/lang/String;)Lcom/tencent/mm/compatible/util/Exif;
    //   666: astore 21
    //   668: iload 13
    //   670: istore 10
    //   672: aload 21
    //   674: ifnull +14 -> 688
    //   677: aload 21
    //   679: invokevirtual 213	com/tencent/mm/compatible/util/Exif:getOrientationInDegree	()I
    //   682: sipush 360
    //   685: irem
    //   686: istore 10
    //   688: ldc -119
    //   690: new 80	java/lang/StringBuilder
    //   693: dup
    //   694: ldc_w 934
    //   697: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   700: aload 20
    //   702: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   705: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   708: ldc_w 936
    //   711: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   714: aload 20
    //   716: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   719: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   722: ldc_w 936
    //   725: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   728: iload 17
    //   730: invokevirtual 939	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   733: ldc_w 941
    //   736: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   739: iload 11
    //   741: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   744: ldc_w 943
    //   747: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   750: iload 10
    //   752: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   755: ldc_w 945
    //   758: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   761: iload 14
    //   763: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   766: ldc_w 947
    //   769: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   772: iload 7
    //   774: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   777: ldc_w 936
    //   780: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   783: iload 8
    //   785: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   788: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   791: invokestatic 276	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   794: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   797: ldc_w 949
    //   800: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   803: bipush 10
    //   805: invokestatic 884	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   808: pop
    //   809: aload 20
    //   811: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   814: aload 20
    //   816: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   819: iconst_2
    //   820: imul
    //   821: if_icmpge +18 -> 839
    //   824: aload 20
    //   826: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   829: aload 20
    //   831: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   834: iconst_2
    //   835: imul
    //   836: if_icmplt +1407 -> 2243
    //   839: aload 20
    //   841: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   844: aload 20
    //   846: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   849: imul
    //   850: ldc_w 950
    //   853: if_icmpgt +1144 -> 1997
    //   856: iload 14
    //   858: iload 16
    //   860: if_icmpge +642 -> 1502
    //   863: iload 17
    //   865: ifeq +637 -> 1502
    //   868: iload 10
    //   870: ifne +632 -> 1502
    //   873: ldc -119
    //   875: new 80	java/lang/StringBuilder
    //   878: dup
    //   879: ldc_w 952
    //   882: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   885: iload 16
    //   887: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   890: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   893: invokestatic 276	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   896: aload_1
    //   897: new 80	java/lang/StringBuilder
    //   900: dup
    //   901: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   904: aload_0
    //   905: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   908: aload_2
    //   909: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   912: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   915: invokestatic 545	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   918: lconst_0
    //   919: lcmp
    //   920: iflt +571 -> 1491
    //   923: ldc2_w 835
    //   926: ldc_w 837
    //   929: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   932: iconst_1
    //   933: ireturn
    //   934: aload 21
    //   936: ldc_w 574
    //   939: invokevirtual 157	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   942: iflt +9 -> 951
    //   945: iconst_1
    //   946: istore 17
    //   948: goto -872 -> 76
    //   951: aload 21
    //   953: ldc_w 455
    //   956: invokevirtual 157	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   959: iflt +9 -> 968
    //   962: iconst_1
    //   963: istore 17
    //   965: goto -889 -> 76
    //   968: iconst_0
    //   969: istore 17
    //   971: goto -895 -> 76
    //   974: aload 21
    //   976: ldc_w 574
    //   979: invokevirtual 157	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   982: iflt +9 -> 991
    //   985: iconst_1
    //   986: istore 10
    //   988: goto -874 -> 114
    //   991: iconst_0
    //   992: istore 10
    //   994: goto -880 -> 114
    //   997: iload 7
    //   999: istore 8
    //   1001: invokestatic 861	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   1004: invokestatic 955	com/tencent/mm/sdk/platformtools/am:is2G	(Landroid/content/Context;)Z
    //   1007: ifeq +26 -> 1033
    //   1010: iload 7
    //   1012: istore 8
    //   1014: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   1017: ldc_w 888
    //   1020: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1023: bipush 70
    //   1025: invokestatic 884	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   1028: istore 7
    //   1030: goto -835 -> 195
    //   1033: iload 7
    //   1035: istore 8
    //   1037: invokestatic 861	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   1040: invokestatic 958	com/tencent/mm/sdk/platformtools/am:is3G	(Landroid/content/Context;)Z
    //   1043: ifeq +26 -> 1069
    //   1046: iload 7
    //   1048: istore 8
    //   1050: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   1053: ldc_w 890
    //   1056: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1059: bipush 60
    //   1061: invokestatic 884	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   1064: istore 7
    //   1066: goto -871 -> 195
    //   1069: iload 7
    //   1071: istore 8
    //   1073: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   1076: ldc_w 892
    //   1079: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1082: bipush 60
    //   1084: invokestatic 884	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   1087: istore 7
    //   1089: goto -894 -> 195
    //   1092: iload 7
    //   1094: istore 8
    //   1096: invokestatic 861	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   1099: invokestatic 867	com/tencent/mm/sdk/platformtools/am:isWifi	(Landroid/content/Context;)Z
    //   1102: ifeq +27 -> 1129
    //   1105: iload 7
    //   1107: istore 8
    //   1109: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   1112: ldc_w 894
    //   1115: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1118: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1121: invokevirtual 924	java/lang/Integer:intValue	()I
    //   1124: istore 7
    //   1126: goto -931 -> 195
    //   1129: iload 7
    //   1131: istore 8
    //   1133: invokestatic 861	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   1136: invokestatic 955	com/tencent/mm/sdk/platformtools/am:is2G	(Landroid/content/Context;)Z
    //   1139: ifeq +27 -> 1166
    //   1142: iload 7
    //   1144: istore 8
    //   1146: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   1149: ldc_w 896
    //   1152: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1155: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1158: invokevirtual 924	java/lang/Integer:intValue	()I
    //   1161: istore 7
    //   1163: goto -968 -> 195
    //   1166: iload 7
    //   1168: istore 8
    //   1170: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   1173: ldc_w 898
    //   1176: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1179: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1182: invokevirtual 924	java/lang/Integer:intValue	()I
    //   1185: istore 7
    //   1187: goto -992 -> 195
    //   1190: iload 8
    //   1192: istore 7
    //   1194: invokestatic 861	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   1197: invokestatic 955	com/tencent/mm/sdk/platformtools/am:is2G	(Landroid/content/Context;)Z
    //   1200: ifeq +69 -> 1269
    //   1203: iload 8
    //   1205: istore 7
    //   1207: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   1210: ldc_w 960
    //   1213: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1216: astore 21
    //   1218: iload 8
    //   1220: istore 7
    //   1222: aload 21
    //   1224: ldc_w 914
    //   1227: invokevirtual 918	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1230: iconst_0
    //   1231: aaload
    //   1232: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1235: invokevirtual 924	java/lang/Integer:intValue	()I
    //   1238: istore 12
    //   1240: iload 12
    //   1242: istore 7
    //   1244: aload 21
    //   1246: ldc_w 914
    //   1249: invokevirtual 918	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1252: iconst_1
    //   1253: aaload
    //   1254: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1257: invokevirtual 924	java/lang/Integer:intValue	()I
    //   1260: istore 8
    //   1262: iload 12
    //   1264: istore 7
    //   1266: goto -800 -> 466
    //   1269: iload 8
    //   1271: istore 7
    //   1273: invokestatic 861	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   1276: invokestatic 958	com/tencent/mm/sdk/platformtools/am:is3G	(Landroid/content/Context;)Z
    //   1279: ifeq +69 -> 1348
    //   1282: iload 8
    //   1284: istore 7
    //   1286: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   1289: ldc_w 962
    //   1292: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1295: astore 21
    //   1297: iload 8
    //   1299: istore 7
    //   1301: aload 21
    //   1303: ldc_w 914
    //   1306: invokevirtual 918	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1309: iconst_0
    //   1310: aaload
    //   1311: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1314: invokevirtual 924	java/lang/Integer:intValue	()I
    //   1317: istore 12
    //   1319: iload 12
    //   1321: istore 7
    //   1323: aload 21
    //   1325: ldc_w 914
    //   1328: invokevirtual 918	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1331: iconst_1
    //   1332: aaload
    //   1333: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1336: invokevirtual 924	java/lang/Integer:intValue	()I
    //   1339: istore 8
    //   1341: iload 12
    //   1343: istore 7
    //   1345: goto -879 -> 466
    //   1348: iload 8
    //   1350: istore 7
    //   1352: invokestatic 873	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   1355: ldc_w 964
    //   1358: invokevirtual 880	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1361: astore 21
    //   1363: iload 8
    //   1365: istore 7
    //   1367: aload 21
    //   1369: ldc_w 914
    //   1372: invokevirtual 918	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1375: iconst_0
    //   1376: aaload
    //   1377: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1380: invokevirtual 924	java/lang/Integer:intValue	()I
    //   1383: istore 12
    //   1385: iload 12
    //   1387: istore 7
    //   1389: aload 21
    //   1391: ldc_w 914
    //   1394: invokevirtual 918	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1397: iconst_1
    //   1398: aaload
    //   1399: invokestatic 921	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1402: invokevirtual 924	java/lang/Integer:intValue	()I
    //   1405: istore 8
    //   1407: iload 12
    //   1409: istore 7
    //   1411: goto -945 -> 466
    //   1414: iload 8
    //   1416: sipush 2160
    //   1419: if_icmplt +14 -> 1433
    //   1422: iconst_0
    //   1423: istore 7
    //   1425: sipush 1080
    //   1428: istore 8
    //   1430: goto -884 -> 546
    //   1433: iload 8
    //   1435: ifgt +1680 -> 3115
    //   1438: iload 7
    //   1440: sipush 3240
    //   1443: if_icmple +1672 -> 3115
    //   1446: sipush 1620
    //   1449: istore 7
    //   1451: iconst_0
    //   1452: istore 8
    //   1454: goto -908 -> 546
    //   1457: astore 21
    //   1459: ldc -119
    //   1461: new 80	java/lang/StringBuilder
    //   1464: dup
    //   1465: ldc_w 966
    //   1468: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1471: aload 21
    //   1473: invokevirtual 749	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1476: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1479: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1482: invokestatic 570	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1485: iconst_0
    //   1486: istore 10
    //   1488: goto -800 -> 688
    //   1491: ldc2_w 835
    //   1494: ldc_w 837
    //   1497: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1500: iconst_0
    //   1501: ireturn
    //   1502: new 120	android/graphics/BitmapFactory$Options
    //   1505: dup
    //   1506: invokespecial 121	android/graphics/BitmapFactory$Options:<init>	()V
    //   1509: astore 23
    //   1511: aload 23
    //   1513: invokestatic 969	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/BitmapFactory$Options;)V
    //   1516: aconst_null
    //   1517: astore 20
    //   1519: aconst_null
    //   1520: astore 21
    //   1522: aload_1
    //   1523: invokestatic 118	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   1526: astore 22
    //   1528: aload 22
    //   1530: astore 21
    //   1532: aload 22
    //   1534: astore 20
    //   1536: aload 22
    //   1538: invokevirtual 972	java/io/InputStream:markSupported	()Z
    //   1541: ifne +1564 -> 3105
    //   1544: aload 22
    //   1546: astore 21
    //   1548: aload 22
    //   1550: astore 20
    //   1552: aload 22
    //   1554: instanceof 581
    //   1557: ifeq +1548 -> 3105
    //   1560: aload 22
    //   1562: astore 21
    //   1564: aload 22
    //   1566: astore 20
    //   1568: new 583	com/tencent/mm/sdk/platformtools/i
    //   1571: dup
    //   1572: aload 22
    //   1574: checkcast 581	java/io/FileInputStream
    //   1577: invokespecial 586	com/tencent/mm/sdk/platformtools/i:<init>	(Ljava/io/FileInputStream;)V
    //   1580: astore 22
    //   1582: aload 22
    //   1584: astore 20
    //   1586: aload 20
    //   1588: ldc_w 587
    //   1591: invokevirtual 591	java/io/InputStream:mark	(I)V
    //   1594: new 181	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger
    //   1597: dup
    //   1598: invokespecial 182	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:<init>	()V
    //   1601: astore 21
    //   1603: aload 20
    //   1605: aconst_null
    //   1606: aload 23
    //   1608: aload 21
    //   1610: iconst_0
    //   1611: iconst_0
    //   1612: newarray <illegal type>
    //   1614: invokestatic 131	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   1617: astore 22
    //   1619: aload 20
    //   1621: invokevirtual 599	java/io/InputStream:reset	()V
    //   1624: aload 22
    //   1626: ifnonnull +54 -> 1680
    //   1629: aload 21
    //   1631: invokevirtual 188	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:getDecodeResult	()I
    //   1634: sipush 2000
    //   1637: if_icmplt +22 -> 1659
    //   1640: aload_1
    //   1641: bipush 10
    //   1643: aload 21
    //   1645: invokestatic 194	com/tencent/mm/sdk/platformtools/MMBitmapFactory$KVStatHelper:getKVStatString	(Ljava/lang/Object;ILcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Ljava/lang/String;
    //   1648: astore_0
    //   1649: getstatic 200	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   1652: sipush 12712
    //   1655: aload_0
    //   1656: invokevirtual 204	com/tencent/mm/plugin/report/service/g:A	(ILjava/lang/String;)V
    //   1659: aload 20
    //   1661: ifnull +8 -> 1669
    //   1664: aload 20
    //   1666: invokevirtual 162	java/io/InputStream:close	()V
    //   1669: ldc2_w 835
    //   1672: ldc_w 837
    //   1675: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1678: iconst_0
    //   1679: ireturn
    //   1680: iload 10
    //   1682: i2f
    //   1683: fstore 6
    //   1685: aload 22
    //   1687: fload 6
    //   1689: invokestatic 217	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    //   1692: iload 9
    //   1694: getstatic 726	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1697: new 80	java/lang/StringBuilder
    //   1700: dup
    //   1701: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   1704: aload_0
    //   1705: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1708: aload_2
    //   1709: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1712: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1715: iconst_1
    //   1716: invokestatic 802	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   1719: iload 17
    //   1721: ifeq +189 -> 1910
    //   1724: iload 10
    //   1726: ifne +184 -> 1910
    //   1729: new 80	java/lang/StringBuilder
    //   1732: dup
    //   1733: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   1736: aload_0
    //   1737: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1740: aload_2
    //   1741: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1744: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1747: invokestatic 316	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   1750: lstore 18
    //   1752: ldc -119
    //   1754: ldc_w 974
    //   1757: iconst_3
    //   1758: anewarray 221	java/lang/Object
    //   1761: dup
    //   1762: iconst_0
    //   1763: iload 14
    //   1765: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1768: aastore
    //   1769: dup
    //   1770: iconst_1
    //   1771: lload 18
    //   1773: invokestatic 696	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1776: aastore
    //   1777: dup
    //   1778: iconst_2
    //   1779: iload 12
    //   1781: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1784: aastore
    //   1785: invokestatic 245	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1788: iload 14
    //   1790: i2l
    //   1791: lload 18
    //   1793: lsub
    //   1794: ldc2_w 975
    //   1797: lmul
    //   1798: iload 12
    //   1800: iload 14
    //   1802: imul
    //   1803: i2l
    //   1804: lcmp
    //   1805: ifge +84 -> 1889
    //   1808: new 80	java/lang/StringBuilder
    //   1811: dup
    //   1812: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   1815: aload_0
    //   1816: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1819: aload_2
    //   1820: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1823: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1826: invokestatic 554	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   1829: pop
    //   1830: aload_1
    //   1831: new 80	java/lang/StringBuilder
    //   1834: dup
    //   1835: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   1838: aload_0
    //   1839: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1842: aload_2
    //   1843: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1846: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1849: invokestatic 545	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   1852: lstore 18
    //   1854: lload 18
    //   1856: lconst_0
    //   1857: lcmp
    //   1858: iflt +26 -> 1884
    //   1861: iconst_1
    //   1862: istore_3
    //   1863: aload 20
    //   1865: ifnull +8 -> 1873
    //   1868: aload 20
    //   1870: invokevirtual 162	java/io/InputStream:close	()V
    //   1873: ldc2_w 835
    //   1876: ldc_w 837
    //   1879: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1882: iload_3
    //   1883: ireturn
    //   1884: iconst_0
    //   1885: istore_3
    //   1886: goto -23 -> 1863
    //   1889: aload 20
    //   1891: ifnull +8 -> 1899
    //   1894: aload 20
    //   1896: invokevirtual 162	java/io/InputStream:close	()V
    //   1899: ldc2_w 835
    //   1902: ldc_w 837
    //   1905: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1908: iconst_1
    //   1909: ireturn
    //   1910: aload 20
    //   1912: ifnull +8 -> 1920
    //   1915: aload 20
    //   1917: invokevirtual 162	java/io/InputStream:close	()V
    //   1920: ldc2_w 835
    //   1923: ldc_w 837
    //   1926: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1929: iconst_1
    //   1930: ireturn
    //   1931: astore_0
    //   1932: aload 21
    //   1934: astore 20
    //   1936: ldc -119
    //   1938: aload_0
    //   1939: new 80	java/lang/StringBuilder
    //   1942: dup
    //   1943: ldc_w 978
    //   1946: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1949: aload_1
    //   1950: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1953: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1956: iconst_0
    //   1957: anewarray 221	java/lang/Object
    //   1960: invokestatic 225	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1963: aload 21
    //   1965: ifnull +8 -> 1973
    //   1968: aload 21
    //   1970: invokevirtual 162	java/io/InputStream:close	()V
    //   1973: ldc2_w 835
    //   1976: ldc_w 837
    //   1979: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1982: iconst_0
    //   1983: ireturn
    //   1984: astore_0
    //   1985: aload 20
    //   1987: ifnull +8 -> 1995
    //   1990: aload 20
    //   1992: invokevirtual 162	java/io/InputStream:close	()V
    //   1995: aload_0
    //   1996: athrow
    //   1997: ldc -119
    //   1999: new 80	java/lang/StringBuilder
    //   2002: dup
    //   2003: ldc_w 980
    //   2006: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2009: aload 20
    //   2011: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2014: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2017: ldc_w 936
    //   2020: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2023: aload 20
    //   2025: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2028: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2031: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2034: invokestatic 276	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2037: aload 20
    //   2039: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2042: ifgt +9 -> 2051
    //   2045: aload 20
    //   2047: iconst_1
    //   2048: putfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2051: aload 20
    //   2053: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2056: ifgt +9 -> 2065
    //   2059: aload 20
    //   2061: iconst_1
    //   2062: putfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2065: aload 20
    //   2067: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2070: aload 20
    //   2072: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2075: if_icmple +134 -> 2209
    //   2078: aload 20
    //   2080: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2083: aload 20
    //   2085: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2088: idiv
    //   2089: istore 7
    //   2091: iload 7
    //   2093: istore 8
    //   2095: iload 7
    //   2097: ifne +6 -> 2103
    //   2100: iconst_1
    //   2101: istore 8
    //   2103: ldc_w 950
    //   2106: iload 8
    //   2108: idiv
    //   2109: i2d
    //   2110: invokestatic 983	java/lang/Math:sqrt	(D)D
    //   2113: d2i
    //   2114: istore 7
    //   2116: aload 20
    //   2118: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2121: aload 20
    //   2123: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2126: if_icmple +99 -> 2225
    //   2129: iload 7
    //   2131: iload 8
    //   2133: imul
    //   2134: istore 10
    //   2136: ldc -119
    //   2138: new 80	java/lang/StringBuilder
    //   2141: dup
    //   2142: ldc_w 985
    //   2145: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2148: iload 10
    //   2150: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2153: ldc_w 936
    //   2156: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2159: iload 7
    //   2161: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2164: ldc_w 936
    //   2167: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2170: iload 8
    //   2172: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2175: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2178: invokestatic 276	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2181: aload_1
    //   2182: iload 7
    //   2184: iload 10
    //   2186: getstatic 726	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   2189: iload 9
    //   2191: aload_0
    //   2192: aload_2
    //   2193: iload_3
    //   2194: invokestatic 987	com/tencent/mm/plugin/sns/storage/r:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   2197: istore_3
    //   2198: ldc2_w 835
    //   2201: ldc_w 837
    //   2204: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2207: iload_3
    //   2208: ireturn
    //   2209: aload 20
    //   2211: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2214: aload 20
    //   2216: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2219: idiv
    //   2220: istore 7
    //   2222: goto -131 -> 2091
    //   2225: iload 7
    //   2227: iload 8
    //   2229: imul
    //   2230: istore 11
    //   2232: iload 7
    //   2234: istore 10
    //   2236: iload 11
    //   2238: istore 7
    //   2240: goto -104 -> 2136
    //   2243: iload 14
    //   2245: iload 15
    //   2247: if_icmpge +85 -> 2332
    //   2250: iload 17
    //   2252: ifeq +80 -> 2332
    //   2255: iload 10
    //   2257: ifne +75 -> 2332
    //   2260: ldc -119
    //   2262: new 80	java/lang/StringBuilder
    //   2265: dup
    //   2266: ldc_w 989
    //   2269: invokespecial 142	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2272: iload 15
    //   2274: invokevirtual 395	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2277: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2280: invokestatic 276	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2283: aload_1
    //   2284: new 80	java/lang/StringBuilder
    //   2287: dup
    //   2288: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   2291: aload_0
    //   2292: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2295: aload_2
    //   2296: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2299: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2302: invokestatic 545	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   2305: lconst_0
    //   2306: lcmp
    //   2307: iflt +14 -> 2321
    //   2310: ldc2_w 835
    //   2313: ldc_w 837
    //   2316: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2319: iconst_1
    //   2320: ireturn
    //   2321: ldc2_w 835
    //   2324: ldc_w 837
    //   2327: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2330: iconst_0
    //   2331: ireturn
    //   2332: aload 20
    //   2334: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2337: aload 20
    //   2339: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2342: if_icmple +166 -> 2508
    //   2345: aload 20
    //   2347: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2350: istore 11
    //   2352: aload 20
    //   2354: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2357: aload 20
    //   2359: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2362: if_icmpge +156 -> 2518
    //   2365: aload 20
    //   2367: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2370: istore 13
    //   2372: iload 8
    //   2374: ifle +10 -> 2384
    //   2377: iload 13
    //   2379: iload 8
    //   2381: if_icmple +15 -> 2396
    //   2384: iload 8
    //   2386: ifgt +414 -> 2800
    //   2389: iload 11
    //   2391: iload 7
    //   2393: if_icmpgt +407 -> 2800
    //   2396: ldc -119
    //   2398: ldc_w 991
    //   2401: iconst_3
    //   2402: anewarray 221	java/lang/Object
    //   2405: dup
    //   2406: iconst_0
    //   2407: iload 14
    //   2409: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2412: aastore
    //   2413: dup
    //   2414: iconst_1
    //   2415: aload 20
    //   2417: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2420: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2423: aastore
    //   2424: dup
    //   2425: iconst_2
    //   2426: aload 20
    //   2428: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2431: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2434: aastore
    //   2435: invokestatic 245	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2438: aload_1
    //   2439: invokestatic 316	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   2442: ldc2_w 992
    //   2445: lcmp
    //   2446: ifge +149 -> 2595
    //   2449: iload 17
    //   2451: ifeq +88 -> 2539
    //   2454: ldc -119
    //   2456: ldc_w 995
    //   2459: iconst_1
    //   2460: anewarray 221	java/lang/Object
    //   2463: dup
    //   2464: iconst_0
    //   2465: aload_1
    //   2466: aastore
    //   2467: invokestatic 245	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2470: aload_1
    //   2471: new 80	java/lang/StringBuilder
    //   2474: dup
    //   2475: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   2478: aload_0
    //   2479: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2482: aload_2
    //   2483: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2486: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2489: invokestatic 545	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   2492: lconst_0
    //   2493: lcmp
    //   2494: iflt +34 -> 2528
    //   2497: ldc2_w 835
    //   2500: ldc_w 837
    //   2503: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2506: iconst_1
    //   2507: ireturn
    //   2508: aload 20
    //   2510: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2513: istore 11
    //   2515: goto -163 -> 2352
    //   2518: aload 20
    //   2520: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2523: istore 13
    //   2525: goto -153 -> 2372
    //   2528: ldc2_w 835
    //   2531: ldc_w 837
    //   2534: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2537: iconst_0
    //   2538: ireturn
    //   2539: aload 20
    //   2541: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2544: sipush 150
    //   2547: if_icmpge +48 -> 2595
    //   2550: aload 20
    //   2552: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2555: sipush 150
    //   2558: if_icmpge +37 -> 2595
    //   2561: aload_1
    //   2562: aload 20
    //   2564: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2567: aload 20
    //   2569: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2572: getstatic 721	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   2575: iload 9
    //   2577: aload_0
    //   2578: aload_2
    //   2579: iload_3
    //   2580: invokestatic 987	com/tencent/mm/plugin/sns/storage/r:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   2583: istore_3
    //   2584: ldc2_w 835
    //   2587: ldc_w 837
    //   2590: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2593: iload_3
    //   2594: ireturn
    //   2595: aload_1
    //   2596: aload 20
    //   2598: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2601: aload 20
    //   2603: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2606: getstatic 726	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   2609: iload 9
    //   2611: aload_0
    //   2612: aload_2
    //   2613: iload_3
    //   2614: invokestatic 987	com/tencent/mm/plugin/sns/storage/r:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   2617: istore_3
    //   2618: iload 17
    //   2620: ifeq +169 -> 2789
    //   2623: iload 10
    //   2625: ifne +164 -> 2789
    //   2628: new 80	java/lang/StringBuilder
    //   2631: dup
    //   2632: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   2635: aload_0
    //   2636: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2639: aload_2
    //   2640: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2643: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2646: invokestatic 316	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   2649: lstore 18
    //   2651: ldc -119
    //   2653: ldc_w 974
    //   2656: iconst_3
    //   2657: anewarray 221	java/lang/Object
    //   2660: dup
    //   2661: iconst_0
    //   2662: iload 14
    //   2664: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2667: aastore
    //   2668: dup
    //   2669: iconst_1
    //   2670: lload 18
    //   2672: invokestatic 696	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2675: aastore
    //   2676: dup
    //   2677: iconst_2
    //   2678: iload 12
    //   2680: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2683: aastore
    //   2684: invokestatic 245	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2687: iload 14
    //   2689: i2l
    //   2690: lload 18
    //   2692: lsub
    //   2693: ldc2_w 975
    //   2696: lmul
    //   2697: iload 12
    //   2699: iload 14
    //   2701: imul
    //   2702: i2l
    //   2703: lcmp
    //   2704: ifge +74 -> 2778
    //   2707: new 80	java/lang/StringBuilder
    //   2710: dup
    //   2711: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   2714: aload_0
    //   2715: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2718: aload_2
    //   2719: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2722: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2725: invokestatic 554	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   2728: pop
    //   2729: aload_1
    //   2730: new 80	java/lang/StringBuilder
    //   2733: dup
    //   2734: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   2737: aload_0
    //   2738: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2741: aload_2
    //   2742: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2745: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2748: invokestatic 545	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   2751: lconst_0
    //   2752: lcmp
    //   2753: iflt +14 -> 2767
    //   2756: ldc2_w 835
    //   2759: ldc_w 837
    //   2762: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2765: iconst_1
    //   2766: ireturn
    //   2767: ldc2_w 835
    //   2770: ldc_w 837
    //   2773: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2776: iconst_0
    //   2777: ireturn
    //   2778: ldc2_w 835
    //   2781: ldc_w 837
    //   2784: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2787: iload_3
    //   2788: ireturn
    //   2789: ldc2_w 835
    //   2792: ldc_w 837
    //   2795: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2798: iload_3
    //   2799: ireturn
    //   2800: iload 8
    //   2802: ifle +176 -> 2978
    //   2805: aload_1
    //   2806: aload 20
    //   2808: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2811: aload 20
    //   2813: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   2816: iload 8
    //   2818: getstatic 726	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   2821: iload 9
    //   2823: aload_0
    //   2824: aload_2
    //   2825: invokestatic 997	com/tencent/mm/plugin/sns/storage/r:a	(Ljava/lang/String;IIILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;)Z
    //   2828: istore_3
    //   2829: iload 17
    //   2831: ifeq +209 -> 3040
    //   2834: iload 10
    //   2836: ifne +204 -> 3040
    //   2839: new 80	java/lang/StringBuilder
    //   2842: dup
    //   2843: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   2846: aload_0
    //   2847: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2850: aload_2
    //   2851: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2854: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2857: invokestatic 316	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   2860: lstore 18
    //   2862: ldc -119
    //   2864: ldc_w 974
    //   2867: iconst_3
    //   2868: anewarray 221	java/lang/Object
    //   2871: dup
    //   2872: iconst_0
    //   2873: iload 14
    //   2875: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2878: aastore
    //   2879: dup
    //   2880: iconst_1
    //   2881: lload 18
    //   2883: invokestatic 696	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2886: aastore
    //   2887: dup
    //   2888: iconst_2
    //   2889: iload 12
    //   2891: invokestatic 616	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2894: aastore
    //   2895: invokestatic 245	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2898: iload 14
    //   2900: i2l
    //   2901: lload 18
    //   2903: lsub
    //   2904: ldc2_w 975
    //   2907: lmul
    //   2908: iload 12
    //   2910: iload 14
    //   2912: imul
    //   2913: i2l
    //   2914: lcmp
    //   2915: ifge +125 -> 3040
    //   2918: new 80	java/lang/StringBuilder
    //   2921: dup
    //   2922: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   2925: aload_0
    //   2926: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2929: aload_2
    //   2930: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2933: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2936: invokestatic 554	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   2939: pop
    //   2940: aload_1
    //   2941: new 80	java/lang/StringBuilder
    //   2944: dup
    //   2945: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   2948: aload_0
    //   2949: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2952: aload_2
    //   2953: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2956: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2959: invokestatic 545	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   2962: lconst_0
    //   2963: lcmp
    //   2964: iflt +65 -> 3029
    //   2967: ldc2_w 835
    //   2970: ldc_w 837
    //   2973: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2976: iconst_1
    //   2977: ireturn
    //   2978: iload 11
    //   2980: i2d
    //   2981: dconst_1
    //   2982: dmul
    //   2983: iload 7
    //   2985: i2d
    //   2986: ddiv
    //   2987: dstore 4
    //   2989: aload 20
    //   2991: getfield 176	android/graphics/BitmapFactory$Options:outWidth	I
    //   2994: i2d
    //   2995: dload 4
    //   2997: ddiv
    //   2998: d2i
    //   2999: istore 7
    //   3001: aload_1
    //   3002: aload 20
    //   3004: getfield 179	android/graphics/BitmapFactory$Options:outHeight	I
    //   3007: i2d
    //   3008: dload 4
    //   3010: ddiv
    //   3011: d2i
    //   3012: iload 7
    //   3014: getstatic 726	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   3017: iload 9
    //   3019: aload_0
    //   3020: aload_2
    //   3021: iload_3
    //   3022: invokestatic 987	com/tencent/mm/plugin/sns/storage/r:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   3025: istore_3
    //   3026: goto -197 -> 2829
    //   3029: ldc2_w 835
    //   3032: ldc_w 837
    //   3035: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3038: iconst_0
    //   3039: ireturn
    //   3040: ldc2_w 835
    //   3043: ldc_w 837
    //   3046: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3049: iload_3
    //   3050: ireturn
    //   3051: astore_0
    //   3052: goto -1383 -> 1669
    //   3055: astore_0
    //   3056: goto -1183 -> 1873
    //   3059: astore_0
    //   3060: goto -1161 -> 1899
    //   3063: astore_0
    //   3064: goto -1144 -> 1920
    //   3067: astore_0
    //   3068: goto -1095 -> 1973
    //   3071: astore_1
    //   3072: goto -1077 -> 1995
    //   3075: astore_0
    //   3076: goto -1091 -> 1985
    //   3079: astore_0
    //   3080: aload 20
    //   3082: astore 21
    //   3084: goto -1152 -> 1932
    //   3087: astore 21
    //   3089: iload 13
    //   3091: istore 8
    //   3093: goto -2627 -> 466
    //   3096: astore 21
    //   3098: iload 8
    //   3100: istore 7
    //   3102: goto -2805 -> 297
    //   3105: aload 22
    //   3107: astore 20
    //   3109: goto -1523 -> 1586
    //   3112: goto -2458 -> 654
    //   3115: goto -2569 -> 546
    //   3118: iload 7
    //   3120: istore 9
    //   3122: goto -2751 -> 371
    //   3125: iconst_m1
    //   3126: istore 11
    //   3128: iload 7
    //   3130: istore 9
    //   3132: goto -2761 -> 371
    //   3135: goto -2793 -> 342
    //   3138: bipush 100
    //   3140: istore 9
    //   3142: iconst_m1
    //   3143: istore 11
    //   3145: goto -2774 -> 371
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	3148	0	paramString1	String
    //   0	3148	1	paramString2	String
    //   0	3148	2	paramString3	String
    //   0	3148	3	paramBoolean	boolean
    //   2987	22	4	d	double
    //   1683	5	6	f	float
    //   116	3013	7	i	int
    //   124	2975	8	j	int
    //   369	2772	9	k	int
    //   112	2723	10	m	int
    //   351	2793	11	n	int
    //   456	2457	12	i1	int
    //   384	2706	13	i2	int
    //   376	2537	14	i3	int
    //   581	1692	15	i4	int
    //   620	266	16	i5	int
    //   74	2756	17	bool	boolean
    //   1750	1152	18	l	long
    //   13	3095	20	localObject1	Object
    //   25	1365	21	localObject2	Object
    //   1457	15	21	localException1	Exception
    //   1520	1563	21	localObject3	Object
    //   3087	1	21	localException2	Exception
    //   3096	1	21	localException3	Exception
    //   1526	1580	22	localObject4	Object
    //   1509	98	23	localOptions	BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   662	668	1457	java/lang/Exception
    //   677	688	1457	java/lang/Exception
    //   1522	1528	1931	java/io/IOException
    //   1536	1544	1931	java/io/IOException
    //   1552	1560	1931	java/io/IOException
    //   1568	1582	1931	java/io/IOException
    //   1522	1528	1984	finally
    //   1536	1544	1984	finally
    //   1552	1560	1984	finally
    //   1568	1582	1984	finally
    //   1936	1963	1984	finally
    //   1664	1669	3051	java/io/IOException
    //   1868	1873	3055	java/io/IOException
    //   1894	1899	3059	java/io/IOException
    //   1915	1920	3063	java/io/IOException
    //   1968	1973	3067	java/io/IOException
    //   1990	1995	3071	java/io/IOException
    //   1586	1624	3075	finally
    //   1629	1659	3075	finally
    //   1685	1719	3075	finally
    //   1729	1788	3075	finally
    //   1808	1854	3075	finally
    //   1586	1624	3079	java/io/IOException
    //   1629	1659	3079	java/io/IOException
    //   1685	1719	3079	java/io/IOException
    //   1729	1788	3079	java/io/IOException
    //   1808	1854	3079	java/io/IOException
    //   390	399	3087	java/lang/Exception
    //   403	414	3087	java/lang/Exception
    //   418	436	3087	java/lang/Exception
    //   440	458	3087	java/lang/Exception
    //   1194	1203	3087	java/lang/Exception
    //   1207	1218	3087	java/lang/Exception
    //   1222	1240	3087	java/lang/Exception
    //   1244	1262	3087	java/lang/Exception
    //   1273	1282	3087	java/lang/Exception
    //   1286	1297	3087	java/lang/Exception
    //   1301	1319	3087	java/lang/Exception
    //   1323	1341	3087	java/lang/Exception
    //   1352	1363	3087	java/lang/Exception
    //   1367	1385	3087	java/lang/Exception
    //   1389	1407	3087	java/lang/Exception
    //   126	130	3096	java/lang/Exception
    //   134	142	3096	java/lang/Exception
    //   146	152	3096	java/lang/Exception
    //   156	162	3096	java/lang/Exception
    //   166	175	3096	java/lang/Exception
    //   179	195	3096	java/lang/Exception
    //   199	297	3096	java/lang/Exception
    //   1001	1010	3096	java/lang/Exception
    //   1014	1030	3096	java/lang/Exception
    //   1037	1046	3096	java/lang/Exception
    //   1050	1066	3096	java/lang/Exception
    //   1073	1089	3096	java/lang/Exception
    //   1096	1105	3096	java/lang/Exception
    //   1109	1126	3096	java/lang/Exception
    //   1133	1142	3096	java/lang/Exception
    //   1146	1163	3096	java/lang/Exception
    //   1170	1187	3096	java/lang/Exception
  }
  
  public static void dc(int paramInt1, int paramInt2)
  {
    GMTrace.i(8304856137728L, 61876);
    pnu = paramInt1;
    pmG = paramInt2;
    w.i("MicroMsg.snsMediaStorage", "SCREEN %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(8304856137728L, 61876);
  }
  
  public final q IH(String paramString)
  {
    GMTrace.i(8305393008640L, 61880);
    q localq = new q();
    paramString = this.goN.a("SnsMedia", null, "StrId=?", new String[] { paramString }, null, null, null, 2);
    if (paramString.moveToFirst())
    {
      localq.b(paramString);
      paramString.close();
      GMTrace.o(8305393008640L, 61880);
      return localq;
    }
    paramString.close();
    GMTrace.o(8305393008640L, 61880);
    return null;
  }
  
  public final int a(int paramInt, q paramq)
  {
    GMTrace.i(8305258790912L, 61879);
    paramq = paramq.bmt();
    paramInt = this.goN.update("SnsMedia", paramq, "local_id=?", new String[] { String.valueOf(paramInt) });
    GMTrace.o(8305258790912L, 61879);
    return paramInt;
  }
  
  public final h a(h paramh, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(15964259221504L, 118943);
    q localq = new q();
    localq.hcs = ((int)bg.Pu());
    localq.type = paramh.type;
    anx localanx = new anx();
    localanx.uCQ = paramh.ppn;
    localanx.uDl = paramh.ppm;
    localanx.token = paramh.ppp;
    localanx.uDu = paramh.ppq;
    localanx.uDI = 0;
    localanx.uDH = new anr();
    localanx.gsq = 0;
    localanx.lPj = paramh.desc;
    w.d("MicroMsg.snsMediaStorage", "upload.filterId " + paramh.ppl);
    localanx.uDk = paramh.ppl;
    localanx.uDK = 2;
    localanx.videoPath = paramString1;
    localanx.uDM = paramString2;
    localanx.eDW = paramh.ppr;
    for (;;)
    {
      try
      {
        localq.pMO = localanx.toByteArray();
        localq.bmu();
        i = (int)this.goN.insert("SnsMedia", "local_id", localq.bmt());
        str1 = "Locall_path" + i;
        w.d("MicroMsg.snsMediaStorage", "insert localId " + i);
        String str2 = i.GQ(str1);
        String str3 = i.GR(str1);
        String str4 = i.GP(str1);
        String str5 = i.GS(str1);
        String str6 = IG(str1);
        FileOp.la(str6);
        FileOp.o(paramString2, str6 + str2);
        FileOp.o(paramString2, str6 + str3);
        FileOp.o(paramString2, str6 + str4);
        FileOp.o(paramString1, str6 + str5);
        localanx.videoPath = (str6 + str5);
        localanx.uDM = (str6 + str3);
        localanx.eDW = paramh.ppr;
      }
      catch (Exception localException)
      {
        try
        {
          int i;
          String str1;
          localq.pMO = localanx.toByteArray();
          localq.pMK = str1;
          if ((TextUtils.isEmpty(paramString3)) || (TextUtils.isEmpty(paramString4)))
          {
            a(i, localq);
            paramh = a(paramh, localanx.uDM);
            paramh.ppo = i;
            GMTrace.o(15964259221504L, 118943);
            return paramh;
            localException = localException;
            w.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
          }
        }
        catch (Exception paramString2)
        {
          w.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
          continue;
          paramString2 = new anr();
          paramString2.jib = 1;
          paramString2.lPM = paramString3;
          localanx.uDH = paramString2;
          localanx.uDK = 0;
          com.tencent.mm.modelcdntran.g.Gl();
          localanx.uDj = b.jv(paramString1);
          if (!bg.nm(paramString4))
          {
            paramString1 = new anr();
            paramString1.jib = 1;
            paramString1.lPM = paramString4;
            localanx.uDJ.add(paramString1);
          }
        }
      }
      try
      {
        localq.pMO = localanx.toByteArray();
        localq.bmv();
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "", new Object[0]);
        }
      }
    }
  }
  
  public final boolean a(String paramString, q paramq)
  {
    GMTrace.i(8305124573184L, 61878);
    w.d("MicroMsg.snsMediaStorage", "replace AlbumLikeList " + paramString);
    Cursor localCursor = this.goN.a("SnsMedia", null, "StrId=?", new String[] { paramString }, null, null, null, 2);
    if (localCursor.moveToFirst())
    {
      localCursor.close();
      w.d("MicroMsg.snsMediaStorage", "snsMedia Insert");
      if (paramq != null)
      {
        paramString = paramq.bmt();
        if ((int)this.goN.insert("SnsMedia", "local_id", paramString) != -1)
        {
          GMTrace.o(8305124573184L, 61878);
          return true;
        }
      }
      GMTrace.o(8305124573184L, 61878);
      return false;
    }
    localCursor.close();
    paramq = paramq.bmt();
    if (this.goN.update("SnsMedia", paramq, "StrId=?", new String[] { paramString }) > 0)
    {
      GMTrace.o(8305124573184L, 61878);
      return true;
    }
    GMTrace.o(8305124573184L, 61878);
    return false;
  }
  
  public final List<h> bz(List<h> paramList)
  {
    GMTrace.i(8305661444096L, 61882);
    LinkedList localLinkedList = new LinkedList();
    if ((paramList == null) || (paramList.size() == 0))
    {
      GMTrace.o(8305661444096L, 61882);
      return null;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      h localh1 = (h)paramList.next();
      int i = a(localh1);
      if (i == -1)
      {
        GMTrace.o(8305661444096L, 61882);
        return null;
      }
      h localh2 = new h(i, localh1.type);
      localh2.height = localh1.height;
      localh2.width = localh1.width;
      localh2.fileSize = localh1.fileSize;
      localLinkedList.add(localh2);
    }
    GMTrace.o(8305661444096L, 61882);
    return localLinkedList;
  }
  
  public final q dV(long paramLong)
  {
    GMTrace.i(8305527226368L, 61881);
    q localq = new q();
    Cursor localCursor = this.goN.a("SnsMedia", null, "local_id=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      GMTrace.o(8305527226368L, 61881);
      return null;
    }
    localq.b(localCursor);
    localCursor.close();
    GMTrace.o(8305527226368L, 61881);
    return localq;
  }
  
  final class a
  {
    String pMP;
    String pMQ;
    int pMR;
    int pMS;
    int pMT;
    int pMU;
    int pMV;
    int pMW;
    
    a()
    {
      GMTrace.i(18582712877056L, 138452);
      GMTrace.o(18582712877056L, 138452);
    }
    
    static String IK(String paramString)
    {
      GMTrace.i(18582847094784L, 138453);
      if (bg.nm(paramString))
      {
        GMTrace.o(18582847094784L, 138453);
        return "";
      }
      paramString = paramString.replace(",", ";");
      GMTrace.o(18582847094784L, 138453);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
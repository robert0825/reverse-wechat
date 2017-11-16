package com.tencent.mm.plugin.scanner.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.a.a.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qbar.QbarNative;
import java.io.ByteArrayOutputStream;
import java.io.File;

public final class k
  extends b
{
  private Object gwY;
  private boolean lAS;
  public boolean naa;
  public byte[] oAo;
  private final int oBg;
  private boolean oBh;
  private final int oBi;
  private int oBj;
  private boolean oBk;
  public int outHeight;
  public int outWidth;
  private long ovo;
  private boolean oxj;
  private float oyq;
  public int quality;
  
  public k(b.a parama, int paramInt, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(parama);
    GMTrace.i(6172539092992L, 45989);
    this.oBg = 25;
    this.quality = 50;
    this.oyq = 1.0F;
    this.oBh = false;
    this.oBi = 1;
    this.oBj = 0;
    this.lAS = false;
    this.naa = true;
    this.gwY = new Object();
    this.oxj = false;
    this.quality = paramInt;
    this.oyq = paramFloat;
    this.naa = paramBoolean2;
    this.oBk = paramBoolean1;
    w.i("MicroMsg.scanner.ScanImageDecoder", "quality = [%s], scaleRate = [%s], needRotate = [%s], ocrMode=[%s]", new Object[] { Integer.valueOf(paramInt), Float.valueOf(paramFloat), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1) });
    GMTrace.o(6172539092992L, 45989);
  }
  
  private static int b(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    GMTrace.i(6173075963904L, 45993);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      GMTrace.o(6173075963904L, 45993);
      return -1;
    }
    if (paramInt3 == 1)
    {
      paramInt1 = QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 6, 140);
      GMTrace.o(6173075963904L, 45993);
      return paramInt1;
    }
    if (paramInt3 == 2)
    {
      paramInt1 = QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 8, 120);
      GMTrace.o(6173075963904L, 45993);
      return paramInt1;
    }
    if (paramInt3 == 4)
    {
      paramInt1 = QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 13, 80);
      GMTrace.o(6173075963904L, 45993);
      return paramInt1;
    }
    if (paramInt3 == 5)
    {
      paramInt1 = QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 15, 65);
      GMTrace.o(6173075963904L, 45993);
      return paramInt1;
    }
    paramInt1 = QbarNative.FocusInit(paramInt1, paramInt2, paramBoolean, 10, 100);
    GMTrace.o(6173075963904L, 45993);
    return paramInt1;
  }
  
  private static int tE(int paramInt)
  {
    GMTrace.i(6173210181632L, 45994);
    if ((paramInt <= 0) || (paramInt > 5))
    {
      GMTrace.o(6173210181632L, 45994);
      return 3;
    }
    GMTrace.o(6173210181632L, 45994);
    return paramInt;
  }
  
  @TargetApi(8)
  public final boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect)
  {
    GMTrace.i(6172673310720L, 45990);
    if (this.lAS)
    {
      w.e("MicroMsg.scanner.ScanImageDecoder", "decode() is decoding, return false");
      GMTrace.o(6172673310720L, 45990);
      return false;
    }
    this.lAS = true;
    if ((paramArrayOfByte == null) || (paramPoint == null) || (paramRect == null))
    {
      boolean bool1;
      boolean bool2;
      if (paramArrayOfByte == null)
      {
        bool1 = true;
        if (paramPoint != null) {
          break label126;
        }
        bool2 = true;
        label63:
        if (paramRect != null) {
          break label132;
        }
      }
      label126:
      label132:
      for (boolean bool3 = true;; bool3 = false)
      {
        w.e("MicroMsg.scanner.ScanImageDecoder", "decode() data null:[%s], resolution null:[%s], coverage null:[%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        this.lAS = false;
        GMTrace.o(6172673310720L, 45990);
        return false;
        bool1 = false;
        break;
        bool2 = false;
        break label63;
      }
    }
    int i;
    int j;
    try
    {
      if (this.oBj <= 0)
      {
        this.oBj += 1;
        this.lAS = false;
        GMTrace.o(6172673310720L, 45990);
        return false;
      }
      synchronized (this.gwY)
      {
        Rect localRect = new Rect();
        if ((com.tencent.mm.compatible.d.c.sG()) || (this.naa))
        {
          i = paramRect.width();
          j = paramRect.height();
          localRect.left = paramRect.left;
          paramRect.right -= i % 4;
          localRect.top = paramRect.top;
          paramRect.bottom -= j % 4;
          if ((localRect.right <= localRect.left) || (localRect.bottom <= localRect.top))
          {
            this.lAS = false;
            GMTrace.o(6172673310720L, 45990);
            return false;
          }
        }
        else
        {
          localRect.left = (paramPoint.x / 2 - paramRect.height());
          localRect.right = (paramPoint.x / 2 + paramRect.height());
          localRect.top = (paramPoint.y / 2 - paramRect.width() / 2);
          localRect.bottom = (paramPoint.y / 2 + paramRect.width() / 2);
          if (localRect.left < 0) {
            localRect.left = 0;
          }
          if (localRect.right > paramPoint.x - 1) {
            localRect.right = (paramPoint.x - 1);
          }
          if (localRect.top < 0) {
            localRect.top = 0;
          }
          if (localRect.bottom > paramPoint.y - 1) {
            localRect.bottom = (paramPoint.y - 1);
          }
          i = localRect.width() % 4;
          j = localRect.height() % 4;
          if (i != 0) {
            localRect.right -= i;
          }
          if (j != 0) {
            localRect.bottom -= j;
          }
          if ((localRect.right <= localRect.left) || (localRect.bottom <= localRect.top))
          {
            this.lAS = false;
            GMTrace.o(6172673310720L, 45990);
            return false;
          }
        }
        paramArrayOfByte = new c(paramArrayOfByte, paramPoint.x, paramPoint.y, localRect);
        if ((paramArrayOfByte.height == 0) || (paramArrayOfByte.width == 0))
        {
          this.lAS = false;
          GMTrace.o(6172673310720L, 45990);
          return false;
        }
        if (this.oxj)
        {
          w.w("MicroMsg.scanner.ScanImageDecoder", "isReleasing, return false 1");
          GMTrace.o(6172673310720L, 45990);
          return false;
        }
        paramPoint = paramArrayOfByte.bdn();
        if (paramPoint == null)
        {
          this.lAS = false;
          GMTrace.o(6172673310720L, 45990);
          return false;
        }
        if (this.oBh) {
          break label934;
        }
        if (!com.tencent.mm.compatible.d.c.sG())
        {
          i = b(localRect.height(), localRect.width(), this.oBk, tE(p.fQC.fOR));
          w.d("MicroMsg.scanner.ScanImageDecoder", "Focus init params1=[%s] params2=[%s] params3=[%s], focusThreshold=[%s]", new Object[] { Integer.valueOf(localRect.height()), Integer.valueOf(localRect.width()), Boolean.valueOf(this.oBk), Integer.valueOf(p.fQC.fOR) });
          if (i != -1) {
            break label929;
          }
          w.e("MicroMsg.scanner.ScanImageDecoder", "error in Focus init = [%s]", new Object[] { Integer.valueOf(i) });
          GMTrace.o(6172673310720L, 45990);
          return false;
        }
        i = b(localRect.width(), localRect.height(), this.oBk, tE(p.fQC.fOR));
        w.d("MicroMsg.scanner.ScanImageDecoder", "Focus init Landscape params1=[%s] params2=[%s] params3=[%s], focusThreshold=[%s]", new Object[] { Integer.valueOf(localRect.width()), Integer.valueOf(localRect.height()), Boolean.valueOf(this.oBk), Integer.valueOf(p.fQC.fOR) });
      }
      this.oAa = null;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("MicroMsg.scanner.ScanImageDecoder", " Exception in decode(): [%s]", new Object[] { paramArrayOfByte.toString() });
      w.printErrStackTrace("MicroMsg.scanner.ScanImageDecoder", paramArrayOfByte, "", new Object[0]);
    }
    for (;;)
    {
      this.lAS = false;
      GMTrace.o(6172673310720L, 45990);
      return false;
      label929:
      this.oBh = true;
      label934:
      b.a.oAj[0] = false;
      b.a.oAj[1] = false;
      long l = bg.Pw();
      QbarNative.FocusPro(paramPoint, com.tencent.mm.compatible.d.c.sG(), b.a.oAj);
      w.d("MicroMsg.scanner.ScanImageDecoder", "is best:%s, need focus:%s, cost:%s", new Object[] { Boolean.valueOf(b.a.oAj[0]), Boolean.valueOf(b.a.oAj[1]), Long.valueOf(bg.aI(l)) });
      if (this.ovo == 0L) {
        this.ovo = System.currentTimeMillis();
      }
      if ((b.a.oAj[1] == 0) && (System.currentTimeMillis() - this.ovo > 9000L))
      {
        w.d("MicroMsg.scanner.ScanImageDecoder", "reach focus interfal");
        b.a.oAj[1] = true;
        this.ovo = System.currentTimeMillis();
      }
      if (b.a.oAj[0] == 1)
      {
        if (this.oxj)
        {
          w.w("MicroMsg.scanner.ScanImageDecoder", "isReleasing, return false 2");
          GMTrace.o(6172673310720L, 45990);
          return false;
        }
        this.outWidth = paramArrayOfByte.width;
        this.outHeight = paramArrayOfByte.height;
        i = 0;
        j = 0;
        if (!com.tencent.mm.compatible.d.c.sG())
        {
          i = 1;
          this.outWidth = paramArrayOfByte.height;
          this.outHeight = paramArrayOfByte.width;
        }
        if (this.oyq < 0.9D)
        {
          j = 1;
          this.outWidth /= 2;
          this.outHeight /= 2;
        }
        if (this.oAo == null)
        {
          this.oAo = new byte[this.outWidth * this.outHeight * 3 / 2];
          w.v("MicroMsg.scanner.ScanImageDecoder", "tempOutBytes = null, new byte[%s]", new Object[] { Integer.valueOf(this.outWidth * this.outHeight * 3 / 2) });
        }
        for (;;)
        {
          int k = QbarNative.a(this.oAo, paramPoint, this.outWidth, this.outHeight, j);
          w.d("MicroMsg.scanner.ScanImageDecoder", "decode() imgRet = [%s], outWidth = [%s], outHeight = [%s], imgRotate=[%s], imgScale=[%s]", new Object[] { Integer.valueOf(k), Integer.valueOf(this.outWidth), Integer.valueOf(this.outHeight), Integer.valueOf(i), Integer.valueOf(j) });
          if (k == 1) {
            break;
          }
          this.oAa = null;
          this.lAS = false;
          GMTrace.o(6172673310720L, 45990);
          return false;
          if (this.oAo.length != this.outWidth * this.outHeight * 3 / 2)
          {
            this.oAo = null;
            this.oAo = new byte[this.outWidth * this.outHeight * 3 / 2];
            w.v("MicroMsg.scanner.ScanImageDecoder", "tempOutBytes size change, new byte[%s]", new Object[] { Integer.valueOf(this.outWidth * this.outHeight * 3 / 2) });
          }
        }
        if (this.oxj)
        {
          w.w("MicroMsg.scanner.ScanImageDecoder", "isReleasing, return false 3");
          GMTrace.o(6172673310720L, 45990);
          return false;
        }
        if (f.et(8)) {
          com.tencent.mm.compatible.a.a.a(8, new a.a()
          {
            /* Error */
            public final void run()
            {
              // Byte code:
              //   0: aconst_null
              //   1: astore_2
              //   2: aconst_null
              //   3: astore_3
              //   4: ldc2_w 37
              //   7: ldc 39
              //   9: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
              //   12: new 41	android/graphics/YuvImage
              //   15: dup
              //   16: aload_0
              //   17: getfield 17	com/tencent/mm/plugin/scanner/util/k$1:oBl	Lcom/tencent/mm/plugin/scanner/util/k;
              //   20: getfield 45	com/tencent/mm/plugin/scanner/util/k:oAo	[B
              //   23: bipush 17
              //   25: aload_0
              //   26: getfield 17	com/tencent/mm/plugin/scanner/util/k$1:oBl	Lcom/tencent/mm/plugin/scanner/util/k;
              //   29: getfield 49	com/tencent/mm/plugin/scanner/util/k:outWidth	I
              //   32: aload_0
              //   33: getfield 17	com/tencent/mm/plugin/scanner/util/k$1:oBl	Lcom/tencent/mm/plugin/scanner/util/k;
              //   36: getfield 52	com/tencent/mm/plugin/scanner/util/k:outHeight	I
              //   39: aconst_null
              //   40: invokespecial 55	android/graphics/YuvImage:<init>	([BIII[I)V
              //   43: astore_1
              //   44: ldc 57
              //   46: ldc 59
              //   48: invokestatic 65	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
              //   51: new 67	java/io/ByteArrayOutputStream
              //   54: dup
              //   55: invokespecial 68	java/io/ByteArrayOutputStream:<init>	()V
              //   58: astore 4
              //   60: aload_1
              //   61: new 70	android/graphics/Rect
              //   64: dup
              //   65: iconst_0
              //   66: iconst_0
              //   67: aload_0
              //   68: getfield 17	com/tencent/mm/plugin/scanner/util/k$1:oBl	Lcom/tencent/mm/plugin/scanner/util/k;
              //   71: getfield 49	com/tencent/mm/plugin/scanner/util/k:outWidth	I
              //   74: aload_0
              //   75: getfield 17	com/tencent/mm/plugin/scanner/util/k$1:oBl	Lcom/tencent/mm/plugin/scanner/util/k;
              //   78: getfield 52	com/tencent/mm/plugin/scanner/util/k:outHeight	I
              //   81: invokespecial 73	android/graphics/Rect:<init>	(IIII)V
              //   84: aload_0
              //   85: getfield 17	com/tencent/mm/plugin/scanner/util/k$1:oBl	Lcom/tencent/mm/plugin/scanner/util/k;
              //   88: getfield 76	com/tencent/mm/plugin/scanner/util/k:quality	I
              //   91: aload 4
              //   93: invokevirtual 80	android/graphics/YuvImage:compressToJpeg	(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z
              //   96: pop
              //   97: aload_0
              //   98: getfield 17	com/tencent/mm/plugin/scanner/util/k$1:oBl	Lcom/tencent/mm/plugin/scanner/util/k;
              //   101: aload 4
              //   103: invokevirtual 84	java/io/ByteArrayOutputStream:toByteArray	()[B
              //   106: putfield 87	com/tencent/mm/plugin/scanner/util/k:oAa	[B
              //   109: aload_2
              //   110: astore_1
              //   111: getstatic 93	com/tencent/mm/platformtools/r:hjX	Z
              //   114: ifeq +278 -> 392
              //   117: aload_2
              //   118: astore_1
              //   119: new 95	java/io/FileOutputStream
              //   122: dup
              //   123: new 97	java/io/File
              //   126: dup
              //   127: new 99	java/lang/StringBuilder
              //   130: dup
              //   131: invokespecial 100	java/lang/StringBuilder:<init>	()V
              //   134: invokestatic 106	com/tencent/mm/compatible/util/h:getExternalStorageDirectory	()Ljava/io/File;
              //   137: invokevirtual 110	java/io/File:getAbsolutePath	()Ljava/lang/String;
              //   140: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
              //   143: ldc 116
              //   145: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
              //   148: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
              //   151: invokespecial 122	java/io/File:<init>	(Ljava/lang/String;)V
              //   154: invokespecial 125	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
              //   157: astore_2
              //   158: aload_2
              //   159: aload_0
              //   160: getfield 17	com/tencent/mm/plugin/scanner/util/k$1:oBl	Lcom/tencent/mm/plugin/scanner/util/k;
              //   163: getfield 87	com/tencent/mm/plugin/scanner/util/k:oAa	[B
              //   166: invokevirtual 129	java/io/FileOutputStream:write	([B)V
              //   169: aload_2
              //   170: invokevirtual 132	java/io/FileOutputStream:flush	()V
              //   173: aload_2
              //   174: ifnull +7 -> 181
              //   177: aload_2
              //   178: invokevirtual 135	java/io/FileOutputStream:close	()V
              //   181: aload 4
              //   183: invokevirtual 136	java/io/ByteArrayOutputStream:close	()V
              //   186: ldc2_w 37
              //   189: ldc 39
              //   191: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
              //   194: return
              //   195: astore_1
              //   196: ldc 57
              //   198: aload_1
              //   199: ldc -118
              //   201: iconst_0
              //   202: anewarray 4	java/lang/Object
              //   205: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
              //   208: goto -27 -> 181
              //   211: astore_1
              //   212: ldc 57
              //   214: aload_1
              //   215: ldc -118
              //   217: iconst_0
              //   218: anewarray 4	java/lang/Object
              //   221: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
              //   224: ldc2_w 37
              //   227: ldc 39
              //   229: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
              //   232: return
              //   233: astore_1
              //   234: aload_3
              //   235: astore_2
              //   236: aload_1
              //   237: astore_3
              //   238: aload_2
              //   239: astore_1
              //   240: ldc 57
              //   242: ldc -112
              //   244: iconst_1
              //   245: anewarray 4	java/lang/Object
              //   248: dup
              //   249: iconst_0
              //   250: aload_3
              //   251: invokevirtual 147	java/io/IOException:getMessage	()Ljava/lang/String;
              //   254: aastore
              //   255: invokestatic 151	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   258: aload_2
              //   259: astore_1
              //   260: ldc 57
              //   262: aload_3
              //   263: ldc -118
              //   265: iconst_0
              //   266: anewarray 4	java/lang/Object
              //   269: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
              //   272: aload_2
              //   273: ifnull +7 -> 280
              //   276: aload_2
              //   277: invokevirtual 135	java/io/FileOutputStream:close	()V
              //   280: aload 4
              //   282: invokevirtual 136	java/io/ByteArrayOutputStream:close	()V
              //   285: ldc2_w 37
              //   288: ldc 39
              //   290: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
              //   293: return
              //   294: astore_1
              //   295: ldc 57
              //   297: aload_1
              //   298: ldc -118
              //   300: iconst_0
              //   301: anewarray 4	java/lang/Object
              //   304: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
              //   307: goto -27 -> 280
              //   310: astore_1
              //   311: ldc 57
              //   313: aload_1
              //   314: ldc -118
              //   316: iconst_0
              //   317: anewarray 4	java/lang/Object
              //   320: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
              //   323: ldc2_w 37
              //   326: ldc 39
              //   328: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
              //   331: return
              //   332: astore_3
              //   333: aload_1
              //   334: astore_2
              //   335: aload_3
              //   336: astore_1
              //   337: aload_2
              //   338: ifnull +7 -> 345
              //   341: aload_2
              //   342: invokevirtual 135	java/io/FileOutputStream:close	()V
              //   345: aload 4
              //   347: invokevirtual 136	java/io/ByteArrayOutputStream:close	()V
              //   350: aload_1
              //   351: athrow
              //   352: astore_2
              //   353: ldc 57
              //   355: aload_2
              //   356: ldc -118
              //   358: iconst_0
              //   359: anewarray 4	java/lang/Object
              //   362: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
              //   365: goto -20 -> 345
              //   368: astore_2
              //   369: ldc 57
              //   371: aload_2
              //   372: ldc -118
              //   374: iconst_0
              //   375: anewarray 4	java/lang/Object
              //   378: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
              //   381: goto -31 -> 350
              //   384: astore_1
              //   385: goto -48 -> 337
              //   388: astore_3
              //   389: goto -151 -> 238
              //   392: aconst_null
              //   393: astore_2
              //   394: goto -221 -> 173
              // Local variable table:
              //   start	length	slot	name	signature
              //   0	397	0	this	1
              //   43	76	1	localObject1	Object
              //   195	4	1	localIOException1	java.io.IOException
              //   211	4	1	localIOException2	java.io.IOException
              //   233	4	1	localIOException3	java.io.IOException
              //   239	21	1	localObject2	Object
              //   294	4	1	localIOException4	java.io.IOException
              //   310	24	1	localIOException5	java.io.IOException
              //   336	15	1	localObject3	Object
              //   384	1	1	localObject4	Object
              //   1	341	2	localObject5	Object
              //   352	4	2	localIOException6	java.io.IOException
              //   368	4	2	localIOException7	java.io.IOException
              //   393	1	2	localObject6	Object
              //   3	260	3	localObject7	Object
              //   332	4	3	localObject8	Object
              //   388	1	3	localIOException8	java.io.IOException
              //   58	288	4	localByteArrayOutputStream	ByteArrayOutputStream
              // Exception table:
              //   from	to	target	type
              //   177	181	195	java/io/IOException
              //   181	186	211	java/io/IOException
              //   111	117	233	java/io/IOException
              //   119	158	233	java/io/IOException
              //   276	280	294	java/io/IOException
              //   280	285	310	java/io/IOException
              //   111	117	332	finally
              //   119	158	332	finally
              //   240	258	332	finally
              //   260	272	332	finally
              //   341	345	352	java/io/IOException
              //   345	350	368	java/io/IOException
              //   158	173	384	finally
              //   158	173	388	java/io/IOException
            }
          });
        }
        for (;;)
        {
          w.i("MicroMsg.scanner.ScanImageDecoder", "decode() finish greyData.length = [%s]", new Object[] { Integer.valueOf(this.oAa.length) });
          this.lAS = false;
          GMTrace.o(6172673310720L, 45990);
          return true;
          w.d("MicroMsg.scanner.ScanImageDecoder", "decode() compress jpeg by PlanarYUVLuminanceSource");
          paramPoint = new c(this.oAo, this.outWidth, this.outHeight, new Rect(0, 0, this.outWidth, this.outHeight));
          paramRect = new int[paramPoint.width * paramPoint.height];
          QbarNative.a(paramPoint.eSn, paramRect, paramPoint.oAk, paramPoint.oAl, paramPoint.left, paramPoint.top, paramPoint.width, paramPoint.height);
          QbarNative.nativeRelease();
          paramArrayOfByte = Bitmap.createBitmap(paramPoint.width, paramPoint.height, Bitmap.Config.ARGB_8888);
          paramArrayOfByte.setPixels(paramRect, 0, paramPoint.width, 0, 0, paramPoint.width, paramPoint.height);
          paramPoint = new ByteArrayOutputStream();
          paramArrayOfByte.compress(Bitmap.CompressFormat.JPEG, this.quality, paramPoint);
          this.oAa = paramPoint.toByteArray();
          paramPoint.close();
          if (r.hjX) {
            d.a(paramArrayOfByte, this.quality, Bitmap.CompressFormat.JPEG, h.getExternalStorageDirectory().getAbsolutePath() + "/_scanImage_.JPEG", false);
          }
          paramArrayOfByte.recycle();
        }
      }
    }
  }
  
  public final void bdl()
  {
    GMTrace.i(6172941746176L, 45992);
    if (this.oBh) {
      releaseDecoder();
    }
    this.lAS = false;
    this.oxj = false;
    this.oBh = false;
    GMTrace.o(6172941746176L, 45992);
  }
  
  public final void releaseDecoder()
  {
    GMTrace.i(6172807528448L, 45991);
    w.d("MicroMsg.scanner.ScanImageDecoder", "releaseDecoder start");
    this.oxj = true;
    if (this.gwY != null) {}
    synchronized (this.gwY)
    {
      if (this.oBh)
      {
        w.d("sizepara", "ImgProcessScan.FocusRelease() = [%s]", new Object[] { Integer.valueOf(0) });
        this.oBh = false;
        w.d("MicroMsg.scanner.ScanImageDecoder", "ImgProcessScan.Release() = [%s]", new Object[] { Integer.valueOf(QbarNative.FocusRelease()) });
      }
      this.oAo = null;
      c.bdm();
      w.d("MicroMsg.scanner.ScanImageDecoder", "releaseDecoder done");
      GMTrace.o(6172807528448L, 45991);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
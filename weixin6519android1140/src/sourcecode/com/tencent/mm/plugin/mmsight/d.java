package com.tencent.mm.plugin.mmsight;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Point;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.media.MediaMetadataRetriever;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.model.i;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.ad;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class d
{
  public static int mWA;
  private static ConcurrentHashMap<String, Long> mWB;
  private static float mWx;
  private static boolean mWy;
  private static int mWz;
  
  static
  {
    GMTrace.i(7379290685440L, 54980);
    mWx = 0.01F;
    mWy = false;
    mWz = 0;
    mWA = 0;
    mWB = new ConcurrentHashMap();
    GMTrace.o(7379290685440L, 54980);
  }
  
  public static String CG(String paramString)
  {
    GMTrace.i(7377680072704L, 54968);
    try
    {
      paramString = com.tencent.mm.plugin.sight.base.d.CG(paramString);
      GMTrace.o(7377680072704L, 54968);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.MMSightUtil", "getMediaInfo error: %s", new Object[] { paramString.getMessage() });
      GMTrace.o(7377680072704L, 54968);
    }
    return null;
  }
  
  public static void CH(String paramString)
  {
    GMTrace.i(7377948508160L, 54970);
    w.i("MicroMsg.MMSightUtil", "setTime key %s %s", new Object[] { paramString, bg.bQW().toString() });
    mWB.put(paramString, Long.valueOf(System.currentTimeMillis()));
    GMTrace.o(7377948508160L, 54970);
  }
  
  public static long CI(String paramString)
  {
    GMTrace.i(7378082725888L, 54971);
    if (mWB.containsKey(paramString))
    {
      long l1 = ((Long)mWB.get(paramString)).longValue();
      long l2 = System.currentTimeMillis();
      GMTrace.o(7378082725888L, 54971);
      return l2 - l1;
    }
    GMTrace.o(7378082725888L, 54971);
    return 0L;
  }
  
  private static int a(String paramString, FileInputStream paramFileInputStream)
  {
    GMTrace.i(7378351161344L, 54973);
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int m;
      int i;
      try
      {
        m = paramFileInputStream.read(arrayOfByte);
        j = 0;
      }
      catch (NumberFormatException paramString)
      {
        int n;
        GMTrace.o(7378351161344L, 54973);
        return 0;
      }
      catch (IOException paramString)
      {
        continue;
      }
      int k = i;
      if (j < m)
      {
        n = j - i;
        k = i;
        if (arrayOfByte[j] == paramString.charAt(n))
        {
          if (n == paramString.length() - 1)
          {
            if ((j < 1024) && (arrayOfByte[j] != 10))
            {
              if (Character.isDigit(arrayOfByte[j]))
              {
                i = j + 1;
                if ((i < 1024) && (Character.isDigit(arrayOfByte[i])))
                {
                  i += 1;
                  continue;
                }
                i = bg.Sy(new String(arrayOfByte, 0, j, i - j));
                GMTrace.o(7378351161344L, 54973);
                return i;
              }
              j += 1;
              continue;
            }
            GMTrace.o(7378351161344L, 54973);
            return 0;
          }
          j += 1;
          continue;
        }
      }
      int j = k + 1;
      if (j < m) {
        if (arrayOfByte[j] != 10)
        {
          k = j;
          if (j != 0) {}
        }
        else
        {
          i = j;
          if (arrayOfByte[j] == 10) {
            i = j + 1;
          }
          j = i;
        }
      }
    }
  }
  
  public static Point a(Point paramPoint1, Point paramPoint2, boolean paramBoolean)
  {
    GMTrace.i(7377008984064L, 54963);
    paramPoint1 = a(paramPoint1, paramPoint2, paramBoolean, false);
    GMTrace.o(7377008984064L, 54963);
    return paramPoint1;
  }
  
  public static Point a(Point paramPoint1, Point paramPoint2, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(7377143201792L, 54964);
    int n = paramPoint2.x;
    int i1 = paramPoint2.y;
    int j;
    int k;
    label40:
    int i;
    if (paramBoolean1)
    {
      j = paramPoint1.y;
      if (!paramBoolean1) {
        break label212;
      }
      k = paramPoint1.x;
      int m = (int)(n * (k / j));
      i = m;
      if (m % 2 != 0) {
        i = m - 1;
      }
      float f = i1;
      j = (int)(j / k * f);
      if (!paramBoolean2) {
        break label238;
      }
      i = cs(i, paramPoint2.y);
    }
    label212:
    label238:
    for (;;)
    {
      w.i("MicroMsg.MMSightUtil", "getCropPreviewSize, previewSize: %s, displaySize: %s, width: %s, newHeight: %s makeMediaCodecHappy %s, newWidth: %s, isRoate: %s", new Object[] { paramPoint2, paramPoint1, Integer.valueOf(n), Integer.valueOf(i), Boolean.valueOf(paramBoolean2), Integer.valueOf(j), Boolean.valueOf(paramBoolean1) });
      if ((i <= paramPoint2.y) && (n <= paramPoint2.x))
      {
        paramPoint1 = new Point(n, i);
        GMTrace.o(7377143201792L, 54964);
        return paramPoint1;
        j = paramPoint1.x;
        break;
        k = paramPoint1.y;
        break label40;
      }
      w.i("MicroMsg.MMSightUtil", "can not adapt to screen");
      GMTrace.o(7377143201792L, 54964);
      return null;
    }
  }
  
  public static ArrayList<Camera.Size> a(Camera.Parameters paramParameters)
  {
    GMTrace.i(7377545854976L, 54967);
    paramParameters = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort(paramParameters, new a());
    GMTrace.o(7377545854976L, 54967);
    return paramParameters;
  }
  
  public static void a(com.tencent.mm.plugin.mmsight.model.a.d paramd, final SightParams paramSightParams)
  {
    GMTrace.i(18670222835712L, 139104);
    Object localObject1 = paramSightParams.mWS;
    Object localObject2 = paramSightParams.mWQ;
    paramSightParams = paramSightParams.mWR;
    if ((!bg.nm((String)localObject1)) && (!bg.nm((String)localObject2)) && (!bg.nm(paramSightParams)))
    {
      w.i("MicroMsg.MMSightUtil", "setMMSightRecorderPathByTalker, fileName: %s, filePath: %s, thumbPath: %s", new Object[] { localObject1, localObject2, paramSightParams });
      paramd.setFilePath((String)localObject2);
      paramd.CJ(paramSightParams);
    }
    for (;;)
    {
      paramSightParams = CaptureMMProxy.getInstance().getSubCoreImageFullPath("capture_" + System.currentTimeMillis());
      w.i("MicroMsg.MMSightUtil", "captureImagePath %s", new Object[] { paramSightParams });
      paramd.CK(paramSightParams);
      GMTrace.o(18670222835712L, 139104);
      return;
      paramSightParams = CaptureMMProxy.getInstance().getAccVideoPath();
      int i = mWz;
      mWz = i + 1;
      localObject1 = new File(String.format("%s/tempvideo%s.mp4", new Object[] { paramSightParams, Integer.valueOf(i) }));
      if (((File)localObject1).exists()) {
        ((File)localObject1).delete();
      }
      localObject2 = new File(((File)localObject1).getAbsolutePath() + ".remux");
      if (((File)localObject2).exists()) {
        ((File)localObject2).delete();
      }
      localObject2 = new File(((File)localObject1).getAbsoluteFile() + ".thumb");
      if (((File)localObject2).exists()) {
        ((File)localObject2).delete();
      }
      localObject2 = new File(((File)localObject1).getAbsoluteFile() + ".soundmp4");
      if (((File)localObject2).exists()) {
        ((File)localObject2).delete();
      }
      i.v(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7494583713792L, 55839);
          int i = d.mWA;
          while (i < this.mWC)
          {
            File localFile1 = new File(String.format("%s/tempvideo%s.mp4", new Object[] { paramSightParams, Integer.valueOf(i) }));
            if (localFile1.exists()) {
              localFile1.delete();
            }
            File localFile2 = new File(localFile1.getAbsolutePath() + ".remux");
            if (localFile2.exists()) {
              localFile2.delete();
            }
            localFile1 = new File(localFile1.getAbsoluteFile() + ".thumb");
            if (localFile1.exists()) {
              localFile1.delete();
            }
            i += 1;
          }
          d.mWA = Math.max(this.mWC, 0);
          GMTrace.o(7494583713792L, 55839);
        }
      });
      paramSightParams = ((File)localObject1).getAbsolutePath();
      localObject1 = bg.aq(paramSightParams, "") + ".thumb";
      w.i("MicroMsg.MMSightUtil", "setMMSightRecorderPathDefault, filePath: %s, thumbPath: %s", new Object[] { paramSightParams, localObject1 });
      paramd.setFilePath(paramSightParams);
      paramd.CJ((String)localObject1);
    }
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3, PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(17412736942080L, 129735);
    float f;
    int i;
    int j;
    if ((paramInt3 > 0) && (Math.min(paramInt1, paramInt2) > paramInt3)) {
      if (paramInt1 < paramInt2)
      {
        f = paramInt1 * 1.0F / paramInt3;
        i = (int)(paramInt2 / f);
        j = paramInt3;
      }
    }
    for (boolean bool = true;; bool = false)
    {
      paramPInt1.value = j;
      paramPInt2.value = i;
      w.d("MicroMsg.MMSightUtil", "check bitmap size result[%b] raw[%d %d] minSize[%d] out[%d %d]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value) });
      GMTrace.o(17412736942080L, 129735);
      return bool;
      f = paramInt2 * 1.0F / paramInt3;
      j = (int)(paramInt1 / f);
      i = paramInt3;
      break;
      i = paramInt2;
      j = paramInt1;
    }
  }
  
  public static boolean a(Context paramContext, Point paramPoint, boolean paramBoolean)
  {
    GMTrace.i(7376874766336L, 54962);
    paramContext = cN(paramContext);
    float f2 = paramContext.y / paramContext.x;
    if (paramBoolean) {}
    for (float f1 = paramPoint.x / paramPoint.y;; f1 = paramPoint.y / paramPoint.x)
    {
      float f3 = Math.abs(f2 - f1);
      w.i("MicroMsg.MMSightUtil", "checkIfNeedUsePreviewLarge: previewSize: %s, displaySize: %s, displayRatio: %s, previewRatio: %s, diff: %s", new Object[] { paramPoint, paramContext, Float.valueOf(f2), Float.valueOf(f1), Float.valueOf(f3) });
      if (f3 <= mWx) {
        break;
      }
      GMTrace.o(7376874766336L, 54962);
      return true;
    }
    GMTrace.o(7376874766336L, 54962);
    return false;
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7378619596800L, 54975);
    if (paramInt3 == 0)
    {
      GMTrace.o(7378619596800L, 54975);
      return paramArrayOfByte;
    }
    byte[] arrayOfByte = j.naP.h(Integer.valueOf(paramArrayOfByte.length));
    int i5 = paramInt1 * paramInt2;
    int m;
    int n;
    label64:
    int i1;
    if (paramInt3 % 180 != 0)
    {
      m = 1;
      if (paramInt3 % 270 == 0) {
        break label264;
      }
      n = 1;
      if (paramInt3 < 180) {
        break label270;
      }
      i1 = 1;
      label74:
      paramInt3 = 0;
    }
    for (;;)
    {
      if (paramInt3 >= paramInt2) {
        break label308;
      }
      int i = 0;
      label84:
      if (i < paramInt1)
      {
        int i6 = (paramInt3 >> 1) * paramInt1 + i5 + (i & 0xFFFFFFFE);
        int i2;
        label114:
        int i3;
        label122:
        int j;
        if (m != 0)
        {
          i2 = paramInt2;
          if (m == 0) {
            break label282;
          }
          i3 = paramInt1;
          if (m == 0) {
            break label288;
          }
          j = paramInt3;
          label130:
          if (m == 0) {
            break label295;
          }
        }
        label264:
        label270:
        label282:
        label288:
        label295:
        for (int k = i;; k = paramInt3)
        {
          int i4 = j;
          if (n != 0) {
            i4 = i2 - j - 1;
          }
          j = k;
          if (i1 != 0) {
            j = i3 - k - 1;
          }
          k = (j >> 1) * i2 + i5 + (i4 & 0xFFFFFFFE);
          arrayOfByte[(j * i2 + i4)] = ((byte)(paramArrayOfByte[(paramInt3 * paramInt1 + i)] & 0xFF));
          arrayOfByte[k] = ((byte)(paramArrayOfByte[i6] & 0xFF));
          arrayOfByte[(k + 1)] = ((byte)(paramArrayOfByte[(i6 + 1)] & 0xFF));
          i += 1;
          break label84;
          m = 0;
          break;
          n = 0;
          break label64;
          i1 = 0;
          break label74;
          i2 = paramInt1;
          break label114;
          i3 = paramInt2;
          break label122;
          j = i;
          break label130;
        }
      }
      paramInt3 += 1;
    }
    label308:
    j.naP.x(paramArrayOfByte);
    GMTrace.o(7378619596800L, 54975);
    return arrayOfByte;
  }
  
  public static Point aON()
  {
    GMTrace.i(7376740548608L, 54961);
    Point localPoint = ad.ff(ab.getContext());
    GMTrace.o(7376740548608L, 54961);
    return localPoint;
  }
  
  public static String aV(List<Camera.Size> paramList)
  {
    GMTrace.i(7377277419520L, 54965);
    StringBuffer localStringBuffer = new StringBuffer();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Camera.Size localSize = (Camera.Size)paramList.next();
      localStringBuffer.append("size: " + localSize.height + "," + localSize.width + ";");
    }
    paramList = localStringBuffer.toString();
    GMTrace.o(7377277419520L, 54965);
    return paramList;
  }
  
  public static String aW(List<Camera.Size> paramList)
  {
    GMTrace.i(7377411637248L, 54966);
    StringBuffer localStringBuffer = new StringBuffer();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Camera.Size localSize = (Camera.Size)paramList.next();
      localStringBuffer.append("size: " + localSize.height + "," + localSize.width + " " + localSize.height * 1.0D / localSize.width + "||");
    }
    paramList = localStringBuffer.toString();
    GMTrace.o(7377411637248L, 54966);
    return paramList;
  }
  
  public static Point b(Point paramPoint1, Point paramPoint2, boolean paramBoolean)
  {
    GMTrace.i(20189164863488L, 150421);
    paramPoint1 = b(paramPoint1, paramPoint2, paramBoolean, false);
    GMTrace.o(20189164863488L, 150421);
    return paramPoint1;
  }
  
  public static Point b(Point paramPoint1, Point paramPoint2, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(20189299081216L, 150422);
    int k = paramPoint2.x;
    int m = paramPoint2.y;
    int i;
    if (paramBoolean1)
    {
      i = paramPoint1.y;
      if (!paramBoolean1) {
        break label187;
      }
    }
    label187:
    for (int j = paramPoint1.x;; j = paramPoint1.y)
    {
      float f = m;
      j = (int)(i / j * f);
      i = j;
      if (j % 2 != 0) {
        i = j + 1;
      }
      j = i;
      if (paramBoolean2) {
        j = cs(i, paramPoint2.y);
      }
      w.i("MicroMsg.MMSightUtil", "getCropPreviewSize, previewSize: %s, displaySize: %s, width: %s, newWidth: %s, makeMediaCodecHappy %s, , isRoate: %s", new Object[] { paramPoint2, paramPoint1, Integer.valueOf(k), Integer.valueOf(j), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1) });
      if (j > paramPoint2.x) {
        break label196;
      }
      paramPoint1 = new Point(j, m);
      GMTrace.o(20189299081216L, 150422);
      return paramPoint1;
      i = paramPoint1.x;
      break;
    }
    label196:
    w.i("MicroMsg.MMSightUtil", "can not adapt to screen");
    GMTrace.o(20189299081216L, 150422);
    return null;
  }
  
  public static Point cN(Context paramContext)
  {
    GMTrace.i(7376606330880L, 54960);
    Point localPoint = ad.ff(paramContext);
    if ((!mWy) && (ad.fe(paramContext))) {
      localPoint.y -= ad.fd(paramContext);
    }
    GMTrace.o(7376606330880L, 54960);
    return localPoint;
  }
  
  /* Error */
  public static int cO(Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 492
    //   3: ldc_w 494
    //   6: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: getstatic 499	android/os/Build$VERSION:SDK_INT	I
    //   12: bipush 16
    //   14: if_icmplt +52 -> 66
    //   17: new 501	android/app/ActivityManager$MemoryInfo
    //   20: dup
    //   21: invokespecial 502	android/app/ActivityManager$MemoryInfo:<init>	()V
    //   24: astore 6
    //   26: aload_0
    //   27: ldc_w 504
    //   30: invokevirtual 510	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   33: checkcast 512	android/app/ActivityManager
    //   36: aload 6
    //   38: invokevirtual 516	android/app/ActivityManager:getMemoryInfo	(Landroid/app/ActivityManager$MemoryInfo;)V
    //   41: aload 6
    //   43: getfield 520	android/app/ActivityManager$MemoryInfo:totalMem	J
    //   46: l2d
    //   47: ldc2_w 521
    //   50: ddiv
    //   51: d2i
    //   52: istore 5
    //   54: ldc2_w 492
    //   57: ldc_w 494
    //   60: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   63: iload 5
    //   65: ireturn
    //   66: new 137	java/io/FileInputStream
    //   69: dup
    //   70: ldc_w 524
    //   73: invokespecial 525	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   76: astore_0
    //   77: ldc_w 527
    //   80: aload_0
    //   81: invokestatic 529	com/tencent/mm/plugin/mmsight/d:a	(Ljava/lang/String;Ljava/io/FileInputStream;)I
    //   84: istore 5
    //   86: iload 5
    //   88: i2d
    //   89: dstore_3
    //   90: dload_3
    //   91: dstore_1
    //   92: dload_3
    //   93: dconst_0
    //   94: dcmpl
    //   95: ifle +9 -> 104
    //   98: dload_3
    //   99: ldc2_w 521
    //   102: ddiv
    //   103: dstore_1
    //   104: aload_0
    //   105: invokevirtual 532	java/io/FileInputStream:close	()V
    //   108: dload_1
    //   109: d2i
    //   110: istore 5
    //   112: ldc2_w 492
    //   115: ldc_w 494
    //   118: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   121: iload 5
    //   123: ireturn
    //   124: astore 6
    //   126: aload_0
    //   127: invokevirtual 532	java/io/FileInputStream:close	()V
    //   130: aload 6
    //   132: athrow
    //   133: astore_0
    //   134: dconst_0
    //   135: dstore_1
    //   136: goto -28 -> 108
    //   139: astore_0
    //   140: goto -32 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	paramContext	Context
    //   91	45	1	d1	double
    //   89	10	3	d2	double
    //   52	70	5	i	int
    //   24	18	6	localMemoryInfo	android.app.ActivityManager.MemoryInfo
    //   124	7	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   77	86	124	finally
    //   66	77	133	java/io/IOException
    //   126	133	133	java/io/IOException
    //   104	108	139	java/io/IOException
  }
  
  public static int cs(int paramInt1, int paramInt2)
  {
    GMTrace.i(7378888032256L, 54977);
    int i = paramInt1 % 16;
    if (i == 0)
    {
      GMTrace.o(7378888032256L, 54977);
      return paramInt1;
    }
    int j = 16 - i + paramInt1;
    if (j < paramInt2)
    {
      GMTrace.o(7378888032256L, 54977);
      return j;
    }
    GMTrace.o(7378888032256L, 54977);
    return paramInt1 - i;
  }
  
  public static void fV(boolean paramBoolean)
  {
    GMTrace.i(7376472113152L, 54959);
    mWy = paramBoolean;
    GMTrace.o(7376472113152L, 54959);
  }
  
  public static Bitmap ls(String paramString)
  {
    GMTrace.i(7378485379072L, 54974);
    if ((bg.nm(paramString)) || (!FileOp.aZ(paramString)))
    {
      w.e("MicroMsg.MMSightUtil", "getVideoThumb, %s not exist!!", new Object[] { paramString });
      GMTrace.o(7378485379072L, 54974);
      return null;
    }
    w.i("MicroMsg.MMSightUtil", "getVideoThumb, %s", new Object[] { paramString });
    for (;;)
    {
      try
      {
        Object localObject = new MediaMetadataRetriever();
        ((MediaMetadataRetriever)localObject).setDataSource(paramString);
        int j = bg.getInt(((MediaMetadataRetriever)localObject).extractMetadata(18), -1);
        int i = bg.getInt(((MediaMetadataRetriever)localObject).extractMetadata(19), -1);
        int k = SightVideoJNI.getMp4Rotate(paramString);
        w.i("MicroMsg.MMSightUtil", "getVideoThumb, width: %s, height: %s, rotate: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k) });
        Bitmap localBitmap = ((MediaMetadataRetriever)localObject).getFrameAtTime(0L, 2);
        ((MediaMetadataRetriever)localObject).release();
        if (localBitmap != null)
        {
          GMTrace.o(7378485379072L, 54974);
          return localBitmap;
        }
        w.i("MicroMsg.MMSightUtil", "use MediaMetadataRetriever failed, try ffmpeg");
        if ((j <= 0) || (i <= 0))
        {
          localObject = SightVideoJNI.getSimpleMp4Info(paramString);
          w.i("MicroMsg.MMSightUtil", "getSimpleMp4Info: %s", new Object[] { localObject });
          localObject = new JSONObject((String)localObject);
          j = ((JSONObject)localObject).getInt("videoWidth");
          i = ((JSONObject)localObject).getInt("videoHeight");
          paramString = MP4MuxerJNI.getVideoThumb(paramString, j, i);
          if (paramString == null)
          {
            w.e("MicroMsg.MMSightUtil", "getVideoThumb, error, can not get rgb byte!!");
            GMTrace.o(7378485379072L, 54974);
            return null;
          }
          paramString = ByteBuffer.wrap(paramString);
          localObject = Bitmap.createBitmap(j, i, Bitmap.Config.ARGB_8888);
          ((Bitmap)localObject).copyPixelsFromBuffer(paramString);
          paramString = (String)localObject;
          if (k > 0) {
            paramString = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject, k);
          }
          GMTrace.o(7378485379072L, 54974);
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.MMSightUtil", paramString, "get video thumb error! %s", new Object[] { paramString.getMessage() });
        GMTrace.o(7378485379072L, 54974);
        return null;
      }
    }
  }
  
  public static String nd(String paramString)
  {
    GMTrace.i(7377814290432L, 54969);
    paramString = e.fRZ + String.format("%s%d.%s", new Object[] { "wx_camera_", Long.valueOf(System.currentTimeMillis()), paramString });
    GMTrace.o(7377814290432L, 54969);
    return paramString;
  }
  
  public static boolean qE(int paramInt)
  {
    GMTrace.i(7378753814528L, 54976);
    if (paramInt % 16 == 0)
    {
      GMTrace.o(7378753814528L, 54976);
      return true;
    }
    GMTrace.o(7378753814528L, 54976);
    return false;
  }
  
  public static int qF(int paramInt)
  {
    GMTrace.i(16582600294400L, 123550);
    paramInt = cs(paramInt, Integer.MAX_VALUE);
    GMTrace.o(16582600294400L, 123550);
    return paramInt;
  }
  
  private static final class a
    implements Comparator<Camera.Size>
  {
    public a()
    {
      GMTrace.i(7491899359232L, 55819);
      GMTrace.o(7491899359232L, 55819);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
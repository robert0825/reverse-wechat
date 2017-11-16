package com.tencent.mm.plugin.gallery.model;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.MediaStore.Video.Thumbnails;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;

public final class j
{
  private static int giI;
  private static final int lBM;
  private static final int lBN;
  
  static
  {
    int j = 960;
    GMTrace.i(11907394174976L, 88717);
    giI = 0;
    int[] arrayOfInt = new int[2];
    Display localDisplay = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
    arrayOfInt[0] = localDisplay.getWidth();
    arrayOfInt[1] = localDisplay.getHeight();
    if (arrayOfInt[0] > 960) {}
    for (int i = arrayOfInt[0];; i = 960)
    {
      lBM = i;
      i = j;
      if (arrayOfInt[1] > 960) {
        i = arrayOfInt[1];
      }
      lBN = i;
      GMTrace.o(11907394174976L, 88717);
      return;
    }
  }
  
  public static Bitmap a(long paramLong, int paramInt, String paramString1, String paramString2)
  {
    Object localObject = null;
    GMTrace.i(11906588868608L, 88711);
    if (c.aCL() == null)
    {
      GMTrace.o(11906588868608L, 88711);
      return null;
    }
    switch (paramInt)
    {
    default: 
      paramString1 = (String)localObject;
    }
    for (;;)
    {
      GMTrace.o(11906588868608L, 88711);
      return paramString1;
      MMBitmapFactory.DecodeResultLogger localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
      Bitmap localBitmap = a(paramString1, paramString2, paramLong, 12288, localDecodeResultLogger);
      localObject = localBitmap;
      if (localBitmap == null)
      {
        w.e("MicroMsg.MediaManager", "get thumb from content resolver failed: [%s], [%s]", new Object[] { paramString1, paramString2 });
        localObject = localBitmap;
        if (localDecodeResultLogger.getDecodeResult() >= 2000)
        {
          paramString1 = MMBitmapFactory.KVStatHelper.getKVStatString(paramString2, 1, localDecodeResultLogger);
          g.ork.A(12712, paramString1);
          paramString1 = localBitmap;
          continue;
          localBitmap = l(paramLong, paramString2);
          localObject = localBitmap;
          if (localBitmap == null)
          {
            paramString1 = a(paramString1, paramString2, paramLong, 12288, null);
            continue;
          }
        }
      }
      paramString1 = (String)localObject;
    }
  }
  
  private static Bitmap a(String paramString1, String paramString2, long paramLong, int paramInt, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(11906857304064L, 88713);
    w.d("MicroMsg.MediaManager", "current thread %s", new Object[] { Thread.currentThread().getName() });
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.MediaManager", "filePath is null or nill");
      GMTrace.o(11906857304064L, 88713);
      return null;
    }
    paramLong = System.currentTimeMillis();
    paramDecodeResultLogger = d.a(paramString1, aDl(), aDl(), false, null, 0);
    int i;
    if (paramDecodeResultLogger == null)
    {
      paramInt = 0;
      if (paramDecodeResultLogger != null) {
        break label266;
      }
      i = 0;
      label87:
      w.v("MicroMsg.MediaManager", "getImageThumb[%s]FromThumbFilePath, bmp size[%d, %d]: total time:[%dms]", new Object[] { paramString1, Integer.valueOf(paramInt), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - paramLong) });
      if (paramDecodeResultLogger != null) {
        break label311;
      }
      w.w("MicroMsg.MediaManager", "get bitmap from thumb failed, try to get thumb from orig image:[%s]", new Object[] { paramString2 });
      if (bg.nm(paramString2)) {
        break label296;
      }
      paramLong = System.currentTimeMillis();
      paramDecodeResultLogger = d.a(paramString2, aDl(), aDl(), false, null, 0);
      if (paramDecodeResultLogger != null) {
        break label276;
      }
      paramInt = 0;
      label183:
      if (paramDecodeResultLogger != null) {
        break label286;
      }
      i = 0;
      label191:
      w.v("MicroMsg.MediaManager", "getImageThumb[%s]FromOrigFilePath[%s], bmp size[%d, %d]:total time:[%dms]", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - paramLong) });
    }
    label266:
    label276:
    label286:
    label296:
    label311:
    for (paramString1 = paramDecodeResultLogger;; paramString1 = paramDecodeResultLogger)
    {
      paramString1 = n(paramString2, paramString1);
      GMTrace.o(11906857304064L, 88713);
      return paramString1;
      paramInt = paramDecodeResultLogger.getWidth();
      break;
      i = paramDecodeResultLogger.getHeight();
      break label87;
      paramInt = paramDecodeResultLogger.getWidth();
      break label183;
      i = paramDecodeResultLogger.getHeight();
      break label191;
      w.e("MicroMsg.MediaManager", "get bit from orig image faield:[%s]", new Object[] { paramString2 });
    }
  }
  
  private static int aDl()
  {
    GMTrace.i(11906723086336L, 88712);
    if (giI > 0)
    {
      i = giI;
      GMTrace.o(11906723086336L, 88712);
      return i;
    }
    int i = BackwardSupportUtil.b.a(ab.getContext(), 150.0F);
    giI = i;
    GMTrace.o(11906723086336L, 88712);
    return i;
  }
  
  @TargetApi(8)
  private static Bitmap l(long paramLong, String paramString)
  {
    GMTrace.i(11907259957248L, 88716);
    try
    {
      Bitmap localBitmap1 = MediaStore.Video.Thumbnails.getThumbnail(ab.getContext().getContentResolver(), paramLong, 1, null);
      Bitmap localBitmap2 = localBitmap1;
      if (localBitmap1 == null)
      {
        w.e("MicroMsg.MediaManager", "get vedio thumb failed : [%d], call media scanner : [%s]", new Object[] { Long.valueOf(paramLong), paramString });
        if (Build.VERSION.SDK_INT >= 8) {
          localBitmap1 = ThumbnailUtils.createVideoThumbnail(paramString, 1);
        }
        localBitmap2 = localBitmap1;
        if (localBitmap1 == null)
        {
          localBitmap2 = localBitmap1;
          if (!bg.nm(paramString))
          {
            w.e("MicroMsg.MediaManager", "get vedio thumb failed : [%d], call media scanner : [%s]", new Object[] { Long.valueOf(paramLong), paramString });
            ab.getContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + paramString)));
            localBitmap2 = localBitmap1;
          }
        }
      }
      GMTrace.o(11907259957248L, 88716);
      return localBitmap2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MediaManager", "exception: %s", new Object[] { bg.f(localException) });
        Object localObject = null;
      }
    }
  }
  
  private static Bitmap n(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(11906991521792L, 88714);
    if (paramBitmap != null)
    {
      long l = System.currentTimeMillis();
      int i = BackwardSupportUtil.ExifHelper.Rz(paramString);
      paramString = d.b(paramBitmap, i);
      w.d("MicroMsg.MediaManager", "do rotate finish, width[%d] height[%d] rotate[%d] use[%dms]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      if (paramString != null)
      {
        GMTrace.o(11906991521792L, 88714);
        return paramString;
      }
    }
    GMTrace.o(11906991521792L, 88714);
    return null;
  }
  
  public static Bitmap zg(String paramString)
  {
    int k = 1;
    GMTrace.i(11907125739520L, 88715);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.MediaManager", "filepath is null or nil");
      GMTrace.o(11907125739520L, 88715);
      return null;
    }
    for (;;)
    {
      int m;
      int j;
      int i;
      try
      {
        if (!e.aZ(paramString))
        {
          w.e("MicroMsg.MediaManager", "getSuitableBmp fail, file does not exist, filePath = " + paramString);
          GMTrace.o(11907125739520L, 88715);
          return null;
        }
        m = lBM;
        j = lBN;
        Object localObject = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
        Bitmap localBitmap = MMBitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject, null, 0, new int[0]);
        if (localBitmap != null) {
          localBitmap.recycle();
        }
        if ((((BitmapFactory.Options)localObject).outWidth <= 0) || (((BitmapFactory.Options)localObject).outHeight <= 0))
        {
          w.d("MicroMsg.MediaManager", "get bitmap fail, file is not a image file = " + paramString);
          GMTrace.o(11907125739520L, 88715);
          return null;
        }
        if ((d.bh(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) && (((BitmapFactory.Options)localObject).outWidth > 480))
        {
          i = 1;
          if ((d.bg(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) && (((BitmapFactory.Options)localObject).outHeight > 480))
          {
            break label468;
            j = ((BitmapFactory.Options)localObject).outHeight;
            i = ((BitmapFactory.Options)localObject).outWidth;
            m = BackwardSupportUtil.ExifHelper.Rz(paramString);
            if (m == 90) {
              break label483;
            }
            if (m != 270) {
              break label465;
            }
            break label483;
            localObject = new MMBitmapFactory.DecodeResultLogger();
            localBitmap = d.a(paramString, j, i, false, (MMBitmapFactory.DecodeResultLogger)localObject, 0);
            if (localBitmap != null) {
              continue;
            }
            w.e("MicroMsg.MediaManager", "getSuitableBmp fail, temBmp is null, filePath = " + paramString);
            if (((MMBitmapFactory.DecodeResultLogger)localObject).getDecodeResult() >= 2000)
            {
              paramString = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 1, (MMBitmapFactory.DecodeResultLogger)localObject);
              g.ork.A(12712, paramString);
            }
            GMTrace.o(11907125739520L, 88715);
            return null;
          }
        }
        else
        {
          i = 0;
          continue;
        }
        k = 0;
        break label468;
        float f = m;
        paramString = d.b(localBitmap, f);
        w.i("MicroMsg.MediaManager", "bmp height = " + paramString.getHeight() + ",bmp width = " + paramString.getWidth());
        GMTrace.o(11907125739520L, 88715);
        return paramString;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.MediaManager", "decode bitmap err: " + paramString.getMessage());
        GMTrace.o(11907125739520L, 88715);
        return null;
      }
      label465:
      continue;
      label468:
      if (i == 0)
      {
        i = m;
        if (k != 0)
        {
          continue;
          label483:
          k = j;
          j = i;
          i = k;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
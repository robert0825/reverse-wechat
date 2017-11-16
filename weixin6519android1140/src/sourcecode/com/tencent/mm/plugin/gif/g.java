package com.tencent.mm.plugin.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  public static Bitmap av(byte[] paramArrayOfByte)
  {
    GMTrace.i(20135746207744L, 150023);
    if (bg.bq(paramArrayOfByte))
    {
      GMTrace.o(20135746207744L, 150023);
      return null;
    }
    int[] arrayOfInt2 = new int[4];
    int[] arrayOfInt1 = new int[4];
    long l = MMWXGFJNI.nativeInitWxAMDecoder();
    if (l == 0L) {
      w.w("MicroMsg.GIF.MMWXGFUtil", "Cpan init wxam decoder failed.");
    }
    int i = MMWXGFJNI.nativeDecodeBufferHeader(l, paramArrayOfByte, paramArrayOfByte.length);
    if (i != 0) {
      w.w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF decode buffer header failed. result:%d", new Object[] { Integer.valueOf(i) });
    }
    i = MMWXGFJNI.nativeGetOption(l, paramArrayOfByte, paramArrayOfByte.length, arrayOfInt2);
    if (i != 0) {
      w.w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF get option failed. result:%d", new Object[] { Integer.valueOf(i) });
    }
    paramArrayOfByte = Bitmap.createBitmap(arrayOfInt2[1], arrayOfInt2[2], Bitmap.Config.ARGB_8888);
    MMWXGFJNI.nativeDecodeBufferFrame(l, null, 0, paramArrayOfByte, arrayOfInt1);
    MMWXGFJNI.nativeUninit(l);
    GMTrace.o(20135746207744L, 150023);
    return paramArrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\gif\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
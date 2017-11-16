package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;

public final class n
{
  public static int a(Bitmap paramBitmap, int paramInt, String paramString)
  {
    GMTrace.i(13742553169920L, 102390);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(13742553169920L, 102390);
      return -1;
    }
    paramInt = MMJpegOptim.compressByQualityOptim(paramBitmap, paramInt, false, paramString);
    GMTrace.o(13742553169920L, 102390);
    return paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
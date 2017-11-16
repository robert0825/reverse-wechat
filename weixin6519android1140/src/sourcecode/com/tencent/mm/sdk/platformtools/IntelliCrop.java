package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;

class IntelliCrop
{
  IntelliCrop()
  {
    GMTrace.i(13767786102784L, 102578);
    GMTrace.o(13767786102784L, 102578);
  }
  
  public static native int crop(Bitmap paramBitmap, int[] paramArrayOfInt);
  
  public static native void release();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\sdk\platformtools\IntelliCrop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
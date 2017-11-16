package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;

public final class MMNativeWebP
{
  public MMNativeWebP()
  {
    GMTrace.i(13769262497792L, 102589);
    GMTrace.o(13769262497792L, 102589);
  }
  
  public static native Bitmap nativeDecodeByteArray(byte[] paramArrayOfByte, BitmapFactory.Options paramOptions);
  
  public static native byte[] nativeEncodeBitmap(Bitmap paramBitmap, int paramInt);
  
  public static native boolean nativeIsWebPImage(byte[] paramArrayOfByte);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\sdk\platformtools\MMNativeWebP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
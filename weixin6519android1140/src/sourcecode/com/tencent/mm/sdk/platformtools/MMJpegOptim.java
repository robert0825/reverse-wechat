package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;

public class MMJpegOptim
{
  MMJpegOptim()
  {
    GMTrace.i(13741479428096L, 102382);
    GMTrace.o(13741479428096L, 102382);
  }
  
  public static native boolean checkIntegrity(String paramString);
  
  public static native int compressByQuality(Bitmap paramBitmap, int paramInt, boolean paramBoolean, String paramString);
  
  public static native int compressByQualityOptim(Bitmap paramBitmap, int paramInt, boolean paramBoolean, String paramString);
  
  public static native int convertToProgressive(String paramString1, String paramString2, int paramInt);
  
  public static native int decodeToBitmap(String paramString, Bitmap paramBitmap, int paramInt);
  
  public static native int isProgressiveFile(String paramString);
  
  public static native int queryQuality(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\MMJpegOptim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
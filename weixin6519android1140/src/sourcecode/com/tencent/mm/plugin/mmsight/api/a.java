package com.tencent.mm.plugin.mmsight.api;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;

public abstract class a
{
  public static a mXb;
  
  static
  {
    GMTrace.i(20204331466752L, 150534);
    mXb = null;
    GMTrace.o(20204331466752L, 150534);
  }
  
  public a()
  {
    GMTrace.i(20203794595840L, 150530);
    GMTrace.o(20203794595840L, 150530);
  }
  
  public abstract void A(Bitmap paramBitmap);
  
  public abstract int aOO();
  
  public abstract int getType();
  
  public static abstract interface a
  {
    public abstract a a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
    
    public abstract a a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2);
    
    public abstract a a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract a a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\api\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
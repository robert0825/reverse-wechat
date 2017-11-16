package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;

public final class f
  extends Canvas
{
  public Bitmap mBitmap;
  
  public f()
  {
    GMTrace.i(17705868460032L, 131919);
    GMTrace.o(17705868460032L, 131919);
  }
  
  public f(Bitmap paramBitmap)
  {
    super(paramBitmap);
    GMTrace.i(17706002677760L, 131920);
    this.mBitmap = paramBitmap;
    GMTrace.o(17706002677760L, 131920);
  }
  
  public final void setBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(17706136895488L, 131921);
    super.setBitmap(paramBitmap);
    this.mBitmap = paramBitmap;
    GMTrace.o(17706136895488L, 131921);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.svg;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.b.b;

public class WeChatSVG
{
  static
  {
    GMTrace.i(3479057727488L, 25921);
    if (b.bVx())
    {
      System.loadLibrary("wechatsvg");
      nativeInit();
    }
    GMTrace.o(3479057727488L, 25921);
  }
  
  public WeChatSVG()
  {
    GMTrace.i(3478118203392L, 25914);
    GMTrace.o(3478118203392L, 25914);
  }
  
  public static native float[] getViewPort(long paramLong);
  
  private static native void nativeInit();
  
  public static native long parse(String paramString);
  
  public static native void release(long paramLong);
  
  public static native int render(long paramLong, Canvas paramCanvas);
  
  public static native int renderViewPort(long paramLong, Canvas paramCanvas, float paramFloat1, float paramFloat2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\svg\WeChatSVG.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
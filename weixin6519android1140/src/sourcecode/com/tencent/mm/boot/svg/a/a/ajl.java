package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ajl
  extends c
{
  private final int height;
  private final int width;
  
  public ajl()
  {
    GMTrace.i(15774206918656L, 117527);
    this.width = 46;
    this.height = 46;
    GMTrace.o(15774206918656L, 117527);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15774341136384L, 117528);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15774341136384L, 117528);
      return 0;
      GMTrace.o(15774341136384L, 117528);
      return 46;
      GMTrace.o(15774341136384L, 117528);
      return 46;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-6710887);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(23.0F, 0.0F);
      localPath.cubicTo(35.70255F, 0.0F, 46.0F, 10.29745F, 46.0F, 23.0F);
      localPath.cubicTo(46.0F, 35.70255F, 35.70255F, 46.0F, 23.0F, 46.0F);
      localPath.cubicTo(10.29745F, 46.0F, 0.0F, 35.70255F, 0.0F, 23.0F);
      localPath.cubicTo(0.0F, 10.29745F, 10.29745F, 0.0F, 23.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(29.837742F, 16.978155F);
      ((Path)localObject).cubicTo(29.663364F, 15.734242F, 29.332104F, 14.538659F, 28.424576F, 13.573514F);
      ((Path)localObject).cubicTo(25.837162F, 10.148845F, 20.172827F, 10.138831F, 17.585415F, 13.5635F);
      ((Path)localObject).cubicTo(15.967033F, 15.315889F, 16.176823F, 17.799276F, 15.827173F, 19.982252F);
      ((Path)localObject).lineTo(13.0F, 19.982252F);
      ((Path)localObject).cubicTo(13.00999F, 24.328176F, 13.00999F, 28.66409F, 13.00999F, 33.0F);
      ((Path)localObject).lineTo(32.99001F, 33.0F);
      ((Path)localObject).cubicTo(32.99001F, 28.66409F, 32.99001F, 24.328176F, 33.0F, 19.982252F);
      ((Path)localObject).lineTo(31.586414F, 19.982252F);
      ((Path)localObject).lineTo(26.086912F, 19.982252F);
      ((Path)localObject).lineTo(18.824175F, 19.982252F);
      ((Path)localObject).cubicTo(18.804195F, 17.358675F, 19.713287F, 13.873924F, 22.99001F, 13.97406F);
      ((Path)localObject).cubicTo(25.067957F, 13.891255F, 26.212177F, 15.279206F, 26.759495F, 16.978155F);
      ((Path)localObject).lineTo(29.837742F, 16.978155F);
      ((Path)localObject).lineTo(29.837742F, 16.978155F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ajl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
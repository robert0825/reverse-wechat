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

public final class fo
  extends c
{
  private final int height;
  private final int width;
  
  public fo()
  {
    GMTrace.i(15837826121728L, 118001);
    this.width = 46;
    this.height = 51;
    GMTrace.o(15837826121728L, 118001);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15837960339456L, 118002);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15837960339456L, 118002);
      return 0;
      GMTrace.o(15837960339456L, 118002);
      return 46;
      GMTrace.o(15837960339456L, 118002);
      return 51;
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-3881788);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(24.0F, 3.0F);
      ((Path)localObject).cubicTo(24.89F, 0.3245459F, 29.14F, 0.33455303F, 30.0F, 3.0F);
      ((Path)localObject).cubicTo(30.22F, 5.9885883F, 29.98F, 8.990731F, 30.0F, 12.0F);
      ((Path)localObject).cubicTo(30.48F, 11.972859F, 31.48F, 11.972859F, 32.0F, 12.0F);
      ((Path)localObject).cubicTo(31.99F, 9.981439F, 31.82F, 7.9700027F, 32.0F, 6.0F);
      ((Path)localObject).cubicTo(32.82F, 3.63691F, 36.41F, 3.2466314F, 38.0F, 5.0F);
      ((Path)localObject).cubicTo(38.37F, 7.48966F, 37.93F, 9.80131F, 38.0F, 12.0F);
      ((Path)localObject).cubicTo(40.68F, 11.972859F, 43.34F, 11.972859F, 46.0F, 12.0F);
      ((Path)localObject).lineTo(46.0F, 39.0F);
      ((Path)localObject).cubicTo(43.6F, 38.982136F, 41.2F, 38.99214F, 39.0F, 39.0F);
      ((Path)localObject).cubicTo(37.14F, 44.706223F, 32.34F, 49.389565F, 26.0F, 50.0F);
      ((Path)localObject).lineTo(21.0F, 50.0F);
      ((Path)localObject).cubicTo(14.81F, 49.539673F, 9.88F, 44.786278F, 8.0F, 39.0F);
      ((Path)localObject).cubicTo(5.46F, 38.99214F, 2.73F, 38.99214F, 0.0F, 39.0F);
      ((Path)localObject).lineTo(0.0F, 12.0F);
      ((Path)localObject).cubicTo(2.63F, 11.972859F, 5.25F, 11.972859F, 8.0F, 12.0F);
      ((Path)localObject).cubicTo(7.87F, 9.691231F, 7.81F, 5.8584957F, 11.0F, 6.0F);
      ((Path)localObject).cubicTo(14.22F, 5.968574F, 14.09F, 9.731259F, 14.0F, 12.0F);
      ((Path)localObject).cubicTo(14.6F, 11.972859F, 15.54F, 11.972859F, 16.0F, 12.0F);
      ((Path)localObject).cubicTo(16.0F, 9.320967F, 15.79F, 6.639053F, 16.0F, 4.0F);
      ((Path)localObject).cubicTo(16.88F, 1.3352673F, 21.13F, 1.3352673F, 22.0F, 4.0F);
      ((Path)localObject).cubicTo(22.21F, 6.64906F, 22.0F, 9.320967F, 22.0F, 12.0F);
      ((Path)localObject).cubicTo(22.5F, 11.972859F, 23.51F, 11.972859F, 24.0F, 12.0F);
      ((Path)localObject).cubicTo(24.02F, 8.980724F, 23.77F, 5.968574F, 24.0F, 3.0F);
      ((Path)localObject).lineTo(24.0F, 3.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(5.0F, 34.0F);
      ((Path)localObject).cubicTo(12.38F, 33.93302F, 19.77F, 34.072884F, 27.0F, 34.0F);
      ((Path)localObject).cubicTo(33.0F, 34.0F, 32.56548F, 25.699202F, 32.99548F, 22.046875F);
      ((Path)localObject).cubicTo(33.340767F, 19.0F, 36.95F, 18.938057F, 39.0F, 19.0F);
      ((Path)localObject).cubicTo(39.01F, 23.75323F, 39.0F, 28.868101F, 39.0F, 34.0F);
      ((Path)localObject).cubicTo(39.75F, 33.98297F, 41.25F, 33.98297F, 42.0F, 34.0F);
      ((Path)localObject).lineTo(42.0F, 17.0F);
      ((Path)localObject).lineTo(5.0F, 17.0F);
      ((Path)localObject).lineTo(5.0F, 34.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\fo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
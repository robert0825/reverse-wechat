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

public final class hm
  extends c
{
  private final int height;
  private final int width;
  
  public hm()
  {
    GMTrace.i(15902519066624L, 118483);
    this.width = 144;
    this.height = 144;
    GMTrace.o(15902519066624L, 118483);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15902653284352L, 118484);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15902653284352L, 118484);
      return 0;
      GMTrace.o(15902653284352L, 118484);
      return 144;
      GMTrace.o(15902653284352L, 118484);
      return 144;
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-9276814);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(32.316944F, 114.45962F);
      ((Path)localObject).cubicTo(17.49707F, 103.41242F, 8.0F, 86.3897F, 8.0F, 67.29348F);
      ((Path)localObject).cubicTo(8.0F, 33.99431F, 36.877632F, 7.0F, 72.5F, 7.0F);
      ((Path)localObject).cubicTo(108.12237F, 7.0F, 137.0F, 33.99431F, 137.0F, 67.29348F);
      ((Path)localObject).cubicTo(137.0F, 100.59264F, 108.12237F, 127.58696F, 72.5F, 127.58696F);
      ((Path)localObject).cubicTo(66.06798F, 127.58696F, 59.85585F, 126.70688F, 53.993908F, 125.06851F);
      ((Path)localObject).lineTo(32.316944F, 136.89055F);
      ((Path)localObject).lineTo(32.316944F, 114.45962F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(30.467037F, 88.38713F);
      ((Path)localObject).lineTo(66.017456F, 50.875744F);
      ((Path)localObject).lineTo(82.72663F, 68.6543F);
      ((Path)localObject).lineTo(114.75198F, 50.19022F);
      ((Path)localObject).lineTo(79.51087F, 88.32609F);
      ((Path)localObject).lineTo(63.189262F, 70.64465F);
      ((Path)localObject).lineTo(30.467037F, 88.38713F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\hm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
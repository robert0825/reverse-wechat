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

public final class amv
  extends c
{
  private final int height;
  private final int width;
  
  public amv()
  {
    GMTrace.i(20323919462400L, 151425);
    this.width = 102;
    this.height = 102;
    GMTrace.o(20323919462400L, 151425);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20324053680128L, 151426);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20324053680128L, 151426);
      return 0;
      GMTrace.o(20324053680128L, 151426);
      return 102;
      GMTrace.o(20324053680128L, 151426);
      return 102;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      Object localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setColor(-986896);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(102.0F, 0.0F);
      localPath.lineTo(102.0F, 102.0F);
      localPath.lineTo(0.0F, 102.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath(localPath, c.a((Paint)localObject2, paramVarArgs));
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setColor(-11048043);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(24.0F, 50.0F);
      ((Path)localObject2).cubicTo(24.0F, 48.89543F, 24.89543F, 48.0F, 26.0F, 48.0F);
      ((Path)localObject2).lineTo(76.0F, 48.0F);
      ((Path)localObject2).cubicTo(77.10457F, 48.0F, 78.0F, 48.89543F, 78.0F, 50.0F);
      ((Path)localObject2).lineTo(78.0F, 79.0F);
      ((Path)localObject2).cubicTo(78.0F, 80.10457F, 77.10457F, 81.0F, 76.0F, 81.0F);
      ((Path)localObject2).lineTo(26.0F, 81.0F);
      ((Path)localObject2).cubicTo(24.89543F, 81.0F, 24.0F, 80.10457F, 24.0F, 79.0F);
      ((Path)localObject2).lineTo(24.0F, 50.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject1).setColor(-11048043);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(28.5F, 35.0F);
      ((Path)localObject2).cubicTo(28.5F, 22.573593F, 38.573593F, 12.5F, 51.0F, 12.5F);
      ((Path)localObject2).cubicTo(63.426407F, 12.5F, 73.5F, 22.573593F, 73.5F, 35.0F);
      ((Path)localObject2).lineTo(67.5F, 35.0F);
      ((Path)localObject2).cubicTo(67.5F, 25.887302F, 60.112698F, 18.5F, 51.0F, 18.5F);
      ((Path)localObject2).cubicTo(41.887302F, 18.5F, 34.5F, 25.887302F, 34.5F, 35.0F);
      ((Path)localObject2).lineTo(28.5F, 35.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject1).setColor(-11048043);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(28.5F, 35.0F);
      ((Path)localObject2).lineTo(34.5F, 35.0F);
      ((Path)localObject2).lineTo(34.5F, 47.0F);
      ((Path)localObject2).lineTo(28.5F, 47.0F);
      ((Path)localObject2).lineTo(28.5F, 35.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-11048043);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(67.5F, 35.0F);
      ((Path)localObject1).lineTo(73.5F, 35.0F);
      ((Path)localObject1).lineTo(73.5F, 35.0F);
      ((Path)localObject1).lineTo(73.5F, 35.0F);
      ((Path)localObject1).cubicTo(73.5F, 36.656853F, 72.15685F, 38.0F, 70.5F, 38.0F);
      ((Path)localObject1).lineTo(70.5F, 38.0F);
      ((Path)localObject1).lineTo(70.5F, 38.0F);
      ((Path)localObject1).cubicTo(68.84315F, 38.0F, 67.5F, 36.656853F, 67.5F, 35.0F);
      ((Path)localObject1).lineTo(67.5F, 35.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\amv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
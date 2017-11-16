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

public final class dr
  extends c
{
  private final int height;
  private final int width;
  
  public dr()
  {
    GMTrace.i(21022254301184L, 156628);
    this.width = 80;
    this.height = 70;
    GMTrace.o(21022254301184L, 156628);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21022388518912L, 156629);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21022388518912L, 156629);
      return 0;
      GMTrace.o(21022388518912L, 156629);
      return 80;
      GMTrace.o(21022388518912L, 156629);
      return 70;
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
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-983041);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(39.999F, 66.129F);
      ((Path)localObject).cubicTo(35.436F, 66.129F, 31.029F, 65.48F, 26.945F, 64.315F);
      ((Path)localObject).cubicTo(26.573F, 64.203F, 26.178F, 64.142F, 25.769F, 64.142F);
      ((Path)localObject).cubicTo(25.001F, 64.142F, 24.304F, 64.373F, 23.645F, 64.751F);
      ((Path)localObject).lineTo(14.89F, 69.766F);
      ((Path)localObject).cubicTo(14.646F, 69.905F, 14.409F, 70.012F, 14.12F, 70.012F);
      ((Path)localObject).cubicTo(13.384F, 70.012F, 12.787F, 69.42F, 12.787F, 68.69F);
      ((Path)localObject).cubicTo(12.787F, 68.362F, 12.918F, 68.036F, 13.002F, 67.722F);
      ((Path)localObject).cubicTo(13.052F, 67.536F, 14.13F, 63.545F, 14.804F, 61.054F);
      ((Path)localObject).cubicTo(14.88F, 60.774F, 14.944F, 60.503F, 14.944F, 60.211F);
      ((Path)localObject).cubicTo(14.944F, 59.322F, 14.502F, 58.536F, 13.824F, 58.056F);
      ((Path)localObject).cubicTo(5.393F, 51.995F, 0.006F, 43.027F, 0.006F, 33.065F);
      ((Path)localObject).cubicTo(0.006F, 30.372F, 0.398F, 27.756F, 1.133F, 25.25F);
      ((Path)localObject).cubicTo(7.438F, 18.998F, 16.145F, 15.132F, 25.763F, 15.132F);
      ((Path)localObject).cubicTo(37.198F, 15.132F, 47.347F, 20.597F, 53.699F, 29.038F);
      ((Path)localObject).lineTo(60.783F, 22.011F);
      ((Path)localObject).cubicTo(52.578F, 11.811F, 39.94F, 5.274F, 25.763F, 5.274F);
      ((Path)localObject).cubicTo(22.662F, 5.274F, 19.635F, 5.586F, 16.712F, 6.182F);
      ((Path)localObject).cubicTo(23.271F, 2.291F, 31.311F, 0.0F, 39.999F, 0.0F);
      ((Path)localObject).cubicTo(62.086F, 0.0F, 79.992F, 14.804F, 79.992F, 33.065F);
      ((Path)localObject).cubicTo(79.992F, 51.325F, 62.086F, 66.129F, 39.999F, 66.129F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(25.763F, 54.693F);
      ((Path)localObject).cubicTo(28.542F, 54.693F, 30.795F, 52.458F, 30.795F, 49.7F);
      ((Path)localObject).cubicTo(30.795F, 46.943F, 28.542F, 44.708F, 25.763F, 44.708F);
      ((Path)localObject).cubicTo(22.984F, 44.708F, 20.73F, 46.943F, 20.73F, 49.7F);
      ((Path)localObject).cubicTo(20.73F, 52.458F, 22.984F, 54.693F, 25.763F, 54.693F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(25.763F, 24.991F);
      ((Path)localObject).cubicTo(17.069F, 24.991F, 9.416F, 29.41F, 4.961F, 36.108F);
      ((Path)localObject).lineTo(12.238F, 43.327F);
      ((Path)localObject).cubicTo(14.642F, 38.314F, 19.795F, 34.849F, 25.763F, 34.849F);
      ((Path)localObject).cubicTo(31.733F, 34.849F, 36.888F, 38.317F, 39.29F, 43.334F);
      ((Path)localObject).lineTo(46.569F, 36.113F);
      ((Path)localObject).cubicTo(42.114F, 29.412F, 34.459F, 24.991F, 25.763F, 24.991F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
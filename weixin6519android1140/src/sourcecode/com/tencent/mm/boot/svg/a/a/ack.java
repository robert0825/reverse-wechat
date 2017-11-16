package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ack
  extends c
{
  private final int height;
  private final int width;
  
  public ack()
  {
    GMTrace.i(15886949810176L, 118367);
    this.width = 168;
    this.height = 168;
    GMTrace.o(15886949810176L, 118367);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15887084027904L, 118368);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15887084027904L, 118368);
      return 0;
      GMTrace.o(15887084027904L, 118368);
      return 168;
      GMTrace.o(15887084027904L, 118368);
      return 168;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-8617594);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 31.0F, 0.0F, 1.0F, 50.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(53.458427F, 68.67285F);
      ((Path)localObject3).cubicTo(83.84122F, 68.67285F, 105.827965F, 35.957947F, 105.827965F, 35.957947F);
      ((Path)localObject3).cubicTo(106.46974F, 35.062405F, 106.47585F, 33.603374F, 105.81945F, 32.703407F);
      ((Path)localObject3).cubicTo(105.81945F, 32.703407F, 83.84122F, 2.4963452E-15F, 53.458427F, 0.0F);
      ((Path)localObject3).cubicTo(23.075638F, -2.4963452E-15F, 1.0888885F, 32.714905F, 1.0888885F, 32.714905F);
      ((Path)localObject3).cubicTo(0.4471118F, 33.610447F, 0.44100174F, 35.069477F, 1.0974094F, 35.969444F);
      ((Path)localObject3).cubicTo(1.0974094F, 35.969444F, 23.075642F, 68.67285F, 53.458427F, 68.67285F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(53.458427F, 54.626133F);
      ((Path)localObject3).cubicTo(64.858315F, 54.626133F, 74.09975F, 45.54212F, 74.09975F, 34.336426F);
      ((Path)localObject3).cubicTo(74.09975F, 23.13073F, 64.858315F, 14.04672F, 53.458427F, 14.04672F);
      ((Path)localObject3).cubicTo(42.058544F, 14.04672F, 32.817112F, 23.13073F, 32.817112F, 34.336426F);
      ((Path)localObject3).cubicTo(32.817112F, 45.54212F, 42.058544F, 54.626133F, 53.458427F, 54.626133F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(41.175587F, 25.24117F);
      ((Path)localObject2).cubicTo(39.181583F, 27.849945F, 38.0F, 31.093002F, 38.0F, 34.607468F);
      ((Path)localObject2).cubicTo(38.0F, 43.22759F, 45.10843F, 50.21493F, 53.877937F, 50.21493F);
      ((Path)localObject2).cubicTo(62.64744F, 50.21493F, 69.755875F, 43.22759F, 69.755875F, 34.607468F);
      ((Path)localObject2).cubicTo(69.755875F, 25.987343F, 62.64744F, 19.0F, 53.877937F, 19.0F);
      ((Path)localObject2).cubicTo(51.33193F, 19.0F, 48.92593F, 19.588953F, 46.793247F, 20.635828F);
      ((Path)localObject2).cubicTo(49.016388F, 21.031485F, 50.702347F, 22.943605F, 50.702347F, 25.242987F);
      ((Path)localObject2).cubicTo(50.702347F, 27.829023F, 48.56982F, 29.925226F, 45.93897F, 29.925226F);
      ((Path)localObject2).cubicTo(43.308117F, 29.925226F, 41.175587F, 27.829023F, 41.175587F, 25.242987F);
      ((Path)localObject2).cubicTo(41.175587F, 25.24238F, 41.175587F, 25.241776F, 41.175587F, 25.24117F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
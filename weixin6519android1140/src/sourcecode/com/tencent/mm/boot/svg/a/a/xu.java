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

public final class xu
  extends c
{
  private final int height;
  private final int width;
  
  public xu()
  {
    GMTrace.i(17803578966016L, 132647);
    this.width = 108;
    this.height = 108;
    GMTrace.o(17803578966016L, 132647);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17803713183744L, 132648);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17803713183744L, 132648);
      return 0;
      GMTrace.o(17803713183744L, 132648);
      return 108;
      GMTrace.o(17803713183744L, 132648);
      return 108;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-15683841);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, -1.0F, 0.0F, 90.0F, 0.0F, 1.0F, 21.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(11.396121F, 32.09012F);
      ((Path)localObject2).cubicTo(10.260603F, 31.398438F, 8.926831F, 31.0F, 7.5F, 31.0F);
      ((Path)localObject2).cubicTo(3.3578644F, 31.0F, 0.0F, 34.357864F, 0.0F, 38.5F);
      ((Path)localObject2).cubicTo(0.0F, 42.642136F, 3.3578644F, 46.0F, 7.5F, 46.0F);
      ((Path)localObject2).cubicTo(8.929695F, 46.0F, 10.265957F, 45.59996F, 11.402957F, 44.905712F);
      ((Path)localObject2).lineTo(11.401377F, 44.90862F);
      ((Path)localObject2).cubicTo(11.805888F, 44.684177F, 12.121924F, 44.571957F, 12.349486F, 44.571957F);
      ((Path)localObject2).cubicTo(12.684298F, 44.571957F, 12.890045F, 44.695858F, 13.0F, 44.99306F);
      ((Path)localObject2).lineTo(13.0F, 58.0F);
      ((Path)localObject2).cubicTo(13.0F, 61.31371F, 15.686292F, 64.0F, 19.0F, 64.0F);
      ((Path)localObject2).lineTo(58.0F, 64.0F);
      ((Path)localObject2).cubicTo(61.31371F, 64.0F, 64.0F, 61.31371F, 64.0F, 58.0F);
      ((Path)localObject2).lineTo(64.0F, 43.599068F);
      ((Path)localObject2).cubicTo(63.99934F, 43.599777F, 63.998684F, 43.60049F, 63.998024F, 43.6012F);
      ((Path)localObject2).cubicTo(63.997887F, 44.011288F, 63.997795F, 44.488285F, 63.997757F, 45.032185F);
      ((Path)localObject2).cubicTo(63.889458F, 44.72227F, 63.682262F, 44.593487F, 63.34092F, 44.593487F);
      ((Path)localObject2).cubicTo(63.124115F, 44.593487F, 62.815083F, 44.695347F, 62.41382F, 44.899067F);
      ((Path)localObject2).cubicTo(61.27447F, 45.59741F, 59.93425F, 46.0F, 58.5F, 46.0F);
      ((Path)localObject2).cubicTo(54.357864F, 46.0F, 51.0F, 42.642136F, 51.0F, 38.5F);
      ((Path)localObject2).cubicTo(51.0F, 34.357864F, 54.357864F, 31.0F, 58.5F, 31.0F);
      ((Path)localObject2).cubicTo(59.902565F, 31.0F, 61.215206F, 31.384998F, 62.338013F, 32.05508F);
      ((Path)localObject2).lineTo(62.336735F, 32.05282F);
      ((Path)localObject2).cubicTo(62.780434F, 32.27726F, 63.116066F, 32.38948F, 63.343628F, 32.38948F);
      ((Path)localObject2).cubicTo(63.68448F, 32.38948F, 63.89157F, 32.261066F, 64.0F, 31.952118F);
      ((Path)localObject2).lineTo(64.0F, 19.0F);
      ((Path)localObject2).cubicTo(64.0F, 15.686292F, 61.31371F, 13.0F, 58.0F, 13.0F);
      ((Path)localObject2).lineTo(44.985634F, 13.0F);
      ((Path)localObject2).cubicTo(44.683487F, 12.890678F, 44.557682F, 12.684352F, 44.557682F, 12.346982F);
      ((Path)localObject2).cubicTo(44.557682F, 12.121241F, 44.668118F, 11.815655F, 44.88898F, 11.430226F);
      ((Path)localObject2).cubicTo(45.593533F, 10.287346F, 46.0F, 8.941141F, 46.0F, 7.5F);
      ((Path)localObject2).cubicTo(46.0F, 3.3578644F, 42.642136F, 0.0F, 38.5F, 0.0F);
      ((Path)localObject2).cubicTo(34.357864F, 0.0F, 31.0F, 3.3578644F, 31.0F, 7.5F);
      ((Path)localObject2).cubicTo(31.0F, 8.92941F, 31.399878F, 10.265423F, 32.093872F, 11.402275F);
      ((Path)localObject2).lineTo(32.08055F, 11.395013F);
      ((Path)localObject2).cubicTo(32.304993F, 11.802097F, 32.417213F, 12.11942F, 32.417213F, 12.346982F);
      ((Path)localObject2).cubicTo(32.417213F, 12.684352F, 32.29141F, 12.890678F, 31.989262F, 13.0F);
      ((Path)localObject2).lineTo(19.0F, 13.0F);
      ((Path)localObject2).cubicTo(15.686292F, 13.0F, 13.0F, 15.686292F, 13.0F, 19.0F);
      ((Path)localObject2).lineTo(13.0F, 31.97362F);
      ((Path)localObject2).cubicTo(12.89148F, 32.281895F, 12.684464F, 32.41005F, 12.343956F, 32.41005F);
      ((Path)localObject2).cubicTo(12.122121F, 32.41005F, 11.806176F, 32.303406F, 11.396121F, 32.09012F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\xu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
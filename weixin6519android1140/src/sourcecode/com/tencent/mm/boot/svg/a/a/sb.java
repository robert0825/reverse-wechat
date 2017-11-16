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

public final class sb
  extends c
{
  private final int height;
  private final int width;
  
  public sb()
  {
    GMTrace.i(21025475526656L, 156652);
    this.width = 63;
    this.height = 75;
    GMTrace.o(21025475526656L, 156652);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21025609744384L, 156653);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21025609744384L, 156653);
      return 0;
      GMTrace.o(21025609744384L, 156653);
      return 63;
      GMTrace.o(21025609744384L, 156653);
      return 75;
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
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -366.0F, 0.0F, 1.0F, -536.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 377.0F, 0.0F, 1.0F, 537.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 3.0846448F);
      ((Path)localObject3).cubicTo(0.0F, 1.8420041F, 1.0073593F, 0.83464485F, 2.25F, 0.83464485F);
      ((Path)localObject3).lineTo(4.6465516F, 0.83464485F);
      ((Path)localObject3).cubicTo(5.8891926F, 0.83464485F, 6.8965516F, 1.8420041F, 6.8965516F, 3.0846448F);
      ((Path)localObject3).lineTo(6.8965516F, 69.939705F);
      ((Path)localObject3).cubicTo(6.8965516F, 71.18234F, 5.8891926F, 72.189705F, 4.6465516F, 72.189705F);
      ((Path)localObject3).lineTo(2.25F, 72.189705F);
      ((Path)localObject3).cubicTo(1.0073593F, 72.189705F, 0.0F, 71.18234F, 0.0F, 69.939705F);
      ((Path)localObject3).lineTo(0.0F, 3.0846448F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(33.103447F, 3.0880115F);
      ((Path)localObject2).cubicTo(33.103447F, 1.8435115F, 34.106266F, 0.83464485F, 35.361637F, 0.83464485F);
      ((Path)localObject2).lineTo(37.74181F, 0.83464485F);
      ((Path)localObject2).cubicTo(38.988976F, 0.83464485F, 40.0F, 1.8433424F, 40.0F, 3.0880115F);
      ((Path)localObject2).lineTo(40.0F, 69.93634F);
      ((Path)localObject2).cubicTo(40.0F, 71.18084F, 38.99718F, 72.189705F, 37.74181F, 72.189705F);
      ((Path)localObject2).lineTo(35.361637F, 72.189705F);
      ((Path)localObject2).cubicTo(34.114475F, 72.189705F, 33.103447F, 71.18101F, 33.103447F, 69.93634F);
      ((Path)localObject2).lineTo(33.103447F, 3.0880115F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\sb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
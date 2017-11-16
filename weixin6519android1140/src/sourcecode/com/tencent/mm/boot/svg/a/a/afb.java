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

public final class afb
  extends c
{
  private final int height;
  private final int width;
  
  public afb()
  {
    GMTrace.i(15718103908352L, 117109);
    this.width = 63;
    this.height = 63;
    GMTrace.o(15718103908352L, 117109);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15718238126080L, 117110);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15718238126080L, 117110);
      return 0;
      GMTrace.o(15718238126080L, 117110);
      return 63;
      GMTrace.o(15718238126080L, 117110);
      return 63;
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
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 18.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(5.0F, 5.0F);
      ((Path)localObject2).lineTo(5.0F, 34.0F);
      ((Path)localObject2).lineTo(34.0F, 34.0F);
      ((Path)localObject2).lineTo(34.0F, 5.0F);
      ((Path)localObject2).lineTo(5.0F, 5.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(0.0F, 1.5049495F);
      ((Path)localObject2).cubicTo(0.0F, 0.67378885F, 0.676918F, 0.0F, 1.5049495F, 0.0F);
      ((Path)localObject2).lineTo(37.495052F, 0.0F);
      ((Path)localObject2).cubicTo(38.32621F, 0.0F, 39.0F, 0.676918F, 39.0F, 1.5049495F);
      ((Path)localObject2).lineTo(39.0F, 37.495052F);
      ((Path)localObject2).cubicTo(39.0F, 38.32621F, 38.323082F, 39.0F, 37.495052F, 39.0F);
      ((Path)localObject2).lineTo(1.5049495F, 39.0F);
      ((Path)localObject2).cubicTo(0.67378885F, 39.0F, 0.0F, 38.323082F, 0.0F, 37.495052F);
      ((Path)localObject2).lineTo(0.0F, 1.5049495F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(52.925938F, 23.0F);
      ((Path)localObject2).cubicTo(52.974922F, 22.49169F, 53.0F, 21.976135F, 53.0F, 21.454546F);
      ((Path)localObject2).cubicTo(53.0F, 12.919235F, 46.28427F, 6.0F, 38.0F, 6.0F);
      ((Path)localObject2).cubicTo(35.866688F, 6.0F, 33.837387F, 6.4588375F, 32.0F, 7.285953F);
      ((Path)localObject2).lineTo(32.0F, 10.252686F);
      ((Path)localObject2).cubicTo(33.60105F, 9.50638F, 35.378433F, 9.090909F, 37.25F, 9.090909F);
      ((Path)localObject2).cubicTo(44.29163F, 9.090909F, 50.0F, 14.9722595F, 50.0F, 22.227272F);
      ((Path)localObject2).cubicTo(50.0F, 22.486673F, 49.992702F, 22.744318F, 49.978306F, 23.0F);
      ((Path)localObject2).lineTo(52.925938F, 23.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(35.0F, 0.0F);
      ((Path)localObject1).lineTo(26.0F, 7.4431515F);
      ((Path)localObject1).lineTo(34.865273F, 15.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\afb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
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

public final class jx
  extends c
{
  private final int height;
  private final int width;
  
  public jx()
  {
    GMTrace.i(15920504242176L, 118617);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15920504242176L, 118617);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15920638459904L, 118618);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15920638459904L, 118618);
      return 0;
      GMTrace.o(15920638459904L, 118618);
      return 60;
      GMTrace.o(15920638459904L, 118618);
      return 60;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.h(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramVarArgs).setStrokeWidth(1.0F);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 0.0F);
      ((Path)localObject3).lineTo(60.0F, 0.0F);
      ((Path)localObject3).lineTo(60.0F, 60.0F);
      ((Path)localObject3).lineTo(0.0F, 60.0F);
      ((Path)localObject3).lineTo(0.0F, 0.0F);
      ((Path)localObject3).close();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-5592406);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 5.877551F);
      ((Path)localObject2).cubicTo(0.0F, 2.6891508F, 2.6835413F, 0.0F, 5.877551F, 0.0F);
      ((Path)localObject2).lineTo(42.122448F, 0.0F);
      ((Path)localObject2).cubicTo(45.31085F, 0.0F, 48.0F, 2.6835413F, 48.0F, 5.877551F);
      ((Path)localObject2).lineTo(48.0F, 42.122448F);
      ((Path)localObject2).cubicTo(48.0F, 45.31085F, 45.31646F, 48.0F, 42.122448F, 48.0F);
      ((Path)localObject2).lineTo(5.877551F, 48.0F);
      ((Path)localObject2).cubicTo(2.6891508F, 48.0F, 0.0F, 45.31646F, 0.0F, 42.122448F);
      ((Path)localObject2).lineTo(0.0F, 5.877551F);
      ((Path)localObject2).lineTo(0.0F, 5.877551F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(4.0F, 5.904762F);
      ((Path)localObject2).cubicTo(4.0F, 4.894218F, 4.89154F, 4.0F, 5.904762F, 4.0F);
      ((Path)localObject2).lineTo(42.095238F, 4.0F);
      ((Path)localObject2).cubicTo(43.10578F, 4.0F, 44.0F, 4.89154F, 44.0F, 5.904762F);
      ((Path)localObject2).lineTo(44.0F, 42.095238F);
      ((Path)localObject2).cubicTo(44.0F, 43.10578F, 43.10846F, 44.0F, 42.095238F, 44.0F);
      ((Path)localObject2).lineTo(5.904762F, 44.0F);
      ((Path)localObject2).cubicTo(4.894218F, 44.0F, 4.0F, 43.10846F, 4.0F, 42.095238F);
      ((Path)localObject2).lineTo(4.0F, 5.904762F);
      ((Path)localObject2).lineTo(4.0F, 5.904762F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(10.2F, 22.538462F);
      ((Path)localObject2).lineTo(19.0F, 30.923077F);
      ((Path)localObject2).lineTo(37.8F, 13.0F);
      ((Path)localObject2).lineTo(42.0F, 17.038462F);
      ((Path)localObject2).lineTo(19.0F, 39.0F);
      ((Path)localObject2).lineTo(6.0F, 26.576923F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\jx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
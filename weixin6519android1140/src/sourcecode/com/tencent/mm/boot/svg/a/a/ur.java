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

public final class ur
  extends c
{
  private final int height;
  private final int width;
  
  public ur()
  {
    GMTrace.i(15895271309312L, 118429);
    this.width = 48;
    this.height = 48;
    GMTrace.o(15895271309312L, 118429);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15895405527040L, 118430);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15895405527040L, 118430);
      return 0;
      GMTrace.o(15895405527040L, 118430);
      return 48;
      GMTrace.o(15895405527040L, 118430);
      return 48;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
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
      ((Paint)localObject2).setColor(-5592406);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -70.0F, 0.0F, 1.0F, -199.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 69.0F, 0.0F, 1.0F, 98.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 101.67347F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 6.3265305F);
      ((Path)localObject2).cubicTo(0.0F, 2.9596574F, 2.6835413F, 0.3265306F, 6.0F, 0.3265306F);
      ((Path)localObject2).lineTo(42.0F, 0.3265306F);
      ((Path)localObject2).cubicTo(45.31085F, 0.3265306F, 48.0F, 2.9541647F, 48.0F, 6.3265305F);
      ((Path)localObject2).lineTo(48.0F, 41.32653F);
      ((Path)localObject2).cubicTo(48.0F, 44.693405F, 45.31646F, 47.32653F, 42.0F, 47.32653F);
      ((Path)localObject2).lineTo(6.0F, 47.32653F);
      ((Path)localObject2).cubicTo(2.6891508F, 47.32653F, 0.0F, 44.698895F, 0.0F, 41.32653F);
      ((Path)localObject2).lineTo(0.0F, 6.3265305F);
      ((Path)localObject2).lineTo(0.0F, 6.3265305F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(4.0F, 6.3265305F);
      ((Path)localObject2).cubicTo(4.0F, 5.198393F, 4.89154F, 4.3265305F, 6.0F, 4.3265305F);
      ((Path)localObject2).lineTo(42.0F, 4.3265305F);
      ((Path)localObject2).cubicTo(43.10578F, 4.3265305F, 44.0F, 5.195782F, 44.0F, 6.3265305F);
      ((Path)localObject2).lineTo(44.0F, 41.32653F);
      ((Path)localObject2).cubicTo(44.0F, 42.45467F, 43.10846F, 43.32653F, 42.0F, 43.32653F);
      ((Path)localObject2).lineTo(6.0F, 43.32653F);
      ((Path)localObject2).cubicTo(4.894218F, 43.32653F, 4.0F, 42.45728F, 4.0F, 41.32653F);
      ((Path)localObject2).lineTo(4.0F, 6.3265305F);
      ((Path)localObject2).lineTo(4.0F, 6.3265305F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
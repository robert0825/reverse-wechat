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

public final class jz
  extends c
{
  private final int height;
  private final int width;
  
  public jz()
  {
    GMTrace.i(15753000517632L, 117369);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15753000517632L, 117369);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15753134735360L, 117370);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15753134735360L, 117370);
      return 0;
      GMTrace.o(15753134735360L, 117370);
      return 60;
      GMTrace.o(15753134735360L, 117370);
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
      ((Path)localObject2).moveTo(0.0F, 6.0F);
      ((Path)localObject2).cubicTo(0.0F, 2.6891508F, 2.6835413F, 0.0F, 6.0F, 0.0F);
      ((Path)localObject2).lineTo(42.0F, 0.0F);
      ((Path)localObject2).cubicTo(45.31085F, 0.0F, 48.0F, 2.6835413F, 48.0F, 6.0F);
      ((Path)localObject2).lineTo(48.0F, 42.0F);
      ((Path)localObject2).cubicTo(48.0F, 45.31085F, 45.31646F, 48.0F, 42.0F, 48.0F);
      ((Path)localObject2).lineTo(6.0F, 48.0F);
      ((Path)localObject2).cubicTo(2.6891508F, 48.0F, 0.0F, 45.31646F, 0.0F, 42.0F);
      ((Path)localObject2).lineTo(0.0F, 6.0F);
      ((Path)localObject2).lineTo(0.0F, 6.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(3.0F, 5.0F);
      ((Path)localObject2).cubicTo(3.0F, 3.9389288F, 3.936117F, 3.0F, 5.0F, 3.0F);
      ((Path)localObject2).lineTo(43.0F, 3.0F);
      ((Path)localObject2).cubicTo(44.06107F, 3.0F, 45.0F, 3.936117F, 45.0F, 5.0F);
      ((Path)localObject2).lineTo(45.0F, 43.0F);
      ((Path)localObject2).cubicTo(45.0F, 44.06107F, 44.063885F, 45.0F, 43.0F, 45.0F);
      ((Path)localObject2).lineTo(5.0F, 45.0F);
      ((Path)localObject2).cubicTo(3.9389288F, 45.0F, 3.0F, 44.063885F, 3.0F, 43.0F);
      ((Path)localObject2).lineTo(3.0F, 5.0F);
      ((Path)localObject2).lineTo(3.0F, 5.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\jz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
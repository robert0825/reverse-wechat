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

public final class ja
  extends c
{
  private final int height;
  private final int width;
  
  public ja()
  {
    GMTrace.i(15845342314496L, 118057);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15845342314496L, 118057);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15845476532224L, 118058);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15845476532224L, 118058);
      return 0;
      GMTrace.o(15845476532224L, 118058);
      return 60;
      GMTrace.o(15845476532224L, 118058);
      return 60;
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
      ((Paint)localObject2).setColor(-6118750);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(11.145517F, 1.5122092F);
      ((Path)localObject3).cubicTo(12.139298F, 0.841187F, 13.13308F, 0.8311717F, 14.12686F, 1.4721482F);
      ((Path)localObject3).cubicTo(23.139763F, 9.6546135F, 23.316874F, 25.448673F, 14.490918F, 33.851475F);
      ((Path)localObject3).cubicTo(12.719824F, 34.49245F, 10.663386F, 32.97013F, 11.224233F, 30.987112F);
      ((Path)localObject3).cubicTo(12.493517F, 28.503328F, 14.372846F, 26.29997F, 15.0517645F, 23.525745F);
      ((Path)localObject3).cubicTo(16.891735F, 17.586697F, 15.199356F, 10.946582F, 11.234072F, 6.3095174F);
      ((Path)localObject3).cubicTo(9.905751F, 5.03758F, 9.335065F, 2.6239028F, 11.145517F, 1.5122092F);
      ((Path)localObject3).lineTo(11.145517F, 1.5122092F);
      ((Path)localObject3).lineTo(11.145517F, 1.5122092F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(1.0777197F, 8.738578F);
      ((Path)localObject2).cubicTo(2.1650724F, 7.7619977F, 4.146697F, 7.7229342F, 5.1730766F, 8.806938F);
      ((Path)localObject2).cubicTo(9.786705F, 13.738669F, 10.426922F, 21.83452F, 6.0063753F, 27.068993F);
      ((Path)localObject2).cubicTo(4.268643F, 29.139343F, 0.3358808F, 27.46939F, 0.6813948F, 24.871687F);
      ((Path)localObject2).cubicTo(1.3012875F, 22.48883F, 3.912967F, 20.809113F, 3.4455068F, 18.133282F);
      ((Path)localObject2).cubicTo(3.6284258F, 14.725016F, -2.3875825F, 11.961293F, 1.0777197F, 8.738578F);
      ((Path)localObject2).lineTo(1.0777197F, 8.738578F);
      ((Path)localObject2).lineTo(1.0777197F, 8.738578F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
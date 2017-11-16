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

public final class jn
  extends c
{
  private final int height;
  private final int width;
  
  public jn()
  {
    GMTrace.i(15874064908288L, 118271);
    this.width = 28;
    this.height = 21;
    GMTrace.o(15874064908288L, 118271);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15874199126016L, 118272);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15874199126016L, 118272);
      return 0;
      GMTrace.o(15874199126016L, 118272);
      return 28;
      GMTrace.o(15874199126016L, 118272);
      return 21;
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
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-2763307);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(9.740437F, 16.82034F);
      ((Path)localObject).cubicTo(15.206292F, 11.2271185F, 20.54201F, 5.501695F, 26.097961F, 0.0F);
      ((Path)localObject).cubicTo(26.568466F, 0.4881356F, 27.519485F, 1.4745762F, 28.0F, 1.9728813F);
      ((Path)localObject).cubicTo(22.303898F, 8.583051F, 15.887022F, 14.532204F, 10.040758F, 21.0F);
      ((Path)localObject).cubicTo(6.677154F, 18.21356F, 3.283518F, 15.488135F, 0.0F, 12.620339F);
      ((Path)localObject).lineTo(0.0F, 10.932203F);
      ((Path)localObject).cubicTo(0.41043976F, 10.718644F, 1.2313193F, 10.291526F, 1.641759F, 10.088136F);
      ((Path)localObject).cubicTo(4.3346443F, 12.335593F, 7.0275297F, 14.593221F, 9.740437F, 16.82034F);
      ((Path)localObject).lineTo(9.740437F, 16.82034F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\jn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
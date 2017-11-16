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

public final class dj
  extends c
{
  private final int height;
  private final int width;
  
  public dj()
  {
    GMTrace.i(17583596109824L, 131008);
    this.width = 63;
    this.height = 75;
    GMTrace.o(17583596109824L, 131008);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17583730327552L, 131009);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17583730327552L, 131009);
      return 0;
      GMTrace.o(17583730327552L, 131009);
      return 63;
      GMTrace.o(17583730327552L, 131009);
      return 75;
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -251.0F, 0.0F, 1.0F, -536.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(251.0F, 604.63025F);
      ((Path)localObject2).cubicTo(251.0F, 608.6046F, 253.80093F, 610.2191F, 257.23993F, 608.2455F);
      ((Path)localObject2).lineTo(310.9292F, 577.43384F);
      ((Path)localObject2).cubicTo(314.37543F, 575.4561F, 314.3682F, 572.24536F, 310.9292F, 570.2718F);
      ((Path)localObject2).lineTo(257.23993F, 539.46014F);
      ((Path)localObject2).cubicTo(253.79372F, 537.48236F, 251.0F, 539.09393F, 251.0F, 543.0754F);
      ((Path)localObject2).lineTo(251.0F, 604.63025F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
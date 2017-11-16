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

public final class st
  extends c
{
  private final int height;
  private final int width;
  
  public st()
  {
    GMTrace.i(17577153658880L, 130960);
    this.width = 46;
    this.height = 40;
    GMTrace.o(17577153658880L, 130960);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17577287876608L, 130961);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17577287876608L, 130961);
      return 0;
      GMTrace.o(17577287876608L, 130961);
      return 46;
      GMTrace.o(17577287876608L, 130961);
      return 40;
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
      localPaint1.setColor(48640);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -149.0F, 0.0F, 1.0F, -661.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(151.0733F, 700.02264F);
      ((Path)localObject2).lineTo(151.0733F, 700.02264F);
      ((Path)localObject2).cubicTo(150.70924F, 700.02264F, 150.3521F, 699.9233F, 150.04036F, 699.7353F);
      ((Path)localObject2).cubicTo(149.09451F, 699.1648F, 148.7902F, 697.93555F, 149.36069F, 696.98975F);
      ((Path)localObject2).lineTo(149.36069F, 696.98975F);
      ((Path)localObject2).lineTo(170.08609F, 662.6272F);
      ((Path)localObject2).cubicTo(170.25401F, 662.34875F, 170.48732F, 662.1155F, 170.76575F, 661.9475F);
      ((Path)localObject2).cubicTo(171.7116F, 661.377F, 172.94083F, 661.68134F, 173.5113F, 662.6272F);
      ((Path)localObject2).lineTo(173.5113F, 662.6272F);
      ((Path)localObject2).lineTo(194.2367F, 696.98975F);
      ((Path)localObject2).cubicTo(194.42471F, 697.30145F, 194.52408F, 697.6586F, 194.52408F, 698.02264F);
      ((Path)localObject2).cubicTo(194.52408F, 699.12726F, 193.62866F, 700.02264F, 192.52408F, 700.02264F);
      ((Path)localObject2).lineTo(151.0733F, 700.02264F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(169.61902F, 675.9917F);
      ((Path)localObject2).lineTo(170.2866F, 687.9688F);
      ((Path)localObject2).lineTo(173.31001F, 687.9688F);
      ((Path)localObject2).lineTo(173.9776F, 675.9917F);
      ((Path)localObject2).cubicTo(174.0237F, 675.16455F, 173.39055F, 674.45667F, 172.5634F, 674.4105F);
      ((Path)localObject2).cubicTo(172.5356F, 674.409F, 172.50777F, 674.4082F, 172.47992F, 674.4082F);
      ((Path)localObject2).lineTo(171.1167F, 674.4082F);
      ((Path)localObject2).cubicTo(170.28827F, 674.4082F, 169.6167F, 675.0798F, 169.6167F, 675.9082F);
      ((Path)localObject2).cubicTo(169.6167F, 675.93604F, 169.61748F, 675.96387F, 169.61902F, 675.9917F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(171.79831F, 695.50244F);
      ((Path)localObject2).cubicTo(173.05064F, 695.50244F, 174.06586F, 694.4906F, 174.06586F, 693.2424F);
      ((Path)localObject2).cubicTo(174.06586F, 691.99414F, 173.05064F, 690.98224F, 171.79831F, 690.98224F);
      ((Path)localObject2).cubicTo(170.54597F, 690.98224F, 169.53076F, 691.99414F, 169.53076F, 693.2424F);
      ((Path)localObject2).cubicTo(169.53076F, 694.4906F, 170.54597F, 695.50244F, 171.79831F, 695.50244F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\st.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
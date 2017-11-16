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

public final class us
  extends c
{
  private final int height;
  private final int width;
  
  public us()
  {
    GMTrace.i(15776622837760L, 117545);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15776622837760L, 117545);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15776757055488L, 117546);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15776757055488L, 117546);
      return 0;
      GMTrace.o(15776757055488L, 117546);
      return 96;
      GMTrace.o(15776757055488L, 117546);
      return 96;
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
      localPaint1.setColor(-2500135);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 14.0F, 0.0F, 1.0F, 27.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 21.0F);
      ((Path)localObject2).cubicTo(6.541142F, 9.067516F, 19.195314F, 0.2773516F, 33.0F, -3.5527137E-15F);
      ((Path)localObject2).cubicTo(47.47057F, -0.56266415F, 61.090485F, 8.457505F, 68.0F, 21.0F);
      ((Path)localObject2).cubicTo(61.279648F, 33.217968F, 48.147583F, 42.128136F, 34.0F, 42.0F);
      ((Path)localObject2).cubicTo(19.862371F, 42.148136F, 6.7402635F, 33.23797F, 0.0F, 21.0F);
      ((Path)localObject2).lineTo(0.0F, 21.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(30.0F, 10.0F);
      ((Path)localObject2).cubicTo(26.510271F, 10.850008F, 23.349888F, 14.148959F, 22.0F, 18.0F);
      ((Path)localObject2).cubicTo(20.448715F, 24.932842F, 25.872211F, 32.447674F, 33.0F, 33.0F);
      ((Path)localObject2).cubicTo(40.05904F, 33.833035F, 46.808502F, 27.08563F, 46.0F, 20.0F);
      ((Path)localObject2).cubicTo(45.492508F, 12.574233F, 37.337322F, 7.1324587F, 30.0F, 10.0F);
      ((Path)localObject2).lineTo(30.0F, 10.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\us.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
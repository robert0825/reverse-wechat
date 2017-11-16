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

public final class sv
  extends c
{
  private final int height;
  private final int width;
  
  public sv()
  {
    GMTrace.i(15724009488384L, 117153);
    this.width = 61;
    this.height = 61;
    GMTrace.o(15724009488384L, 117153);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15724143706112L, 117154);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15724143706112L, 117154);
      return 0;
      GMTrace.o(15724143706112L, 117154);
      return 61;
      GMTrace.o(15724143706112L, 117154);
      return 61;
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
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-10970130);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(24.357143F, 31.267857F);
      ((Path)localObject).cubicTo(26.82522F, 35.67271F, 22.368435F, 37.603485F, 20.517857F, 38.94643F);
      ((Path)localObject).cubicTo(12.49915F, 43.23181F, 9.0F, 44.938072F, 9.0F, 46.625F);
      ((Path)localObject).lineTo(9.0F, 50.464287F);
      ((Path)localObject).cubicTo(9.0F, 51.156628F, 9.728162F, 52.0F, 10.535714F, 52.0F);
      ((Path)localObject).lineTo(50.464287F, 52.0F);
      ((Path)localObject).cubicTo(51.27184F, 52.0F, 52.0F, 51.156628F, 52.0F, 50.464287F);
      ((Path)localObject).lineTo(52.0F, 46.625F);
      ((Path)localObject).cubicTo(52.0F, 44.938072F, 48.50085F, 43.23181F, 40.482143F, 38.94643F);
      ((Path)localObject).cubicTo(38.631565F, 37.603485F, 34.17478F, 35.67271F, 36.642857F, 31.267857F);
      ((Path)localObject).cubicTo(39.24307F, 27.868282F, 41.103214F, 26.426222F, 41.25F, 20.517857F);
      ((Path)localObject).cubicTo(41.103214F, 14.887795F, 36.947693F, 9.0F, 30.5F, 9.0F);
      ((Path)localObject).cubicTo(24.052307F, 9.0F, 19.896786F, 14.887795F, 19.75F, 20.517857F);
      ((Path)localObject).cubicTo(19.896786F, 26.426222F, 21.756931F, 27.868282F, 24.357143F, 31.267857F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(30.714453F, 42.92168F);
      ((Path)localObject).cubicTo(26.309618F, 42.92168F, 23.007446F, 38.011597F, 23.007446F, 38.011597F);
      ((Path)localObject).cubicTo(23.007446F, 38.011597F, 24.622948F, 50.719337F, 30.714453F, 50.719337F);
      ((Path)localObject).cubicTo(36.805958F, 50.719337F, 38.079346F, 38.011597F, 38.079346F, 38.011597F);
      ((Path)localObject).cubicTo(38.079346F, 38.011597F, 35.11929F, 42.92168F, 30.714453F, 42.92168F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\sv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
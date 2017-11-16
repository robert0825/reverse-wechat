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

public final class ka
  extends c
{
  private final int height;
  private final int width;
  
  public ka()
  {
    GMTrace.i(15926678257664L, 118663);
    this.width = 60;
    this.height = 60;
    GMTrace.o(15926678257664L, 118663);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15926812475392L, 118664);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15926812475392L, 118664);
      return 0;
      GMTrace.o(15926812475392L, 118664);
      return 60;
      GMTrace.o(15926812475392L, 118664);
      return 60;
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
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(0.0F, 0.0F);
      ((Path)localObject).lineTo(60.0F, 0.0F);
      ((Path)localObject).lineTo(60.0F, 60.0F);
      ((Path)localObject).lineTo(0.0F, 60.0F);
      ((Path)localObject).lineTo(0.0F, 0.0F);
      ((Path)localObject).close();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(6.0F, 12.0F);
      ((Path)localObject).cubicTo(6.0F, 8.689151F, 8.683541F, 6.0F, 12.0F, 6.0F);
      ((Path)localObject).lineTo(48.0F, 6.0F);
      ((Path)localObject).cubicTo(51.31085F, 6.0F, 54.0F, 8.683541F, 54.0F, 12.0F);
      ((Path)localObject).lineTo(54.0F, 48.0F);
      ((Path)localObject).cubicTo(54.0F, 51.31085F, 51.31646F, 54.0F, 48.0F, 54.0F);
      ((Path)localObject).lineTo(12.0F, 54.0F);
      ((Path)localObject).cubicTo(8.689151F, 54.0F, 6.0F, 51.31646F, 6.0F, 48.0F);
      ((Path)localObject).lineTo(6.0F, 12.0F);
      ((Path)localObject).lineTo(6.0F, 12.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(9.0F, 11.0F);
      ((Path)localObject).cubicTo(9.0F, 9.938929F, 9.936117F, 9.0F, 11.0F, 9.0F);
      ((Path)localObject).lineTo(49.0F, 9.0F);
      ((Path)localObject).cubicTo(50.06107F, 9.0F, 51.0F, 9.936117F, 51.0F, 11.0F);
      ((Path)localObject).lineTo(51.0F, 49.0F);
      ((Path)localObject).cubicTo(51.0F, 50.06107F, 50.063885F, 51.0F, 49.0F, 51.0F);
      ((Path)localObject).lineTo(11.0F, 51.0F);
      ((Path)localObject).cubicTo(9.938929F, 51.0F, 9.0F, 50.063885F, 9.0F, 49.0F);
      ((Path)localObject).lineTo(9.0F, 11.0F);
      ((Path)localObject).lineTo(9.0F, 11.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
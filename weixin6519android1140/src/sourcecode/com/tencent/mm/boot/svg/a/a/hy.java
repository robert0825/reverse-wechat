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

public final class hy
  extends c
{
  private final int height;
  private final int width;
  
  public hy()
  {
    GMTrace.i(15876212391936L, 118287);
    this.width = 102;
    this.height = 102;
    GMTrace.o(15876212391936L, 118287);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15876346609664L, 118288);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15876346609664L, 118288);
      return 0;
      GMTrace.o(15876346609664L, 118288);
      return 102;
      GMTrace.o(15876346609664L, 118288);
      return 102;
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
      localPaint.setColor(-1);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(51.0F, 102.0F);
      localPath.cubicTo(79.16652F, 102.0F, 102.0F, 79.16652F, 102.0F, 51.0F);
      localPath.cubicTo(102.0F, 22.833477F, 79.16652F, 0.0F, 51.0F, 0.0F);
      localPath.cubicTo(22.833477F, 0.0F, 0.0F, 22.833477F, 0.0F, 51.0F);
      localPath.cubicTo(0.0F, 79.16652F, 22.833477F, 102.0F, 51.0F, 102.0F);
      localPath.lineTo(51.0F, 102.0F);
      localPath.close();
      localPath.moveTo(51.0F, 98.0F);
      localPath.cubicTo(76.95738F, 98.0F, 98.0F, 76.95738F, 98.0F, 51.0F);
      localPath.cubicTo(98.0F, 25.042616F, 76.95738F, 4.0F, 51.0F, 4.0F);
      localPath.cubicTo(25.042616F, 4.0F, 4.0F, 25.042616F, 4.0F, 51.0F);
      localPath.cubicTo(4.0F, 76.95738F, 25.042616F, 98.0F, 51.0F, 98.0F);
      localPath.lineTo(51.0F, 98.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(60.046738F, 37.910957F);
      ((Path)localObject).cubicTo(69.13362F, 37.910957F, 76.5F, 45.204285F, 76.5F, 54.20548F);
      ((Path)localObject).cubicTo(76.5F, 63.204693F, 69.13489F, 70.5F, 60.046738F, 70.5F);
      ((Path)localObject).lineTo(29.047552F, 70.5F);
      ((Path)localObject).cubicTo(28.745148F, 70.5F, 28.5F, 70.25656F, 28.5F, 69.968216F);
      ((Path)localObject).lineTo(28.5F, 65.68932F);
      ((Path)localObject).cubicTo(28.5F, 65.39562F, 28.735804F, 65.15753F, 29.047586F, 65.15753F);
      ((Path)localObject).lineTo(60.048687F, 65.15753F);
      ((Path)localObject).cubicTo(66.152725F, 65.15753F, 71.10674F, 60.25413F, 71.10674F, 54.20548F);
      ((Path)localObject).cubicTo(71.10674F, 48.1555F, 66.15588F, 43.253426F, 60.048687F, 43.253426F);
      ((Path)localObject).lineTo(40.83506F, 43.253426F);
      ((Path)localObject).lineTo(40.83506F, 48.97156F);
      ((Path)localObject).cubicTo(40.83506F, 49.56155F, 40.448963F, 49.755066F, 39.972683F, 49.402626F);
      ((Path)localObject).lineTo(28.857897F, 41.177834F);
      ((Path)localObject).cubicTo(28.379784F, 40.82404F, 28.38162F, 40.253983F, 28.857897F, 39.901543F);
      ((Path)localObject).lineTo(39.972683F, 31.676752F);
      ((Path)localObject).cubicTo(40.450798F, 31.322954F, 40.83506F, 31.517307F, 40.83506F, 32.107815F);
      ((Path)localObject).lineTo(40.83506F, 37.910957F);
      ((Path)localObject).lineTo(60.046738F, 37.910957F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\hy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
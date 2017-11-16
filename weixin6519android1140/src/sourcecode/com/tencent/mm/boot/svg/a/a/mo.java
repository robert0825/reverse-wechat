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

public final class mo
  extends c
{
  private final int height;
  private final int width;
  
  public mo()
  {
    GMTrace.i(15779307192320L, 117565);
    this.width = 192;
    this.height = 192;
    GMTrace.o(15779307192320L, 117565);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15779441410048L, 117566);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15779441410048L, 117566);
      return 0;
      GMTrace.o(15779441410048L, 117566);
      return 192;
      GMTrace.o(15779441410048L, 117566);
      return 192;
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
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-15158035);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(192.0F, 0.0F);
      localPath.lineTo(192.0F, 192.0F);
      localPath.lineTo(0.0F, 192.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(142.54546F, 100.831314F);
      ((Path)localObject).cubicTo(139.21634F, 92.18106F, 135.36592F, 85.41221F, 136.1254F, 75.06431F);
      ((Path)localObject).cubicTo(134.93721F, 54.305878F, 117.50597F, 36.5975F, 97.60502F, 36.41379F);
      ((Path)localObject).cubicTo(74.49456F, 36.5975F, 57.06332F, 54.305878F, 55.874607F, 75.06431F);
      ((Path)localObject).cubicTo(56.631752F, 85.41221F, 52.78132F, 92.18106F, 49.454544F, 100.831314F);
      ((Path)localObject).cubicTo(40.531776F, 114.37079F, 42.792137F, 131.66068F, 46.244514F, 133.04007F);
      ((Path)localObject).cubicTo(48.937344F, 131.66068F, 53.50395F, 128.93271F, 59.08464F, 123.37745F);
      ((Path)localObject).cubicTo(59.046963F, 129.886F, 62.21491F, 134.8965F, 65.5047F, 139.48183F);
      ((Path)localObject).cubicTo(60.41336F, 140.68864F, 56.32277F, 143.90248F, 55.874607F, 145.92358F);
      ((Path)localObject).cubicTo(56.75219F, 152.38712F, 65.80511F, 156.04285F, 75.134796F, 155.58621F);
      ((Path)localObject).cubicTo(85.191315F, 155.14914F, 92.27135F, 152.36159F, 94.39498F, 149.14445F);
      ((Path)localObject).cubicTo(95.27298F, 148.79735F, 95.62354F, 148.81863F, 97.60502F, 149.14445F);
      ((Path)localObject).cubicTo(96.38775F, 148.81863F, 96.74691F, 148.79735F, 97.60502F, 149.14445F);
      ((Path)localObject).cubicTo(99.75284F, 152.36159F, 106.82212F, 155.14914F, 116.865204F, 155.58621F);
      ((Path)localObject).cubicTo(126.196144F, 156.04285F, 135.2462F, 152.38712F, 136.1254F, 145.92358F);
      ((Path)localObject).cubicTo(135.67705F, 143.90106F, 131.58717F, 140.68864F, 126.4953F, 139.48183F);
      ((Path)localObject).cubicTo(129.78922F, 134.8965F, 132.94926F, 129.89098F, 132.91536F, 123.37745F);
      ((Path)localObject).cubicTo(138.50232F, 128.93483F, 143.06104F, 131.66068F, 145.7555F, 133.04007F);
      ((Path)localObject).cubicTo(149.20982F, 131.66068F, 151.46875F, 114.37079F, 142.54546F, 100.831314F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\mo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
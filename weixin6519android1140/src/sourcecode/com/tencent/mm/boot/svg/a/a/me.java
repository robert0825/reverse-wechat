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

public final class me
  extends c
{
  private final int height;
  private final int width;
  
  public me()
  {
    GMTrace.i(15787360256000L, 117625);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15787360256000L, 117625);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15787494473728L, 117626);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15787494473728L, 117626);
      return 0;
      GMTrace.o(15787494473728L, 117626);
      return 108;
      GMTrace.o(15787494473728L, 117626);
      return 108;
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
      ((Paint)localObject).setColor(-352965);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(108.0F, 0.0F);
      localPath.lineTo(108.0F, 108.0F);
      localPath.lineTo(0.0F, 108.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(81.0F, 72.0F);
      ((Path)localObject).lineTo(75.0F, 72.0F);
      ((Path)localObject).lineTo(75.0F, 69.0F);
      ((Path)localObject).lineTo(81.0F, 69.0F);
      ((Path)localObject).lineTo(81.0F, 63.0F);
      ((Path)localObject).lineTo(84.0F, 63.0F);
      ((Path)localObject).lineTo(84.0F, 69.0F);
      ((Path)localObject).lineTo(90.0F, 69.0F);
      ((Path)localObject).lineTo(90.0F, 72.0F);
      ((Path)localObject).lineTo(84.0F, 72.0F);
      ((Path)localObject).lineTo(84.0F, 78.0F);
      ((Path)localObject).lineTo(81.0F, 78.0F);
      ((Path)localObject).lineTo(81.0F, 72.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(70.593575F, 84.0F);
      ((Path)localObject).lineTo(26.608969F, 84.0F);
      ((Path)localObject).cubicTo(25.016039F, 84.0F, 24.0F, 82.823204F, 24.0F, 81.33677F);
      ((Path)localObject).lineTo(24.0F, 77.34148F);
      ((Path)localObject).cubicTo(24.0F, 74.14615F, 28.882536F, 71.76532F, 39.652912F, 65.62255F);
      ((Path)localObject).cubicTo(42.65363F, 63.91184F, 48.8724F, 61.21774F, 44.842228F, 55.012318F);
      ((Path)localObject).cubicTo(41.80037F, 50.327835F, 39.20482F, 48.31566F, 39.20482F, 40.414963F);
      ((Path)localObject).cubicTo(39.20482F, 32.215527F, 45.00322F, 24.0F, 54.0F, 24.0F);
      ((Path)localObject).cubicTo(62.99678F, 24.0F, 68.79518F, 32.215527F, 68.79518F, 40.414963F);
      ((Path)localObject).cubicTo(68.79518F, 48.31566F, 66.19963F, 50.327835F, 63.157772F, 55.012318F);
      ((Path)localObject).cubicTo(60.146255F, 59.649273F, 62.85746F, 62.325607F, 65.672424F, 64.09607F);
      ((Path)localObject).cubicTo(64.914856F, 66.0857F, 64.5F, 68.244385F, 64.5F, 70.5F);
      ((Path)localObject).cubicTo(64.5F, 75.87621F, 66.85677F, 80.7018F, 70.593575F, 84.0F);
      ((Path)localObject).lineTo(70.593575F, 84.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(69.0F, 70.50122F);
      ((Path)localObject).cubicTo(69.0F, 71.18327F, 69.05058F, 71.8535F, 69.14821F, 72.50836F);
      ((Path)localObject).cubicTo(70.11773F, 79.01188F, 75.72652F, 84.0F, 82.5F, 84.0F);
      ((Path)localObject).cubicTo(89.95676F, 84.0F, 96.0F, 77.95676F, 96.0F, 70.50122F);
      ((Path)localObject).cubicTo(96.0F, 63.044464F, 89.95676F, 57.0F, 82.5F, 57.0F);
      ((Path)localObject).cubicTo(75.044464F, 57.0F, 69.0F, 63.044464F, 69.0F, 70.50122F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\me.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
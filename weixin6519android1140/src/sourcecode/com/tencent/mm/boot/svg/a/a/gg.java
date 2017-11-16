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

public final class gg
  extends c
{
  private final int height;
  private final int width;
  
  public gg()
  {
    GMTrace.i(15908424646656L, 118527);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15908424646656L, 118527);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15908558864384L, 118528);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15908558864384L, 118528);
      return 0;
      GMTrace.o(15908558864384L, 118528);
      return 96;
      GMTrace.o(15908558864384L, 118528);
      return 96;
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
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(81.0F, 60.0F);
      ((Path)localObject).lineTo(72.0F, 60.0F);
      ((Path)localObject).lineTo(72.0F, 68.0F);
      ((Path)localObject).lineTo(64.0F, 68.0F);
      ((Path)localObject).lineTo(64.0F, 77.0F);
      ((Path)localObject).lineTo(72.0F, 77.0F);
      ((Path)localObject).lineTo(72.0F, 85.0F);
      ((Path)localObject).lineTo(81.0F, 85.0F);
      ((Path)localObject).lineTo(81.0F, 77.0F);
      ((Path)localObject).lineTo(89.0F, 77.0F);
      ((Path)localObject).lineTo(89.0F, 68.0F);
      ((Path)localObject).lineTo(81.0F, 68.0F);
      ((Path)localObject).lineTo(81.0F, 60.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(33.0F, 66.0F);
      ((Path)localObject).lineTo(27.0F, 69.0F);
      ((Path)localObject).lineTo(28.0F, 64.0F);
      ((Path)localObject).cubicTo(20.127745F, 59.652744F, 15.2F, 52.282616F, 15.0F, 44.0F);
      ((Path)localObject).cubicTo(15.2F, 30.296667F, 28.315445F, 19.235294F, 48.0F, 19.0F);
      ((Path)localObject).cubicTo(67.684555F, 19.235294F, 80.8F, 30.296667F, 81.0F, 44.0F);
      ((Path)localObject).cubicTo(80.8F, 46.829475F, 80.203674F, 49.600197F, 79.0F, 52.0F);
      ((Path)localObject).lineTo(88.0F, 52.0F);
      ((Path)localObject).cubicTo(88.59775F, 49.54438F, 89.0F, 46.78464F, 89.0F, 44.0F);
      ((Path)localObject).cubicTo(89.0F, 25.74804F, 72.60592F, 11.0F, 48.0F, 11.0F);
      ((Path)localObject).cubicTo(23.394077F, 11.0F, 7.0F, 25.74804F, 7.0F, 44.0F);
      ((Path)localObject).cubicTo(7.0F, 53.683987F, 11.725022F, 62.435818F, 20.0F, 68.0F);
      ((Path)localObject).lineTo(15.0F, 81.0F);
      ((Path)localObject).lineTo(31.0F, 74.0F);
      ((Path)localObject).cubicTo(36.047134F, 75.924774F, 41.76071F, 76.882355F, 48.0F, 77.0F);
      ((Path)localObject).cubicTo(50.683678F, 76.882355F, 53.264854F, 76.696144F, 56.0F, 76.0F);
      ((Path)localObject).lineTo(56.0F, 68.0F);
      ((Path)localObject).cubicTo(53.296288F, 68.428825F, 50.71238F, 68.64706F, 48.0F, 69.0F);
      ((Path)localObject).cubicTo(42.51602F, 68.64706F, 37.537712F, 67.78236F, 33.0F, 66.0F);
      ((Path)localObject).lineTo(33.0F, 66.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
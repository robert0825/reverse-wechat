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

public final class afa
  extends c
{
  private final int height;
  private final int width;
  
  public afa()
  {
    GMTrace.i(15816351285248L, 117841);
    this.width = 186;
    this.height = 186;
    GMTrace.o(15816351285248L, 117841);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15816485502976L, 117842);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15816485502976L, 117842);
      return 0;
      GMTrace.o(15816485502976L, 117842);
      return 186;
      GMTrace.o(15816485502976L, 117842);
      return 186;
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
      ((Paint)localObject).setColor(-15683841);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(186.0F, 94.14815F);
      localPath.cubicTo(186.0F, 41.636444F, 144.36356F, 0.0F, 91.85185F, 0.0F);
      localPath.cubicTo(41.636444F, 0.0F, 0.0F, 41.636444F, 0.0F, 94.14815F);
      localPath.cubicTo(0.0F, 144.36356F, 41.636444F, 186.0F, 91.85185F, 186.0F);
      localPath.cubicTo(144.36356F, 186.0F, 186.0F, 144.36356F, 186.0F, 94.14815F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(96.53957F, 101.59992F);
      ((Path)localObject).lineTo(93.96079F, 37.990128F);
      ((Path)localObject).cubicTo(93.93903F, 37.45337F, 93.475F, 37.0F, 92.925255F, 37.0F);
      ((Path)localObject).lineTo(84.91605F, 37.0F);
      ((Path)localObject).cubicTo(84.37632F, 37.0F, 83.90268F, 37.443295F, 83.880516F, 37.990128F);
      ((Path)localObject).lineTo(81.00167F, 109.00153F);
      ((Path)localObject).cubicTo(80.974144F, 109.68064F, 81.28838F, 110.28124F, 81.79111F, 110.64247F);
      ((Path)localObject).cubicTo(81.98214F, 110.944756F, 82.25776F, 111.19843F, 82.60479F, 111.36398F);
      ((Path)localObject).lineTo(129.58261F, 133.77519F);
      ((Path)localObject).cubicTo(130.08742F, 134.016F, 130.7105F, 133.8202F, 130.98582F, 133.34332F);
      ((Path)localObject).lineTo(133.9888F, 128.14203F);
      ((Path)localObject).cubicTo(134.26079F, 127.67092F, 134.11714F, 127.02809F, 133.66052F, 126.71911F);
      ((Path)localObject).lineTo(96.53957F, 101.59992F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\afa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
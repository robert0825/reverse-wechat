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

public final class a
  extends c
{
  private final int height;
  private final int width;
  
  public a()
  {
    GMTrace.i(15755953307648L, 117391);
    this.width = 100;
    this.height = 100;
    GMTrace.o(15755953307648L, 117391);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15756087525376L, 117392);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15756087525376L, 117392);
      return 0;
      GMTrace.o(15756087525376L, 117392);
      return 100;
      GMTrace.o(15756087525376L, 117392);
      return 100;
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
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-2236702);
      localCanvas.save();
      localObject = c.a((Paint)localObject, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 10.0F);
      localPath.cubicTo(0.0F, 4.4771523F, 4.4771523F, 0.0F, 10.0F, 0.0F);
      localPath.lineTo(90.0F, 0.0F);
      localPath.cubicTo(95.52285F, 0.0F, 100.0F, 4.4771523F, 100.0F, 10.0F);
      localPath.lineTo(100.0F, 90.0F);
      localPath.cubicTo(100.0F, 95.52285F, 95.52285F, 100.0F, 90.0F, 100.0F);
      localPath.lineTo(10.0F, 100.0F);
      localPath.cubicTo(4.4771523F, 100.0F, 0.0F, 95.52285F, 0.0F, 90.0F);
      localPath.lineTo(0.0F, 10.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(74.0F, 52.03699F);
      ((Path)localObject).lineTo(74.0F, 22.99649F);
      ((Path)localObject).cubicTo(74.0F, 21.887833F, 73.10395F, 21.0F, 71.99861F, 21.0F);
      ((Path)localObject).lineTo(28.001389F, 21.0F);
      ((Path)localObject).cubicTo(26.894938F, 21.0F, 26.0F, 21.89386F, 26.0F, 22.99649F);
      ((Path)localObject).lineTo(26.0F, 77.00351F);
      ((Path)localObject).cubicTo(26.0F, 78.11217F, 26.896053F, 79.0F, 28.001389F, 79.0F);
      ((Path)localObject).lineTo(71.99861F, 79.0F);
      ((Path)localObject).cubicTo(73.105064F, 79.0F, 74.0F, 78.10614F, 74.0F, 77.00351F);
      ((Path)localObject).lineTo(74.0F, 55.48232F);
      ((Path)localObject).lineTo(50.747208F, 68.733765F);
      ((Path)localObject).lineTo(50.57445F, 68.832016F);
      ((Path)localObject).cubicTo(50.36059F, 68.938515F, 50.119755F, 69.0F, 49.86415F, 69.0F);
      ((Path)localObject).cubicTo(49.272663F, 69.0F, 48.75824F, 68.677986F, 48.487865F, 68.2032F);
      ((Path)localObject).lineTo(48.384464F, 67.97943F);
      ((Path)localObject).lineTo(44.075783F, 58.647274F);
      ((Path)localObject).cubicTo(44.0289F, 58.54522F, 44.0F, 58.430485F, 44.0F, 58.318916F);
      ((Path)localObject).cubicTo(44.0F, 57.88914F, 44.35322F, 57.539864F, 44.789295F, 57.539864F);
      ((Path)localObject).cubicTo(44.96655F, 57.539864F, 45.129673F, 57.59755F, 45.26133F, 57.694534F);
      ((Path)localObject).lineTo(50.345818F, 61.267784F);
      ((Path)localObject).cubicTo(50.717667F, 61.50803F, 51.161446F, 61.648754F, 51.63862F, 61.648754F);
      ((Path)localObject).cubicTo(51.923122F, 61.648754F, 52.194782F, 61.59614F, 52.44782F, 61.505493F);
      ((Path)localObject).lineTo(74.0F, 52.03699F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(34.0F, 38.0F);
      ((Path)localObject).lineTo(52.0F, 38.0F);
      ((Path)localObject).lineTo(52.0F, 41.0F);
      ((Path)localObject).lineTo(34.0F, 41.0F);
      ((Path)localObject).lineTo(34.0F, 38.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(34.0F, 29.0F);
      ((Path)localObject).lineTo(52.0F, 29.0F);
      ((Path)localObject).lineTo(52.0F, 32.0F);
      ((Path)localObject).lineTo(34.0F, 32.0F);
      ((Path)localObject).lineTo(34.0F, 29.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
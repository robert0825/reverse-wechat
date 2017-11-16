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

public final class ue
  extends c
{
  private final int height;
  private final int width;
  
  public ue()
  {
    GMTrace.i(15804003254272L, 117749);
    this.width = 450;
    this.height = 342;
    GMTrace.o(15804003254272L, 117749);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15804137472000L, 117750);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15804137472000L, 117750);
      return 0;
      GMTrace.o(15804137472000L, 117750);
      return 450;
      GMTrace.o(15804137472000L, 117750);
      return 342;
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
      localCanvas.saveLayerAlpha(null, 7, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(70.67984F, 150.63449F);
      ((Path)localObject).cubicTo(67.97303F, 110.35668F, 80.40884F, 71.12603F, 108.708755F, 42.23457F);
      ((Path)localObject).cubicTo(166.09906F, -16.355326F, 266.9981F, -10.238467F, 334.07306F, 55.896957F);
      ((Path)localObject).cubicTo(401.14804F, 122.03238F, 408.999F, 223.14223F, 351.6087F, 281.73212F);
      ((Path)localObject).cubicTo(320.71915F, 313.26736F, 277.22516F, 326.05713F, 233.18497F, 320.83246F);
      ((Path)localObject).cubicTo(228.70084F, 330.40506F, 222.63911F, 339.28018F, 214.97217F, 347.10776F);
      ((Path)localObject).cubicTo(173.24408F, 389.71017F, 99.76736F, 385.15027F, 50.85731F, 336.92297F);
      ((Path)localObject).cubicTo(1.947269F, 288.69565F, -3.8748572F, 215.06361F, 37.85323F, 172.46121F);
      ((Path)localObject).cubicTo(47.367443F, 162.74765F, 58.53215F, 155.48589F, 70.67984F, 150.63449F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(70.67984F, 150.63449F);
      ((Path)localObject).cubicTo(73.46225F, 192.0373F, 92.244995F, 234.54659F, 126.2444F, 268.06973F);
      ((Path)localObject).cubicTo(157.21716F, 298.60867F, 195.40207F, 316.3501F, 233.18497F, 320.83246F);
      ((Path)localObject).cubicTo(253.10619F, 278.3053F, 241.89159F, 222.01225F, 201.96808F, 182.64603F);
      ((Path)localObject).cubicTo(164.20978F, 145.41478F, 111.81031F, 134.20828F, 70.67984F, 150.63449F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
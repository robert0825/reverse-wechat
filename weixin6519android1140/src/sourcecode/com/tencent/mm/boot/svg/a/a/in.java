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

public final class in
  extends c
{
  private final int height;
  private final int width;
  
  public in()
  {
    GMTrace.i(21027354574848L, 156666);
    this.width = 66;
    this.height = 48;
    GMTrace.o(21027354574848L, 156666);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21027488792576L, 156667);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21027488792576L, 156667);
      return 0;
      GMTrace.o(21027488792576L, 156667);
      return 66;
      GMTrace.o(21027488792576L, 156667);
      return 48;
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
      ((Paint)localObject).setColor(48640);
      localCanvas.save();
      localObject = c.a((Paint)localObject, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(1.492238E-12F, 4.7575727F);
      localPath.lineTo(1.4921397E-12F, 1.44F);
      localPath.lineTo(1.4923618E-12F, 1.44F);
      localPath.cubicTo(1.4922644E-12F, 0.64470994F, 0.64470994F, 5.0310737E-15F, 1.44F, 4.8849813E-15F);
      localPath.lineTo(1.44F, 7.1054274E-15F);
      localPath.lineTo(64.185F, 7.1054274E-15F);
      localPath.lineTo(64.185F, 7.327472E-15F);
      localPath.cubicTo(64.98029F, 7.18138E-15F, 65.625F, 0.64470994F, 65.625F, 1.44F);
      localPath.lineTo(65.625F, 4.7563457F);
      localPath.cubicTo(63.938255F, 4.842435F, 62.5987F, 6.156979F, 62.5987F, 7.7659883F);
      localPath.cubicTo(62.5987F, 9.374997F, 63.938255F, 10.689542F, 65.625F, 10.775631F);
      localPath.lineTo(65.625F, 15.712849F);
      localPath.cubicTo(63.938255F, 15.798938F, 62.5987F, 17.113482F, 62.5987F, 18.72249F);
      localPath.cubicTo(62.5987F, 20.331501F, 63.938255F, 21.646044F, 65.625F, 21.732134F);
      localPath.lineTo(65.625F, 26.669352F);
      localPath.cubicTo(63.938255F, 26.75544F, 62.5987F, 28.069984F, 62.5987F, 29.678993F);
      localPath.cubicTo(62.5987F, 31.288002F, 63.938255F, 32.602547F, 65.625F, 32.688637F);
      localPath.lineTo(65.625F, 37.625854F);
      localPath.cubicTo(63.938255F, 37.71194F, 62.5987F, 39.026485F, 62.5987F, 40.635494F);
      localPath.cubicTo(62.5987F, 42.244507F, 63.938255F, 43.559048F, 65.625F, 43.645138F);
      localPath.lineTo(65.625F, 46.442352F);
      localPath.cubicTo(65.625F, 47.237644F, 64.98029F, 47.882355F, 64.185F, 47.882355F);
      localPath.lineTo(1.44F, 47.882355F);
      localPath.lineTo(1.44F, 47.882355F);
      localPath.cubicTo(0.64470994F, 47.882355F, 1.4935694E-12F, 47.237644F, 1.493472E-12F, 46.442352F);
      localPath.lineTo(1.4933892E-12F, 43.643913F);
      localPath.cubicTo(1.6761057F, 43.547302F, 3.0037231F, 42.23732F, 3.0037231F, 40.635494F);
      localPath.cubicTo(3.0037231F, 39.033672F, 1.6761057F, 37.72369F, 1.5209084E-12F, 37.62708F);
      localPath.lineTo(1.4930648E-12F, 32.68741F);
      localPath.cubicTo(1.6761057F, 32.5908F, 3.0037231F, 31.280817F, 3.0037231F, 29.678993F);
      localPath.cubicTo(3.0037231F, 28.07717F, 1.6761057F, 26.767185F, 1.5221574E-12F, 26.670578F);
      localPath.lineTo(1.4927405E-12F, 21.730906F);
      localPath.cubicTo(1.6761057F, 21.634298F, 3.0037231F, 20.324316F, 3.0037231F, 18.72249F);
      localPath.cubicTo(3.0037231F, 17.120667F, 1.6761057F, 15.810683F, 1.5217966E-12F, 15.714075F);
      localPath.lineTo(1.4924161E-12F, 10.774404F);
      localPath.cubicTo(1.6761057F, 10.677795F, 3.0037231F, 9.367813F, 3.0037231F, 7.7659883F);
      localPath.cubicTo(3.0037231F, 6.1641636F, 1.6761057F, 4.854181F, 1.5213941E-12F, 4.7575727F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(28.410238F, 24.652752F);
      ((Path)localObject).cubicTo(30.052023F, 27.348827F, 27.201754F, 28.510988F, 25.74895F, 29.66224F);
      ((Path)localObject).cubicTo(20.890003F, 31.898764F, 18.652174F, 32.92579F, 18.652174F, 33.83681F);
      ((Path)localObject).lineTo(18.652174F, 36.25749F);
      ((Path)localObject).lineTo(18.652174F, 36.25749F);
      ((Path)localObject).cubicTo(18.652174F, 36.76503F, 19.063616F, 37.17647F, 19.571156F, 37.17647F);
      ((Path)localObject).lineTo(45.233192F, 37.17647F);
      ((Path)localObject).lineTo(45.233192F, 37.17647F);
      ((Path)localObject).cubicTo(45.74073F, 37.17647F, 46.152172F, 36.76503F, 46.152172F, 36.25749F);
      ((Path)localObject).lineTo(46.152172F, 33.83681F);
      ((Path)localObject).cubicTo(46.152172F, 32.92579F, 43.914345F, 31.898764F, 39.0554F, 29.66224F);
      ((Path)localObject).cubicTo(37.602592F, 28.510988F, 34.752323F, 27.348827F, 36.394108F, 24.652752F);
      ((Path)localObject).cubicTo(37.99367F, 22.651222F, 39.1833F, 21.783226F, 39.0554F, 17.973434F);
      ((Path)localObject).cubicTo(39.1833F, 14.838071F, 36.5257F, 11.294118F, 32.845722F, 11.294118F);
      ((Path)localObject).cubicTo(28.27865F, 11.294118F, 25.62105F, 14.838071F, 25.74895F, 17.973434F);
      ((Path)localObject).cubicTo(25.62105F, 21.783226F, 26.810677F, 22.651222F, 28.410238F, 24.652752F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\in.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
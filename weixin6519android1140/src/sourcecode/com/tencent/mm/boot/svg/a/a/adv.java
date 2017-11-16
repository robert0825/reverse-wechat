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

public final class adv
  extends c
{
  private final int height;
  private final int width;
  
  public adv()
  {
    GMTrace.i(20327677558784L, 151453);
    this.width = 290;
    this.height = 290;
    GMTrace.o(20327677558784L, 151453);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20327811776512L, 151454);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20327811776512L, 151454);
      return 0;
      GMTrace.o(20327811776512L, 151454);
      return 290;
      GMTrace.o(20327811776512L, 151454);
      return 290;
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
      localPaint.setColor(-3833595);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(274.5553F, 275.0F);
      ((Path)localObject).cubicTo(245.1193F, 272.369F, 198.0823F, 270.665F, 145.0633F, 270.665F);
      ((Path)localObject).cubicTo(92.0443F, 270.665F, 45.0103F, 272.369F, 15.5753F, 275.0F);
      ((Path)localObject).lineTo(15.0003F, 275.0F);
      ((Path)localObject).cubicTo(17.6523F, 245.596F, 19.3733F, 198.364F, 19.3733F, 145.1F);
      ((Path)localObject).cubicTo(19.3733F, 91.835F, 17.6523F, 44.606F, 15.0003F, 15.202F);
      ((Path)localObject).lineTo(15.0003F, 15.0F);
      ((Path)localObject).cubicTo(44.3963F, 17.66F, 91.7033F, 19.386F, 145.0633F, 19.386F);
      ((Path)localObject).cubicTo(198.3403F, 19.386F, 245.5833F, 17.665F, 274.9893F, 15.013F);
      ((Path)localObject).cubicTo(272.3353F, 44.414F, 270.6143F, 91.664F, 270.6143F, 144.951F);
      ((Path)localObject).cubicTo(270.6143F, 198.306F, 272.3403F, 245.607F, 275.0003F, 275.0F);
      ((Path)localObject).lineTo(274.5553F, 275.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(285.1083F, 144.945F);
      ((Path)localObject).cubicTo(285.1083F, 85.51F, 287.0283F, 32.808F, 289.9883F, 0.014F);
      ((Path)localObject).cubicTo(257.1893F, 2.973F, 204.4943F, 4.892F, 145.0703F, 4.892F);
      ((Path)localObject).cubicTo(85.5533F, 4.892F, 32.7883F, 2.966F, 3.0E-4F, 0.0F);
      ((Path)localObject).lineTo(3.0E-4F, 0.225F);
      ((Path)localObject).cubicTo(2.9583F, 33.022F, 4.8773F, 85.7F, 4.8773F, 145.112F);
      ((Path)localObject).cubicTo(4.8773F, 204.522F, 2.9583F, 257.203F, 3.0E-4F, 290.0F);
      ((Path)localObject).lineTo(0.6413F, 290.0F);
      ((Path)localObject).cubicTo(33.4733F, 287.066F, 85.9343F, 285.165F, 145.0703F, 285.165F);
      ((Path)localObject).cubicTo(204.2073F, 285.165F, 256.6723F, 287.066F, 289.5043F, 290.0F);
      ((Path)localObject).lineTo(290.0003F, 290.0F);
      ((Path)localObject).cubicTo(287.0333F, 257.215F, 285.1083F, 204.456F, 285.1083F, 144.945F);
      ((Path)localObject).lineTo(285.1083F, 144.945F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\adv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
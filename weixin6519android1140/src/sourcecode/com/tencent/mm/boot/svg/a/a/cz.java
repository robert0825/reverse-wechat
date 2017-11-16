package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class cz
  extends c
{
  private final int height;
  private final int width;
  
  public cz()
  {
    GMTrace.i(15735283777536L, 117237);
    this.width = 200;
    this.height = 200;
    GMTrace.o(15735283777536L, 117237);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15735417995264L, 117238);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15735417995264L, 117238);
      return 0;
      GMTrace.o(15735417995264L, 117238);
      return 200;
      GMTrace.o(15735417995264L, 117238);
      return 200;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 29.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.31970137F, 77.93319F);
      ((Path)localObject2).cubicTo(-0.063724294F, 77.53636F, -0.108552635F, 76.85273F, 0.2193248F, 76.40659F);
      ((Path)localObject2).lineTo(9.792403F, 63.380688F);
      ((Path)localObject2).cubicTo(10.120393F, 62.934402F, 10.738718F, 62.842735F, 11.176576F, 63.17833F);
      ((Path)localObject2).lineTo(61.002815F, 101.36729F);
      ((Path)localObject2).cubicTo(62.317314F, 102.37477F, 64.42048F, 102.32714F, 65.687584F, 101.27154F);
      ((Path)localObject2).lineTo(186.95796F, 0.24350294F);
      ((Path)localObject2).cubicTo(187.37868F, -0.10698287F, 188.04178F, -0.07305191F, 188.42578F, 0.3061832F);
      ((Path)localObject2).lineTo(197.7745F, 9.538964F);
      ((Path)localObject2).cubicTo(198.16446F, 9.9240675F, 198.16162F, 10.550133F, 197.76987F, 10.935685F);
      ((Path)localObject2).lineTo(64.80481F, 141.79317F);
      ((Path)localObject2).cubicTo(64.01734F, 142.56815F, 62.75824F, 142.55399F, 61.988094F, 141.75691F);
      ((Path)localObject2).lineTo(0.31970137F, 77.93319F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */